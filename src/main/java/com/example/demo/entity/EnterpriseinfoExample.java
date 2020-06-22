package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseinfoExample() {
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

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountIsNull() {
            addCriterion("enterprise_account is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountIsNotNull() {
            addCriterion("enterprise_account is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountEqualTo(String value) {
            addCriterion("enterprise_account =", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotEqualTo(String value) {
            addCriterion("enterprise_account <>", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountGreaterThan(String value) {
            addCriterion("enterprise_account >", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_account >=", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLessThan(String value) {
            addCriterion("enterprise_account <", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLessThanOrEqualTo(String value) {
            addCriterion("enterprise_account <=", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLike(String value) {
            addCriterion("enterprise_account like", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotLike(String value) {
            addCriterion("enterprise_account not like", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountIn(List<String> values) {
            addCriterion("enterprise_account in", values, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotIn(List<String> values) {
            addCriterion("enterprise_account not in", values, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountBetween(String value1, String value2) {
            addCriterion("enterprise_account between", value1, value2, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotBetween(String value1, String value2) {
            addCriterion("enterprise_account not between", value1, value2, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdIsNull() {
            addCriterion("enterprise_pwd is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdIsNotNull() {
            addCriterion("enterprise_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdEqualTo(String value) {
            addCriterion("enterprise_pwd =", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdNotEqualTo(String value) {
            addCriterion("enterprise_pwd <>", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdGreaterThan(String value) {
            addCriterion("enterprise_pwd >", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_pwd >=", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdLessThan(String value) {
            addCriterion("enterprise_pwd <", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_pwd <=", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdLike(String value) {
            addCriterion("enterprise_pwd like", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdNotLike(String value) {
            addCriterion("enterprise_pwd not like", value, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdIn(List<String> values) {
            addCriterion("enterprise_pwd in", values, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdNotIn(List<String> values) {
            addCriterion("enterprise_pwd not in", values, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdBetween(String value1, String value2) {
            addCriterion("enterprise_pwd between", value1, value2, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andEnterprisePwdNotBetween(String value1, String value2) {
            addCriterion("enterprise_pwd not between", value1, value2, "enterprisePwd");
            return (Criteria) this;
        }

        public Criteria andLegalCardIsNull() {
            addCriterion("legal_card is null");
            return (Criteria) this;
        }

        public Criteria andLegalCardIsNotNull() {
            addCriterion("legal_card is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCardEqualTo(String value) {
            addCriterion("legal_card =", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardNotEqualTo(String value) {
            addCriterion("legal_card <>", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardGreaterThan(String value) {
            addCriterion("legal_card >", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_card >=", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardLessThan(String value) {
            addCriterion("legal_card <", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardLessThanOrEqualTo(String value) {
            addCriterion("legal_card <=", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardLike(String value) {
            addCriterion("legal_card like", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardNotLike(String value) {
            addCriterion("legal_card not like", value, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardIn(List<String> values) {
            addCriterion("legal_card in", values, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardNotIn(List<String> values) {
            addCriterion("legal_card not in", values, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardBetween(String value1, String value2) {
            addCriterion("legal_card between", value1, value2, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalCardNotBetween(String value1, String value2) {
            addCriterion("legal_card not between", value1, value2, "legalCard");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("legal_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("legal_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("legal_name =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("legal_name <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("legal_name >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_name >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("legal_name <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("legal_name <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("legal_name like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("legal_name not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("legal_name in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("legal_name not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("legal_name between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("legal_name not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIsNull() {
            addCriterion("enterprise_tel is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIsNotNull() {
            addCriterion("enterprise_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelEqualTo(String value) {
            addCriterion("enterprise_tel =", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotEqualTo(String value) {
            addCriterion("enterprise_tel <>", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelGreaterThan(String value) {
            addCriterion("enterprise_tel >", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_tel >=", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLessThan(String value) {
            addCriterion("enterprise_tel <", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLessThanOrEqualTo(String value) {
            addCriterion("enterprise_tel <=", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLike(String value) {
            addCriterion("enterprise_tel like", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotLike(String value) {
            addCriterion("enterprise_tel not like", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIn(List<String> values) {
            addCriterion("enterprise_tel in", values, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotIn(List<String> values) {
            addCriterion("enterprise_tel not in", values, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelBetween(String value1, String value2) {
            addCriterion("enterprise_tel between", value1, value2, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotBetween(String value1, String value2) {
            addCriterion("enterprise_tel not between", value1, value2, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIsNull() {
            addCriterion("enterprise_address is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIsNotNull() {
            addCriterion("enterprise_address is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressEqualTo(String value) {
            addCriterion("enterprise_address =", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotEqualTo(String value) {
            addCriterion("enterprise_address <>", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressGreaterThan(String value) {
            addCriterion("enterprise_address >", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_address >=", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLessThan(String value) {
            addCriterion("enterprise_address <", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLessThanOrEqualTo(String value) {
            addCriterion("enterprise_address <=", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressLike(String value) {
            addCriterion("enterprise_address like", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotLike(String value) {
            addCriterion("enterprise_address not like", value, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressIn(List<String> values) {
            addCriterion("enterprise_address in", values, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotIn(List<String> values) {
            addCriterion("enterprise_address not in", values, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressBetween(String value1, String value2) {
            addCriterion("enterprise_address between", value1, value2, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddressNotBetween(String value1, String value2) {
            addCriterion("enterprise_address not between", value1, value2, "enterpriseAddress");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIsNull() {
            addCriterion("enterprise_email is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIsNotNull() {
            addCriterion("enterprise_email is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailEqualTo(String value) {
            addCriterion("enterprise_email =", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotEqualTo(String value) {
            addCriterion("enterprise_email <>", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailGreaterThan(String value) {
            addCriterion("enterprise_email >", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_email >=", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLessThan(String value) {
            addCriterion("enterprise_email <", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLessThanOrEqualTo(String value) {
            addCriterion("enterprise_email <=", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLike(String value) {
            addCriterion("enterprise_email like", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotLike(String value) {
            addCriterion("enterprise_email not like", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIn(List<String> values) {
            addCriterion("enterprise_email in", values, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotIn(List<String> values) {
            addCriterion("enterprise_email not in", values, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailBetween(String value1, String value2) {
            addCriterion("enterprise_email between", value1, value2, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotBetween(String value1, String value2) {
            addCriterion("enterprise_email not between", value1, value2, "enterpriseEmail");
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