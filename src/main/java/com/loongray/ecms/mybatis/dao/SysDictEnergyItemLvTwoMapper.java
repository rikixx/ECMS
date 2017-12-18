package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictEnergyItemLvTwo;

public interface SysDictEnergyItemLvTwoMapper {
    int deleteByPrimaryKey(Integer uniqueid);

    int insert(SysDictEnergyItemLvTwo record);

    int insertSelective(SysDictEnergyItemLvTwo record);

    SysDictEnergyItemLvTwo selectByPrimaryKey(Integer uniqueid);

    int updateByPrimaryKeySelective(SysDictEnergyItemLvTwo record);

    int updateByPrimaryKeyWithBLOBs(SysDictEnergyItemLvTwo record);

    int updateByPrimaryKey(SysDictEnergyItemLvTwo record);
}