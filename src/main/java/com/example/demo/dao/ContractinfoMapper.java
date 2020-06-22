package com.example.demo.dao;

import com.example.demo.entity.Contractinfo;
import com.example.demo.entity.ContractinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractinfoMapper {
    long countByExample(ContractinfoExample example);

    int deleteByExample(ContractinfoExample example);

    int deleteByPrimaryKey(Integer contractId);

    int insert(Contractinfo record);

    int insertSelective(Contractinfo record);

    List<Contractinfo> selectByExample(ContractinfoExample example);

    Contractinfo selectByPrimaryKey(Integer contractId);

    int updateByExampleSelective(@Param("record") Contractinfo record, @Param("example") ContractinfoExample example);

    int updateByExample(@Param("record") Contractinfo record, @Param("example") ContractinfoExample example);

    int updateByPrimaryKeySelective(Contractinfo record);

    int updateByPrimaryKey(Contractinfo record);
}