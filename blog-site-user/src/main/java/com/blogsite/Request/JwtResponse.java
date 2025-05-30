package com.blogsite.Request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;
	//private List<String> roles;

	public JwtResponse(String accessToken, Long id, String username, String emails) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		//this.roles = roles;
	}

}
