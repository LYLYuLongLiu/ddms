package cn.wisdsoft.ddms.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andCrIdIsNull() {
            addCriterion("cr_id is null");
            return (Criteria) this;
        }

        public Criteria andCrIdIsNotNull() {
            addCriterion("cr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrIdEqualTo(Integer value) {
            addCriterion("cr_id =", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotEqualTo(Integer value) {
            addCriterion("cr_id <>", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdGreaterThan(Integer value) {
            addCriterion("cr_id >", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cr_id >=", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdLessThan(Integer value) {
            addCriterion("cr_id <", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdLessThanOrEqualTo(Integer value) {
            addCriterion("cr_id <=", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdIn(List<Integer> values) {
            addCriterion("cr_id in", values, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotIn(List<Integer> values) {
            addCriterion("cr_id not in", values, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdBetween(Integer value1, Integer value2) {
            addCriterion("cr_id between", value1, value2, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cr_id not between", value1, value2, "crId");
            return (Criteria) this;
        }

        public Criteria andCrLocationIsNull() {
            addCriterion("cr_location is null");
            return (Criteria) this;
        }

        public Criteria andCrLocationIsNotNull() {
            addCriterion("cr_location is not null");
            return (Criteria) this;
        }

        public Criteria andCrLocationEqualTo(String value) {
            addCriterion("cr_location =", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationNotEqualTo(String value) {
            addCriterion("cr_location <>", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationGreaterThan(String value) {
            addCriterion("cr_location >", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationGreaterThanOrEqualTo(String value) {
            addCriterion("cr_location >=", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationLessThan(String value) {
            addCriterion("cr_location <", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationLessThanOrEqualTo(String value) {
            addCriterion("cr_location <=", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationLike(String value) {
            addCriterion("cr_location like", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationNotLike(String value) {
            addCriterion("cr_location not like", value, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationIn(List<String> values) {
            addCriterion("cr_location in", values, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationNotIn(List<String> values) {
            addCriterion("cr_location not in", values, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationBetween(String value1, String value2) {
            addCriterion("cr_location between", value1, value2, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrLocationNotBetween(String value1, String value2) {
            addCriterion("cr_location not between", value1, value2, "crLocation");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumIsNull() {
            addCriterion("cr_roomNum is null");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumIsNotNull() {
            addCriterion("cr_roomNum is not null");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumEqualTo(Integer value) {
            addCriterion("cr_roomNum =", value, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumNotEqualTo(Integer value) {
            addCriterion("cr_roomNum <>", value, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumGreaterThan(Integer value) {
            addCriterion("cr_roomNum >", value, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cr_roomNum >=", value, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumLessThan(Integer value) {
            addCriterion("cr_roomNum <", value, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumLessThanOrEqualTo(Integer value) {
            addCriterion("cr_roomNum <=", value, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumIn(List<Integer> values) {
            addCriterion("cr_roomNum in", values, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumNotIn(List<Integer> values) {
            addCriterion("cr_roomNum not in", values, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumBetween(Integer value1, Integer value2) {
            addCriterion("cr_roomNum between", value1, value2, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrRoomnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cr_roomNum not between", value1, value2, "crRoomnum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumIsNull() {
            addCriterion("cr_maxStuNum is null");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumIsNotNull() {
            addCriterion("cr_maxStuNum is not null");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumEqualTo(Integer value) {
            addCriterion("cr_maxStuNum =", value, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumNotEqualTo(Integer value) {
            addCriterion("cr_maxStuNum <>", value, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumGreaterThan(Integer value) {
            addCriterion("cr_maxStuNum >", value, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cr_maxStuNum >=", value, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumLessThan(Integer value) {
            addCriterion("cr_maxStuNum <", value, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumLessThanOrEqualTo(Integer value) {
            addCriterion("cr_maxStuNum <=", value, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumIn(List<Integer> values) {
            addCriterion("cr_maxStuNum in", values, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumNotIn(List<Integer> values) {
            addCriterion("cr_maxStuNum not in", values, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumBetween(Integer value1, Integer value2) {
            addCriterion("cr_maxStuNum between", value1, value2, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrMaxstunumNotBetween(Integer value1, Integer value2) {
            addCriterion("cr_maxStuNum not between", value1, value2, "crMaxstunum");
            return (Criteria) this;
        }

        public Criteria andCrTypeIsNull() {
            addCriterion("cr_type is null");
            return (Criteria) this;
        }

        public Criteria andCrTypeIsNotNull() {
            addCriterion("cr_type is not null");
            return (Criteria) this;
        }

        public Criteria andCrTypeEqualTo(String value) {
            addCriterion("cr_type =", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeNotEqualTo(String value) {
            addCriterion("cr_type <>", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeGreaterThan(String value) {
            addCriterion("cr_type >", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cr_type >=", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeLessThan(String value) {
            addCriterion("cr_type <", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeLessThanOrEqualTo(String value) {
            addCriterion("cr_type <=", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeLike(String value) {
            addCriterion("cr_type like", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeNotLike(String value) {
            addCriterion("cr_type not like", value, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeIn(List<String> values) {
            addCriterion("cr_type in", values, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeNotIn(List<String> values) {
            addCriterion("cr_type not in", values, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeBetween(String value1, String value2) {
            addCriterion("cr_type between", value1, value2, "crType");
            return (Criteria) this;
        }

        public Criteria andCrTypeNotBetween(String value1, String value2) {
            addCriterion("cr_type not between", value1, value2, "crType");
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