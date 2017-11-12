package com.yb.base.component;

/**
 * Http应答基本类
 * @author ASUS
 *
 */
public abstract class YbResponse<T> {

	/**
	 * 应答编码
	 */
	public int error;
	/**
	 * 应答错误信息
	 */
	public String error_mesg;
	/**
	 * 获取应答结果
	 * @return
	 */
	public abstract T getResult();
}
