package com.feng.webservice.impl;



import com.feng.webservice.TestWebService2;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by jarry on 2017/12/14.
 */
@Service("testWebService2")
@WebService(name = "testWebService2Bean", endpointInterface = "com.feng.webservice.TestWebService2" , targetNamespace = "sssxxx")
public class TestWebService2Impl implements TestWebService2 {
    public String sayHelloResponse() {
        return "hehe";
    }

    public String sayHelloString(String name) {
        return name;
    }
}
