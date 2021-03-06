package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Store;
import com.woniu.gdj.entity.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int countByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int deleteByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int deleteByPrimaryKey(Integer storeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int insert(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int insertSelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    List<Store> selectByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    Store selectByPrimaryKey(Integer storeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int updateByPrimaryKeySelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Jun 15 16:34:59 CST 2020
     */
    int updateByPrimaryKey(Store record);
}