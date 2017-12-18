package com.loongray.ecms.mybatis.pojo;

import java.util.Date;

public class CfgMeasurePoint {
    private Integer pointid;

    private Integer machineid;

    private String pointcode;

    private String pointname;

    private Integer companyid;

    private Integer infocreateuserid;

    private Date infocreatetime;

    private Boolean deleted;

    private String description;

    public Integer getPointid() {
        return pointid;
    }

    public void setPointid(Integer pointid) {
        this.pointid = pointid;
    }

    public Integer getMachineid() {
        return machineid;
    }

    public void setMachineid(Integer machineid) {
        this.machineid = machineid;
    }

    public String getPointcode() {
        return pointcode;
    }

    public void setPointcode(String pointcode) {
        this.pointcode = pointcode == null ? null : pointcode.trim();
    }

    public String getPointname() {
        return pointname;
    }

    public void setPointname(String pointname) {
        this.pointname = pointname == null ? null : pointname.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getInfocreateuserid() {
        return infocreateuserid;
    }

    public void setInfocreateuserid(Integer infocreateuserid) {
        this.infocreateuserid = infocreateuserid;
    }

    public Date getInfocreatetime() {
        return infocreatetime;
    }

    public void setInfocreatetime(Date infocreatetime) {
        this.infocreatetime = infocreatetime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}