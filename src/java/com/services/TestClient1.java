/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import javax.ws.rs.core.MediaType;

//This Client will Create an Employee Record of eid 10

public class TestClient1 {
    
    public static void main(String[] args) {
            ClientConfig clientConfig=new DefaultClientConfig();
    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
    
    Client client=Client.create(clientConfig);
    client.addFilter(new HTTPBasicAuthFilter("mahmoud","@123"));
    WebResource webresource=client.resource("http://localhost:8084/JerseyEmployeeService/webresources/employeeService/createEmployee");
    Employee emp=new Employee();
    emp.setEid(10);
    emp.setName("Yasser");
    emp.setSalary(15000);
    ClientResponse res=webresource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, emp);
    
    int statusCode=res.getStatus();
    String resp=res.getEntity(String.class);
    
    System.out.println("STATUS CODE "+statusCode);
    System.out.println("Output Message : "+resp);
        
    
        
    }
    

}
