package com.webservice;

import javax.xml.ws.Endpoint;

public class WebServicePublish {
    public static void main(String[] args) {
        String address = "http://localhost:8080/dashixiong/fuck/shit";
        Endpoint.publish(address,new WebServiceImpl());
    }
}
