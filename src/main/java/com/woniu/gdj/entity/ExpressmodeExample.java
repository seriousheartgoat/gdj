package com.woniu.gdj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpressmodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public ExpressmodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
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

        public Criteria andExpressmodeidIsNull() {
            addCriterion("expressModeid is null");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidIsNotNull() {
            addCriterion("expressModeid is not null");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidEqualTo(Integer value) {
            addCriterion("expressModeid =", value, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidNotEqualTo(Integer value) {
            addCriterion("expressModeid <>", value, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidGreaterThan(Integer value) {
            addCriterion("expressModeid >", value, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("expressModeid >=", value, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidLessThan(Integer value) {
            addCriterion("expressModeid <", value, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidLessThanOrEqualTo(Integer value) {
            addCriterion("expressModeid <=", value, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidIn(List<Integer> values) {
            addCriterion("expressModeid in", values, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidNotIn(List<Integer> values) {
            addCriterion("expressModeid not in", values, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidBetween(Integer value1, Integer value2) {
            addCriterion("expressModeid between", value1, value2, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("expressModeid not between", value1, value2, "expressmodeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeID is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Integer value) {
            addCriterion("storeID =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Integer value) {
            addCriterion("storeID <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Integer value) {
            addCriterion("storeID >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeID >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Integer value) {
            addCriterion("storeID <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Integer value) {
            addCriterion("storeID <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Integer> values) {
            addCriterion("storeID in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Integer> values) {
            addCriterion("storeID not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Integer value1, Integer value2) {
            addCriterion("storeID between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("storeID not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameIsNull() {
            addCriterion("expressModename is null");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameIsNotNull() {
            addCriterion("expressModename is not null");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameEqualTo(String value) {
            addCriterion("expressModename =", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameNotEqualTo(String value) {
            addCriterion("expressModename <>", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameGreaterThan(String value) {
            addCriterion("expressModename >", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameGreaterThanOrEqualTo(String value) {
            addCriterion("expressModename >=", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameLessThan(String value) {
            addCriterion("expressModename <", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameLessThanOrEqualTo(String value) {
            addCriterion("expressModename <=", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameLike(String value) {
            addCriterion("expressModename like", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameNotLike(String value) {
            addCriterion("expressModename not like", value, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameIn(List<String> values) {
            addCriterion("expressModename in", values, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameNotIn(List<String> values) {
            addCriterion("expressModename not in", values, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameBetween(String value1, String value2) {
            addCriterion("expressModename between", value1, value2, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andExpressmodenameNotBetween(String value1, String value2) {
            addCriterion("expressModename not between", value1, value2, "expressmodename");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expressmode
     *
     * @mbggenerated do_not_delete_during_merge Mon Jun 08 16:26:28 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table expressmode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
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