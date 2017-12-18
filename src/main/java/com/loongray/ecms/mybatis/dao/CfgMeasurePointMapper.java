package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgMeasurePoint;

public interface CfgMeasurePointMapper {
    int deleteByPrimaryKey(Integer pointid);

    int insert(CfgMeasurePoint record);

    int insertSelective(CfgMeasurePoint record);

    CfgMeasurePoint selectByPrimaryKey(Integer pointid);

    int updateByPrimaryKeySelective(CfgMeasurePoint record);

    int updateByPrimaryKeyWithBLOBs(CfgMeasurePoint record);

    int updateByPrimaryKey(CfgMeasurePoint record);
}