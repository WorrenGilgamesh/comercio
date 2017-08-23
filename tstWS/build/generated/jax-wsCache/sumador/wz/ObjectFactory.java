
package wz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wz package. 
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

    private final static QName _OperacionSuma_QNAME = new QName("http://wssumador/", "operacionSuma");
    private final static QName _Hello_QNAME = new QName("http://wssumador/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://wssumador/", "helloResponse");
    private final static QName _OperacionSumaResponse_QNAME = new QName("http://wssumador/", "operacionSumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperacionSumaResponse }
     * 
     */
    public OperacionSumaResponse createOperacionSumaResponse() {
        return new OperacionSumaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link OperacionSuma }
     * 
     */
    public OperacionSuma createOperacionSuma() {
        return new OperacionSuma();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionSuma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssumador/", name = "operacionSuma")
    public JAXBElement<OperacionSuma> createOperacionSuma(OperacionSuma value) {
        return new JAXBElement<OperacionSuma>(_OperacionSuma_QNAME, OperacionSuma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssumador/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssumador/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionSumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssumador/", name = "operacionSumaResponse")
    public JAXBElement<OperacionSumaResponse> createOperacionSumaResponse(OperacionSumaResponse value) {
        return new JAXBElement<OperacionSumaResponse>(_OperacionSumaResponse_QNAME, OperacionSumaResponse.class, null, value);
    }

}
