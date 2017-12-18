package com.loongray.ecms.mybatis.pojo;

public class CfgBuildingWithBLOBs extends CfgBuilding {
    private String address;

    private String description;

    private byte[] picture;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}