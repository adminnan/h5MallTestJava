package com.java.mall2.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("goods_category")
@Data
public class GoodsCategory {
    private Long parentId;

    private String name;

    private String icon;

    private Integer sort;

    private Integer status;

    private Integer isDeleted;
}
