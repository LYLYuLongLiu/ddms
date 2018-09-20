package cn.wisdsoft.ddms.pojo;

public class Clazz {
    private Integer classid;

    private String className;

    private Integer classNum;

    private Integer classMajorid;

    private Integer collegeid;

    private String remark;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public Integer getClassMajorid() {
        return classMajorid;
    }

    public void setClassMajorid(Integer classMajorid) {
        this.classMajorid = classMajorid;
    }

    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}