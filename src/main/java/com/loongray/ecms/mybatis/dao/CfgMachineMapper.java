package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgMachine;

public interface CfgMachineMapper {
    int deleteByPrimaryKey(Integer machineid);

    int insert(CfgMachine record);

    int insertSelective(CfgMachine record);

    CfgMachine selectByPrimaryKey(Integer machineid);

    int updateByPrimaryKeySelective(CfgMachine record);

    int updateByPrimaryKeyWithBLOBs(CfgMachine record);

    int updateByPrimaryKey(CfgMachine record);
}