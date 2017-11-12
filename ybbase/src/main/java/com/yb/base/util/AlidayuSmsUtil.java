package com.yb.base.util;

import com.alibaba.fastjson.JSONObject;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class AlidayuSmsUtil {

	public static final String key = "23568963";
	public static final String secret = "ec486d4d59019752fb525930c37dc9de";
	public static final String url = "http://gw.api.taobao.com/router/rest";
	public static final String sign = "鲸客校园";
	public static final String templeteId = "SMS_34400355";
	public static final String type = "normal";
	
	
	public static String sendMessage(String id,String phone,String code){
		TaobaoClient client = new DefaultTaobaoClient(url, AlidayuSmsUtil.key, AlidayuSmsUtil.secret,"json");
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend(id);
		req.setSmsType(AlidayuSmsUtil.type);
		req.setSmsFreeSignName(AlidayuSmsUtil.sign);
		JSONObject obj = new JSONObject();
		obj.put("number", code);
		req.setSmsParamString(obj.toJSONString());
		req.setRecNum(phone);
		req.setSmsTemplateCode(AlidayuSmsUtil.templeteId);
		AlibabaAliqinFcSmsNumSendResponse rsp = null;
		try {
			rsp = client.execute(req);
			System.out.println(rsp.getBody());
			return rsp.getBody();
		} catch (ApiException e) {
			e.printStackTrace();
			return TipUtil.netWorkError;
		}
	}
	
//	public static void main(String[] args) {
//		sendMessage("2234","13735585951","11459");
//	}
}
