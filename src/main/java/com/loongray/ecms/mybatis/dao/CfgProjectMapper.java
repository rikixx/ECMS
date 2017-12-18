package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.CfgProject;
import com.loongray.ecms.mybatis.pojo.CfgProjectWithBLOBs;

public interface CfgProjectMapper {
    int deleteByPrimaryKey(Integer projectid);

    int insert(CfgProjectWithBLOBs record);

    int insertSelective(CfgProjectWithBLOBs record);

    CfgProjectWithBLOBs selectByPrimaryKey(Integer projectid);

    int updateByPrimaryKeySelective(CfgProjectWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CfgProjectWithBLOBs record);

    int updateByPrimaryKey(CfgProject record);
}