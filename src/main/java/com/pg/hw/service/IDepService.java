package com.pg.hw.service;

import com.pg.hw.pojo.Dep;

import java.util.List;

/**
 * @author Zwyk
 * @date 2020/2/22
 **/
public interface IDepService {
    /**
     * 条件查询
     * @param dep1
     * @param dep2
     * @param param
     * @return
     */
    List<Dep> getList(Dep dep1, Dep dep2, Object param) ;

}
