package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Wareclassificationtype;
import com.woniu.gdj.entity.WareclassificationtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareclassificationtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(WareclassificationtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(WareclassificationtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(Integer wareclassificationtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(Wareclassificationtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(Wareclassificationtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<Wareclassificationtype> selectByExample(WareclassificationtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    Wareclassificationtype selectByPrimaryKey(Integer wareclassificationtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Wareclassificationtype record, @Param("example") WareclassificationtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") Wareclassificationtype record, @Param("example") WareclassificationtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKeySelective(Wareclassificationtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareclassificationtype
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKey(Wareclassificationtype record);
}