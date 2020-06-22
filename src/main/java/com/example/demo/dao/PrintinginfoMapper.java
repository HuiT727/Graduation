package com.example.demo.dao;

import com.example.demo.entity.Printinginfo;
import com.example.demo.entity.PrintinginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrintinginfoMapper {
    long countByExample(PrintinginfoExample example);

    int deleteByExample(PrintinginfoExample example);

    int deleteByPrimaryKey(Integer printingId);

    int insert(Printinginfo record);

    int insertSelective(Printinginfo record);

    List<Printinginfo> selectByExample(PrintinginfoExample example);

    Printinginfo selectByPrimaryKey(Integer printingId);

    int updateByExampleSelective(@Param("record") Printinginfo record, @Param("example") PrintinginfoExample example);

    int updateByExample(@Param("record") Printinginfo record, @Param("example") PrintinginfoExample example);

    int updateByPrimaryKeySelective(Printinginfo record);

    int updateByPrimaryKey(Printinginfo record);
}