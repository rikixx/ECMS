package com.loongray.ecms.mybatis.pojo;

public class SysDictEnergyCategory {
    private Integer uniqueid;

    private String energycategorycode;

    private String energycategoryname;

    private Double convertparam;

    private String unit;

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

    public String getEnergycategoryname() {
        return energycategoryname;
    }

    public void setEnergycategoryname(String energycategoryname) {
        this.energycategoryname = energycategoryname == null ? null : energycategoryname.trim();
    }

    public Double getConvertparam() {
        return convertparam;
    }

    public void setConvertparam(Double convertparam) {
        this.convertparam = convertparam;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}