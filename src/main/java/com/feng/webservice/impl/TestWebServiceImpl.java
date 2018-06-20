package com.feng.webservice.impl;



import com.feng.webservice.TestWebService;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;


/**
 * Created by jarry on 2017/12/12.
 */
@Service("testWebService")
public class TestWebServiceImpl implements TestWebService {

    public Response sayHelloResponse() {
        Response.ResponseBuilder rb = Response.status(Response.Status.OK);
        return rb.entity("Hello").build();
    }

    public Response sayHelloString(String name) {
        Response.ResponseBuilder rb = Response.status(Response.Status.OK);
        return rb.entity(name).build();
    }
}
