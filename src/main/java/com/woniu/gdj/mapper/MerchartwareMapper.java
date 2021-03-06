package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.MerchartwareExample;
import com.woniu.gdj.entity.MerchartwareKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchartwareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int countByExample(MerchartwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByExample(MerchartwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int deleteByPrimaryKey(MerchartwareKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insert(MerchartwareKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int insertSelective(MerchartwareKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    List<MerchartwareKey> selectByExample(MerchartwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExampleSelective(@Param("record") MerchartwareKey record, @Param("example") MerchartwareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchartware
     *
     * @mbggenerated Mon Jun 08 16:26:28 CST 2020
     */
    int updateByExample(@Param("record") MerchartwareKey record, @Param("example") MerchartwareExample example);
}