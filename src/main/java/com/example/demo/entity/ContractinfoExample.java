package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractinfoExample() {
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

        public Criteria andContractNameIsNull() {
            addCriterion("contract_name is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("contract_name =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("contract_name <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("contract_name >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("contract_name >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("contract_name <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("contract_name <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("contract_name like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("contract_name not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("contract_name in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("contract_name not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("contract_name between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("contract_name not between", value1, value2, "contractName");
            return (Criteria) this;
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

        public Criteria andContractFileIsNull() {
            addCriterion("contract_file is null");
            return (Criteria) this;
        }

        public Criteria andContractFileIsNotNull() {
            addCriterion("contract_file is not null");
            return (Criteria) this;
        }

        public Criteria andContractFileEqualTo(String value) {
            addCriterion("contract_file =", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotEqualTo(String value) {
            addCriterion("contract_file <>", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileGreaterThan(String value) {
            addCriterion("contract_file >", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileGreaterThanOrEqualTo(String value) {
            addCriterion("contract_file >=", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLessThan(String value) {
            addCriterion("contract_file <", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLessThanOrEqualTo(String value) {
            addCriterion("contract_file <=", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLike(String value) {
            addCriterion("contract_file like", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotLike(String value) {
            addCriterion("contract_file not like", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileIn(List<String> values) {
            addCriterion("contract_file in", values, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotIn(List<String> values) {
            addCriterion("contract_file not in", values, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileBetween(String value1, String value2) {
            addCriterion("contract_file between", value1, value2, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotBetween(String value1, String value2) {
            addCriterion("contract_file not between", value1, value2, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractNumbersIsNull() {
            addCriterion("contract_numbers is null");
            return (Criteria) this;
        }

        public Criteria andContractNumbersIsNotNull() {
            addCriterion("contract_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumbersEqualTo(Integer value) {
            addCriterion("contract_numbers =", value, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersNotEqualTo(Integer value) {
            addCriterion("contract_numbers <>", value, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersGreaterThan(Integer value) {
            addCriterion("contract_numbers >", value, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_numbers >=", value, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersLessThan(Integer value) {
            addCriterion("contract_numbers <", value, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("contract_numbers <=", value, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersIn(List<Integer> values) {
            addCriterion("contract_numbers in", values, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersNotIn(List<Integer> values) {
            addCriterion("contract_numbers not in", values, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersBetween(Integer value1, Integer value2) {
            addCriterion("contract_numbers between", value1, value2, "contractNumbers");
            return (Criteria) this;
        }

        public Criteria andContractNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_numbers not between", value1, value2, "contractNumbers");
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