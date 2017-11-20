package com.tsm.ltf.model.LTFCommonStructure;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelRuner {
	
	public static void main(String[] args) throws Exception {
		
		        ApplicationContext appContext = new ClassPathXmlApplicationContext("OSGI-INF/blueprint/newContext.xml");
		
		        CamelContext camelContext = SpringCamelContext.springCamelContext(appContext, false);
		        camelContext.start();
		        
		        System.out.println("HELLO" +camelContext);
		
		
		    }


}
