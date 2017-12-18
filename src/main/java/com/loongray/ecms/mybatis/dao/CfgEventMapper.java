package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgEvent;
import com.loongray.ecms.mybatis.pojo.CfgEventWithBLOBs;

public interface CfgEventMapper {
    int deleteByPrimaryKey(Integer eventid);

    int insert(CfgEventWithBLOBs record);

    int insertSelective(CfgEventWithBLOBs record);

    CfgEventWithBLOBs selectByPrimaryKey(Integer eventid);

    int updateByPrimaryKeySelective(CfgEventWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CfgEventWithBLOBs record);

    int updateByPrimaryKey(CfgEvent record);
}