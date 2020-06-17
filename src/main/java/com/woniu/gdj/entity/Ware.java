package com.woniu.gdj.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Ware {
    //商品图片
    private Wareimage wareimage;
    //商家
    private Store store;

    public Wareimage getWareimage() {
        return wareimage;
    }

    public void setWareimage(Wareimage wareimage) {
        this.wareimage = wareimage;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareId
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer wareid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.storeID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer storeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareClassificationTypeID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer wareclassificationtypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareNo
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String wareno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareCode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String warecode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.warePlace
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String wareplace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareWeight
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private BigDecimal wareweight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareSpec
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String warespec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareDesc
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String waredesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareFreeExpressNo
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer warefreeexpressno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.isUserCoupon
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer isusercoupon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.buyQty
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer buyqty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.giveQty
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer giveqty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.buyCash
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private BigDecimal buycash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.reduceCash
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private BigDecimal reducecash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.salePrice
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private BigDecimal saleprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.buyNumber
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer buynumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.addDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Date adddt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.lastEditDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Date lasteditdt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.isDelete
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer isdelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.isShop
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer isshop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.isAudit
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private Integer isaudit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.pageTitle
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String pagetitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.keywords
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String keywords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ware.wareName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    private String warename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareId
     *
     * @return the value of ware.wareId
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getWareid() {
        return wareid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareId
     *
     * @param wareid the value for ware.wareId
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.storeID
     *
     * @return the value of ware.storeID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getStoreid() {
        return storeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.storeID
     *
     * @param storeid the value for ware.storeID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareClassificationTypeID
     *
     * @return the value of ware.wareClassificationTypeID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getWareclassificationtypeid() {
        return wareclassificationtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareClassificationTypeID
     *
     * @param wareclassificationtypeid the value for ware.wareClassificationTypeID
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWareclassificationtypeid(Integer wareclassificationtypeid) {
        this.wareclassificationtypeid = wareclassificationtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareNo
     *
     * @return the value of ware.wareNo
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getWareno() {
        return wareno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareNo
     *
     * @param wareno the value for ware.wareNo
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWareno(String wareno) {
        this.wareno = wareno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareCode
     *
     * @return the value of ware.wareCode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getWarecode() {
        return warecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareCode
     *
     * @param warecode the value for ware.wareCode
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWarecode(String warecode) {
        this.warecode = warecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.warePlace
     *
     * @return the value of ware.warePlace
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getWareplace() {
        return wareplace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.warePlace
     *
     * @param wareplace the value for ware.warePlace
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWareplace(String wareplace) {
        this.wareplace = wareplace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareWeight
     *
     * @return the value of ware.wareWeight
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public BigDecimal getWareweight() {
        return wareweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareWeight
     *
     * @param wareweight the value for ware.wareWeight
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWareweight(BigDecimal wareweight) {
        this.wareweight = wareweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareSpec
     *
     * @return the value of ware.wareSpec
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getWarespec() {
        return warespec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareSpec
     *
     * @param warespec the value for ware.wareSpec
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWarespec(String warespec) {
        this.warespec = warespec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareDesc
     *
     * @return the value of ware.wareDesc
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getWaredesc() {
        return waredesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareDesc
     *
     * @param waredesc the value for ware.wareDesc
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWaredesc(String waredesc) {
        this.waredesc = waredesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareFreeExpressNo
     *
     * @return the value of ware.wareFreeExpressNo
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getWarefreeexpressno() {
        return warefreeexpressno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareFreeExpressNo
     *
     * @param warefreeexpressno the value for ware.wareFreeExpressNo
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWarefreeexpressno(Integer warefreeexpressno) {
        this.warefreeexpressno = warefreeexpressno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.isUserCoupon
     *
     * @return the value of ware.isUserCoupon
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getIsusercoupon() {
        return isusercoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.isUserCoupon
     *
     * @param isusercoupon the value for ware.isUserCoupon
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setIsusercoupon(Integer isusercoupon) {
        this.isusercoupon = isusercoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.buyQty
     *
     * @return the value of ware.buyQty
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getBuyqty() {
        return buyqty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.buyQty
     *
     * @param buyqty the value for ware.buyQty
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setBuyqty(Integer buyqty) {
        this.buyqty = buyqty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.giveQty
     *
     * @return the value of ware.giveQty
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getGiveqty() {
        return giveqty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.giveQty
     *
     * @param giveqty the value for ware.giveQty
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setGiveqty(Integer giveqty) {
        this.giveqty = giveqty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.buyCash
     *
     * @return the value of ware.buyCash
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public BigDecimal getBuycash() {
        return buycash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.buyCash
     *
     * @param buycash the value for ware.buyCash
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setBuycash(BigDecimal buycash) {
        this.buycash = buycash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.reduceCash
     *
     * @return the value of ware.reduceCash
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public BigDecimal getReducecash() {
        return reducecash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.reduceCash
     *
     * @param reducecash the value for ware.reduceCash
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setReducecash(BigDecimal reducecash) {
        this.reducecash = reducecash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.salePrice
     *
     * @return the value of ware.salePrice
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.salePrice
     *
     * @param saleprice the value for ware.salePrice
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.buyNumber
     *
     * @return the value of ware.buyNumber
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getBuynumber() {
        return buynumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.buyNumber
     *
     * @param buynumber the value for ware.buyNumber
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setBuynumber(Integer buynumber) {
        this.buynumber = buynumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.addDT
     *
     * @return the value of ware.addDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Date getAdddt() {
        return adddt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.addDT
     *
     * @param adddt the value for ware.addDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setAdddt(Date adddt) {
        this.adddt = adddt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.lastEditDT
     *
     * @return the value of ware.lastEditDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Date getLasteditdt() {
        return lasteditdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.lastEditDT
     *
     * @param lasteditdt the value for ware.lastEditDT
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setLasteditdt(Date lasteditdt) {
        this.lasteditdt = lasteditdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.isDelete
     *
     * @return the value of ware.isDelete
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.isDelete
     *
     * @param isdelete the value for ware.isDelete
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.isShop
     *
     * @return the value of ware.isShop
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getIsshop() {
        return isshop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.isShop
     *
     * @param isshop the value for ware.isShop
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setIsshop(Integer isshop) {
        this.isshop = isshop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.isAudit
     *
     * @return the value of ware.isAudit
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public Integer getIsaudit() {
        return isaudit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.isAudit
     *
     * @param isaudit the value for ware.isAudit
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setIsaudit(Integer isaudit) {
        this.isaudit = isaudit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.pageTitle
     *
     * @return the value of ware.pageTitle
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getPagetitle() {
        return pagetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.pageTitle
     *
     * @param pagetitle the value for ware.pageTitle
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setPagetitle(String pagetitle) {
        this.pagetitle = pagetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.keywords
     *
     * @return the value of ware.keywords
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.keywords
     *
     * @param keywords the value for ware.keywords
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ware.wareName
     *
     * @return the value of ware.wareName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public String getWarename() {
        return warename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ware.wareName
     *
     * @param warename the value for ware.wareName
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    public void setWarename(String warename) {
        this.warename = warename;
    }
}