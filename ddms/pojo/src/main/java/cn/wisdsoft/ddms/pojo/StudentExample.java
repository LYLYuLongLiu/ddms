package cn.wisdsoft.ddms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuPictureIsNull() {
            addCriterion("stu_picture is null");
            return (Criteria) this;
        }

        public Criteria andStuPictureIsNotNull() {
            addCriterion("stu_picture is not null");
            return (Criteria) this;
        }

        public Criteria andStuPictureEqualTo(Boolean value) {
            addCriterion("stu_picture =", value, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureNotEqualTo(Boolean value) {
            addCriterion("stu_picture <>", value, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureGreaterThan(Boolean value) {
            addCriterion("stu_picture >", value, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stu_picture >=", value, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureLessThan(Boolean value) {
            addCriterion("stu_picture <", value, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureLessThanOrEqualTo(Boolean value) {
            addCriterion("stu_picture <=", value, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureIn(List<Boolean> values) {
            addCriterion("stu_picture in", values, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureNotIn(List<Boolean> values) {
            addCriterion("stu_picture not in", values, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureBetween(Boolean value1, Boolean value2) {
            addCriterion("stu_picture between", value1, value2, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuPictureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stu_picture not between", value1, value2, "stuPicture");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateIsNull() {
            addCriterion("stu_brithDate is null");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateIsNotNull() {
            addCriterion("stu_brithDate is not null");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateEqualTo(Date value) {
            addCriterionForJDBCDate("stu_brithDate =", value, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("stu_brithDate <>", value, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateGreaterThan(Date value) {
            addCriterionForJDBCDate("stu_brithDate >", value, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_brithDate >=", value, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateLessThan(Date value) {
            addCriterionForJDBCDate("stu_brithDate <", value, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_brithDate <=", value, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateIn(List<Date> values) {
            addCriterionForJDBCDate("stu_brithDate in", values, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("stu_brithDate not in", values, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_brithDate between", value1, value2, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuBrithdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_brithDate not between", value1, value2, "stuBrithdate");
            return (Criteria) this;
        }

        public Criteria andStuNativeIsNull() {
            addCriterion("stu_native is null");
            return (Criteria) this;
        }

        public Criteria andStuNativeIsNotNull() {
            addCriterion("stu_native is not null");
            return (Criteria) this;
        }

        public Criteria andStuNativeEqualTo(String value) {
            addCriterion("stu_native =", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeNotEqualTo(String value) {
            addCriterion("stu_native <>", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeGreaterThan(String value) {
            addCriterion("stu_native >", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_native >=", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeLessThan(String value) {
            addCriterion("stu_native <", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeLessThanOrEqualTo(String value) {
            addCriterion("stu_native <=", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeLike(String value) {
            addCriterion("stu_native like", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeNotLike(String value) {
            addCriterion("stu_native not like", value, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeIn(List<String> values) {
            addCriterion("stu_native in", values, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeNotIn(List<String> values) {
            addCriterion("stu_native not in", values, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeBetween(String value1, String value2) {
            addCriterion("stu_native between", value1, value2, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuNativeNotBetween(String value1, String value2) {
            addCriterion("stu_native not between", value1, value2, "stuNative");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeIsNull() {
            addCriterion("stu_entranceTime is null");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeIsNotNull() {
            addCriterion("stu_entranceTime is not null");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeEqualTo(Date value) {
            addCriterionForJDBCDate("stu_entranceTime =", value, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("stu_entranceTime <>", value, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("stu_entranceTime >", value, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_entranceTime >=", value, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeLessThan(Date value) {
            addCriterionForJDBCDate("stu_entranceTime <", value, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_entranceTime <=", value, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeIn(List<Date> values) {
            addCriterionForJDBCDate("stu_entranceTime in", values, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("stu_entranceTime not in", values, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_entranceTime between", value1, value2, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuEntrancetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_entranceTime not between", value1, value2, "stuEntrancetime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeIsNull() {
            addCriterion("stu_graduationTime is null");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeIsNotNull() {
            addCriterion("stu_graduationTime is not null");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeEqualTo(Date value) {
            addCriterionForJDBCDate("stu_graduationTime =", value, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("stu_graduationTime <>", value, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("stu_graduationTime >", value, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_graduationTime >=", value, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeLessThan(Date value) {
            addCriterionForJDBCDate("stu_graduationTime <", value, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stu_graduationTime <=", value, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeIn(List<Date> values) {
            addCriterionForJDBCDate("stu_graduationTime in", values, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("stu_graduationTime not in", values, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_graduationTime between", value1, value2, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuGraduationtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stu_graduationTime not between", value1, value2, "stuGraduationtime");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceIsNull() {
            addCriterion("stu_politicalFace is null");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceIsNotNull() {
            addCriterion("stu_politicalFace is not null");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceEqualTo(String value) {
            addCriterion("stu_politicalFace =", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceNotEqualTo(String value) {
            addCriterion("stu_politicalFace <>", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceGreaterThan(String value) {
            addCriterion("stu_politicalFace >", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceGreaterThanOrEqualTo(String value) {
            addCriterion("stu_politicalFace >=", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceLessThan(String value) {
            addCriterion("stu_politicalFace <", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceLessThanOrEqualTo(String value) {
            addCriterion("stu_politicalFace <=", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceLike(String value) {
            addCriterion("stu_politicalFace like", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceNotLike(String value) {
            addCriterion("stu_politicalFace not like", value, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceIn(List<String> values) {
            addCriterion("stu_politicalFace in", values, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceNotIn(List<String> values) {
            addCriterion("stu_politicalFace not in", values, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceBetween(String value1, String value2) {
            addCriterion("stu_politicalFace between", value1, value2, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuPoliticalfaceNotBetween(String value1, String value2) {
            addCriterion("stu_politicalFace not between", value1, value2, "stuPoliticalface");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumIsNull() {
            addCriterion("stu_familyNum is null");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumIsNotNull() {
            addCriterion("stu_familyNum is not null");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumEqualTo(String value) {
            addCriterion("stu_familyNum =", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumNotEqualTo(String value) {
            addCriterion("stu_familyNum <>", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumGreaterThan(String value) {
            addCriterion("stu_familyNum >", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumGreaterThanOrEqualTo(String value) {
            addCriterion("stu_familyNum >=", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumLessThan(String value) {
            addCriterion("stu_familyNum <", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumLessThanOrEqualTo(String value) {
            addCriterion("stu_familyNum <=", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumLike(String value) {
            addCriterion("stu_familyNum like", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumNotLike(String value) {
            addCriterion("stu_familyNum not like", value, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumIn(List<String> values) {
            addCriterion("stu_familyNum in", values, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumNotIn(List<String> values) {
            addCriterion("stu_familyNum not in", values, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumBetween(String value1, String value2) {
            addCriterion("stu_familyNum between", value1, value2, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuFamilynumNotBetween(String value1, String value2) {
            addCriterion("stu_familyNum not between", value1, value2, "stuFamilynum");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNull() {
            addCriterion("stu_address is null");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNotNull() {
            addCriterion("stu_address is not null");
            return (Criteria) this;
        }

        public Criteria andStuAddressEqualTo(String value) {
            addCriterion("stu_address =", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotEqualTo(String value) {
            addCriterion("stu_address <>", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThan(String value) {
            addCriterion("stu_address >", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("stu_address >=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThan(String value) {
            addCriterion("stu_address <", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThanOrEqualTo(String value) {
            addCriterion("stu_address <=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLike(String value) {
            addCriterion("stu_address like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotLike(String value) {
            addCriterion("stu_address not like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressIn(List<String> values) {
            addCriterion("stu_address in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotIn(List<String> values) {
            addCriterion("stu_address not in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressBetween(String value1, String value2) {
            addCriterion("stu_address between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotBetween(String value1, String value2) {
            addCriterion("stu_address not between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(Integer value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(Integer value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(Integer value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(Integer value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<Integer> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<Integer> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(Integer value1, Integer value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIsNull() {
            addCriterion("stu_idCard is null");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIsNotNull() {
            addCriterion("stu_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdcardEqualTo(String value) {
            addCriterion("stu_idCard =", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotEqualTo(String value) {
            addCriterion("stu_idCard <>", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardGreaterThan(String value) {
            addCriterion("stu_idCard >", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("stu_idCard >=", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLessThan(String value) {
            addCriterion("stu_idCard <", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLessThanOrEqualTo(String value) {
            addCriterion("stu_idCard <=", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLike(String value) {
            addCriterion("stu_idCard like", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotLike(String value) {
            addCriterion("stu_idCard not like", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIn(List<String> values) {
            addCriterion("stu_idCard in", values, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotIn(List<String> values) {
            addCriterion("stu_idCard not in", values, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardBetween(String value1, String value2) {
            addCriterion("stu_idCard between", value1, value2, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotBetween(String value1, String value2) {
            addCriterion("stu_idCard not between", value1, value2, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuClassidIsNull() {
            addCriterion("stu_classid is null");
            return (Criteria) this;
        }

        public Criteria andStuClassidIsNotNull() {
            addCriterion("stu_classid is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassidEqualTo(Integer value) {
            addCriterion("stu_classid =", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotEqualTo(Integer value) {
            addCriterion("stu_classid <>", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidGreaterThan(Integer value) {
            addCriterion("stu_classid >", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_classid >=", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidLessThan(Integer value) {
            addCriterion("stu_classid <", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidLessThanOrEqualTo(Integer value) {
            addCriterion("stu_classid <=", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidIn(List<Integer> values) {
            addCriterion("stu_classid in", values, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotIn(List<Integer> values) {
            addCriterion("stu_classid not in", values, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidBetween(Integer value1, Integer value2) {
            addCriterion("stu_classid between", value1, value2, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_classid not between", value1, value2, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidIsNull() {
            addCriterion("stu_dormitoryid is null");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidIsNotNull() {
            addCriterion("stu_dormitoryid is not null");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidEqualTo(Integer value) {
            addCriterion("stu_dormitoryid =", value, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidNotEqualTo(Integer value) {
            addCriterion("stu_dormitoryid <>", value, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidGreaterThan(Integer value) {
            addCriterion("stu_dormitoryid >", value, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_dormitoryid >=", value, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidLessThan(Integer value) {
            addCriterion("stu_dormitoryid <", value, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidLessThanOrEqualTo(Integer value) {
            addCriterion("stu_dormitoryid <=", value, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidIn(List<Integer> values) {
            addCriterion("stu_dormitoryid in", values, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidNotIn(List<Integer> values) {
            addCriterion("stu_dormitoryid not in", values, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidBetween(Integer value1, Integer value2) {
            addCriterion("stu_dormitoryid between", value1, value2, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuDormitoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_dormitoryid not between", value1, value2, "stuDormitoryid");
            return (Criteria) this;
        }

        public Criteria andStuNationalIsNull() {
            addCriterion("stu_national is null");
            return (Criteria) this;
        }

        public Criteria andStuNationalIsNotNull() {
            addCriterion("stu_national is not null");
            return (Criteria) this;
        }

        public Criteria andStuNationalEqualTo(String value) {
            addCriterion("stu_national =", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalNotEqualTo(String value) {
            addCriterion("stu_national <>", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalGreaterThan(String value) {
            addCriterion("stu_national >", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalGreaterThanOrEqualTo(String value) {
            addCriterion("stu_national >=", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalLessThan(String value) {
            addCriterion("stu_national <", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalLessThanOrEqualTo(String value) {
            addCriterion("stu_national <=", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalLike(String value) {
            addCriterion("stu_national like", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalNotLike(String value) {
            addCriterion("stu_national not like", value, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalIn(List<String> values) {
            addCriterion("stu_national in", values, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalNotIn(List<String> values) {
            addCriterion("stu_national not in", values, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalBetween(String value1, String value2) {
            addCriterion("stu_national between", value1, value2, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuNationalNotBetween(String value1, String value2) {
            addCriterion("stu_national not between", value1, value2, "stuNational");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNull() {
            addCriterion("stu_status is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNotNull() {
            addCriterion("stu_status is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusEqualTo(String value) {
            addCriterion("stu_status =", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotEqualTo(String value) {
            addCriterion("stu_status <>", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThan(String value) {
            addCriterion("stu_status >", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status >=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThan(String value) {
            addCriterion("stu_status <", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThanOrEqualTo(String value) {
            addCriterion("stu_status <=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLike(String value) {
            addCriterion("stu_status like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotLike(String value) {
            addCriterion("stu_status not like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusIn(List<String> values) {
            addCriterion("stu_status in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotIn(List<String> values) {
            addCriterion("stu_status not in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusBetween(String value1, String value2) {
            addCriterion("stu_status between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotBetween(String value1, String value2) {
            addCriterion("stu_status not between", value1, value2, "stuStatus");
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