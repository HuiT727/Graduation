package com.example.demo.dao;

import com.example.demo.entity.Admininfo;
import com.example.demo.entity.AdmininfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmininfoMapper {
    long countByExample(AdmininfoExample example);

    int deleteByExample(AdmininfoExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Admininfo record);

    int insertSelective(Admininfo record);

    List<Admininfo> selectByExample(AdmininfoExample example);

    Admininfo selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Admininfo record, @Param("example") AdmininfoExample example);

    int updateByExample(@Param("record") Admininfo record, @Param("example") AdmininfoExample example);

    int updateByPrimaryKeySelective(Admininfo record);

    int updateByPrimaryKey(Admininfo record);
}