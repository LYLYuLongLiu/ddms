package cn.wisdsoft.ddms.pojo;

public class Curriculum {
    private String id;

    private String curName;

    private String curCoursetype;

    private Integer curClazzhour;

    private Integer curCredit;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName == null ? null : curName.trim();
    }

    public String getCurCoursetype() {
        return curCoursetype;
    }

    public void setCurCoursetype(String curCoursetype) {
        this.curCoursetype = curCoursetype == null ? null : curCoursetype.trim();
    }

    public Integer getCurClazzhour() {
        return curClazzhour;
    }

    public void setCurClazzhour(Integer curClazzhour) {
        this.curClazzhour = curClazzhour;
    }

    public Integer getCurCredit() {
        return curCredit;
    }

    public void setCurCredit(Integer curCredit) {
        this.curCredit = curCredit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}