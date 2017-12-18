package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictItem;
import com.loongray.ecms.mybatis.pojo.SysDictItemWithBLOBs;

public interface SysDictItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDictItemWithBLOBs record);

    int insertSelective(SysDictItemWithBLOBs record);

    SysDictItemWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDictItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysDictItemWithBLOBs record);

    int updateByPrimaryKey(SysDictItem record);
}