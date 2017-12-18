package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgCommand;
import com.loongray.ecms.mybatis.pojo.CfgCommandWithBLOBs;

public interface CfgCommandMapper {
    int deleteByPrimaryKey(Integer commandid);

    int insert(CfgCommandWithBLOBs record);

    int insertSelective(CfgCommandWithBLOBs record);

    CfgCommandWithBLOBs selectByPrimaryKey(Integer commandid);

    int updateByPrimaryKeySelective(CfgCommandWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CfgCommandWithBLOBs record);

    int updateByPrimaryKey(CfgCommand record);
}