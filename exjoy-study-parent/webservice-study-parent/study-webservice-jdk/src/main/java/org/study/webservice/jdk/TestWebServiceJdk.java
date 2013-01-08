package org.study.webservice.jdk;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.exjoy.cn/study/webservice/jdk")
public class TestWebServiceJdk {

	@WebMethod(operationName = "ffff", action = "ddd")
	@WebResult(name = "x")
	public String helloSerivce(@WebParam(name = "kkk") String name) {
		return "Hello, " + name;
	}

	public WSResponse helloComplexSerivce(WSRequset request, String test) {
		return null;
	}
}
