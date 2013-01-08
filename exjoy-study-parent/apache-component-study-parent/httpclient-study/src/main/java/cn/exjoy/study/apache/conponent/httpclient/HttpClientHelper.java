package cn.exjoy.study.apache.conponent.httpclient;
import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.protocol.Protocol;

@SuppressWarnings({ "unused" })
public class HttpClientHelper {

    public static void main(String[] args) throws HttpException, IOException {
        String url = "https://unionpaysecure.com/api/Query.action";
        //        String url = "http://ebank.sdo.com/bankorder.aspx";

        Protocol https = new Protocol("https", new HTTPSSecureProtocolSocketFactory(), 443);
        Protocol.registerProtocol("https", https);
        for (int i = 0; i < 10; i++) {

            //        GetMethod get = new GetMethod(url);

            PostMethod post = new PostMethod(url);
            HttpClient client = new HttpClient();
            client.executeMethod(post);
                        System.out.println(post.getResponseBodyAsString());
//            System.out.println(i + "   ok!");

        }

        Protocol.unregisterProtocol("https");

    }
}
