package com.yb.user.model;

import javax.persistence.*;

@Table(name = "yb_user_proxy")
public class YbUserProxy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 代理层级
     */
    @Column(name = "proxy_level")
    private Integer proxyLevel;

    /**
     * 代理分润策略
     */
    private Double rate;

    /**
     * 分润类型0、表示按比例，1、表示按数字
     */
    @Column(name = "rate_type")
    private String rateType;

    /**
     * 代理上家,上家可以指定下家的分润比例或者金额
     */
    @Column(name = "related_proxy")
    private Integer relatedProxy;

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
     * 获取代理层级
     *
     * @return proxy_level - 代理层级
     */
    public Integer getProxyLevel() {
        return proxyLevel;
    }

    /**
     * 设置代理层级
     *
     * @param proxyLevel 代理层级
     */
    public void setProxyLevel(Integer proxyLevel) {
        this.proxyLevel = proxyLevel;
    }

    /**
     * 获取代理分润策略
     *
     * @return rate - 代理分润策略
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 设置代理分润策略
     *
     * @param rate 代理分润策略
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * 获取分润类型0、表示按比例，1、表示按数字
     *
     * @return rate_type - 分润类型0、表示按比例，1、表示按数字
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * 设置分润类型0、表示按比例，1、表示按数字
     *
     * @param rateType 分润类型0、表示按比例，1、表示按数字
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    /**
     * 获取代理上家,上家可以指定下家的分润比例或者金额
     *
     * @return related_proxy - 代理上家,上家可以指定下家的分润比例或者金额
     */
    public Integer getRelatedProxy() {
        return relatedProxy;
    }

    /**
     * 设置代理上家,上家可以指定下家的分润比例或者金额
     *
     * @param relatedProxy 代理上家,上家可以指定下家的分润比例或者金额
     */
    public void setRelatedProxy(Integer relatedProxy) {
        this.relatedProxy = relatedProxy;
    }
}