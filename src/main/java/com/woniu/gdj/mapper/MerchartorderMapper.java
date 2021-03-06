package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Merchartorder;
import com.woniu.gdj.entity.MerchartorderExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MerchartorderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(MerchartorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(MerchartorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(String merchartorderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(Merchartorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(Merchartorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<Merchartorder> selectByExample(MerchartorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    Merchartorder selectByPrimaryKey(String merchartorderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") Merchartorder record, @Param("example") MerchartorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") Merchartorder record, @Param("example") MerchartorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKeySelective(Merchartorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartorder
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByPrimaryKey(Merchartorder record);

    List<Merchartorder> selectByMerchart(Map map);
}