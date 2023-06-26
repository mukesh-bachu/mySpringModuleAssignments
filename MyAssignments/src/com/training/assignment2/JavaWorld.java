package com.training.assignment2;

public class JavaWorld implements JavaLanguage {
	//creating a field for dependency injection
	private PythonLanguage newPythonWorld;
	

	public JavaWorld(PythonWorld newPythonWorld) {
		super();
		this.newPythonWorld = newPythonWorld;
	
	}
	public String learningJava() {
		return "I am learning java";
	}
	public String learningPython() {
		return newPythonWorld.learningPython();
	}
}
