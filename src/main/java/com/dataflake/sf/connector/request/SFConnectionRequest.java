package com.dataflake.sf.connector.request;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
// @formatter:off
@JsonPropertyOrder({
"app_id",
"client_id",
"c_username",
"c_password",
"c_client_id",
"c_client_secret",
"c_domain",
"c_grant_type"
})
//@formatter:on
public class SFConnectionRequest {

	@JsonProperty("app_id")
	private String appId;
	@JsonProperty("client_id")
	private String clientId;
	@JsonProperty("c_username")
	private String cUsername;
	@JsonProperty("c_password")
	private String cPassword;
	@JsonProperty("c_client_id")
	private String cClientId;
	@JsonProperty("c_client_secret")
	private String cClientSecret;
	@JsonProperty("c_domain")
	private String cDomain;
	@JsonProperty("c_grant_type")
	private String cGrantType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("app_id")
	public String getAppId() {
		return appId;
	}

	@JsonProperty("app_id")
	public void setAppId(String appId) {
		this.appId = appId;
	}

	@JsonProperty("client_id")
	public String getClientId() {
		return clientId;
	}

	@JsonProperty("client_id")
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@JsonProperty("c_username")
	public String getcUsername() {
		return cUsername;
	}

	@JsonProperty("c_username")
	public void setcUsername(String cUsername) {
		this.cUsername = cUsername;
	}

	@JsonProperty("c_password")
	public String getcPassword() {
		return cPassword;
	}

	@JsonProperty("c_password")
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	@JsonProperty("c_client_id")
	public String getcClientId() {
		return cClientId;
	}

	@JsonProperty("c_client_id")
	public void setcClientId(String cClientId) {
		this.cClientId = cClientId;
	}

	@JsonProperty("c_client_secret")
	public String getcClientSecret() {
		return cClientSecret;
	}

	@JsonProperty("c_client_secret")
	public void setcClientSecret(String cClientSecret) {
		this.cClientSecret = cClientSecret;
	}

	@JsonProperty("c_domain")
	public String getcDomain() {
		return cDomain;
	}

	@JsonProperty("c_domain")
	public void setcDomain(String cDomain) {
		this.cDomain = cDomain;
	}

	@JsonProperty("c_grant_type")
	public String getcGrantType() {
		return cGrantType;
	}

	@JsonProperty("c_grant_type")
	public void setcGrantType(String cGrantType) {
		this.cGrantType = cGrantType;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}