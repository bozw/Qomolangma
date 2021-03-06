package com.boz.dao;

import com.boz.model.BozUser;
import com.boz.model.BozUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BozUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int countByExample(BozUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int deleteByExample(BozUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int insert(BozUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int insertSelective(BozUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    List<BozUser> selectByExample(BozUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    BozUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int updateByExampleSelective(@Param("record") BozUser record, @Param("example") BozUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int updateByExample(@Param("record") BozUser record, @Param("example") BozUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int updateByPrimaryKeySelective(BozUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boz_user
     *
     * @mbggenerated Mon May 08 07:50:34 CST 2017
     */
    int updateByPrimaryKey(BozUser record);
}