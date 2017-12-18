package com.loongray.ecms.mybatis.pojo;

public class CfgCommand {
    private Integer commandid;

    private String commandname;

    private Integer equipmentid;

    private Integer machineid;

    private Integer commandgroupid;

    private Integer templateid;

    private String targetip;

    private Integer targetport;

    private Boolean templatecommand;

    private Integer autoexecdelay;

    private Integer autoexectimes;

    private Boolean needautoexec;

    public Integer getCommandid() {
        return commandid;
    }

    public void setCommandid(Integer commandid) {
        this.commandid = commandid;
    }

    public String getCommandname() {
        return commandname;
    }

    public void setCommandname(String commandname) {
        this.commandname = commandname == null ? null : commandname.trim();
    }

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public Integer getMachineid() {
        return machineid;
    }

    public void setMachineid(Integer machineid) {
        this.machineid = machineid;
    }

    public Integer getCommandgroupid() {
        return commandgroupid;
    }

    public void setCommandgroupid(Integer commandgroupid) {
        this.commandgroupid = commandgroupid;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public String getTargetip() {
        return targetip;
    }

    public void setTargetip(String targetip) {
        this.targetip = targetip == null ? null : targetip.trim();
    }

    public Integer getTargetport() {
        return targetport;
    }

    public void setTargetport(Integer targetport) {
        this.targetport = targetport;
    }

    public Boolean getTemplatecommand() {
        return templatecommand;
    }

    public void setTemplatecommand(Boolean templatecommand) {
        this.templatecommand = templatecommand;
    }

    public Integer getAutoexecdelay() {
        return autoexecdelay;
    }

    public void setAutoexecdelay(Integer autoexecdelay) {
        this.autoexecdelay = autoexecdelay;
    }

    public Integer getAutoexectimes() {
        return autoexectimes;
    }

    public void setAutoexectimes(Integer autoexectimes) {
        this.autoexectimes = autoexectimes;
    }

    public Boolean getNeedautoexec() {
        return needautoexec;
    }

    public void setNeedautoexec(Boolean needautoexec) {
        this.needautoexec = needautoexec;
    }
}