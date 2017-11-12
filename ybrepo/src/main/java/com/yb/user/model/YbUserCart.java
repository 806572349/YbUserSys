package com.yb.user.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "yb_user_cart")
public class YbUserCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 产品ID
     */
    private Integer pid;

    /**
     * 类目ID
     */
    private Integer cid;

    /**
     * 商户ID
     */
    @Column(name = "business_id")
    private Integer businessId;

    /**
     * 商户名称
     */
    @Column(name = "business_name")
    private String businessName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 数量
     */
    private Integer numbers;

    /**
     * 商品全局唯一编码
     */
    @Column(name = "product_code")
    private String productCode;

    /**
     * 总价
     */
    @Column(name = "total_sum")
    private BigDecimal totalSum;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品小图标
     */
    @Column(name = "product_icon")
    private String productIcon;

    /**
     * 商品价格
     */
    @Column(name = "product_sum")
    private BigDecimal productSum;

    /**
     * 出售价格
     */
    @Column(name = "sale_sum")
    private BigDecimal saleSum;

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
     * 获取产品ID
     *
     * @return pid - 产品ID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置产品ID
     *
     * @param pid 产品ID
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取类目ID
     *
     * @return cid - 类目ID
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置类目ID
     *
     * @param cid 类目ID
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取商户ID
     *
     * @return business_id - 商户ID
     */
    public Integer getBusinessId() {
        return businessId;
    }

    /**
     * 设置商户ID
     *
     * @param businessId 商户ID
     */
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    /**
     * 获取商户名称
     *
     * @return business_name - 商户名称
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * 设置商户名称
     *
     * @param businessName 商户名称
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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
     * 获取数量
     *
     * @return numbers - 数量
     */
    public Integer getNumbers() {
        return numbers;
    }

    /**
     * 设置数量
     *
     * @param numbers 数量
     */
    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    /**
     * 获取商品全局唯一编码
     *
     * @return product_code - 商品全局唯一编码
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置商品全局唯一编码
     *
     * @param productCode 商品全局唯一编码
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 获取总价
     *
     * @return total_sum - 总价
     */
    public BigDecimal getTotalSum() {
        return totalSum;
    }

    /**
     * 设置总价
     *
     * @param totalSum 总价
     */
    public void setTotalSum(BigDecimal totalSum) {
        this.totalSum = totalSum;
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品小图标
     *
     * @return product_icon - 商品小图标
     */
    public String getProductIcon() {
        return productIcon;
    }

    /**
     * 设置商品小图标
     *
     * @param productIcon 商品小图标
     */
    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    /**
     * 获取商品价格
     *
     * @return product_sum - 商品价格
     */
    public BigDecimal getProductSum() {
        return productSum;
    }

    /**
     * 设置商品价格
     *
     * @param productSum 商品价格
     */
    public void setProductSum(BigDecimal productSum) {
        this.productSum = productSum;
    }

    /**
     * 获取出售价格
     *
     * @return sale_sum - 出售价格
     */
    public BigDecimal getSaleSum() {
        return saleSum;
    }

    /**
     * 设置出售价格
     *
     * @param saleSum 出售价格
     */
    public void setSaleSum(BigDecimal saleSum) {
        this.saleSum = saleSum;
    }
}