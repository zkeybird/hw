package com.pg.hw.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Zwyk
 * @date 2020/2/22
 **/
@Data
public class Dep implements Serializable {
    private Long uuid;//部门编号
    private String name;//部门名称
    private String tele;//部门电话
}
