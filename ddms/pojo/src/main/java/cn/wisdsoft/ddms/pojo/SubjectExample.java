package cn.wisdsoft.ddms.pojo;

import java.util.ArrayList;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNull() {
            addCriterion("sub_name is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("sub_name =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("sub_name <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("sub_name >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_name >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("sub_name <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("sub_name <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("sub_name like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("sub_name not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("sub_name in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("sub_name not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("sub_name between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("sub_name not between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeIsNull() {
            addCriterion("sub_courseType is null");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeIsNotNull() {
            addCriterion("sub_courseType is not null");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeEqualTo(String value) {
            addCriterion("sub_courseType =", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeNotEqualTo(String value) {
            addCriterion("sub_courseType <>", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeGreaterThan(String value) {
            addCriterion("sub_courseType >", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_courseType >=", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeLessThan(String value) {
            addCriterion("sub_courseType <", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("sub_courseType <=", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeLike(String value) {
            addCriterion("sub_courseType like", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeNotLike(String value) {
            addCriterion("sub_courseType not like", value, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeIn(List<String> values) {
            addCriterion("sub_courseType in", values, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeNotIn(List<String> values) {
            addCriterion("sub_courseType not in", values, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeBetween(String value1, String value2) {
            addCriterion("sub_courseType between", value1, value2, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubCoursetypeNotBetween(String value1, String value2) {
            addCriterion("sub_courseType not between", value1, value2, "subCoursetype");
            return (Criteria) this;
        }

        public Criteria andSubClasshourIsNull() {
            addCriterion("sub_classHour is null");
            return (Criteria) this;
        }

        public Criteria andSubClasshourIsNotNull() {
            addCriterion("sub_classHour is not null");
            return (Criteria) this;
        }

        public Criteria andSubClasshourEqualTo(Integer value) {
            addCriterion("sub_classHour =", value, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourNotEqualTo(Integer value) {
            addCriterion("sub_classHour <>", value, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourGreaterThan(Integer value) {
            addCriterion("sub_classHour >", value, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_classHour >=", value, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourLessThan(Integer value) {
            addCriterion("sub_classHour <", value, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourLessThanOrEqualTo(Integer value) {
            addCriterion("sub_classHour <=", value, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourIn(List<Integer> values) {
            addCriterion("sub_classHour in", values, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourNotIn(List<Integer> values) {
            addCriterion("sub_classHour not in", values, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourBetween(Integer value1, Integer value2) {
            addCriterion("sub_classHour between", value1, value2, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubClasshourNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_classHour not between", value1, value2, "subClasshour");
            return (Criteria) this;
        }

        public Criteria andSubCreditIsNull() {
            addCriterion("sub_credit is null");
            return (Criteria) this;
        }

        public Criteria andSubCreditIsNotNull() {
            addCriterion("sub_credit is not null");
            return (Criteria) this;
        }

        public Criteria andSubCreditEqualTo(Integer value) {
            addCriterion("sub_credit =", value, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditNotEqualTo(Integer value) {
            addCriterion("sub_credit <>", value, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditGreaterThan(Integer value) {
            addCriterion("sub_credit >", value, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_credit >=", value, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditLessThan(Integer value) {
            addCriterion("sub_credit <", value, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditLessThanOrEqualTo(Integer value) {
            addCriterion("sub_credit <=", value, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditIn(List<Integer> values) {
            addCriterion("sub_credit in", values, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditNotIn(List<Integer> values) {
            addCriterion("sub_credit not in", values, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditBetween(Integer value1, Integer value2) {
            addCriterion("sub_credit between", value1, value2, "subCredit");
            return (Criteria) this;
        }

        public Criteria andSubCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_credit not between", value1, value2, "subCredit");
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