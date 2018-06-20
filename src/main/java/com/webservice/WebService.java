package com.webservice;

import javax.jws.WebMethod;
@javax.jws.WebService
public interface WebService {
    @WebMethod
    public String sayHello(String name);
}
