package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictEnergyItemLvOne;

public interface SysDictEnergyItemLvOneMapper {
    int deleteByPrimaryKey(Integer uniqueid);

    int insert(SysDictEnergyItemLvOne record);

    int insertSelective(SysDictEnergyItemLvOne record);

    SysDictEnergyItemLvOne selectByPrimaryKey(Integer uniqueid);

    int updateByPrimaryKeySelective(SysDictEnergyItemLvOne record);

    int updateByPrimaryKeyWithBLOBs(SysDictEnergyItemLvOne record);

    int updateByPrimaryKey(SysDictEnergyItemLvOne record);
}