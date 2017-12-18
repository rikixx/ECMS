package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgUser;

public interface CfgUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(CfgUser record);

    int insertSelective(CfgUser record);

    CfgUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(CfgUser record);

    int updateByPrimaryKeyWithBLOBs(CfgUser record);

    int updateByPrimaryKey(CfgUser record);
}