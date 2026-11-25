package com.java.mall2.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@TableName("goods_sku")
@Data
public class GoodsSku {
    private Long goodsId;

    private String skuSpec;

    private String color;

    private String size;

    private String skuCode;

    private BigDecimal price;

    private BigDecimal marketPrice;

    private Integer stock;

    private String img;

    private Integer isDeleted;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getSkuSpec() {
        return skuSpec;
    }

    public void setSkuSpec(String skuSpec) {
        this.skuSpec = skuSpec;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "GoodsSku{" +
                "goodsId=" + goodsId +
                ", skuSpec='" + skuSpec + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", skuCode='" + skuCode + '\'' +
                ", price=" + price +
                ", marketPrice=" + marketPrice +
                ", stock=" + stock +
                ", img='" + img + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
