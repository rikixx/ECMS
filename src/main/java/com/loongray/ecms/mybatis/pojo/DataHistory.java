package com.loongray.ecms.mybatis.pojo;

import java.util.Date;

public class DataHistory {
    private Integer signalid;

    private Double value;

    private Date measuretime;

    private String tagname;

    public Integer getSignalid() {
        return signalid;
    }

    public void setSignalid(Integer signalid) {
        this.signalid = signalid;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getMeasuretime() {
        return measuretime;
    }

    public void setMeasuretime(Date measuretime) {
        this.measuretime = measuretime;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }
}