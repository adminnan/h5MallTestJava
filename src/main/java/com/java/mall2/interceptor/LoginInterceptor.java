package com.java.mall2.interceptor;

import com.alibaba.fastjson.JSON;
import com.java.mall2.resp.UserLoginResp;
import com.java.mall2.util.LoginUserContext;
import com.java.mall2.util.RedisUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    private static final Logger LOG= LoggerFactory.getLogger(com.java.mall2.interceptor.LoginInterceptor.class);

    // ✅ 白名单：不需要登录的接口
    private List<String> excludePaths = Arrays.asList(
            "/test/**",
            "/redis/**",
            "/goods/getGoods",
            "/user/login",
            "/user/logout/{token}",
            "/file/**"
    );
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception, SocketTimeoutException {
//        打印请求信息
        LOG.info("------------- LoginInterceptor 开始 -------------");
        Long startTime=System.currentTimeMillis();
        request.setAttribute("requestStartTime", startTime);
        if(request.getMethod().toUpperCase().equals("OPTIONS")){
            return true;
        }
        String path=request.getRequestURL().toString();
        LOG.info("接口登录拦截,path:{}",path);
//        String path = request.getRequestURI();
//        // 如果在白名单，直接放行
//        if(excludePaths.contains(path)){
//            return true;
//        }
        String token=request.getHeader("token");
//        String token=request.getHeader("Authorization");
        LOG.info("登录校验开始，token：{}",token);
        if(token==null||token.isEmpty()){
            LOG.info("token为空，请求被拦截");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return false;
        }
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        poolConfig.setMaxTotal(100);
        poolConfig.setMaxIdle(20);
        JedisPool jedisPool=new JedisPool(poolConfig,"localhost",6379);
        RedisUtil redisUtil=new RedisUtil(jedisPool);
        Object object=redisUtil.get(token);
        if(object==null){
            LOG.info("token为空，请求被拦截");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return false;
        }else{
            LOG.info("已登录，{}",object);
            LoginUserContext.setUser((JSON.parseObject((String) object, UserLoginResp.class)));
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Long startTime=(Long) request.getAttribute("requestStartTime");
        LOG.info("------------- LoginInterceptor 结束 耗时：{} ms -------------", System.currentTimeMillis() - startTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
//        LOG.info("LogInterceptor 结束");
    }
}
