package com.example.demo.dao;

import com.example.demo.entity.Enterpriseinfo;
import com.example.demo.entity.EnterpriseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseinfoMapper {
    long countByExample(EnterpriseinfoExample example);

    int deleteByExample(EnterpriseinfoExample example);

    int deleteByPrimaryKey(Integer enterpriseId);

    int insert(Enterpriseinfo record);

    int insertSelective(Enterpriseinfo record);

    List<Enterpriseinfo> selectByExample(EnterpriseinfoExample example);

    Enterpriseinfo selectByPrimaryKey(Integer enterpriseId);

    int updateByExampleSelective(@Param("record") Enterpriseinfo record, @Param("example") EnterpriseinfoExample example);

    int updateByExample(@Param("record") Enterpriseinfo record, @Param("example") EnterpriseinfoExample example);

    int updateByPrimaryKeySelective(Enterpriseinfo record);

    int updateByPrimaryKey(Enterpriseinfo record);
}