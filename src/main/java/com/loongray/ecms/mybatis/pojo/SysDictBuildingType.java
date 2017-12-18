package com.loongray.ecms.mybatis.pojo;

public class SysDictBuildingType {
    private Integer uniqueid;

    private String buildingtypecode;

    private String buildingtypename;

    private String description;

    public Integer getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(Integer uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getBuildingtypecode() {
        return buildingtypecode;
    }

    public void setBuildingtypecode(String buildingtypecode) {
        this.buildingtypecode = buildingtypecode == null ? null : buildingtypecode.trim();
    }

    public String getBuildingtypename() {
        return buildingtypename;
    }

    public void setBuildingtypename(String buildingtypename) {
        this.buildingtypename = buildingtypename == null ? null : buildingtypename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}