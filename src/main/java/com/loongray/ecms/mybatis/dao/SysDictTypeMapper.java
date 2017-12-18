package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictType;

public interface SysDictTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(SysDictType record);

    int insertSelective(SysDictType record);

    SysDictType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(SysDictType record);

    int updateByPrimaryKeyWithBLOBs(SysDictType record);

    int updateByPrimaryKey(SysDictType record);
}