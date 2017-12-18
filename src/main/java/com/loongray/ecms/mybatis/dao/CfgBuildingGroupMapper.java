package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgBuildingGroup;

public interface CfgBuildingGroupMapper {
    int deleteByPrimaryKey(Integer groupid);

    int insert(CfgBuildingGroup record);

    int insertSelective(CfgBuildingGroup record);

    CfgBuildingGroup selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(CfgBuildingGroup record);

    int updateByPrimaryKeyWithBLOBs(CfgBuildingGroup record);

    int updateByPrimaryKey(CfgBuildingGroup record);
}