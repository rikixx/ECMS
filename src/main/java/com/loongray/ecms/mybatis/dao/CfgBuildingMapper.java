package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgBuilding;
import com.loongray.ecms.mybatis.pojo.CfgBuildingWithBLOBs;

public interface CfgBuildingMapper {
    int deleteByPrimaryKey(Integer buildingid);

    int insert(CfgBuildingWithBLOBs record);

    int insertSelective(CfgBuildingWithBLOBs record);

    CfgBuildingWithBLOBs selectByPrimaryKey(Integer buildingid);

    int updateByPrimaryKeySelective(CfgBuildingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CfgBuildingWithBLOBs record);

    int updateByPrimaryKey(CfgBuilding record);
}