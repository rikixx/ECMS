package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.SysDictProvince;

public interface SysDictProvinceMapper {
    int insert(SysDictProvince record);

    int insertSelective(SysDictProvince record);
}