package com.yb.user.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_info")
public class YbUserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 订单总共省钱金额
     */
    @Column(name = "order_save")
    private BigDecimal orderSave;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 更新资料次数
     */
    @Column(name = "update_times")
    private Integer updateTimes;

    /**
     * 用户描述
     */
    @Column(name = "personal_desc")
    private String personalDesc;

    /**
     * 用户签名
     */
    @Column(name = "personal_sign")
    private String personalSign;

    /**
     * 身份证信息
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 身份证图片地址
     */
    @Column(name = "id_card_img")
    private String idCardImg;

    /**
     * 身份证背面
     */
    @Column(name = "id_card_back_img")
    private String idCardBackImg;

    /**
     * 性别1,为男性，2为女性，0为未知
     */
    private Integer sex;

    /**
     * 用户积分总分
     */
    private Integer point;

    /**
     * 用户账户当前总额
     */
    @Column(name = "account_sum")
    private BigDecimal accountSum;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 总共订单数
     */
    private Integer orders;

    /**
     * 订单总金额
     */
    @Column(name = "orders_sum")
    private BigDecimal ordersSum;

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
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取订单总共省钱金额
     *
     * @return order_save - 订单总共省钱金额
     */
    public BigDecimal getOrderSave() {
        return orderSave;
    }

    /**
     * 设置订单总共省钱金额
     *
     * @param orderSave 订单总共省钱金额
     */
    public void setOrderSave(BigDecimal orderSave) {
        this.orderSave = orderSave;
    }

    /**
     * 获取用户昵称
     *
     * @return nickname - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取更新资料次数
     *
     * @return update_times - 更新资料次数
     */
    public Integer getUpdateTimes() {
        return updateTimes;
    }

    /**
     * 设置更新资料次数
     *
     * @param updateTimes 更新资料次数
     */
    public void setUpdateTimes(Integer updateTimes) {
        this.updateTimes = updateTimes;
    }

    /**
     * 获取用户描述
     *
     * @return personal_desc - 用户描述
     */
    public String getPersonalDesc() {
        return personalDesc;
    }

    /**
     * 设置用户描述
     *
     * @param personalDesc 用户描述
     */
    public void setPersonalDesc(String personalDesc) {
        this.personalDesc = personalDesc;
    }

    /**
     * 获取用户签名
     *
     * @return personal_sign - 用户签名
     */
    public String getPersonalSign() {
        return personalSign;
    }

    /**
     * 设置用户签名
     *
     * @param personalSign 用户签名
     */
    public void setPersonalSign(String personalSign) {
        this.personalSign = personalSign;
    }

    /**
     * 获取身份证信息
     *
     * @return id_card - 身份证信息
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证信息
     *
     * @param idCard 身份证信息
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取身份证图片地址
     *
     * @return id_card_img - 身份证图片地址
     */
    public String getIdCardImg() {
        return idCardImg;
    }

    /**
     * 设置身份证图片地址
     *
     * @param idCardImg 身份证图片地址
     */
    public void setIdCardImg(String idCardImg) {
        this.idCardImg = idCardImg;
    }

    /**
     * 获取身份证背面
     *
     * @return id_card_back_img - 身份证背面
     */
    public String getIdCardBackImg() {
        return idCardBackImg;
    }

    /**
     * 设置身份证背面
     *
     * @param idCardBackImg 身份证背面
     */
    public void setIdCardBackImg(String idCardBackImg) {
        this.idCardBackImg = idCardBackImg;
    }

    /**
     * 获取性别1,为男性，2为女性，0为未知
     *
     * @return sex - 性别1,为男性，2为女性，0为未知
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别1,为男性，2为女性，0为未知
     *
     * @param sex 性别1,为男性，2为女性，0为未知
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取用户积分总分
     *
     * @return point - 用户积分总分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置用户积分总分
     *
     * @param point 用户积分总分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 获取用户账户当前总额
     *
     * @return account_sum - 用户账户当前总额
     */
    public BigDecimal getAccountSum() {
        return accountSum;
    }

    /**
     * 设置用户账户当前总额
     *
     * @param accountSum 用户账户当前总额
     */
    public void setAccountSum(BigDecimal accountSum) {
        this.accountSum = accountSum;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取总共订单数
     *
     * @return orders - 总共订单数
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置总共订单数
     *
     * @param orders 总共订单数
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获取订单总金额
     *
     * @return orders_sum - 订单总金额
     */
    public BigDecimal getOrdersSum() {
        return ordersSum;
    }

    /**
     * 设置订单总金额
     *
     * @param ordersSum 订单总金额
     */
    public void setOrdersSum(BigDecimal ordersSum) {
        this.ordersSum = ordersSum;
    }
}