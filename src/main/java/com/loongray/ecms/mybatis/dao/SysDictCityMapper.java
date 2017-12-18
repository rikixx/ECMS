package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictCity;

public interface SysDictCityMapper {
    int insert(SysDictCity record);

    int insertSelective(SysDictCity record);
}