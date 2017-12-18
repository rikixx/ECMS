package com.loongray.ecms.mybatis.pojo;

public class CfgEventWithBLOBs extends CfgEvent {
    private String contents;

    private String recievername;

    private String recieverphonenum;

    private String recieveremail;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public String getRecievername() {
        return recievername;
    }

    public void setRecievername(String recievername) {
        this.recievername = recievername == null ? null : recievername.trim();
    }

    public String getRecieverphonenum() {
        return recieverphonenum;
    }

    public void setRecieverphonenum(String recieverphonenum) {
        this.recieverphonenum = recieverphonenum == null ? null : recieverphonenum.trim();
    }

    public String getRecieveremail() {
        return recieveremail;
    }

    public void setRecieveremail(String recieveremail) {
        this.recieveremail = recieveremail == null ? null : recieveremail.trim();
    }
}