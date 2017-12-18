package com.loongray.ecms.mybatis.pojo;

import java.util.Date;

public class CfgUser {
    private Integer userid;

    private Integer userrole;

    private String username;

    private String loginid;

    private String password;

    private String emailaddress;

    private String signquestion;

    private String signanswer;

    private Integer retrycount;

    private Boolean islocked;

    private Date lastlogintime;

    private Date validtime;

    private String description;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserrole() {
        return userrole;
    }

    public void setUserrole(Integer userrole) {
        this.userrole = userrole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress == null ? null : emailaddress.trim();
    }

    public String getSignquestion() {
        return signquestion;
    }

    public void setSignquestion(String signquestion) {
        this.signquestion = signquestion == null ? null : signquestion.trim();
    }

    public String getSignanswer() {
        return signanswer;
    }

    public void setSignanswer(String signanswer) {
        this.signanswer = signanswer == null ? null : signanswer.trim();
    }

    public Integer getRetrycount() {
        return retrycount;
    }

    public void setRetrycount(Integer retrycount) {
        this.retrycount = retrycount;
    }

    public Boolean getIslocked() {
        return islocked;
    }

    public void setIslocked(Boolean islocked) {
        this.islocked = islocked;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getValidtime() {
        return validtime;
    }

    public void setValidtime(Date validtime) {
        this.validtime = validtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}