package com.java.mall2.resp;

import java.math.BigDecimal;

public class GoodsSkuResp {
    private String color;

    private String size;

    private BigDecimal skuPrice;

    private Integer skuStock;

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

    @Override
    public String toString() {
        return "GoodsSkuResp{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", skuPrice=" + skuPrice +
                ", skuStock=" + skuStock +
                '}';
    }
}
