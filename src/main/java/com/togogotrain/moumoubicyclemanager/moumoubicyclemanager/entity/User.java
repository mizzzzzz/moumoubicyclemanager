package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.entity;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wxopenid
     *
     * @mbg.generated
     */
    private String wxopenid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.money
     *
     * @mbg.generated
     */
    private Float money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.hasDeposit
     *
     * @mbg.generated
     */
    private Boolean hasdeposit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wxopenid
     *
     * @return the value of user.wxopenid
     *
     * @mbg.generated
     */
    public String getWxopenid() {
        return wxopenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wxopenid
     *
     * @param wxopenid the value for user.wxopenid
     *
     * @mbg.generated
     */
    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid == null ? null : wxopenid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.money
     *
     * @return the value of user.money
     *
     * @mbg.generated
     */
    public Float getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.money
     *
     * @param money the value for user.money
     *
     * @mbg.generated
     */
    public void setMoney(Float money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.hasDeposit
     *
     * @return the value of user.hasDeposit
     *
     * @mbg.generated
     */
    public Boolean getHasdeposit() {
        return hasdeposit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.hasDeposit
     *
     * @param hasdeposit the value for user.hasDeposit
     *
     * @mbg.generated
     */
    public void setHasdeposit(Boolean hasdeposit) {
        this.hasdeposit = hasdeposit;
    }
}