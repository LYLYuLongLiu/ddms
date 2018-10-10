package cn.wisdsoft.ddms.pojo;

import java.util.ArrayList;
import java.util.List;

public class CurriculumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumExample() {
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

        public Criteria andCurNameIsNull() {
            addCriterion("cur_name is null");
            return (Criteria) this;
        }

        public Criteria andCurNameIsNotNull() {
            addCriterion("cur_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurNameEqualTo(String value) {
            addCriterion("cur_name =", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotEqualTo(String value) {
            addCriterion("cur_name <>", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameGreaterThan(String value) {
            addCriterion("cur_name >", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameGreaterThanOrEqualTo(String value) {
            addCriterion("cur_name >=", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameLessThan(String value) {
            addCriterion("cur_name <", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameLessThanOrEqualTo(String value) {
            addCriterion("cur_name <=", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameLike(String value) {
            addCriterion("cur_name like", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotLike(String value) {
            addCriterion("cur_name not like", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameIn(List<String> values) {
            addCriterion("cur_name in", values, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotIn(List<String> values) {
            addCriterion("cur_name not in", values, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameBetween(String value1, String value2) {
            addCriterion("cur_name between", value1, value2, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotBetween(String value1, String value2) {
            addCriterion("cur_name not between", value1, value2, "curName");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeIsNull() {
            addCriterion("cur_courseType is null");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeIsNotNull() {
            addCriterion("cur_courseType is not null");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeEqualTo(String value) {
            addCriterion("cur_courseType =", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeNotEqualTo(String value) {
            addCriterion("cur_courseType <>", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeGreaterThan(String value) {
            addCriterion("cur_courseType >", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("cur_courseType >=", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeLessThan(String value) {
            addCriterion("cur_courseType <", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("cur_courseType <=", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeLike(String value) {
            addCriterion("cur_courseType like", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeNotLike(String value) {
            addCriterion("cur_courseType not like", value, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeIn(List<String> values) {
            addCriterion("cur_courseType in", values, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeNotIn(List<String> values) {
            addCriterion("cur_courseType not in", values, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeBetween(String value1, String value2) {
            addCriterion("cur_courseType between", value1, value2, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurCoursetypeNotBetween(String value1, String value2) {
            addCriterion("cur_courseType not between", value1, value2, "curCoursetype");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourIsNull() {
            addCriterion("cur_clazzHour is null");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourIsNotNull() {
            addCriterion("cur_clazzHour is not null");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourEqualTo(Integer value) {
            addCriterion("cur_clazzHour =", value, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourNotEqualTo(Integer value) {
            addCriterion("cur_clazzHour <>", value, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourGreaterThan(Integer value) {
            addCriterion("cur_clazzHour >", value, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_clazzHour >=", value, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourLessThan(Integer value) {
            addCriterion("cur_clazzHour <", value, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourLessThanOrEqualTo(Integer value) {
            addCriterion("cur_clazzHour <=", value, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourIn(List<Integer> values) {
            addCriterion("cur_clazzHour in", values, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourNotIn(List<Integer> values) {
            addCriterion("cur_clazzHour not in", values, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourBetween(Integer value1, Integer value2) {
            addCriterion("cur_clazzHour between", value1, value2, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurClazzhourNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_clazzHour not between", value1, value2, "curClazzhour");
            return (Criteria) this;
        }

        public Criteria andCurCreditIsNull() {
            addCriterion("cur_credit is null");
            return (Criteria) this;
        }

        public Criteria andCurCreditIsNotNull() {
            addCriterion("cur_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCurCreditEqualTo(Integer value) {
            addCriterion("cur_credit =", value, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditNotEqualTo(Integer value) {
            addCriterion("cur_credit <>", value, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditGreaterThan(Integer value) {
            addCriterion("cur_credit >", value, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_credit >=", value, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditLessThan(Integer value) {
            addCriterion("cur_credit <", value, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditLessThanOrEqualTo(Integer value) {
            addCriterion("cur_credit <=", value, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditIn(List<Integer> values) {
            addCriterion("cur_credit in", values, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditNotIn(List<Integer> values) {
            addCriterion("cur_credit not in", values, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditBetween(Integer value1, Integer value2) {
            addCriterion("cur_credit between", value1, value2, "curCredit");
            return (Criteria) this;
        }

        public Criteria andCurCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_credit not between", value1, value2, "curCredit");
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