package com.boot.demo.service;

import com.boot.demo.entity.Good;
import com.boot.demo.mapper.GoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodService {
    @Autowired
    private GoodMapper mapper;
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int update(int id ,String name){
        Good good=new Good();
        good.setGoodId(id);
        good.setGoodName(name);
        return  mapper.update(good);
    }
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int insert(String name,double price,int num){
        return  mapper.insert(name,price,num);
    }
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int delete(long id){
        return  mapper.delete(id);
    }
    @Transactional(propagation= Propagation.REQUIRED,readOnly = true)
    public  Good findById(long id){
        return mapper.findById(id);
    }
    @Transactional(propagation= Propagation.REQUIRED,readOnly = true)
    public List<Good> selectAll(){
        return  mapper.getAll();
    }
}
