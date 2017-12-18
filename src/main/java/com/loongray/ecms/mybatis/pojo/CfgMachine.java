package com.loongray.ecms.mybatis.pojo;

import java.util.Date;

public class CfgMachine {
    private Integer machineid;

    private Integer buildingid;

    private String machinecode;

    private String machinename;

    private String ipaddress;

    private Integer infocreateuserid;

    private Date infocreatetime;

    private Boolean deleted;

    private Integer ismainmachine;

    private Integer mainmachineid;

    private Integer connectionport;

    private Integer configport;

    private String measureweb;

    private String description;

    public Integer getMachineid() {
        return machineid;
    }

    public void setMachineid(Integer machineid) {
        this.machineid = machineid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode == null ? null : machinecode.trim();
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename == null ? null : machinename.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
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

    public Integer getIsmainmachine() {
        return ismainmachine;
    }

    public void setIsmainmachine(Integer ismainmachine) {
        this.ismainmachine = ismainmachine;
    }

    public Integer getMainmachineid() {
        return mainmachineid;
    }

    public void setMainmachineid(Integer mainmachineid) {
        this.mainmachineid = mainmachineid;
    }

    public Integer getConnectionport() {
        return connectionport;
    }

    public void setConnectionport(Integer connectionport) {
        this.connectionport = connectionport;
    }

    public Integer getConfigport() {
        return configport;
    }

    public void setConfigport(Integer configport) {
        this.configport = configport;
    }

    public String getMeasureweb() {
        return measureweb;
    }

    public void setMeasureweb(String measureweb) {
        this.measureweb = measureweb == null ? null : measureweb.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}