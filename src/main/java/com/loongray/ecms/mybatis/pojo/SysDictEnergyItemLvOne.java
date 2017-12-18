package com.loongray.ecms.mybatis.pojo;

public class SysDictEnergyItemLvOne {
    private Integer uniqueid;

    private String energycategorycode;

    private String energyitemcode;

    private String itemlvonecode;

    private String itemlvonename;

    private String description;

    public Integer getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(Integer uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getEnergycategorycode() {
        return energycategorycode;
    }

    public void setEnergycategorycode(String energycategorycode) {
        this.energycategorycode = energycategorycode == null ? null : energycategorycode.trim();
    }

    public String getEnergyitemcode() {
        return energyitemcode;
    }

    public void setEnergyitemcode(String energyitemcode) {
        this.energyitemcode = energyitemcode == null ? null : energyitemcode.trim();
    }

    public String getItemlvonecode() {
        return itemlvonecode;
    }

    public void setItemlvonecode(String itemlvonecode) {
        this.itemlvonecode = itemlvonecode == null ? null : itemlvonecode.trim();
    }

    public String getItemlvonename() {
        return itemlvonename;
    }

    public void setItemlvonename(String itemlvonename) {
        this.itemlvonename = itemlvonename == null ? null : itemlvonename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}