package org.study.webservice.jdk.host;

import javax.xml.ws.Endpoint;

import org.study.webservice.jdk.TestWebServiceJdk;


public class JdkWebserviceHost {

    /**
     * @param args
     */
    public static void main(String[] args) {

        TestWebServiceJdk hello = new TestWebServiceJdk();
        
        Endpoint point = Endpoint.publish("http://localhost:10001/hello", hello);
        
        point.stop();
        
    }

}
