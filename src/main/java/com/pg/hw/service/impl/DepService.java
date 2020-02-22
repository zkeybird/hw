package com.pg.hw.service.impl;

import com.pg.hw.mapper.DepMapper;
import com.pg.hw.pojo.Dep;
import com.pg.hw.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zwyk
 * @date 2020/2/22
 **/
@Service
public class DepService implements IDepService {
    @Autowired
    private DepMapper depMapper ;

    @Override
    public List<Dep> getList(Dep dep1, Dep dep2, Object param) {
        return depMapper.selectByCondition(dep1,dep2,param);
    }
}
