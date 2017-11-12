package com.yb.base.util;

import com.google.gson.Gson;

import net.sf.json.JSONObject;

/**
 * 隐私号码和语音通知的工具类
 * @author Administrator
 *
 */
public class UcpaasUtil{
	//平台要求一个APPID只能申请一个业务号，这个时申请的隐私号业务
	private static String APPID="bd40988b343348eaa50b7a62a247b289";
	private static String accountSid = "d16426fbcdd89666cb99a51ae7e868cd";
	private static String authToken = "a671186b5bbad268b889c8c6f8ccc185";
	private static String version = "2014-06-30";
	private static String NOTICE_APPID ="5b1f4de6da7a412a91170e30b5e31d2d";//平台要求一个APPID只能申请一个业务号，这个时申请的语音通知业务
	private static  String NOTICE_TEMPLATE_ID="1246";//语音通知-模板id：您的车牌{num}在{where}违停，请速挪车。每个参数不得超过20个字符
	/**
	 * 双向绑定号码同步接口
	 */
	public static String allotNumber(String caller,String callee) {
		SafetyCalls calls = new SafetyCalls();
		/**
		 * 设置应用id
		 */
		calls.setAppId(APPID);
		/**
		 * 设置主拨号
		 */
		calls.setCaller("0086"+caller);
		/**
		 * 设置被拨号
		 */
		calls.setCallee("0086"+callee);
		/**
		 * 设置双向绑定的最大时间（单位为秒）
		 */
		calls.setMaxAge("600");
		/**
		 * 设置城市id
		 * 0086+城市区号去零   0086+574组合 0574宁波区号
		 */
		calls.setCityId("0086574");
		// 构造请求URL内容
		String timestamp = Validator.dateFormat();
		String signature=null;
		try {
			signature = MD5Util.md5Digest(accountSid + authToken + timestamp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String url = "https://api.ucpaas.com/"+version+"/Accounts/"+accountSid+"/safetyCalls/allocNumber?sig="+signature;
		String body = "";
		if (calls != null) {
			Gson gson = new Gson();
			body = gson.toJson(calls);
		}
		//发送http请求
		String result = HttpUtil.SafetyPost("application/json", accountSid, authToken, timestamp, url, body);
		JSONObject obj = JSONObject.fromObject(result);
		Object code = obj.get("errorCode");
		if(code!=null)
			return null;
		System.out.println("code"+code);
		/*{
			"caller":"18612341234",
			"appId":"7df01234567841ed816564bb12345678",
			"bindId":"7df0123456ipoopujk7841ed816564bb12345678",//取出bindId 解绑时要用
			"dstVirtualNum":"0086201000123",//取出dstVirtualNum 用户拨打电话时显示的虚拟号码
			"callee":"13611133396"
			}*/
		//String dstVirtualNum = obj.getString("dstVirtualNum");
		return result;
	}
	/**
	 * 隐私号码双向关系解绑
	 * @param bindId
	 * @return
	 */
	public static String freeNum(String bindId){
		String timestamp = Validator.dateFormat();
		String signature=null;
		try {
			signature = MD5Util.md5Digest(accountSid + authToken + timestamp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String url = "https://api.ucpaas.com/"+version+"/Accounts/"+accountSid+"/safetyCalls/freeNumber?sig="+signature;
		JSONObject json = new JSONObject();
		json.put("appId", APPID);
		json.put("bindId", bindId);
		json.put("cityId", "0086574");
		String result = HttpUtil.SafetyPost("application/json", accountSid, authToken, timestamp, url, json.toString());
		JSONObject obj = JSONObject.fromObject(result);
		Object code = obj.get("errorCode");
		String codeStr=code.toString();
		if(!codeStr.equals("000000"))
			return null;
		return result;
	}
	/**
	 * 语音通知接口
	 */
	public static void voiceNotice(String callee,String carNum,String carLocation) {
		VoiceNotice notice=new VoiceNotice();
		notice.setAppId(NOTICE_APPID);
		notice.setBillUrl(null);//可选，为语音通知话单回调接口 需自定义
		/**
		 * 通知用户的手机号
		 */
		notice.setTo(callee);
		/**
		 * 语音通知时用户显示的号码，平台申请的
		 */
		notice.setToSerNum("057156056292");
		/**
		 * 固定值
		 */
		notice.setType("2");
		/**
		 * 语音通知播放次数
		 */
		notice.setPlayTimes("2");
		/**
		 * 语音模板id
		 */
		notice.setTemplateId(NOTICE_TEMPLATE_ID);
		Gson gson=new Gson();
		TemplateParam params=new TemplateParam();
		/**
		 * 模板参数，车牌号
		 */
		params.setNum(carNum);
		/**
		 * 模板参数，车辆地点
		 */
		params.setWhere(carLocation);
		String json=gson.toJson(params);
		notice.setContent(json);
		//发送http请求
		String timestamp = Validator.dateFormat();
		String signature=null;
		try {
			signature = MD5Util.md5Digest(accountSid + authToken + timestamp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String url = "https://message.ucpaas.com/"+version+"/Accounts/"+accountSid+"/Calls/voiceNotify?sig="+signature;
		String body = "";
		if (notice != null) {
			//Gson gson = new Gson();
			body = gson.toJson(notice);
			body="{\"voiceNotify\":"+body+"}";
		}
		String result = HttpUtil.SafetyPost("application/json", accountSid, authToken, timestamp, url, body);
		System.out.println("语音通知相应包"+result);
	}


}
