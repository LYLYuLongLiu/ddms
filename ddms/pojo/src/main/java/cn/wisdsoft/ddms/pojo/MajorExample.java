package cn.wisdsoft.ddms.pojo;

import java.util.ArrayList;
import java.util.List;

public class MajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidIsNull() {
            addCriterion("major_collegeid is null");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidIsNotNull() {
            addCriterion("major_collegeid is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidEqualTo(String value) {
            addCriterion("major_collegeid =", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidNotEqualTo(String value) {
            addCriterion("major_collegeid <>", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidGreaterThan(String value) {
            addCriterion("major_collegeid >", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidGreaterThanOrEqualTo(String value) {
            addCriterion("major_collegeid >=", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidLessThan(String value) {
            addCriterion("major_collegeid <", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidLessThanOrEqualTo(String value) {
            addCriterion("major_collegeid <=", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidLike(String value) {
            addCriterion("major_collegeid like", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidNotLike(String value) {
            addCriterion("major_collegeid not like", value, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidIn(List<String> values) {
            addCriterion("major_collegeid in", values, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidNotIn(List<String> values) {
            addCriterion("major_collegeid not in", values, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidBetween(String value1, String value2) {
            addCriterion("major_collegeid between", value1, value2, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorCollegeidNotBetween(String value1, String value2) {
            addCriterion("major_collegeid not between", value1, value2, "majorCollegeid");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesIsNull() {
            addCriterion("major_disciplineCategories is null");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesIsNotNull() {
            addCriterion("major_disciplineCategories is not null");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesEqualTo(String value) {
            addCriterion("major_disciplineCategories =", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesNotEqualTo(String value) {
            addCriterion("major_disciplineCategories <>", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesGreaterThan(String value) {
            addCriterion("major_disciplineCategories >", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("major_disciplineCategories >=", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesLessThan(String value) {
            addCriterion("major_disciplineCategories <", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesLessThanOrEqualTo(String value) {
            addCriterion("major_disciplineCategories <=", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesLike(String value) {
            addCriterion("major_disciplineCategories like", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesNotLike(String value) {
            addCriterion("major_disciplineCategories not like", value, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesIn(List<String> values) {
            addCriterion("major_disciplineCategories in", values, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesNotIn(List<String> values) {
            addCriterion("major_disciplineCategories not in", values, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesBetween(String value1, String value2) {
            addCriterion("major_disciplineCategories between", value1, value2, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorDisciplinecategoriesNotBetween(String value1, String value2) {
            addCriterion("major_disciplineCategories not between", value1, value2, "majorDisciplinecategories");
            return (Criteria) this;
        }

        public Criteria andMajorEducationIsNull() {
            addCriterion("major_education is null");
            return (Criteria) this;
        }

        public Criteria andMajorEducationIsNotNull() {
            addCriterion("major_education is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEducationEqualTo(String value) {
            addCriterion("major_education =", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationNotEqualTo(String value) {
            addCriterion("major_education <>", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationGreaterThan(String value) {
            addCriterion("major_education >", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationGreaterThanOrEqualTo(String value) {
            addCriterion("major_education >=", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationLessThan(String value) {
            addCriterion("major_education <", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationLessThanOrEqualTo(String value) {
            addCriterion("major_education <=", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationLike(String value) {
            addCriterion("major_education like", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationNotLike(String value) {
            addCriterion("major_education not like", value, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationIn(List<String> values) {
            addCriterion("major_education in", values, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationNotIn(List<String> values) {
            addCriterion("major_education not in", values, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationBetween(String value1, String value2) {
            addCriterion("major_education between", value1, value2, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andMajorEducationNotBetween(String value1, String value2) {
            addCriterion("major_education not between", value1, value2, "majorEducation");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemIsNull() {
            addCriterion("schoolSystem is null");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemIsNotNull() {
            addCriterion("schoolSystem is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemEqualTo(Integer value) {
            addCriterion("schoolSystem =", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemNotEqualTo(Integer value) {
            addCriterion("schoolSystem <>", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemGreaterThan(Integer value) {
            addCriterion("schoolSystem >", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolSystem >=", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemLessThan(Integer value) {
            addCriterion("schoolSystem <", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemLessThanOrEqualTo(Integer value) {
            addCriterion("schoolSystem <=", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemIn(List<Integer> values) {
            addCriterion("schoolSystem in", values, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemNotIn(List<Integer> values) {
            addCriterion("schoolSystem not in", values, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemBetween(Integer value1, Integer value2) {
            addCriterion("schoolSystem between", value1, value2, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolSystem not between", value1, value2, "schoolsystem");
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