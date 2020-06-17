package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Userinfo;
import com.woniu.gdj.entity.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    Userinfo selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKey(Userinfo record);

    Userinfo supperlierByUserName(String userName);
}