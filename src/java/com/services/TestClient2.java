/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import javax.ws.rs.core.MediaType;


//This Client will retrieve an Employee Record of eid 10

public class TestClient2 {
    public static void main(String[] args) {
        
        ClientConfig clientConfig=new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        
        
        Client client=Client.create(clientConfig);
        client.addFilter(new HTTPBasicAuthFilter("mahmoud","@123"));
        WebResource webResource=client.resource("http://localhost:8084/JerseyEmployeeService/webresources/employeeService/getEmployeeById?eid=10");
        Employee res=webResource.accept(MediaType.APPLICATION_JSON).get(Employee.class);       
        
        System.out.println(res.getEid());       
        System.out.println(res.getName());       
        System.out.println(res.getSalary());       
        
}}
