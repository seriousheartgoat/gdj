package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Wareinventory;
import com.woniu.gdj.entity.WareinventoryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WareinventoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(WareinventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(WareinventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(Integer wareinventoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(Wareinventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(Wareinventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<Wareinventory> selectByExample(WareinventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    Wareinventory selectByPrimaryKey(Integer wareinventoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Wareinventory record, @Param("example") WareinventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") Wareinventory record, @Param("example") WareinventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKeySelective(Wareinventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wareinventory
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKey(Wareinventory record);

    List<Wareinventory> selectByWareId(Map map);
    Wareinventory findByWareid(Integer wareId);
}