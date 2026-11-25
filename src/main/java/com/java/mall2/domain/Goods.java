package com.java.mall2.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("goods")
@Data
public class Goods {

//    商品名称
    private String goodsName;

//    商品详情
    private String goodsDesc;

//    封面图片
    private String coverImg;

//    轮播图
    private String carousel;

    private Integer sales;

    private Integer sort;

//    状态 0上架，1下架
    private Integer status;

    private Integer isDeleted;

    private Integer isNew;

    private Integer isHot;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getCarousel() {
        return carousel;
    }

    public void setCarousel(String carousel) {
        this.carousel = carousel;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", carousel='" + carousel + '\'' +
                ", sales=" + sales +
                ", sort=" + sort +
                ", status=" + status +
                ", isDeleted=" + isDeleted +
                ", isNew=" + isNew +
                ", isHot=" + isHot +
                '}';
    }
}
