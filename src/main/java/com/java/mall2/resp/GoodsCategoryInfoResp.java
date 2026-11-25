package com.java.mall2.resp;

public class GoodsCategoryInfoResp {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GoodsCategoryInfoResp{" +
                "name='" + name + '\'' +
                '}';
    }
}
