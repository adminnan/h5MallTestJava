package com.java.mall2.controller;

import com.java.mall2.domain.Goods;
import com.java.mall2.req.GoodsReq;
import com.java.mall2.resp.*;
import com.java.mall2.service.GoodsService;
import com.java.mall2.util.CopyUtil;
import com.java.mall2.util.NoLogin;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @Resource
    private CopyUtil copyUtil;

    //获取首页底部商品信息
    @GetMapping("/getGoods")
    public CommonResp selectAllGood(GoodsReq req){
        CommonResp<PageResp<GoodsResp>> commonResp=new CommonResp<>();
        PageResp<GoodsResp> pageResp=goodsService.selectAllGood(req);
        commonResp.setContent(pageResp);
        return commonResp;
    }
}
