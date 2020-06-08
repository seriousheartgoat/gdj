package com.woniu.gdj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public RechargeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
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
     * This method corresponds to the database table recharge
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
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
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
     * This class corresponds to the database table recharge
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

        public Criteria andRechargeidIsNull() {
            addCriterion("rechargeID is null");
            return (Criteria) this;
        }

        public Criteria andRechargeidIsNotNull() {
            addCriterion("rechargeID is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeidEqualTo(Integer value) {
            addCriterion("rechargeID =", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotEqualTo(Integer value) {
            addCriterion("rechargeID <>", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidGreaterThan(Integer value) {
            addCriterion("rechargeID >", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rechargeID >=", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidLessThan(Integer value) {
            addCriterion("rechargeID <", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidLessThanOrEqualTo(Integer value) {
            addCriterion("rechargeID <=", value, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidIn(List<Integer> values) {
            addCriterion("rechargeID in", values, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotIn(List<Integer> values) {
            addCriterion("rechargeID not in", values, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidBetween(Integer value1, Integer value2) {
            addCriterion("rechargeID between", value1, value2, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andRechargeidNotBetween(Integer value1, Integer value2) {
            addCriterion("rechargeID not between", value1, value2, "rechargeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNull() {
            addCriterion("provinceName is null");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNotNull() {
            addCriterion("provinceName is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenameEqualTo(String value) {
            addCriterion("provinceName =", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotEqualTo(String value) {
            addCriterion("provinceName <>", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThan(String value) {
            addCriterion("provinceName >", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThanOrEqualTo(String value) {
            addCriterion("provinceName >=", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThan(String value) {
            addCriterion("provinceName <", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThanOrEqualTo(String value) {
            addCriterion("provinceName <=", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLike(String value) {
            addCriterion("provinceName like", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotLike(String value) {
            addCriterion("provinceName not like", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameIn(List<String> values) {
            addCriterion("provinceName in", values, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotIn(List<String> values) {
            addCriterion("provinceName not in", values, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameBetween(String value1, String value2) {
            addCriterion("provinceName between", value1, value2, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotBetween(String value1, String value2) {
            addCriterion("provinceName not between", value1, value2, "provincename");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("cityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("cityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNull() {
            addCriterion("countyName is null");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNotNull() {
            addCriterion("countyName is not null");
            return (Criteria) this;
        }

        public Criteria andCountynameEqualTo(String value) {
            addCriterion("countyName =", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotEqualTo(String value) {
            addCriterion("countyName <>", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThan(String value) {
            addCriterion("countyName >", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThanOrEqualTo(String value) {
            addCriterion("countyName >=", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThan(String value) {
            addCriterion("countyName <", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThanOrEqualTo(String value) {
            addCriterion("countyName <=", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLike(String value) {
            addCriterion("countyName like", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotLike(String value) {
            addCriterion("countyName not like", value, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameIn(List<String> values) {
            addCriterion("countyName in", values, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotIn(List<String> values) {
            addCriterion("countyName not in", values, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameBetween(String value1, String value2) {
            addCriterion("countyName between", value1, value2, "countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotBetween(String value1, String value2) {
            addCriterion("countyName not between", value1, value2, "countyname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRechargecodeIsNull() {
            addCriterion("rechargeCode is null");
            return (Criteria) this;
        }

        public Criteria andRechargecodeIsNotNull() {
            addCriterion("rechargeCode is not null");
            return (Criteria) this;
        }

        public Criteria andRechargecodeEqualTo(String value) {
            addCriterion("rechargeCode =", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeNotEqualTo(String value) {
            addCriterion("rechargeCode <>", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeGreaterThan(String value) {
            addCriterion("rechargeCode >", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeGreaterThanOrEqualTo(String value) {
            addCriterion("rechargeCode >=", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeLessThan(String value) {
            addCriterion("rechargeCode <", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeLessThanOrEqualTo(String value) {
            addCriterion("rechargeCode <=", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeLike(String value) {
            addCriterion("rechargeCode like", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeNotLike(String value) {
            addCriterion("rechargeCode not like", value, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeIn(List<String> values) {
            addCriterion("rechargeCode in", values, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeNotIn(List<String> values) {
            addCriterion("rechargeCode not in", values, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeBetween(String value1, String value2) {
            addCriterion("rechargeCode between", value1, value2, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargecodeNotBetween(String value1, String value2) {
            addCriterion("rechargeCode not between", value1, value2, "rechargecode");
            return (Criteria) this;
        }

        public Criteria andRechargedtIsNull() {
            addCriterion("rechargeDT is null");
            return (Criteria) this;
        }

        public Criteria andRechargedtIsNotNull() {
            addCriterion("rechargeDT is not null");
            return (Criteria) this;
        }

        public Criteria andRechargedtEqualTo(Date value) {
            addCriterion("rechargeDT =", value, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtNotEqualTo(Date value) {
            addCriterion("rechargeDT <>", value, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtGreaterThan(Date value) {
            addCriterion("rechargeDT >", value, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtGreaterThanOrEqualTo(Date value) {
            addCriterion("rechargeDT >=", value, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtLessThan(Date value) {
            addCriterion("rechargeDT <", value, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtLessThanOrEqualTo(Date value) {
            addCriterion("rechargeDT <=", value, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtIn(List<Date> values) {
            addCriterion("rechargeDT in", values, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtNotIn(List<Date> values) {
            addCriterion("rechargeDT not in", values, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtBetween(Date value1, Date value2) {
            addCriterion("rechargeDT between", value1, value2, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andRechargedtNotBetween(Date value1, Date value2) {
            addCriterion("rechargeDT not between", value1, value2, "rechargedt");
            return (Criteria) this;
        }

        public Criteria andPaydtIsNull() {
            addCriterion("payDT is null");
            return (Criteria) this;
        }

        public Criteria andPaydtIsNotNull() {
            addCriterion("payDT is not null");
            return (Criteria) this;
        }

        public Criteria andPaydtEqualTo(Date value) {
            addCriterion("payDT =", value, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtNotEqualTo(Date value) {
            addCriterion("payDT <>", value, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtGreaterThan(Date value) {
            addCriterion("payDT >", value, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtGreaterThanOrEqualTo(Date value) {
            addCriterion("payDT >=", value, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtLessThan(Date value) {
            addCriterion("payDT <", value, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtLessThanOrEqualTo(Date value) {
            addCriterion("payDT <=", value, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtIn(List<Date> values) {
            addCriterion("payDT in", values, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtNotIn(List<Date> values) {
            addCriterion("payDT not in", values, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtBetween(Date value1, Date value2) {
            addCriterion("payDT between", value1, value2, "paydt");
            return (Criteria) this;
        }

        public Criteria andPaydtNotBetween(Date value1, Date value2) {
            addCriterion("payDT not between", value1, value2, "paydt");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIsNull() {
            addCriterion("rechargeMoney is null");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIsNotNull() {
            addCriterion("rechargeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney =", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney <>", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyGreaterThan(BigDecimal value) {
            addCriterion("rechargeMoney >", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney >=", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyLessThan(BigDecimal value) {
            addCriterion("rechargeMoney <", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rechargeMoney <=", value, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyIn(List<BigDecimal> values) {
            addCriterion("rechargeMoney in", values, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotIn(List<BigDecimal> values) {
            addCriterion("rechargeMoney not in", values, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeMoney between", value1, value2, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andRechargemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rechargeMoney not between", value1, value2, "rechargemoney");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andRechangestateIsNull() {
            addCriterion("rechangeState is null");
            return (Criteria) this;
        }

        public Criteria andRechangestateIsNotNull() {
            addCriterion("rechangeState is not null");
            return (Criteria) this;
        }

        public Criteria andRechangestateEqualTo(Integer value) {
            addCriterion("rechangeState =", value, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateNotEqualTo(Integer value) {
            addCriterion("rechangeState <>", value, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateGreaterThan(Integer value) {
            addCriterion("rechangeState >", value, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rechangeState >=", value, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateLessThan(Integer value) {
            addCriterion("rechangeState <", value, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateLessThanOrEqualTo(Integer value) {
            addCriterion("rechangeState <=", value, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateIn(List<Integer> values) {
            addCriterion("rechangeState in", values, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateNotIn(List<Integer> values) {
            addCriterion("rechangeState not in", values, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateBetween(Integer value1, Integer value2) {
            addCriterion("rechangeState between", value1, value2, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andRechangestateNotBetween(Integer value1, Integer value2) {
            addCriterion("rechangeState not between", value1, value2, "rechangestate");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andThenoteIsNull() {
            addCriterion("theNote is null");
            return (Criteria) this;
        }

        public Criteria andThenoteIsNotNull() {
            addCriterion("theNote is not null");
            return (Criteria) this;
        }

        public Criteria andThenoteEqualTo(String value) {
            addCriterion("theNote =", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotEqualTo(String value) {
            addCriterion("theNote <>", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteGreaterThan(String value) {
            addCriterion("theNote >", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteGreaterThanOrEqualTo(String value) {
            addCriterion("theNote >=", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteLessThan(String value) {
            addCriterion("theNote <", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteLessThanOrEqualTo(String value) {
            addCriterion("theNote <=", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteLike(String value) {
            addCriterion("theNote like", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotLike(String value) {
            addCriterion("theNote not like", value, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteIn(List<String> values) {
            addCriterion("theNote in", values, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotIn(List<String> values) {
            addCriterion("theNote not in", values, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteBetween(String value1, String value2) {
            addCriterion("theNote between", value1, value2, "thenote");
            return (Criteria) this;
        }

        public Criteria andThenoteNotBetween(String value1, String value2) {
            addCriterion("theNote not between", value1, value2, "thenote");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table recharge
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
     * This class corresponds to the database table recharge
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