package com.javainuse.main;

import com.javainuse.domain.Employee;
import com.javainuse.domain.Fkdata;
import com.javainuse.domain.Request;
import com.javainuse.domain.Response;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.postgresql.util.PGobject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

public class CamelMain {

    public static void main(String[] args) {

        try {
        	
        	
        	
        	/*Fkdata result = restTemplate.getForObject(uri, Fkdata.class);
        	
        	System.out.println(result);*/
        	
            ApplicationContext springCtx = new ClassPathXmlApplicationContext("database-context.xml");

            CamelContext context = springCtx.getBean("employeeContext", CamelContext.class);

            context.start();

            ProducerTemplate producerTemplate = context.createProducerTemplate();

            // Insert Employee 1
            Employee emp1 = getEmployee1();
            String resp = producerTemplate.requestBody("direct:insert", emp1, String.class);

            // Insert Employee 2
            Employee emp2 = getEmployee2();
            resp = producerTemplate.requestBody("direct:insert", emp2, String.class);
            
            //List<Employee> employees = new ArrayList<Employee>();
            
            // Get Employee of inserted employees
            List<Employee> employees = producerTemplate.requestBody("direct:select", null, List.class);
            System.out.println("employees:" + employees);
            
        	Request req1 = getRequest();       	
        	
        	/*PGobject jsonObject = new PGobject();
        	 jsonObject.setType("json");
        	 jsonObject.setValue(yourJsonString);
        	 pstmt.setObject(11, jsonObject);*/
            
            // Get Employee of inserted employees
        	String return2 = producerTemplate.requestBody("direct:pushfkdata", req1, String.class);
            System.out.println("employees:" + return2);
            
            context.stop();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Employee getEmployee1() {

        Employee emp = new Employee();

        emp.setEmpId("empId1");
        emp.setEmpName("emp1");
        return emp;

    }

    private static Employee getEmployee2() {

        Employee emp = new Employee();

        emp.setEmpId("empId2");
        emp.setEmpName("emp2");
        return emp;

    }
    
    private static Request getRequest(){
    	
    	//final String uri = "http://localhost:8080/RestApi/GetFKInboundData/";
    	
    	//RestTemplate restTemplate = new RestTemplate();
    	
    	Request req = new Request();
    	
    	String data = "{\"code\":\"SUCCESS\",\"message\":\"Consignments: 3, Bags: 1, Shipments: 1\",\"data\":{\"consignment_list\":[{\"consignment_id\":18731584,\"awb\":\"TESTAWB001\",\"total_weight\":0.3,\"date\":1471698624000,\"status\":\"Expected\"}],\"bag_list\":[{\"parent_id\":18731584,\"parent_type\":\"CONSIGNMENT\",\"bag_id\":16407407,\"category\":\"Book\",\"tracking_id\":\"F-PC_63280-00001\",\"seal_id\":null,\"status\":\"INTRANSIT\"}],\"shipment_list\":[{\"parent_id\":16407407,\"parent_type\":\"CONSIGNMENT\",\"shipment_id\":\"TESTSHIPMENT031\",\"order_id\":\"OD16186748811110\",\"status\":\"Expected\",\"shipment_type\":\"PP\",\"amount\":0,\"payment_mode\":null,\"customer\":{\"name\":\"Flipkart Chennai\",\"phone\":\"9999999\",\"email\":\"flipkart@fk.com\",\"address\":\"FKL facility, Chennai, , Chennai, Chennai\",\"city\":\"Chennai\",\"state\":\"Chennai\",\"pincode\":\"560001\"},\"shipment_price\":4893,\"categories\":[\"toy\"],\"service_type\":\"STORE_SERVICE\",\"customer_promised_date\":\"2013-07-13 12:00:00\",\"logistics_promised_date\":\"2013-07-14 12:00:00\"},{\"parent_id\":16407407,\"parent_type\":\"CONSIGNMENT\",\"shipment_id\":\"TESTSHIPMENT032\",\"order_id\":\"OD16186748811110\",\"status\":\"Expected\",\"shipment_type\":\"PP\",\"amount\":0,\"payment_mode\":null,\"customer\":{\"name\":\"Flipkart Chennai\",\"phone\":\"9999999\",\"email\":\"flipkart@fk.com\",\"address\":\"FKL facility, Chennai, , Chennai, Chennai\",\"city\":\"Chennai\",\"state\":\"Chennai\",\"pincode\":\"560001\"},\"shipment_price\":4893,\"categories\":[\"toy\"],\"service_type\":\"STORE_SERVICE\",\"customer_promised_date\":\"2013-07-13 12:00:00\",\"logistics_promised_date\":\"2013-07-14 12:00:00\"},{\"parent_id\":16407407,\"parent_type\":\"CONSIGNMENT\",\"shipment_id\":\"TESTSHIPMENT033\",\"order_id\":\"OD16186748811110\",\"status\":\"Expected\",\"shipment_type\":\"PP\",\"amount\":0,\"payment_mode\":null,\"customer\":{\"name\":\"Flipkart Chennai\",\"phone\":\"9999999\",\"email\":\"flipkart@fk.com\",\"address\":\"FKL facility, Chennai, , Chennai, Chennai\",\"city\":\"Chennai\",\"state\":\"Chennai\",\"pincode\":\"560001\"},\"shipment_price\":4893,\"categories\":[\"toy\"],\"service_type\":\"STORE_SERVICE\",\"customer_promised_date\":\"2013-07-13 12:00:00\",\"logistics_promised_date\":\"2013-07-14 12:00:00\"}]}}";
    	
    	req.setInData(data);
    	
    	return req;
    }
}
