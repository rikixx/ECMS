package com.loongray.ecms.mybatis.pojo;

public class SysDictEnergyItem {
    private Integer uniqueid;

    private String energycategorycode;

    private String energyitemcode;

    private String energyitemname;

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

    public String getEnergyitemname() {
        return energyitemname;
    }

    public void setEnergyitemname(String energyitemname) {
        this.energyitemname = energyitemname == null ? null : energyitemname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}