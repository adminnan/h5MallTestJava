package com.java.mall2.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.java.mall2.resp.GoodsResp;

import java.util.List;

public interface GoodsMapper {
    IPage<GoodsResp> selectAllGood(Page page);
}
