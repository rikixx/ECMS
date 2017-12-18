package com.loongray.ecms.mybatis.pojo;

public class CfgEvent {
    private Integer eventid;

    private Integer equipmentid;

    private Integer signalgroupid;

    private Integer pointid;

    private String eventname;

    private String tagname;

    private Integer value;

    private Boolean neednotify;

    private Integer lastminute;

    private Boolean useemail;

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
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

    public Integer getPointid() {
        return pointid;
    }

    public void setPointid(Integer pointid) {
        this.pointid = pointid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname == null ? null : eventname.trim();
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Boolean getNeednotify() {
        return neednotify;
    }

    public void setNeednotify(Boolean neednotify) {
        this.neednotify = neednotify;
    }

    public Integer getLastminute() {
        return lastminute;
    }

    public void setLastminute(Integer lastminute) {
        this.lastminute = lastminute;
    }

    public Boolean getUseemail() {
        return useemail;
    }

    public void setUseemail(Boolean useemail) {
        this.useemail = useemail;
    }
}