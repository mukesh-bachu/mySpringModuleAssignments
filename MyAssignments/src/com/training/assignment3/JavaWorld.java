package com.training.assignment3;

import org.springframework.stereotype.Component;

@Component
public class JavaWorld implements JavaLanguage {
	
	public String learningJava() {
		return "I am learning java";
	}
	
}
