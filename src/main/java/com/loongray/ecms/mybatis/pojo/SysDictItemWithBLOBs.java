package com.loongray.ecms.mybatis.pojo;

public class SysDictItemWithBLOBs extends SysDictItem {
    private String itemvalue;

    private String description;

    public String getItemvalue() {
        return itemvalue;
    }

    public void setItemvalue(String itemvalue) {
        this.itemvalue = itemvalue == null ? null : itemvalue.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}