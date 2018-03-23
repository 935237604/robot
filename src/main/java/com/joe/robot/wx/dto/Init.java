package com.joe.robot.wx.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 初始化能得到该对象，包含用户信息（现在只取了当前有用的信息，还有许多当前无用的信息没有写进来）
 * @author joe
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Init {
	@JsonProperty(value = "SyncKey")
	private SyncKeyList syncKeyList;
	@JsonProperty(value = "User")
	private WxUser user;
	@JsonProperty(value = "BaseResponse")
	private BaseResponse baseResponse;
}
