package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_oauth_wxapp")
public class YbUserOauthWxapp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 微信OPENID
     */
    private String openid;

    /**
     * 微信性别
     */
    private Integer sex;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 重刷TOKEN
     */
    @Column(name = "refresh_token")
    private String refreshToken;

    /**
     * 访问token
     */
    @Column(name = "access_token")
    private String accessToken;

    /**
     * 超时时间
     */
    @Column(name = "expires_in")
    private Integer expiresIn;

    /**
     * 头像地址
     */
    private String headimgurl;

    /**
     * 特权信息
     */
    private String privilege;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

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
     * 获取微信OPENID
     *
     * @return openid - 微信OPENID
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置微信OPENID
     *
     * @param openid 微信OPENID
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取微信性别
     *
     * @return sex - 微信性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置微信性别
     *
     * @param sex 微信性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取重刷TOKEN
     *
     * @return refresh_token - 重刷TOKEN
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 设置重刷TOKEN
     *
     * @param refreshToken 重刷TOKEN
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 获取访问token
     *
     * @return access_token - 访问token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 设置访问token
     *
     * @param accessToken 访问token
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 获取超时时间
     *
     * @return expires_in - 超时时间
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * 设置超时时间
     *
     * @param expiresIn 超时时间
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * 获取头像地址
     *
     * @return headimgurl - 头像地址
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置头像地址
     *
     * @param headimgurl 头像地址
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取特权信息
     *
     * @return privilege - 特权信息
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * 设置特权信息
     *
     * @param privilege 特权信息
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
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
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}