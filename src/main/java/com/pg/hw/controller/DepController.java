package com.pg.hw.controller;

import com.pg.hw.pojo.Dep;
import com.pg.hw.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zwyk
 * @date 2020/2/22
 **/
@RestController
@RequestMapping(value = "/dep")
public class DepController {
    @Autowired
    private IDepService depService ;

    @RequestMapping(value = "/getList")
    public List<Dep> getList(
            @RequestParam(required = false) Dep dep,
            @RequestParam(required = false) Dep dep2,
            @RequestParam(required = false) Object param){
        System.out.println(dep);
        System.out.println(dep2);
        System.out.println(param);
        List<Dep> list = depService.getList(null, null, null);
        return list ;
    }


    @RequestMapping(value = "/hello",produces = "text/html;charset=utf-8")
    public String hello(){
        return "你好" ;
    }
}
