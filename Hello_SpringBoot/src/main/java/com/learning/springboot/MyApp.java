package com.learning.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
	
//	@Value("${App.appName}")
//	private String appName;

	private String word1;
	private String word2;
	
	
//	public String getAppName() {
//		return appName;
//	}
//
//	public void setAppName(String appName) {
//		this.appName = appName;
//	}

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}
	
	
	
	
}
