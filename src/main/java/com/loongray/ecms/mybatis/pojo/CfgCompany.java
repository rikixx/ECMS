package com.loongray.ecms.mybatis.pojo;

public class CfgCompany {
    private Integer roomid;

    private Integer buildingid;

    private Boolean needstatistic;

    private String roomname;

    private String description;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Boolean getNeedstatistic() {
        return needstatistic;
    }

    public void setNeedstatistic(Boolean needstatistic) {
        this.needstatistic = needstatistic;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}