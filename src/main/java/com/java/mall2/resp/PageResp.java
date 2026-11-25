package com.java.mall2.resp;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

public class PageResp<T> {
    private int total;

    private List<T> list;

    private int pageNum;

    private IPage<T> iPage;

    public IPage<T> getiPage() {
        return iPage;
    }

    public void setiPage(IPage<T> iPage) {
        this.iPage = iPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResp{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }
}
