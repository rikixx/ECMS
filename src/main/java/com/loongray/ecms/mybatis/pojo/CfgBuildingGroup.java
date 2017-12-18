package com.loongray.ecms.mybatis.pojo;

import java.util.Date;

public class CfgBuildingGroup {
    private Integer groupid;

    private Integer projectid;

    private String groupname;

    private Integer provinceid;

    private Integer cityid;

    private Double acreage;

    private String developers;

    private String completeddate;

    private Integer infocreateuserid;

    private Date infocreatetime;

    private Boolean deleted;

    private Integer membercount;

    private String description;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Double getAcreage() {
        return acreage;
    }

    public void setAcreage(Double acreage) {
        this.acreage = acreage;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers == null ? null : developers.trim();
    }

    public String getCompleteddate() {
        return completeddate;
    }

    public void setCompleteddate(String completeddate) {
        this.completeddate = completeddate == null ? null : completeddate.trim();
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

    public Integer getMembercount() {
        return membercount;
    }

    public void setMembercount(Integer membercount) {
        this.membercount = membercount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}