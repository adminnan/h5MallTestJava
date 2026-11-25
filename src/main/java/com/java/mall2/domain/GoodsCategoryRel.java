package com.java.mall2.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("goods_category_rel")
@Data
public class GoodsCategoryRel {
    private Long goodsId;

    private Long categoryId;

    private Integer sort;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "GoodsCategoryRel{" +
                "goodsId=" + goodsId +
                ", categoryId=" + categoryId +
                ", sort=" + sort +
                '}';
    }
}
