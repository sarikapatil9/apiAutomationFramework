package com.api.base;

import java.util.HashMap;

import com.api.modelRequest.LoginRequest;
import com.api.modelRequest.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	
	private static final String BASE_PATH = "/api/auth/";
	
	public Response login(LoginRequest payLoad) {
		System.out.println(payLoad);
		return postRequest(payLoad,BASE_PATH+"login");
	}
	
	public Response signUP(SignUpRequest payLoad) {
		System.out.println(payLoad);
		return postRequest(payLoad,BASE_PATH+"signup");
	}
	
	public Response forgotPassword(String emailAddress) {
		HashMap<String,String> payload =  new HashMap();
		payload.put("email",emailAddress);
		return postRequest(payload,BASE_PATH+"forgot-password");
	}
}
