package com.loongray.ecms.mybatis.pojo;

import java.util.Date;

public class CfgProject {
    private Integer projectid;

    private String projectname;

    private Integer projecttypeid;

    private String projectmanager;

    private Integer infocreateuserid;

    private Date infocreatetime;

    private Boolean deleted;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Integer getProjecttypeid() {
        return projecttypeid;
    }

    public void setProjecttypeid(Integer projecttypeid) {
        this.projecttypeid = projecttypeid;
    }

    public String getProjectmanager() {
        return projectmanager;
    }

    public void setProjectmanager(String projectmanager) {
        this.projectmanager = projectmanager == null ? null : projectmanager.trim();
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
}