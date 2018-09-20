package cn.wisdsoft.ddms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andWorknumberIsNull() {
            addCriterion("workNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorknumberIsNotNull() {
            addCriterion("workNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorknumberEqualTo(Integer value) {
            addCriterion("workNumber =", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotEqualTo(Integer value) {
            addCriterion("workNumber <>", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberGreaterThan(Integer value) {
            addCriterion("workNumber >", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workNumber >=", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberLessThan(Integer value) {
            addCriterion("workNumber <", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberLessThanOrEqualTo(Integer value) {
            addCriterion("workNumber <=", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberIn(List<Integer> values) {
            addCriterion("workNumber in", values, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotIn(List<Integer> values) {
            addCriterion("workNumber not in", values, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberBetween(Integer value1, Integer value2) {
            addCriterion("workNumber between", value1, value2, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workNumber not between", value1, value2, "worknumber");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_Name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_Name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_Name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_Name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_Name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_Name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_Name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_Name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_Name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_Name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_Name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_Name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_Name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameIsNull() {
            addCriterion("tea_EnglishName is null");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameIsNotNull() {
            addCriterion("tea_EnglishName is not null");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameEqualTo(String value) {
            addCriterion("tea_EnglishName =", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameNotEqualTo(String value) {
            addCriterion("tea_EnglishName <>", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameGreaterThan(String value) {
            addCriterion("tea_EnglishName >", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_EnglishName >=", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameLessThan(String value) {
            addCriterion("tea_EnglishName <", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("tea_EnglishName <=", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameLike(String value) {
            addCriterion("tea_EnglishName like", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameNotLike(String value) {
            addCriterion("tea_EnglishName not like", value, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameIn(List<String> values) {
            addCriterion("tea_EnglishName in", values, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameNotIn(List<String> values) {
            addCriterion("tea_EnglishName not in", values, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameBetween(String value1, String value2) {
            addCriterion("tea_EnglishName between", value1, value2, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaEnglishnameNotBetween(String value1, String value2) {
            addCriterion("tea_EnglishName not between", value1, value2, "teaEnglishname");
            return (Criteria) this;
        }

        public Criteria andTeaPictureIsNull() {
            addCriterion("tea_picture is null");
            return (Criteria) this;
        }

        public Criteria andTeaPictureIsNotNull() {
            addCriterion("tea_picture is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPictureEqualTo(Boolean value) {
            addCriterion("tea_picture =", value, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureNotEqualTo(Boolean value) {
            addCriterion("tea_picture <>", value, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureGreaterThan(Boolean value) {
            addCriterion("tea_picture >", value, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tea_picture >=", value, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureLessThan(Boolean value) {
            addCriterion("tea_picture <", value, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureLessThanOrEqualTo(Boolean value) {
            addCriterion("tea_picture <=", value, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureIn(List<Boolean> values) {
            addCriterion("tea_picture in", values, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureNotIn(List<Boolean> values) {
            addCriterion("tea_picture not in", values, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureBetween(Boolean value1, Boolean value2) {
            addCriterion("tea_picture between", value1, value2, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaPictureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tea_picture not between", value1, value2, "teaPicture");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_Sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(String value) {
            addCriterion("tea_Sex =", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(String value) {
            addCriterion("tea_Sex <>", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(String value) {
            addCriterion("tea_Sex >", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(String value) {
            addCriterion("tea_Sex >=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(String value) {
            addCriterion("tea_Sex <", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(String value) {
            addCriterion("tea_Sex <=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLike(String value) {
            addCriterion("tea_Sex like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotLike(String value) {
            addCriterion("tea_Sex not like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<String> values) {
            addCriterion("tea_Sex in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<String> values) {
            addCriterion("tea_Sex not in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(String value1, String value2) {
            addCriterion("tea_Sex between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(String value1, String value2) {
            addCriterion("tea_Sex not between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateIsNull() {
            addCriterion("tea_BirthDate is null");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateIsNotNull() {
            addCriterion("tea_BirthDate is not null");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("tea_BirthDate =", value, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tea_BirthDate <>", value, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("tea_BirthDate >", value, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_BirthDate >=", value, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("tea_BirthDate <", value, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_BirthDate <=", value, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("tea_BirthDate in", values, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tea_BirthDate not in", values, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_BirthDate between", value1, value2, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_BirthDate not between", value1, value2, "teaBirthdate");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIsNull() {
            addCriterion("tea_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIsNotNull() {
            addCriterion("tea_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneEqualTo(String value) {
            addCriterion("tea_phone =", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotEqualTo(String value) {
            addCriterion("tea_phone <>", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneGreaterThan(String value) {
            addCriterion("tea_phone >", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tea_phone >=", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLessThan(String value) {
            addCriterion("tea_phone <", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLessThanOrEqualTo(String value) {
            addCriterion("tea_phone <=", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneLike(String value) {
            addCriterion("tea_phone like", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotLike(String value) {
            addCriterion("tea_phone not like", value, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneIn(List<String> values) {
            addCriterion("tea_phone in", values, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotIn(List<String> values) {
            addCriterion("tea_phone not in", values, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneBetween(String value1, String value2) {
            addCriterion("tea_phone between", value1, value2, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaPhoneNotBetween(String value1, String value2) {
            addCriterion("tea_phone not between", value1, value2, "teaPhone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneIsNull() {
            addCriterion("tea_sparePhone is null");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneIsNotNull() {
            addCriterion("tea_sparePhone is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneEqualTo(Integer value) {
            addCriterion("tea_sparePhone =", value, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneNotEqualTo(Integer value) {
            addCriterion("tea_sparePhone <>", value, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneGreaterThan(Integer value) {
            addCriterion("tea_sparePhone >", value, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_sparePhone >=", value, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneLessThan(Integer value) {
            addCriterion("tea_sparePhone <", value, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneLessThanOrEqualTo(Integer value) {
            addCriterion("tea_sparePhone <=", value, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneIn(List<Integer> values) {
            addCriterion("tea_sparePhone in", values, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneNotIn(List<Integer> values) {
            addCriterion("tea_sparePhone not in", values, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneBetween(Integer value1, Integer value2) {
            addCriterion("tea_sparePhone between", value1, value2, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaSparephoneNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_sparePhone not between", value1, value2, "teaSparephone");
            return (Criteria) this;
        }

        public Criteria andTeaNationIsNull() {
            addCriterion("tea_Nation is null");
            return (Criteria) this;
        }

        public Criteria andTeaNationIsNotNull() {
            addCriterion("tea_Nation is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNationEqualTo(String value) {
            addCriterion("tea_Nation =", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationNotEqualTo(String value) {
            addCriterion("tea_Nation <>", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationGreaterThan(String value) {
            addCriterion("tea_Nation >", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationGreaterThanOrEqualTo(String value) {
            addCriterion("tea_Nation >=", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationLessThan(String value) {
            addCriterion("tea_Nation <", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationLessThanOrEqualTo(String value) {
            addCriterion("tea_Nation <=", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationLike(String value) {
            addCriterion("tea_Nation like", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationNotLike(String value) {
            addCriterion("tea_Nation not like", value, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationIn(List<String> values) {
            addCriterion("tea_Nation in", values, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationNotIn(List<String> values) {
            addCriterion("tea_Nation not in", values, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationBetween(String value1, String value2) {
            addCriterion("tea_Nation between", value1, value2, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNationNotBetween(String value1, String value2) {
            addCriterion("tea_Nation not between", value1, value2, "teaNation");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceIsNull() {
            addCriterion("tea_Nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceIsNotNull() {
            addCriterion("tea_Nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceEqualTo(String value) {
            addCriterion("tea_Nativeplace =", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceNotEqualTo(String value) {
            addCriterion("tea_Nativeplace <>", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceGreaterThan(String value) {
            addCriterion("tea_Nativeplace >", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("tea_Nativeplace >=", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceLessThan(String value) {
            addCriterion("tea_Nativeplace <", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("tea_Nativeplace <=", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceLike(String value) {
            addCriterion("tea_Nativeplace like", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceNotLike(String value) {
            addCriterion("tea_Nativeplace not like", value, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceIn(List<String> values) {
            addCriterion("tea_Nativeplace in", values, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceNotIn(List<String> values) {
            addCriterion("tea_Nativeplace not in", values, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceBetween(String value1, String value2) {
            addCriterion("tea_Nativeplace between", value1, value2, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaNativeplaceNotBetween(String value1, String value2) {
            addCriterion("tea_Nativeplace not between", value1, value2, "teaNativeplace");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIsNull() {
            addCriterion("tea_address is null");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIsNotNull() {
            addCriterion("tea_address is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAddressEqualTo(String value) {
            addCriterion("tea_address =", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotEqualTo(String value) {
            addCriterion("tea_address <>", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressGreaterThan(String value) {
            addCriterion("tea_address >", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tea_address >=", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLessThan(String value) {
            addCriterion("tea_address <", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLessThanOrEqualTo(String value) {
            addCriterion("tea_address <=", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressLike(String value) {
            addCriterion("tea_address like", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotLike(String value) {
            addCriterion("tea_address not like", value, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressIn(List<String> values) {
            addCriterion("tea_address in", values, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotIn(List<String> values) {
            addCriterion("tea_address not in", values, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressBetween(String value1, String value2) {
            addCriterion("tea_address between", value1, value2, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaAddressNotBetween(String value1, String value2) {
            addCriterion("tea_address not between", value1, value2, "teaAddress");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceIsNull() {
            addCriterion("tea_politicalFace is null");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceIsNotNull() {
            addCriterion("tea_politicalFace is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceEqualTo(String value) {
            addCriterion("tea_politicalFace =", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceNotEqualTo(String value) {
            addCriterion("tea_politicalFace <>", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceGreaterThan(String value) {
            addCriterion("tea_politicalFace >", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceGreaterThanOrEqualTo(String value) {
            addCriterion("tea_politicalFace >=", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceLessThan(String value) {
            addCriterion("tea_politicalFace <", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceLessThanOrEqualTo(String value) {
            addCriterion("tea_politicalFace <=", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceLike(String value) {
            addCriterion("tea_politicalFace like", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceNotLike(String value) {
            addCriterion("tea_politicalFace not like", value, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceIn(List<String> values) {
            addCriterion("tea_politicalFace in", values, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceNotIn(List<String> values) {
            addCriterion("tea_politicalFace not in", values, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceBetween(String value1, String value2) {
            addCriterion("tea_politicalFace between", value1, value2, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaPoliticalfaceNotBetween(String value1, String value2) {
            addCriterion("tea_politicalFace not between", value1, value2, "teaPoliticalface");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardIsNull() {
            addCriterion("tea_idcard is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardIsNotNull() {
            addCriterion("tea_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardEqualTo(String value) {
            addCriterion("tea_idcard =", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardNotEqualTo(String value) {
            addCriterion("tea_idcard <>", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardGreaterThan(String value) {
            addCriterion("tea_idcard >", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("tea_idcard >=", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardLessThan(String value) {
            addCriterion("tea_idcard <", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardLessThanOrEqualTo(String value) {
            addCriterion("tea_idcard <=", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardLike(String value) {
            addCriterion("tea_idcard like", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardNotLike(String value) {
            addCriterion("tea_idcard not like", value, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardIn(List<String> values) {
            addCriterion("tea_idcard in", values, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardNotIn(List<String> values) {
            addCriterion("tea_idcard not in", values, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardBetween(String value1, String value2) {
            addCriterion("tea_idcard between", value1, value2, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaIdcardNotBetween(String value1, String value2) {
            addCriterion("tea_idcard not between", value1, value2, "teaIdcard");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusIsNull() {
            addCriterion("tea_maritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusIsNotNull() {
            addCriterion("tea_maritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusEqualTo(String value) {
            addCriterion("tea_maritalStatus =", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusNotEqualTo(String value) {
            addCriterion("tea_maritalStatus <>", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusGreaterThan(String value) {
            addCriterion("tea_maritalStatus >", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tea_maritalStatus >=", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusLessThan(String value) {
            addCriterion("tea_maritalStatus <", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("tea_maritalStatus <=", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusLike(String value) {
            addCriterion("tea_maritalStatus like", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusNotLike(String value) {
            addCriterion("tea_maritalStatus not like", value, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusIn(List<String> values) {
            addCriterion("tea_maritalStatus in", values, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusNotIn(List<String> values) {
            addCriterion("tea_maritalStatus not in", values, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusBetween(String value1, String value2) {
            addCriterion("tea_maritalStatus between", value1, value2, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("tea_maritalStatus not between", value1, value2, "teaMaritalstatus");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduIsNull() {
            addCriterion("tea_degreeEdu is null");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduIsNotNull() {
            addCriterion("tea_degreeEdu is not null");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduEqualTo(String value) {
            addCriterion("tea_degreeEdu =", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduNotEqualTo(String value) {
            addCriterion("tea_degreeEdu <>", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduGreaterThan(String value) {
            addCriterion("tea_degreeEdu >", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduGreaterThanOrEqualTo(String value) {
            addCriterion("tea_degreeEdu >=", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduLessThan(String value) {
            addCriterion("tea_degreeEdu <", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduLessThanOrEqualTo(String value) {
            addCriterion("tea_degreeEdu <=", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduLike(String value) {
            addCriterion("tea_degreeEdu like", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduNotLike(String value) {
            addCriterion("tea_degreeEdu not like", value, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduIn(List<String> values) {
            addCriterion("tea_degreeEdu in", values, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduNotIn(List<String> values) {
            addCriterion("tea_degreeEdu not in", values, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduBetween(String value1, String value2) {
            addCriterion("tea_degreeEdu between", value1, value2, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaDegreeeduNotBetween(String value1, String value2) {
            addCriterion("tea_degreeEdu not between", value1, value2, "teaDegreeedu");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleIsNull() {
            addCriterion("tea_jobTitle is null");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleIsNotNull() {
            addCriterion("tea_jobTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleEqualTo(String value) {
            addCriterion("tea_jobTitle =", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleNotEqualTo(String value) {
            addCriterion("tea_jobTitle <>", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleGreaterThan(String value) {
            addCriterion("tea_jobTitle >", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("tea_jobTitle >=", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleLessThan(String value) {
            addCriterion("tea_jobTitle <", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleLessThanOrEqualTo(String value) {
            addCriterion("tea_jobTitle <=", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleLike(String value) {
            addCriterion("tea_jobTitle like", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleNotLike(String value) {
            addCriterion("tea_jobTitle not like", value, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleIn(List<String> values) {
            addCriterion("tea_jobTitle in", values, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleNotIn(List<String> values) {
            addCriterion("tea_jobTitle not in", values, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleBetween(String value1, String value2) {
            addCriterion("tea_jobTitle between", value1, value2, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaJobtitleNotBetween(String value1, String value2) {
            addCriterion("tea_jobTitle not between", value1, value2, "teaJobtitle");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyIsNull() {
            addCriterion("tea_CJGZNY is null");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyIsNotNull() {
            addCriterion("tea_CJGZNY is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJGZNY =", value, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyNotEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJGZNY <>", value, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyGreaterThan(Date value) {
            addCriterionForJDBCDate("tea_CJGZNY >", value, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJGZNY >=", value, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyLessThan(Date value) {
            addCriterionForJDBCDate("tea_CJGZNY <", value, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJGZNY <=", value, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyIn(List<Date> values) {
            addCriterionForJDBCDate("tea_CJGZNY in", values, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyNotIn(List<Date> values) {
            addCriterionForJDBCDate("tea_CJGZNY not in", values, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_CJGZNY between", value1, value2, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjgznyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_CJGZNY not between", value1, value2, "teaCjgzny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyIsNull() {
            addCriterion("tea_CJNY is null");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyIsNotNull() {
            addCriterion("tea_CJNY is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJNY =", value, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyNotEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJNY <>", value, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyGreaterThan(Date value) {
            addCriterionForJDBCDate("tea_CJNY >", value, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJNY >=", value, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyLessThan(Date value) {
            addCriterionForJDBCDate("tea_CJNY <", value, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_CJNY <=", value, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyIn(List<Date> values) {
            addCriterionForJDBCDate("tea_CJNY in", values, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyNotIn(List<Date> values) {
            addCriterionForJDBCDate("tea_CJNY not in", values, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_CJNY between", value1, value2, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCjnyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_CJNY not between", value1, value2, "teaCjny");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeIsNull() {
            addCriterion("tea_credentialsTime is null");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeIsNotNull() {
            addCriterion("tea_credentialsTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeEqualTo(Date value) {
            addCriterionForJDBCDate("tea_credentialsTime =", value, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tea_credentialsTime <>", value, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tea_credentialsTime >", value, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_credentialsTime >=", value, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeLessThan(Date value) {
            addCriterionForJDBCDate("tea_credentialsTime <", value, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_credentialsTime <=", value, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeIn(List<Date> values) {
            addCriterionForJDBCDate("tea_credentialsTime in", values, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tea_credentialsTime not in", values, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_credentialsTime between", value1, value2, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCredentialstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_credentialsTime not between", value1, value2, "teaCredentialstime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeIsNull() {
            addCriterion("tea_comeTime is null");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeIsNotNull() {
            addCriterion("tea_comeTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeEqualTo(Date value) {
            addCriterionForJDBCDate("tea_comeTime =", value, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tea_comeTime <>", value, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tea_comeTime >", value, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_comeTime >=", value, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeLessThan(Date value) {
            addCriterionForJDBCDate("tea_comeTime <", value, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tea_comeTime <=", value, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeIn(List<Date> values) {
            addCriterionForJDBCDate("tea_comeTime in", values, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tea_comeTime not in", values, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_comeTime between", value1, value2, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaCometimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tea_comeTime not between", value1, value2, "teaCometime");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkIsNull() {
            addCriterion("tea_RKZK is null");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkIsNotNull() {
            addCriterion("tea_RKZK is not null");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkEqualTo(String value) {
            addCriterion("tea_RKZK =", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkNotEqualTo(String value) {
            addCriterion("tea_RKZK <>", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkGreaterThan(String value) {
            addCriterion("tea_RKZK >", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkGreaterThanOrEqualTo(String value) {
            addCriterion("tea_RKZK >=", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkLessThan(String value) {
            addCriterion("tea_RKZK <", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkLessThanOrEqualTo(String value) {
            addCriterion("tea_RKZK <=", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkLike(String value) {
            addCriterion("tea_RKZK like", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkNotLike(String value) {
            addCriterion("tea_RKZK not like", value, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkIn(List<String> values) {
            addCriterion("tea_RKZK in", values, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkNotIn(List<String> values) {
            addCriterion("tea_RKZK not in", values, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkBetween(String value1, String value2) {
            addCriterion("tea_RKZK between", value1, value2, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaRkzkNotBetween(String value1, String value2) {
            addCriterion("tea_RKZK not between", value1, value2, "teaRkzk");
            return (Criteria) this;
        }

        public Criteria andTeaTypeIsNull() {
            addCriterion("tea_type is null");
            return (Criteria) this;
        }

        public Criteria andTeaTypeIsNotNull() {
            addCriterion("tea_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeaTypeEqualTo(String value) {
            addCriterion("tea_type =", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotEqualTo(String value) {
            addCriterion("tea_type <>", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeGreaterThan(String value) {
            addCriterion("tea_type >", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tea_type >=", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeLessThan(String value) {
            addCriterion("tea_type <", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeLessThanOrEqualTo(String value) {
            addCriterion("tea_type <=", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeLike(String value) {
            addCriterion("tea_type like", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotLike(String value) {
            addCriterion("tea_type not like", value, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeIn(List<String> values) {
            addCriterion("tea_type in", values, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotIn(List<String> values) {
            addCriterion("tea_type not in", values, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeBetween(String value1, String value2) {
            addCriterion("tea_type between", value1, value2, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaTypeNotBetween(String value1, String value2) {
            addCriterion("tea_type not between", value1, value2, "teaType");
            return (Criteria) this;
        }

        public Criteria andTeaCampusIsNull() {
            addCriterion("tea_campus is null");
            return (Criteria) this;
        }

        public Criteria andTeaCampusIsNotNull() {
            addCriterion("tea_campus is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCampusEqualTo(String value) {
            addCriterion("tea_campus =", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusNotEqualTo(String value) {
            addCriterion("tea_campus <>", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusGreaterThan(String value) {
            addCriterion("tea_campus >", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusGreaterThanOrEqualTo(String value) {
            addCriterion("tea_campus >=", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusLessThan(String value) {
            addCriterion("tea_campus <", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusLessThanOrEqualTo(String value) {
            addCriterion("tea_campus <=", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusLike(String value) {
            addCriterion("tea_campus like", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusNotLike(String value) {
            addCriterion("tea_campus not like", value, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusIn(List<String> values) {
            addCriterion("tea_campus in", values, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusNotIn(List<String> values) {
            addCriterion("tea_campus not in", values, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusBetween(String value1, String value2) {
            addCriterion("tea_campus between", value1, value2, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andTeaCampusNotBetween(String value1, String value2) {
            addCriterion("tea_campus not between", value1, value2, "teaCampus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}