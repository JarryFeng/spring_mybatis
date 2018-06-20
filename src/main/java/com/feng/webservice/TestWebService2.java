package com.feng.webservice;

/**
 * Created by jarry on 2017/12/13.
 */

import javax.jws.WebService;
import javax.ws.rs.core.Response;


@WebService
public interface TestWebService2 {

    public String sayHelloResponse();

    public String sayHelloString(String name);


}
