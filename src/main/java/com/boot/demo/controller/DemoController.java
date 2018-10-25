package com.boot.demo.controller;

import com.boot.demo.service.GoodService;
import com.boot.demo.util.JsonUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/good/info")
public class DemoController {
    @Autowired
    private GoodService goodService;
    @RequestMapping("/update")
    public int uodate(int id,String name){
        return  goodService.update(id,name);
    }
    @RequestMapping("/insert")
    public int insert(String name,double price,int num){
        return  goodService.insert(name,price,num);
    }
    @RequestMapping("/delete")
    public int delete(long id){
        return  goodService.delete(id);
    }
    @RequestMapping("/find")
    public Object findAll(long id){
        return JsonUtils.obj2String(goodService.findById(id));
    }
    @RequestMapping("/findall")
    public Object findAll(){
        return JsonUtils.obj2String(goodService.selectAll());
    }
}
