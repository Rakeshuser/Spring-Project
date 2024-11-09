package com.rakesh.SpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rakesh.SpringProject1")
public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
    	
    	EmpBean empB1 = (EmpBean) applicationContext.getBean("empObj");
    	EmpBean empB2 = (EmpBean) applicationContext.getBean("empObj");
    	EmpBean empB3 = (EmpBean) applicationContext.getBean("empObj");
    	CustBean custB = (CustBean) applicationContext.getBean("CustObj");

    	empB1.printEmployee();
    	
    	System.out.println(empB1);
    	System.out.println(empB2);
    	System.out.println(empB3);
    }
}
