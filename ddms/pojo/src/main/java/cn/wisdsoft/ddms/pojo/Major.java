package cn.wisdsoft.ddms.pojo;

public class Major {
    private String id;

    private String majorName;

    private String majorCollegeid;

    private String majorDisciplinecategories;

    private String majorEducation;

    private Integer schoolsystem;

    private String remark;

    private String collegeName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public String getMajorCollegeid() {
        return majorCollegeid;
    }

    public void setMajorCollegeid(String majorCollegeid) {
        this.majorCollegeid = majorCollegeid == null ? null : majorCollegeid.trim();
    }

    public String getMajorDisciplinecategories() {
        return majorDisciplinecategories;
    }

    public void setMajorDisciplinecategories(String majorDisciplinecategories) {
        this.majorDisciplinecategories = majorDisciplinecategories == null ? null : majorDisciplinecategories.trim();
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