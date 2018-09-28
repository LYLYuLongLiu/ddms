package cn.wisdsoft.ddms.pojo;

public class Clazz {
    private String id;

    private String clazzName;

    private Integer clazzNum;

    private String clazzMajorid;

    private String collegeid;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName == null ? null : clazzName.trim();
    }

    public Integer getClazzNum() {
        return clazzNum;
    }

    public void setClazzNum(Integer clazzNum) {
        this.clazzNum = clazzNum;
    }

    public String getClazzMajorid() {
        return clazzMajorid;
    }

    public void setClazzMajorid(String clazzMajorid) {
        this.clazzMajorid = clazzMajorid == null ? null : clazzMajorid.trim();
    }

    public String getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid == null ? null : collegeid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}