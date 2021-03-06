package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Stock;
import com.woniu.gdj.entity.StockExample;
import com.woniu.gdj.entity.StockKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(StockKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<Stock> selectByExample(StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    Stock selectByPrimaryKey(StockKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKeySelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKey(Stock record);
}