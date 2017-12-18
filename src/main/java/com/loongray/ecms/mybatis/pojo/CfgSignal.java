package com.loongray.ecms.mybatis.pojo;

public class CfgSignal {
    private Integer signalid;

    private Integer projectid;

    private Integer groupid;

    private Integer buildingid;

    private Integer pointid;

    private Integer equipmentid;

    private Integer signalgroupid;

    private Integer energycategoryid;

    private String signalname;

    private Integer signalcategoryid;

    private Integer energyitemid;

    private Integer energyitemlvoneid;

    private Integer energyitemlvtwoid;

    private String tagname;

    private Boolean issumdata;

    private Boolean buildingsummary;

    private Boolean companysummary;

    private Boolean categorysummary;

    private Boolean itemsummary;

    private String description;

    public Integer getSignalid() {
        return signalid;
    }

    public void setSignalid(Integer signalid) {
        this.signalid = signalid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getPointid() {
        return pointid;
    }

    public void setPointid(Integer pointid) {
        this.pointid = pointid;
    }

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public Integer getSignalgroupid() {
        return signalgroupid;
    }

    public void setSignalgroupid(Integer signalgroupid) {
        this.signalgroupid = signalgroupid;
    }

    public Integer getEnergycategoryid() {
        return energycategoryid;
    }

    public void setEnergycategoryid(Integer energycategoryid) {
        this.energycategoryid = energycategoryid;
    }

    public String getSignalname() {
        return signalname;
    }

    public void setSignalname(String signalname) {
        this.signalname = signalname == null ? null : signalname.trim();
    }

    public Integer getSignalcategoryid() {
        return signalcategoryid;
    }

    public void setSignalcategoryid(Integer signalcategoryid) {
        this.signalcategoryid = signalcategoryid;
    }

    public Integer getEnergyitemid() {
        return energyitemid;
    }

    public void setEnergyitemid(Integer energyitemid) {
        this.energyitemid = energyitemid;
    }

    public Integer getEnergyitemlvoneid() {
        return energyitemlvoneid;
    }

    public void setEnergyitemlvoneid(Integer energyitemlvoneid) {
        this.energyitemlvoneid = energyitemlvoneid;
    }

    public Integer getEnergyitemlvtwoid() {
        return energyitemlvtwoid;
    }

    public void setEnergyitemlvtwoid(Integer energyitemlvtwoid) {
        this.energyitemlvtwoid = energyitemlvtwoid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public Boolean getIssumdata() {
        return issumdata;
    }

    public void setIssumdata(Boolean issumdata) {
        this.issumdata = issumdata;
    }

    public Boolean getBuildingsummary() {
        return buildingsummary;
    }

    public void setBuildingsummary(Boolean buildingsummary) {
        this.buildingsummary = buildingsummary;
    }

    public Boolean getCompanysummary() {
        return companysummary;
    }

    public void setCompanysummary(Boolean companysummary) {
        this.companysummary = companysummary;
    }

    public Boolean getCategorysummary() {
        return categorysummary;
    }

    public void setCategorysummary(Boolean categorysummary) {
        this.categorysummary = categorysummary;
    }

    public Boolean getItemsummary() {
        return itemsummary;
    }

    public void setItemsummary(Boolean itemsummary) {
        this.itemsummary = itemsummary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}