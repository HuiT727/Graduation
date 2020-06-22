package com.example.demo.dao;

import com.example.demo.entity.Policeinfo;
import com.example.demo.entity.PoliceinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoliceinfoMapper {
    long countByExample(PoliceinfoExample example);

    int deleteByExample(PoliceinfoExample example);

    int deleteByPrimaryKey(Integer policeId);

    int insert(Policeinfo record);

    int insertSelective(Policeinfo record);

    List<Policeinfo> selectByExample(PoliceinfoExample example);

    Policeinfo selectByPrimaryKey(Integer policeId);

    int updateByExampleSelective(@Param("record") Policeinfo record, @Param("example") PoliceinfoExample example);

    int updateByExample(@Param("record") Policeinfo record, @Param("example") PoliceinfoExample example);

    int updateByPrimaryKeySelective(Policeinfo record);

    int updateByPrimaryKey(Policeinfo record);
}