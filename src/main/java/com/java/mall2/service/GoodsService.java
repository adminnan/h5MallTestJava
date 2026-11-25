package com.java.mall2.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.java.mall2.mapper.GoodsMapper;
import com.java.mall2.req.GoodsReq;
import com.java.mall2.resp.GoodsResp;
import com.java.mall2.resp.PageResp;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    public PageResp<GoodsResp> selectAllGood(GoodsReq req){
//        List<GoodsResp> list=goodsMapper.selectAllGood();
        Page<GoodsResp> page2=new Page<>(req.getPageNum(), req.getPageSize());
        IPage<GoodsResp> ipage=goodsMapper.selectAllGood(page2);
        PageResp<GoodsResp> pageResp = new PageResp<>();
        pageResp.setiPage(ipage);
//        pageResp.setList(ipage.getRecords());
        return pageResp;
    }
}
