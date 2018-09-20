package cn.wisdsoft.ddms.pojo;

import java.util.Date;

public class Student {
    private String stuId;

    private String stuName;

    private Boolean stuPicture;

    private String stuSex;

    private Date stuBrithdate;

    private String stuNative;

    private Date stuEntrancetime;

    private Date stuGraduationtime;

    private String stuPoliticalface;

    private String stuFamilynum;

    private String stuAddress;

    private Integer stuPhone;

    private String stuIdcard;

    private Integer stuClassid;

    private Integer stuDormitoryid;

    private String stuNational;

    private String stuStatus;

    private String remark;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Boolean getStuPicture() {
        return stuPicture;
    }

    public void setStuPicture(Boolean stuPicture) {
        this.stuPicture = stuPicture;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public Date getStuBrithdate() {
        return stuBrithdate;
    }

    public void setStuBrithdate(Date stuBrithdate) {
        this.stuBrithdate = stuBrithdate;
    }

    public String getStuNative() {
        return stuNative;
    }

    public void setStuNative(String stuNative) {
        this.stuNative = stuNative == null ? null : stuNative.trim();
    }

    public Date getStuEntrancetime() {
        return stuEntrancetime;
    }

    public void setStuEntrancetime(Date stuEntrancetime) {
        this.stuEntrancetime = stuEntrancetime;
    }

    public Date getStuGraduationtime() {
        return stuGraduationtime;
    }

    public void setStuGraduationtime(Date stuGraduationtime) {
        this.stuGraduationtime = stuGraduationtime;
    }

    public String getStuPoliticalface() {
        return stuPoliticalface;
    }

    public void setStuPoliticalface(String stuPoliticalface) {
        this.stuPoliticalface = stuPoliticalface == null ? null : stuPoliticalface.trim();
    }

    public String getStuFamilynum() {
        return stuFamilynum;
    }

    public void setStuFamilynum(String stuFamilynum) {
        this.stuFamilynum = stuFamilynum == null ? null : stuFamilynum.trim();
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress == null ? null : stuAddress.trim();
    }

    public Integer getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(Integer stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuIdcard() {
        return stuIdcard;
    }

    public void setStuIdcard(String stuIdcard) {
        this.stuIdcard = stuIdcard == null ? null : stuIdcard.trim();
    }

    public Integer getStuClassid() {
        return stuClassid;
    }

    public void setStuClassid(Integer stuClassid) {
        this.stuClassid = stuClassid;
    }

    public Integer getStuDormitoryid() {
        return stuDormitoryid;
    }

    public void setStuDormitoryid(Integer stuDormitoryid) {
        this.stuDormitoryid = stuDormitoryid;
    }

    public String getStuNational() {
        return stuNational;
    }

    public void setStuNational(String stuNational) {
        this.stuNational = stuNational == null ? null : stuNational.trim();
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus == null ? null : stuStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}