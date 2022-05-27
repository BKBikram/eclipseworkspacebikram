package com.practice8.dto;

import java.util.List;

import org.json.simple.JSONObject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServiceResponse {
	private String message;
	private String errorCode;
	private List<JSONObject> details;

}
