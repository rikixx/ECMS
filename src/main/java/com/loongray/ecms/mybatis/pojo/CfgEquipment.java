package com.loongray.ecms.mybatis.pojo;

import java.util.Date;

public class CfgEquipment {
    private Integer equipmentid;

    private Integer buildingid;

    private String equipmentname;

    private Integer infocreateuserid;

    private Date infocreatetime;

    private Boolean deleted;

    private String description;

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
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