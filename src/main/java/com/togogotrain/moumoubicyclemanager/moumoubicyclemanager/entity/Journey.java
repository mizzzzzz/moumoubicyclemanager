package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity;

import java.util.Date;

public class Journey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey.user
     *
     * @mbg.generated
     */
    private Long user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey.bicycle
     *
     * @mbg.generated
     */
    private Long bicycle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey.startTime
     *
     * @mbg.generated
     */
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey.finishTime
     *
     * @mbg.generated
     */
    private Date finishtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey.cost
     *
     * @mbg.generated
     */
    private Float cost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column journey.haspaid
     *
     * @mbg.generated
     */
    private Boolean haspaid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey.id
     *
     * @return the value of journey.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey.id
     *
     * @param id the value for journey.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey.user
     *
     * @return the value of journey.user
     *
     * @mbg.generated
     */
    public Long getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey.user
     *
     * @param user the value for journey.user
     *
     * @mbg.generated
     */
    public void setUser(Long user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey.bicycle
     *
     * @return the value of journey.bicycle
     *
     * @mbg.generated
     */
    public Long getBicycle() {
        return bicycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey.bicycle
     *
     * @param bicycle the value for journey.bicycle
     *
     * @mbg.generated
     */
    public void setBicycle(Long bicycle) {
        this.bicycle = bicycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey.startTime
     *
     * @return the value of journey.startTime
     *
     * @mbg.generated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey.startTime
     *
     * @param starttime the value for journey.startTime
     *
     * @mbg.generated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey.finishTime
     *
     * @return the value of journey.finishTime
     *
     * @mbg.generated
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey.finishTime
     *
     * @param finishtime the value for journey.finishTime
     *
     * @mbg.generated
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey.cost
     *
     * @return the value of journey.cost
     *
     * @mbg.generated
     */
    public Float getCost() {
        return cost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey.cost
     *
     * @param cost the value for journey.cost
     *
     * @mbg.generated
     */
    public void setCost(Float cost) {
        this.cost = cost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column journey.haspaid
     *
     * @return the value of journey.haspaid
     *
     * @mbg.generated
     */
    public Boolean getHaspaid() {
        return haspaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column journey.haspaid
     *
     * @param haspaid the value for journey.haspaid
     *
     * @mbg.generated
     */
    public void setHaspaid(Boolean haspaid) {
        this.haspaid = haspaid;
    }
}