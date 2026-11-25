package com.java.mall2;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@SpringBootApplication
@MapperScan("com.java.mall2.mapper")
public class Mall2Application {

    private static final Logger LOG= LoggerFactory.getLogger(Mall2Application.class);
    private static final int Max_Random_Count=11;

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(Mall2Application.class);
        Environment env=app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址：\thttp://127.0.0.1:"+env.getProperty("server.port"));
//        sortCode();
//        JedisPoolConfig poolConfig = new JedisPoolConfig();
//        poolConfig.setMaxTotal(100);
//        poolConfig.setMaxIdle(10);
//        JedisPool jedisPool = new JedisPool(poolConfig, "localhost", 6379);
    }

    public static void sortCode(){
        int[] nums=new int[10];
        int randomCount=0;
        boolean completeFlag=false;
//        while (randomCount<Max_Random_Count&&!completeFlag){
//
//        }
        for (int i = 0; i < nums.length; i++) {
            int sjs=pushContent(nums);
            nums[i]=sjs;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static int pushContent(int[] array){
//        判断数组里面是否包含随机数，包含就调用方法自己生成随机数
        Random r=new Random();
        int sjs=r.nextInt(10-1)+1;
        if((contentContains(array,sjs))){
            pushContent(array);
        }
        return sjs;
    }
    public static boolean contentContains(int[] array,int number){
        Set<Integer> hashSet=new HashSet<>();
        for(int num : array){
            hashSet.add(num);
        }
        return hashSet.contains(number);
    }
}
