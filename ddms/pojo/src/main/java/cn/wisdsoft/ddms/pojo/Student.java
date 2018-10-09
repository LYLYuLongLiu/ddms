package cn.wisdsoft.ddms.pojo;

import java.util.Date;

public class Student {
    private String id;

    private String stuName;

    private String stuPicture;

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

    private String stuClazzid;

    private Integer stuDormitoryid;

    private String stuNational;

    private String stuDelflag;

    private String stuStatus;

    private String remark;

    private String clazzName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPicture() {
        return stuPicture;
    }

    public void setStuPicture(String stuPicture) {
        this.stuPicture = stuPicture == null ? null : stuPicture.trim();
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

    public String getStuClazzid() {
        return stuClazzid;
    }

    public void setStuClazzid(String stuClazzid) {
        this.stuClazzid = stuClazzid == null ? null : stuClazzid.trim();
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

    public String getStuDelflag() {
        return stuDelflag;
    }

    public void setStuDelflag(String stuDelflag) {
        this.stuDelflag = stuDelflag == null ? null : stuDelflag.trim();
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

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName == null ? null : clazzName.trim();
    }
}