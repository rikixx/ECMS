package com.loongray.ecms.mybatis.pojo;

public class SysDictEnergyItemLvTwo {
    private Integer uniqueid;

    private String energycategorycode;

    private String energyitemcode;

    private String itemlvonecode;

    private String itemlvtwocode;

    private String itemlvtwoname;

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

    public String getItemlvtwocode() {
        return itemlvtwocode;
    }

    public void setItemlvtwocode(String itemlvtwocode) {
        this.itemlvtwocode = itemlvtwocode == null ? null : itemlvtwocode.trim();
    }

    public String getItemlvtwoname() {
        return itemlvtwoname;
    }

    public void setItemlvtwoname(String itemlvtwoname) {
        this.itemlvtwoname = itemlvtwoname == null ? null : itemlvtwoname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}