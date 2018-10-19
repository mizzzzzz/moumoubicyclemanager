package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.mappers;

import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.Bicycle;
import com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity.BicycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BicycleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    long countByExample(BicycleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int deleteByExample(BicycleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int insert(Bicycle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int insertSelective(Bicycle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    List<Bicycle> selectByExample(BicycleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    Bicycle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Bicycle record, @Param("example") BicycleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Bicycle record, @Param("example") BicycleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Bicycle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bicycle
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Bicycle record);
}