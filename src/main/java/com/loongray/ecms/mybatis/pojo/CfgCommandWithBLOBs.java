package com.loongray.ecms.mybatis.pojo;

public class CfgCommandWithBLOBs extends CfgCommand {
    private String description;

    private String contents;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }
}