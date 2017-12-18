package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgSignal;

public interface CfgSignalMapper {
    int deleteByPrimaryKey(Integer signalid);

    int insert(CfgSignal record);

    int insertSelective(CfgSignal record);

    CfgSignal selectByPrimaryKey(Integer signalid);

    int updateByPrimaryKeySelective(CfgSignal record);

    int updateByPrimaryKeyWithBLOBs(CfgSignal record);

    int updateByPrimaryKey(CfgSignal record);
}