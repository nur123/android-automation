package xray;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest{

	@JsonProperty("client_secret")
	private String clientSecret;

	@JsonProperty("client_id")
	private String clientId;

	public LoginRequest() {
	}

	public LoginRequest(String clientSecret, String clientId) {
		this.clientSecret = clientSecret;
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
}