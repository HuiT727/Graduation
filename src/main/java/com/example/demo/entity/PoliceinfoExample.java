package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class PoliceinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliceinfoExample() {
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

        public Criteria andPoliceIdIsNull() {
            addCriterion("police_id is null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNotNull() {
            addCriterion("police_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdEqualTo(Integer value) {
            addCriterion("police_id =", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotEqualTo(Integer value) {
            addCriterion("police_id <>", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThan(Integer value) {
            addCriterion("police_id >", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("police_id >=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThan(Integer value) {
            addCriterion("police_id <", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThanOrEqualTo(Integer value) {
            addCriterion("police_id <=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIn(List<Integer> values) {
            addCriterion("police_id in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotIn(List<Integer> values) {
            addCriterion("police_id not in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdBetween(Integer value1, Integer value2) {
            addCriterion("police_id between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("police_id not between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountIsNull() {
            addCriterion("police_account is null");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountIsNotNull() {
            addCriterion("police_account is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountEqualTo(String value) {
            addCriterion("police_account =", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountNotEqualTo(String value) {
            addCriterion("police_account <>", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountGreaterThan(String value) {
            addCriterion("police_account >", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountGreaterThanOrEqualTo(String value) {
            addCriterion("police_account >=", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountLessThan(String value) {
            addCriterion("police_account <", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountLessThanOrEqualTo(String value) {
            addCriterion("police_account <=", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountLike(String value) {
            addCriterion("police_account like", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountNotLike(String value) {
            addCriterion("police_account not like", value, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountIn(List<String> values) {
            addCriterion("police_account in", values, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountNotIn(List<String> values) {
            addCriterion("police_account not in", values, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountBetween(String value1, String value2) {
            addCriterion("police_account between", value1, value2, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPoliceAccountNotBetween(String value1, String value2) {
            addCriterion("police_account not between", value1, value2, "policeAccount");
            return (Criteria) this;
        }

        public Criteria andPolicePwdIsNull() {
            addCriterion("police_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPolicePwdIsNotNull() {
            addCriterion("police_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPolicePwdEqualTo(String value) {
            addCriterion("police_pwd =", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdNotEqualTo(String value) {
            addCriterion("police_pwd <>", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdGreaterThan(String value) {
            addCriterion("police_pwd >", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdGreaterThanOrEqualTo(String value) {
            addCriterion("police_pwd >=", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdLessThan(String value) {
            addCriterion("police_pwd <", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdLessThanOrEqualTo(String value) {
            addCriterion("police_pwd <=", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdLike(String value) {
            addCriterion("police_pwd like", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdNotLike(String value) {
            addCriterion("police_pwd not like", value, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdIn(List<String> values) {
            addCriterion("police_pwd in", values, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdNotIn(List<String> values) {
            addCriterion("police_pwd not in", values, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdBetween(String value1, String value2) {
            addCriterion("police_pwd between", value1, value2, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPolicePwdNotBetween(String value1, String value2) {
            addCriterion("police_pwd not between", value1, value2, "policePwd");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIsNull() {
            addCriterion("police_name is null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIsNotNull() {
            addCriterion("police_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameEqualTo(String value) {
            addCriterion("police_name =", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotEqualTo(String value) {
            addCriterion("police_name <>", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThan(String value) {
            addCriterion("police_name >", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThanOrEqualTo(String value) {
            addCriterion("police_name >=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThan(String value) {
            addCriterion("police_name <", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThanOrEqualTo(String value) {
            addCriterion("police_name <=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLike(String value) {
            addCriterion("police_name like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotLike(String value) {
            addCriterion("police_name not like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIn(List<String> values) {
            addCriterion("police_name in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotIn(List<String> values) {
            addCriterion("police_name not in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameBetween(String value1, String value2) {
            addCriterion("police_name between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotBetween(String value1, String value2) {
            addCriterion("police_name not between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneIsNull() {
            addCriterion("police_phone is null");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneIsNotNull() {
            addCriterion("police_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneEqualTo(String value) {
            addCriterion("police_phone =", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneNotEqualTo(String value) {
            addCriterion("police_phone <>", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneGreaterThan(String value) {
            addCriterion("police_phone >", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("police_phone >=", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneLessThan(String value) {
            addCriterion("police_phone <", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneLessThanOrEqualTo(String value) {
            addCriterion("police_phone <=", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneLike(String value) {
            addCriterion("police_phone like", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneNotLike(String value) {
            addCriterion("police_phone not like", value, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneIn(List<String> values) {
            addCriterion("police_phone in", values, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneNotIn(List<String> values) {
            addCriterion("police_phone not in", values, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneBetween(String value1, String value2) {
            addCriterion("police_phone between", value1, value2, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPolicePhoneNotBetween(String value1, String value2) {
            addCriterion("police_phone not between", value1, value2, "policePhone");
            return (Criteria) this;
        }

        public Criteria andPoliceSexIsNull() {
            addCriterion("police_sex is null");
            return (Criteria) this;
        }

        public Criteria andPoliceSexIsNotNull() {
            addCriterion("police_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceSexEqualTo(String value) {
            addCriterion("police_sex =", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexNotEqualTo(String value) {
            addCriterion("police_sex <>", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexGreaterThan(String value) {
            addCriterion("police_sex >", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexGreaterThanOrEqualTo(String value) {
            addCriterion("police_sex >=", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexLessThan(String value) {
            addCriterion("police_sex <", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexLessThanOrEqualTo(String value) {
            addCriterion("police_sex <=", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexLike(String value) {
            addCriterion("police_sex like", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexNotLike(String value) {
            addCriterion("police_sex not like", value, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexIn(List<String> values) {
            addCriterion("police_sex in", values, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexNotIn(List<String> values) {
            addCriterion("police_sex not in", values, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexBetween(String value1, String value2) {
            addCriterion("police_sex between", value1, value2, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceSexNotBetween(String value1, String value2) {
            addCriterion("police_sex not between", value1, value2, "policeSex");
            return (Criteria) this;
        }

        public Criteria andPoliceCardIsNull() {
            addCriterion("police_card is null");
            return (Criteria) this;
        }

        public Criteria andPoliceCardIsNotNull() {
            addCriterion("police_card is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceCardEqualTo(String value) {
            addCriterion("police_card =", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardNotEqualTo(String value) {
            addCriterion("police_card <>", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardGreaterThan(String value) {
            addCriterion("police_card >", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardGreaterThanOrEqualTo(String value) {
            addCriterion("police_card >=", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardLessThan(String value) {
            addCriterion("police_card <", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardLessThanOrEqualTo(String value) {
            addCriterion("police_card <=", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardLike(String value) {
            addCriterion("police_card like", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardNotLike(String value) {
            addCriterion("police_card not like", value, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardIn(List<String> values) {
            addCriterion("police_card in", values, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardNotIn(List<String> values) {
            addCriterion("police_card not in", values, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardBetween(String value1, String value2) {
            addCriterion("police_card between", value1, value2, "policeCard");
            return (Criteria) this;
        }

        public Criteria andPoliceCardNotBetween(String value1, String value2) {
            addCriterion("police_card not between", value1, value2, "policeCard");
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