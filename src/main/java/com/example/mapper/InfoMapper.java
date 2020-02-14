package com.example.mapper;

import com.example.model.Info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InfoMapper {

    @Insert("INSERT INTO datatable (info) VALUES(#{info})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Info info);

    @Select("SELECT info FROM datatable WHERE id = #{id}")
    Info findById(long id);

    @Select("SELECT info FROM datatable")
    Info findAll();
}

