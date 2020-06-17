package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.County;
import com.woniu.gdj.entity.CountyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountyMapper {
    //获得市下所有的区
    List<County> findByCityid(int cityid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(Integer county);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(County record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(County record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<County> selectByExample(CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    County selectByPrimaryKey(Integer county);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") County record, @Param("example") CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") County record, @Param("example") CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKeySelective(County record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKey(County record);
}