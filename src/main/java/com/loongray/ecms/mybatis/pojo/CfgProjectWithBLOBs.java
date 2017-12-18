package com.loongray.ecms.mybatis.pojo;

public class CfgProjectWithBLOBs extends CfgProject {
    private String projectmembers;

    private String description;

    public String getProjectmembers() {
        return projectmembers;
    }

    public void setProjectmembers(String projectmembers) {
        this.projectmembers = projectmembers == null ? null : projectmembers.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}