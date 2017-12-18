package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgRoleMap;

public interface CfgRoleMapMapper {
    int deleteByPrimaryKey(Integer uniqueid);

    int insert(CfgRoleMap record);

    int insertSelective(CfgRoleMap record);

    CfgRoleMap selectByPrimaryKey(Integer uniqueid);

    int updateByPrimaryKeySelective(CfgRoleMap record);

    int updateByPrimaryKey(CfgRoleMap record);
}