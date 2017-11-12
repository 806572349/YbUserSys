package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_address")
public class YbUserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 省份
     */
    private Long province;

    /**
     * 城市
     */
    private Long city;

    /**
     * 地区
     */
    private Long district;

    /**
     * 街道地址
     */
    private String street;

    /**
     * 收件人名称
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 地址是否有效
     */
    private Integer valid;

    /**
     * 是否默认地址
     */
    private Integer isdefault;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public Long getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(Long province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public Long getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(Long city) {
        this.city = city;
    }

    /**
     * 获取地区
     *
     * @return district - 地区
     */
    public Long getDistrict() {
        return district;
    }

    /**
     * 设置地区
     *
     * @param district 地区
     */
    public void setDistrict(Long district) {
        this.district = district;
    }

    /**
     * 获取街道地址
     *
     * @return street - 街道地址
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道地址
     *
     * @param street 街道地址
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获取收件人名称
     *
     * @return customer_name - 收件人名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置收件人名称
     *
     * @param customerName 收件人名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取地址是否有效
     *
     * @return valid - 地址是否有效
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * 设置地址是否有效
     *
     * @param valid 地址是否有效
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * 获取是否默认地址
     *
     * @return isdefault - 是否默认地址
     */
    public Integer getIsdefault() {
        return isdefault;
    }

    /**
     * 设置是否默认地址
     *
     * @param isdefault 是否默认地址
     */
    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    /**
     * 获取联系电话
     *
     * @return mobile - 联系电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系电话
     *
     * @param mobile 联系电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮编
     *
     * @return postcode - 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮编
     *
     * @param postcode 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}