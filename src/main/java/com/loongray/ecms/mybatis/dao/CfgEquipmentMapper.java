package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgEquipment;

public interface CfgEquipmentMapper {
    int deleteByPrimaryKey(Integer equipmentid);

    int insert(CfgEquipment record);

    int insertSelective(CfgEquipment record);

    CfgEquipment selectByPrimaryKey(Integer equipmentid);

    int updateByPrimaryKeySelective(CfgEquipment record);

    int updateByPrimaryKeyWithBLOBs(CfgEquipment record);

    int updateByPrimaryKey(CfgEquipment record);
}