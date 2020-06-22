package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrintinginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrintinginfoExample() {
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

        public Criteria andPrintingIdIsNull() {
            addCriterion("printing_id is null");
            return (Criteria) this;
        }

        public Criteria andPrintingIdIsNotNull() {
            addCriterion("printing_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrintingIdEqualTo(Integer value) {
            addCriterion("printing_id =", value, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdNotEqualTo(Integer value) {
            addCriterion("printing_id <>", value, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdGreaterThan(Integer value) {
            addCriterion("printing_id >", value, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("printing_id >=", value, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdLessThan(Integer value) {
            addCriterion("printing_id <", value, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdLessThanOrEqualTo(Integer value) {
            addCriterion("printing_id <=", value, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdIn(List<Integer> values) {
            addCriterion("printing_id in", values, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdNotIn(List<Integer> values) {
            addCriterion("printing_id not in", values, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdBetween(Integer value1, Integer value2) {
            addCriterion("printing_id between", value1, value2, "printingId");
            return (Criteria) this;
        }

        public Criteria andPrintingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("printing_id not between", value1, value2, "printingId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andPrintingPageIsNull() {
            addCriterion("printing_page is null");
            return (Criteria) this;
        }

        public Criteria andPrintingPageIsNotNull() {
            addCriterion("printing_page is not null");
            return (Criteria) this;
        }

        public Criteria andPrintingPageEqualTo(Integer value) {
            addCriterion("printing_page =", value, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageNotEqualTo(Integer value) {
            addCriterion("printing_page <>", value, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageGreaterThan(Integer value) {
            addCriterion("printing_page >", value, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("printing_page >=", value, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageLessThan(Integer value) {
            addCriterion("printing_page <", value, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageLessThanOrEqualTo(Integer value) {
            addCriterion("printing_page <=", value, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageIn(List<Integer> values) {
            addCriterion("printing_page in", values, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageNotIn(List<Integer> values) {
            addCriterion("printing_page not in", values, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageBetween(Integer value1, Integer value2) {
            addCriterion("printing_page between", value1, value2, "printingPage");
            return (Criteria) this;
        }

        public Criteria andPrintingPageNotBetween(Integer value1, Integer value2) {
            addCriterion("printing_page not between", value1, value2, "printingPage");
            return (Criteria) this;
        }

        public Criteria andContractTimeIsNull() {
            addCriterion("contract_time is null");
            return (Criteria) this;
        }

        public Criteria andContractTimeIsNotNull() {
            addCriterion("contract_time is not null");
            return (Criteria) this;
        }

        public Criteria andContractTimeEqualTo(Date value) {
            addCriterion("contract_time =", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeNotEqualTo(Date value) {
            addCriterion("contract_time <>", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeGreaterThan(Date value) {
            addCriterion("contract_time >", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_time >=", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeLessThan(Date value) {
            addCriterion("contract_time <", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeLessThanOrEqualTo(Date value) {
            addCriterion("contract_time <=", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeIn(List<Date> values) {
            addCriterion("contract_time in", values, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeNotIn(List<Date> values) {
            addCriterion("contract_time not in", values, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeBetween(Date value1, Date value2) {
            addCriterion("contract_time between", value1, value2, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeNotBetween(Date value1, Date value2) {
            addCriterion("contract_time not between", value1, value2, "contractTime");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgIsNull() {
            addCriterion("printingContract_msg is null");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgIsNotNull() {
            addCriterion("printingContract_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgEqualTo(String value) {
            addCriterion("printingContract_msg =", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgNotEqualTo(String value) {
            addCriterion("printingContract_msg <>", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgGreaterThan(String value) {
            addCriterion("printingContract_msg >", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgGreaterThanOrEqualTo(String value) {
            addCriterion("printingContract_msg >=", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgLessThan(String value) {
            addCriterion("printingContract_msg <", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgLessThanOrEqualTo(String value) {
            addCriterion("printingContract_msg <=", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgLike(String value) {
            addCriterion("printingContract_msg like", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgNotLike(String value) {
            addCriterion("printingContract_msg not like", value, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgIn(List<String> values) {
            addCriterion("printingContract_msg in", values, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgNotIn(List<String> values) {
            addCriterion("printingContract_msg not in", values, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgBetween(String value1, String value2) {
            addCriterion("printingContract_msg between", value1, value2, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andPrintingcontractMsgNotBetween(String value1, String value2) {
            addCriterion("printingContract_msg not between", value1, value2, "printingcontractMsg");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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