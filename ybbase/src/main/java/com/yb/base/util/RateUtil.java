package com.yb.base.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RateUtil {
	
	
	static BigDecimal bigYear=new BigDecimal(365);
	
	/**
	 * 有加息券的计算
	 * @param payAmount 投资金额
	 * @param addRate   加息利率
	 * @param baseRate  基础投资利率
	 * @param days 	           投资天数
	 * @param addDays   加息天数
	 * @return  利息加本金
	 */
	public static BigDecimal calculateRate(BigDecimal payAmount,BigDecimal addRate,BigDecimal baseRate,Integer days,Integer addDays){
		
		BigDecimal bigAddDays=new BigDecimal(addDays);
		BigDecimal bigDays=new BigDecimal(days);
		// 加息券天数 大于 投资天数   全部天数的利率 = 加息券利率 + 基础利率
		if(addDays >= days){
			BigDecimal daysDivYear= bigDays.divide(bigYear, 4, RoundingMode.HALF_UP);
			BigDecimal addRateAmount =  baseRate.add(addRate).multiply(payAmount).multiply(daysDivYear);
			return payAmount.add(addRateAmount);
			
		}else{
			BigDecimal addDaysDivYears=bigAddDays.divide(bigYear, 4, RoundingMode.HALF_UP);
			BigDecimal addRateAmount = baseRate.add(addRate).multiply(payAmount).multiply(addDaysDivYears);
			BigDecimal baseRateAmount = calculateRate(payAmount, baseRate, days-addDays);
			return baseRateAmount.add(addRateAmount);
		}
	}
	
	/**
	 * 基础利息计算 无加息券
	 * @param payAmount
	 * @param baseRate
	 * @param days 
	 */
	public static BigDecimal calculateRate(BigDecimal payAmount,BigDecimal baseRate,Integer days){
		BigDecimal bigDays =new BigDecimal(days);
		BigDecimal daysDivYear = bigDays.divide(bigYear, 4, RoundingMode.HALF_UP);
		BigDecimal baseRateAmount = baseRate.multiply(payAmount).multiply(daysDivYear);
		return payAmount.add(baseRateAmount);
	}
	

}
