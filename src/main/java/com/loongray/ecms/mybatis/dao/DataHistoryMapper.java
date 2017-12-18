package com.loongray.ecms.mybatis.dao;

import com.loongray.ecms.mybatis.pojo.DataHistory;

public interface DataHistoryMapper {
    int insert(DataHistory record);

    int insertSelective(DataHistory record);
}