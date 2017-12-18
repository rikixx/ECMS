package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictEnergyCategory;

public interface SysDictEnergyCategoryMapper {
    int deleteByPrimaryKey(Integer uniqueid);

    int insert(SysDictEnergyCategory record);

    int insertSelective(SysDictEnergyCategory record);

    SysDictEnergyCategory selectByPrimaryKey(Integer uniqueid);

    int updateByPrimaryKeySelective(SysDictEnergyCategory record);

    int updateByPrimaryKeyWithBLOBs(SysDictEnergyCategory record);

    int updateByPrimaryKey(SysDictEnergyCategory record);
}