package com.somle.overstock.model;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DataBean implements Serializable {

    @Alias("totalCount")
    private String totalCount;

    @Alias("list")
    private List<Object> list;

}
