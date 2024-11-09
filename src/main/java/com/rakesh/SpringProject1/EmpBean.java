package com.rakesh.SpringProject1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empObj")
@Scope("prototype")
public class EmpBean {
	
	private int age;
	private String empName;
	
	
	public EmpBean() {
		System.out.println("EmpBean.EmpBean()");
	}


	public int getAge() {
		return age;
	}

	@Value("25")
	public void setAge(int age) {
		this.age = age;
	}


	public String getEmpName() {
		return empName;
	}

	@Value("Rakesh")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public void printEmployee() {
		System.out.println(age+"\t"+empName);
	}
	
	
}
