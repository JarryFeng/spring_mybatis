package com.feng.test;

import com.feng.webservice.TestWebService;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by jarry on 2017/12/14.
 */
public class RestServiceTest {
    public static void main(String[] args) {
        TestWebService staticClient = JAXRSClientFactory.create("http://localhost:8080/feng/cxf/cxf", TestWebService.class);
        Response resp1 = staticClient.sayHelloResponse();
        System.out.println(resp1.getMetadata());
        System.out.println(resp1.readEntity(String.class));


        WebClient webClient = WebClient.create("http://localhost:8080/feng/cxf/cxf").path("/hello/string").path("/Kevin");
        Response resp3 = webClient.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get();
        System.out.println(resp3.getMetadata());
        System.out.println(resp3.readEntity(String.class));

        WebTarget webTarget = ClientBuilder.newClient().target("http://localhost:8080/feng/cxf/cxf").path("/hello/string").path("/Tony");
        Response resp2 = webTarget.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get();
        System.out.println(resp2.getMetadata());
        System.out.println(resp2.readEntity(String.class));
    }
}
