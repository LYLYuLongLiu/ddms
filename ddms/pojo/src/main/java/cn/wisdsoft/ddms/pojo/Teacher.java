package cn.wisdsoft.ddms.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Teacher implements Serializable {

    private static final long serialVersionUID = -7291874061103907622L;

    private String worknumber;

    private String teaName;

    private String teaEnglishname;

    private String teaPicture;

    private String teaSex;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date teaBirthdate;

    private String teaPhone;

    private String teaSparephone;

    private String teaNation;

    private String teaNativeplace;

    private String teaAddress;

    private String teaPoliticalface;

    private String teaIdcard;

    private String teaMaritalstatus;

    private String teaDegreeedu;

    private String teaJobtitle;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date teaCjgzny;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date teaCjny;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date teaCredentialstime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date teaCometime;

    private String teaRkzk;

    private String teaType;

    private String teaCampus;

    private String remark;

    public String getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(String worknumber) {
        this.worknumber = worknumber == null ? null : worknumber.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaEnglishname() {
        return teaEnglishname;
    }

    public void setTeaEnglishname(String teaEnglishname) {
        this.teaEnglishname = teaEnglishname == null ? null : teaEnglishname.trim();
    }

    public String getTeaPicture() {
        return teaPicture;
    }

    public void setTeaPicture(String teaPicture) {
        this.teaPicture = teaPicture == null ? null : teaPicture.trim();
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }

    public Date getTeaBirthdate() {
        return teaBirthdate;
    }

    public void setTeaBirthdate(Date teaBirthdate) {
        this.teaBirthdate = teaBirthdate;
    }

    public String getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone == null ? null : teaPhone.trim();
    }

    public String getTeaSparephone() {
        return teaSparephone;
    }

    public void setTeaSparephone(String teaSparephone) {
        this.teaSparephone = teaSparephone == null ? null : teaSparephone.trim();
    }

    public String getTeaNation() {
        return teaNation;
    }

    public void setTeaNation(String teaNation) {
        this.teaNation = teaNation == null ? null : teaNation.trim();
    }

    public String getTeaNativeplace() {
        return teaNativeplace;
    }

    public void setTeaNativeplace(String teaNativeplace) {
        this.teaNativeplace = teaNativeplace == null ? null : teaNativeplace.trim();
    }

    public String getTeaAddress() {
        return teaAddress;
    }

    public void setTeaAddress(String teaAddress) {
        this.teaAddress = teaAddress == null ? null : teaAddress.trim();
    }

    public String getTeaPoliticalface() {
        return teaPoliticalface;
    }

    public void setTeaPoliticalface(String teaPoliticalface) {
        this.teaPoliticalface = teaPoliticalface == null ? null : teaPoliticalface.trim();
    }

    public String getTeaIdcard() {
        return teaIdcard;
    }

    public void setTeaIdcard(String teaIdcard) {
        this.teaIdcard = teaIdcard == null ? null : teaIdcard.trim();
    }

    public String getTeaMaritalstatus() {
        return teaMaritalstatus;
    }

    public void setTeaMaritalstatus(String teaMaritalstatus) {
        this.teaMaritalstatus = teaMaritalstatus == null ? null : teaMaritalstatus.trim();
    }

    public String getTeaDegreeedu() {
        return teaDegreeedu;
    }

    public void setTeaDegreeedu(String teaDegreeedu) {
        this.teaDegreeedu = teaDegreeedu == null ? null : teaDegreeedu.trim();
    }

    public String getTeaJobtitle() {
        return teaJobtitle;
    }

    public void setTeaJobtitle(String teaJobtitle) {
        this.teaJobtitle = teaJobtitle == null ? null : teaJobtitle.trim();
    }

    public Date getTeaCjgzny() {
        return teaCjgzny;
    }

    public void setTeaCjgzny(Date teaCjgzny) {
        this.teaCjgzny = teaCjgzny;
    }

    public Date getTeaCjny() {
        return teaCjny;
    }

    public void setTeaCjny(Date teaCjny) {
        this.teaCjny = teaCjny;
    }

    public Date getTeaCredentialstime() {
        return teaCredentialstime;
    }

    public void setTeaCredentialstime(Date teaCredentialstime) {
        this.teaCredentialstime = teaCredentialstime;
    }

    public Date getTeaCometime() {
        return teaCometime;
    }

    public void setTeaCometime(Date teaCometime) {
        this.teaCometime = teaCometime;
    }

    public String getTeaRkzk() {
        return teaRkzk;
    }

    public void setTeaRkzk(String teaRkzk) {
        this.teaRkzk = teaRkzk == null ? null : teaRkzk.trim();
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType == null ? null : teaType.trim();
    }

    public String getTeaCampus() {
        return teaCampus;
    }

    public void setTeaCampus(String teaCampus) {
        this.teaCampus = teaCampus == null ? null : teaCampus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}