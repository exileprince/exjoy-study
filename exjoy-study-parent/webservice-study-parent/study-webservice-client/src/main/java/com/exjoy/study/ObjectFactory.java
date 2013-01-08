
package com.exjoy.study;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exjoy.study package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FfffResponse_QNAME = new QName("http://www.exjoy.cn/study/webservice/jdk", "ffffResponse");
    private final static QName _HelloComplexSerivceResponse_QNAME = new QName("http://www.exjoy.cn/study/webservice/jdk", "helloComplexSerivceResponse");
    private final static QName _Ffff_QNAME = new QName("http://www.exjoy.cn/study/webservice/jdk", "ffff");
    private final static QName _HelloComplexSerivce_QNAME = new QName("http://www.exjoy.cn/study/webservice/jdk", "helloComplexSerivce");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exjoy.study
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FfffResponse }
     * 
     */
    public FfffResponse createFfffResponse() {
        return new FfffResponse();
    }

    /**
     * Create an instance of {@link HelloComplexSerivceResponse }
     * 
     */
    public HelloComplexSerivceResponse createHelloComplexSerivceResponse() {
        return new HelloComplexSerivceResponse();
    }

    /**
     * Create an instance of {@link Ffff }
     * 
     */
    public Ffff createFfff() {
        return new Ffff();
    }

    /**
     * Create an instance of {@link HelloComplexSerivce }
     * 
     */
    public HelloComplexSerivce createHelloComplexSerivce() {
        return new HelloComplexSerivce();
    }

    /**
     * Create an instance of {@link WsRequset }
     * 
     */
    public WsRequset createWsRequset() {
        return new WsRequset();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FfffResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.exjoy.cn/study/webservice/jdk", name = "ffffResponse")
    public JAXBElement<FfffResponse> createFfffResponse(FfffResponse value) {
        return new JAXBElement<FfffResponse>(_FfffResponse_QNAME, FfffResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloComplexSerivceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.exjoy.cn/study/webservice/jdk", name = "helloComplexSerivceResponse")
    public JAXBElement<HelloComplexSerivceResponse> createHelloComplexSerivceResponse(HelloComplexSerivceResponse value) {
        return new JAXBElement<HelloComplexSerivceResponse>(_HelloComplexSerivceResponse_QNAME, HelloComplexSerivceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ffff }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.exjoy.cn/study/webservice/jdk", name = "ffff")
    public JAXBElement<Ffff> createFfff(Ffff value) {
        return new JAXBElement<Ffff>(_Ffff_QNAME, Ffff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloComplexSerivce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.exjoy.cn/study/webservice/jdk", name = "helloComplexSerivce")
    public JAXBElement<HelloComplexSerivce> createHelloComplexSerivce(HelloComplexSerivce value) {
        return new JAXBElement<HelloComplexSerivce>(_HelloComplexSerivce_QNAME, HelloComplexSerivce.class, null, value);
    }

}
