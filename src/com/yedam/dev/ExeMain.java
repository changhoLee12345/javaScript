package com.yedam.dev;

import com.yedam.study.Sample;

import net.sf.json.JSONObject;

public class ExeMain {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("s1", "Hello");
		int result = Sample.sum(5, 5);
	}
}
