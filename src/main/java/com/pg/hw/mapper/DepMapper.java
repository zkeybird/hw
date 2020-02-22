package com.pg.hw.mapper;

import com.pg.hw.pojo.Dep;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Zwyk
 * @date 2020/2/22
 **/
public interface DepMapper {

    @Select("select * from dep")
    List<Dep> selectByCondition(Dep dep1, Dep dep2, Object param) ;
}
