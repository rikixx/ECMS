package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgCompany;

public interface CfgCompanyMapper {
    int deleteByPrimaryKey(Integer roomid);

    int insert(CfgCompany record);

    int insertSelective(CfgCompany record);

    CfgCompany selectByPrimaryKey(Integer roomid);

    int updateByPrimaryKeySelective(CfgCompany record);

    int updateByPrimaryKeyWithBLOBs(CfgCompany record);

    int updateByPrimaryKey(CfgCompany record);
}