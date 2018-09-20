package cn.wisdsoft.ddms.pojo;

public class Major {
    private Integer id;

    private String majorName;

    private Integer majorCollegeid;

    private Integer majorDisciplinecategories;

    private String majorEducation;

    private Integer schoolsystem;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public Integer getMajorCollegeid() {
        return majorCollegeid;
    }

    public void setMajorCollegeid(Integer majorCollegeid) {
        this.majorCollegeid = majorCollegeid;
    }

    public Integer getMajorDisciplinecategories() {
        return majorDisciplinecategories;
    }

    public void setMajorDisciplinecategories(Integer majorDisciplinecategories) {
        this.majorDisciplinecategories = majorDisciplinecategories;
    }

    public String getMajorEducation() {
        return majorEducation;
    }

    public void setMajorEducation(String majorEducation) {
        this.majorEducation = majorEducation == null ? null : majorEducation.trim();
    }

    public Integer getSchoolsystem() {
        return schoolsystem;
    }

    public void setSchoolsystem(Integer schoolsystem) {
        this.schoolsystem = schoolsystem;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}