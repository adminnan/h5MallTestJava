package com.java.mall2.resp;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


public class GoodsResp {
    private Long id;

    private String GoodsName;

    private String coverImg;

    private String goodsDesc;

//    @JsonIgnore
    private String size;

//    @JsonIgnore
    private String color;

//    @JsonIgnore
    private BigDecimal skuPrice;

//    @JsonIgnore
    private Integer skuStock;

//    @JsonIgnore
    private String catName;

    private List<GoodsSkuResp> skuList;

    private List<GoodsCategoryInfoResp> categoryList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getSkuStock() {
        return skuStock;
    }

    public void setSkuStock(Integer skuStock) {
        this.skuStock = skuStock;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<GoodsSkuResp> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<GoodsSkuResp> skuList) {
        this.skuList = skuList;
    }

    public List<GoodsCategoryInfoResp> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<GoodsCategoryInfoResp> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return "GoodsResp{" +
                "id=" + id +
                ", GoodsName='" + GoodsName + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", skuPrice=" + skuPrice +
                ", skuStock=" + skuStock +
                ", catName='" + catName + '\'' +
                ", skuList=" + skuList +
                ", categoryList=" + categoryList +
                '}';
    }
}
