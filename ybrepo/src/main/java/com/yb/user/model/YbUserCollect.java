package com.yb.user.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_collect")
public class YbUserCollect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 搜藏记录类型ID 0，表示商品，1表示商铺，2表示其他类型还在扩展中
     */
    private Integer type;

    /**
     * 浏览对象ID
     */
    @Column(name = "type_obj_id")
    private Integer typeObjId;

    /**
     * 浏览对象名称,对象四要素之一，不一定使用
     */
    @Column(name = "type_obj_name")
    private String typeObjName;

    /**
     * 浏览对象描述,对象四要素之一，不一定使用
     */
    @Column(name = "type_obj_desc")
    private String typeObjDesc;

    /**
     * 浏览对象图标,对象四要素之一，不一定使用
     */
    @Column(name = "type_obj_icon")
    private String typeObjIcon;

    /**
     * 浏览对象地址,对象四要素之一，不一定使用
     */
    @Column(name = "type_obj_url")
    private String typeObjUrl;

    /**
     * 浏览对象展示属性,若为商品，则该字段展示单价
     */
    @Column(name = "type_obj_property")
    private String typeObjProperty;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 点击次数,统计收藏页面流量值
     */
    private Integer clicks;

    /**
     * 最后一次点击进入收藏对象地址
     */
    @Column(name = "last_time")
    private Date lastTime;

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
     * 获取搜藏记录类型ID 0，表示商品，1表示商铺，2表示其他类型还在扩展中
     *
     * @return type - 搜藏记录类型ID 0，表示商品，1表示商铺，2表示其他类型还在扩展中
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置搜藏记录类型ID 0，表示商品，1表示商铺，2表示其他类型还在扩展中
     *
     * @param type 搜藏记录类型ID 0，表示商品，1表示商铺，2表示其他类型还在扩展中
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取浏览对象ID
     *
     * @return type_obj_id - 浏览对象ID
     */
    public Integer getTypeObjId() {
        return typeObjId;
    }

    /**
     * 设置浏览对象ID
     *
     * @param typeObjId 浏览对象ID
     */
    public void setTypeObjId(Integer typeObjId) {
        this.typeObjId = typeObjId;
    }

    /**
     * 获取浏览对象名称,对象四要素之一，不一定使用
     *
     * @return type_obj_name - 浏览对象名称,对象四要素之一，不一定使用
     */
    public String getTypeObjName() {
        return typeObjName;
    }

    /**
     * 设置浏览对象名称,对象四要素之一，不一定使用
     *
     * @param typeObjName 浏览对象名称,对象四要素之一，不一定使用
     */
    public void setTypeObjName(String typeObjName) {
        this.typeObjName = typeObjName;
    }

    /**
     * 获取浏览对象描述,对象四要素之一，不一定使用
     *
     * @return type_obj_desc - 浏览对象描述,对象四要素之一，不一定使用
     */
    public String getTypeObjDesc() {
        return typeObjDesc;
    }

    /**
     * 设置浏览对象描述,对象四要素之一，不一定使用
     *
     * @param typeObjDesc 浏览对象描述,对象四要素之一，不一定使用
     */
    public void setTypeObjDesc(String typeObjDesc) {
        this.typeObjDesc = typeObjDesc;
    }

    /**
     * 获取浏览对象图标,对象四要素之一，不一定使用
     *
     * @return type_obj_icon - 浏览对象图标,对象四要素之一，不一定使用
     */
    public String getTypeObjIcon() {
        return typeObjIcon;
    }

    /**
     * 设置浏览对象图标,对象四要素之一，不一定使用
     *
     * @param typeObjIcon 浏览对象图标,对象四要素之一，不一定使用
     */
    public void setTypeObjIcon(String typeObjIcon) {
        this.typeObjIcon = typeObjIcon;
    }

    /**
     * 获取浏览对象地址,对象四要素之一，不一定使用
     *
     * @return type_obj_url - 浏览对象地址,对象四要素之一，不一定使用
     */
    public String getTypeObjUrl() {
        return typeObjUrl;
    }

    /**
     * 设置浏览对象地址,对象四要素之一，不一定使用
     *
     * @param typeObjUrl 浏览对象地址,对象四要素之一，不一定使用
     */
    public void setTypeObjUrl(String typeObjUrl) {
        this.typeObjUrl = typeObjUrl;
    }

    /**
     * 获取浏览对象展示属性,若为商品，则该字段展示单价
     *
     * @return type_obj_property - 浏览对象展示属性,若为商品，则该字段展示单价
     */
    public String getTypeObjProperty() {
        return typeObjProperty;
    }

    /**
     * 设置浏览对象展示属性,若为商品，则该字段展示单价
     *
     * @param typeObjProperty 浏览对象展示属性,若为商品，则该字段展示单价
     */
    public void setTypeObjProperty(String typeObjProperty) {
        this.typeObjProperty = typeObjProperty;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取点击次数,统计收藏页面流量值
     *
     * @return clicks - 点击次数,统计收藏页面流量值
     */
    public Integer getClicks() {
        return clicks;
    }

    /**
     * 设置点击次数,统计收藏页面流量值
     *
     * @param clicks 点击次数,统计收藏页面流量值
     */
    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    /**
     * 获取最后一次点击进入收藏对象地址
     *
     * @return last_time - 最后一次点击进入收藏对象地址
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置最后一次点击进入收藏对象地址
     *
     * @param lastTime 最后一次点击进入收藏对象地址
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}