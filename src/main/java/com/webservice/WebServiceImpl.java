package com.webservice;

@javax.jws.WebService
public class WebServiceImpl implements  WebService
{
    @Override
    public String sayHello(String name) {
        return "fuck";
    }
}
