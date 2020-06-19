package com.woniu.gdj.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Userinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer county;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.cityID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer cityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.provinceID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer provinceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.provinceName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String provincename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.cityName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String cityname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.countyName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String countyname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userPwd
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String userpwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.payPwd
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String paypwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userTel
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String usertel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userSex
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer usersex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.balance
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private BigDecimal balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userRegDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Date userregdt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.infoType
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer infotype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.theNote
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String thenote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.isDelete
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userID
     *
     * @return the value of userinfo.userID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userID
     *
     * @param userid the value for userinfo.userID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.county
     *
     * @return the value of userinfo.county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.county
     *
     * @param county the value for userinfo.county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setCounty(Integer county) {
        this.county = county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.cityID
     *
     * @return the value of userinfo.cityID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.cityID
     *
     * @param cityid the value for userinfo.cityID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.provinceID
     *
     * @return the value of userinfo.provinceID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.provinceID
     *
     * @param provinceid the value for userinfo.provinceID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.provinceName
     *
     * @return the value of userinfo.provinceName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.provinceName
     *
     * @param provincename the value for userinfo.provinceName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.cityName
     *
     * @return the value of userinfo.cityName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.cityName
     *
     * @param cityname the value for userinfo.cityName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.countyName
     *
     * @return the value of userinfo.countyName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getCountyname() {
        return countyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.countyName
     *
     * @param countyname the value for userinfo.countyName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userName
     *
     * @return the value of userinfo.userName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userName
     *
     * @param username the value for userinfo.userName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userPwd
     *
     * @return the value of userinfo.userPwd
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userPwd
     *
     * @param userpwd the value for userinfo.userPwd
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.payPwd
     *
     * @return the value of userinfo.payPwd
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getPaypwd() {
        return paypwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.payPwd
     *
     * @param paypwd the value for userinfo.payPwd
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userTel
     *
     * @return the value of userinfo.userTel
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getUsertel() {
        return usertel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userTel
     *
     * @param usertel the value for userinfo.userTel
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userSex
     *
     * @return the value of userinfo.userSex
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getUsersex() {
        return usersex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userSex
     *
     * @param usersex the value for userinfo.userSex
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.balance
     *
     * @return the value of userinfo.balance
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.balance
     *
     * @param balance the value for userinfo.balance
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userRegDT
     *
     * @return the value of userinfo.userRegDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getUserregdt() {
        return userregdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userRegDT
     *
     * @param userregdt the value for userinfo.userRegDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setUserregdt(Date userregdt) {
        this.userregdt = userregdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.infoType
     *
     * @return the value of userinfo.infoType
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getInfotype() {
        return infotype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.infoType
     *
     * @param infotype the value for userinfo.infoType
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setInfotype(Integer infotype) {
        this.infotype = infotype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.theNote
     *
     * @return the value of userinfo.theNote
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getThenote() {
        return thenote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.theNote
     *
     * @param thenote the value for userinfo.theNote
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setThenote(String thenote) {
        this.thenote = thenote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.isDelete
     *
     * @return the value of userinfo.isDelete
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.isDelete
     *
     * @param isdelete the value for userinfo.isDelete
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}