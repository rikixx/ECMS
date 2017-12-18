package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictEnergyItem;

public interface SysDictEnergyItemMapper {
    int deleteByPrimaryKey(Integer uniqueid);

    int insert(SysDictEnergyItem record);

    int insertSelective(SysDictEnergyItem record);

    SysDictEnergyItem selectByPrimaryKey(Integer uniqueid);

    int updateByPrimaryKeySelective(SysDictEnergyItem record);

    int updateByPrimaryKeyWithBLOBs(SysDictEnergyItem record);

    int updateByPrimaryKey(SysDictEnergyItem record);
}