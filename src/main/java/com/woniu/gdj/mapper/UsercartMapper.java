package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Usercart;
import com.woniu.gdj.entity.UsercartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsercartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(UsercartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(UsercartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(Integer usercartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(Usercart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(Usercart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<Usercart> selectByExample(UsercartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    Usercart selectByPrimaryKey(Integer usercartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Usercart record, @Param("example") UsercartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") Usercart record, @Param("example") UsercartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKeySelective(Usercart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usercart
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKey(Usercart record);
}