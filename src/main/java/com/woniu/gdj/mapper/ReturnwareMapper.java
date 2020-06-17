package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Returnware;
import com.woniu.gdj.entity.ReturnwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnwareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(ReturnwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(ReturnwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(String returnwareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(Returnware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(Returnware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<Returnware> selectByExample(ReturnwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    Returnware selectByPrimaryKey(String returnwareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Returnware record, @Param("example") ReturnwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") Returnware record, @Param("example") ReturnwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKeySelective(Returnware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKey(Returnware record);
}