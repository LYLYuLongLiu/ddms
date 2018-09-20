package cn.wisdsoft.ddms.pojo;

public class Administrators {
    private Integer id;

    private String adminAccnum;

    private String adminPassword;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminAccnum() {
        return adminAccnum;
    }

    public void setAdminAccnum(String adminAccnum) {
        this.adminAccnum = adminAccnum == null ? null : adminAccnum.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}