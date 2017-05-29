package com.javainuse.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.web.client.RestTemplate;

import com.javainuse.domain.Fkdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeRouter extends RouteBuilder {

	private final Logger slf4jLogger = LoggerFactory.getLogger(EmployeeRouter.class);
	
    @Override
    public void configure() throws Exception {
    	
    	//DOMConfigurator.configure("logback.xml");
    	

        /*from("direct:insert").log("Inserted new Book").beanRef("employeeMapper", "getMap")
            .to("sqlComponent:{{sql.insertEmployee}}");
        
        from("direct:select").to("sqlComponent:{{sql.getAllEmployees}}")
            .beanRef("employeeMapper", "readEmployees").log("${body}");*/
    }

}