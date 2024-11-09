package com.rakesh.SpringProject1;

import org.springframework.stereotype.Component;

@Component("CustObj")
public class CustBean {

	public CustBean() {
		System.out.println("CustBean.CustBean()");
	}
	
}
