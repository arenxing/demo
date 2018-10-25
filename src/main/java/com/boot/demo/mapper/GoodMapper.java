package com.boot.demo.mapper;

import com.boot.demo.entity.Good;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface GoodMapper{
    @Update("update good set good_name = #{goodName} where good_id = #{goodId}")
    int update(Good good);
    @Delete("delete from good where good_id=#{id}")
    int delete(long id);
    @Insert("insert into good(good_name,good_price,good_num) values(#{name},#{price},#{num})" )
    @Options(useGeneratedKeys=true, keyProperty="goodId", keyColumn="good_id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(@Param("name")String name,@Param("price")Double price,@Param("num")int num);
    @Select("SELECT * FROM good")
    @Results({
            @Result(column = "good_id",property = "goodId") ,
            @Result(column = "good_name",property = "goodName"),
            @Result(column = "good_price",property = "goodPrice"),
            @Result(column = "good_num",property = "goodNum"),
            @Result(column = "good_Prodate",property = "goodProdate"),
            @Result(column = "good_savetime",property = "goodSaveTime"),
            @Result(column = "good_img",property = "goodImg")
    })
    List<Good> getAll();
    @Select("SELECT * FROM good where good_id = #{goodId}")
    @Results({
            @Result(column = "good_id",property = "goodId") ,
            @Result(column = "good_name",property = "goodName"),
            @Result(column = "good_price",property = "goodPrice"),
            @Result(column = "good_num",property = "goodNum"),
            @Result(column = "good_Prodate",property = "goodProdate"),
            @Result(column = "good_savetime",property = "goodSaveTime"),
            @Result(column = "good_img",property = "goodImg")
    })
    Good findById(long goodId);
}
