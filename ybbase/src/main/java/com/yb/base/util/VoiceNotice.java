package com.yb.base.util;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 语音通知-beam类
 * @author Administrator
 *
 */
@XmlRootElement(name = "voiceNotice")
public class VoiceNotice implements Serializable{
	private static final long serialVersionUID = 1L;
	private String appId;//必选	应用Id
	private String to;//必选	被叫号码
	private String toSerNum;//可选	语音通知的被叫侧显示的号码
	private String type;//必选	2{文字模板}
	private String playTimes;//可选	语音通知播放次数，默认是1次
	private String templateId;//必选	模板ID
	private String content;//必选	模板参数值,形式为json格式，如{“var1”:“aa”,“var2”:“bb”}
	private String billUrl;//可选	话单推送url
	private String userData;//可选	用户自定义透传字段
	private String event;//必选	值为：saleCall
	private String callId;//必选	通话唯一标识由云平台通过2接口响应得到
	private String requestId;//必选	请求时携带的requestId，原样返回
	private String caller;//必选	主叫号码
	private String callee;//必选  被叫号码，被叫为座机时需要添加区号，如：075512345678
	private String duration;//必选  通话时长，单位为秒
	private String state;//必选	通话状态，0：正常通话；1：被叫未接听；2：被叫拒接；3：外呼失败
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getToSerNum() {
		return toSerNum;
	}
	public void setToSerNum(String toSerNum) {
		this.toSerNum = toSerNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlayTimes() {
		return playTimes;
	}
	public void setPlayTimes(String playTimes) {
		this.playTimes = playTimes;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBillUrl() {
		return billUrl;
	}
	public void setBillUrl(String billUrl) {
		this.billUrl = billUrl;
	}
	public String getUserData() {
		return userData;
	}
	public void setUserData(String userData) {
		this.userData = userData;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getCaller() {
		return caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}
	public String getCallee() {
		return callee;
	}
	public void setCallee(String callee) {
		this.callee = callee;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	/*public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}*/
	
}
