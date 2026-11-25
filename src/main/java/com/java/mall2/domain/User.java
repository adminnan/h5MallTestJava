package com.java.mall2.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class User {
    private Integer id;

    private String nickName;

    private String avatar;
}
