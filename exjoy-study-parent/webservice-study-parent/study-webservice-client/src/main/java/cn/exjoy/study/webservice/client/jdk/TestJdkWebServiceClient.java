package cn.exjoy.study.webservice.client.jdk;

import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class TestJdkWebServiceClient {

	// 名称空间
	private static String targetNamespace = "http://www.exjoy.cn/study/webservice/jdk";

	// 服务名
	private static String servName = "TestWebServiceJdkService";

	private static String pName = "TestWebServiceJdkPort";

	// 服务地址
	private static String endPointAddr = "http://localhost:10001/hello";
	
	private static String opName = "ffff";

	private static String inputName= "ffff";
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QName serviceName = new QName(targetNamespace, servName);

		QName portName = new QName(targetNamespace, pName);

		Service service = Service.create(serviceName);

		service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, endPointAddr);

		Dispatch<SOAPMessage> dispatch = service.createDispatch(portName,
				SOAPMessage.class, Service.Mode.MESSAGE);
		
		BindingProvider provider = (BindingProvider)dispatch;
		
		Map<String, Object> rc = provider.getRequestContext();
		
		rc.put(BindingProvider.SOAPACTION_USE_PROPERTY, Boolean.TRUE);
		rc.put(BindingProvider.SOAPACTION_URI_PROPERTY, opName);
		
		MessageFactory factory = ((SOAPBinding)provider.getBinding()).getMessageFactory();
		
		SOAPMessage request = factory.createMessage();
		SOAPBody body = request.getSOAPBody();
		QName payloadName = new QName(targetNamespace, opName, "ns1");
		SOAPBodyElement payload = body.addBodyElement(payloadName);
		
		SOAPElement message = payload.addChildElement(inputName);
		
		SOAPElement dd = message.addChildElement("kkk");
		
		dd.addTextNode("dddd");
		
		SOAPMessage reply = null;
		
		try {
			reply = dispatch.invoke(request);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(reply);

	}
}
