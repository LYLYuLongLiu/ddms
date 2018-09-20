package cn.wisdsoft.ddms.pojo;

public class Subject {
    private Integer id;

    private String subName;

    private String subCoursetype;

    private Integer subClasshour;

    private Integer subCredit;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getSubCoursetype() {
        return subCoursetype;
    }

    public void setSubCoursetype(String subCoursetype) {
        this.subCoursetype = subCoursetype == null ? null : subCoursetype.trim();
    }

    public Integer getSubClasshour() {
        return subClasshour;
    }

    public void setSubClasshour(Integer subClasshour) {
        this.subClasshour = subClasshour;
    }

    public Integer getSubCredit() {
        return subCredit;
    }

    public void setSubCredit(Integer subCredit) {
        this.subCredit = subCredit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}