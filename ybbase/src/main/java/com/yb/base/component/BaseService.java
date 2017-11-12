package com.yb.base.component;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BaseService {
	
	public static Integer SUCCESS = 0x00;
	
	public static Integer COMMONFAIL = 0x01;
	
	public static Integer DBFAIL = 0x02;
	
	public static String SYSTEM_BASE_URL = "http://localhost:8080/";
	
	public Logger logger = LoggerFactory.getLogger(BaseService.class);
	
	public class ServiceResult<T> implements Serializable{

		private static final long serialVersionUID = 1L;
		
		protected ServiceResult(Integer resultCode,String resultStr,T t){
			this.resultCode = resultCode;
			this.resultStr = resultStr;
			this.t = t;
		}
		
		//空的构造方法
		protected ServiceResult() {
			// TODO Auto-generated constructor stub
		}

		/**
		 * 结果编码
		 */
		Integer resultCode;
		/**
		 * 结果字符串
		 */
		String resultStr;
		/**
		 * 结果对象
		 */
		T t;
		public Integer getResultCode() {
			return resultCode;
		}
		public String getResultStr() {
			return resultStr;
		}
		public T getT() {
			return t;
		}

		
	}
	/**
	 * 快速返回
	 * @param t
	 * @return
	 */
	default <T> ServiceResult<T> generateResult(T t){
		return generateResult(SUCCESS, "", t);
	}
	/**
	 * Service层返回结果
	 * @param resultCode
	 * @param resultStr
	 * @param t
	 * @return
	 */
	default <T> ServiceResult<T> generateResult(Integer resultCode, String resultStr, T t){
		return new ServiceResult<T>(resultCode, resultStr, t);
	}
	
}
