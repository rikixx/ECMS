package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.DataDailySummation;

public interface DataDailySummationMapper {
    int deleteByPrimaryKey(Integer uniqueid);

    int insert(DataDailySummation record);

    int insertSelective(DataDailySummation record);

    DataDailySummation selectByPrimaryKey(Integer uniqueid);

    int updateByPrimaryKeySelective(DataDailySummation record);

    int updateByPrimaryKey(DataDailySummation record);
}