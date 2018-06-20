package com.feng.webservice;

/**
 * Created by jarry on 2017/12/13.
 */


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


//Produces & Consumes既可以加在Class上，也可以加在Method上，Method上的优先
@Path("/hello")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface TestWebService {
    //Response是CXF默认的返回对象，实际数据可以封装在里面，如果使用WebClient等客户端测试类时，推荐返回Response
    @GET
    @Path(value = "/say")
    public Response sayHelloResponse();

    @GET
    @Path(value = "/string/{name}")
    public Response sayHelloString(@PathParam("name") String name);


}
