package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictBuildingType;

public interface SysDictBuildingTypeMapper {
    int deleteByPrimaryKey(Integer uniqueid);

    int insert(SysDictBuildingType record);

    int insertSelective(SysDictBuildingType record);

    SysDictBuildingType selectByPrimaryKey(Integer uniqueid);

    int updateByPrimaryKeySelective(SysDictBuildingType record);

    int updateByPrimaryKeyWithBLOBs(SysDictBuildingType record);

    int updateByPrimaryKey(SysDictBuildingType record);
}