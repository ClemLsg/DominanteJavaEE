
package org.datacontract.schemas._2004._07.wcfservicelibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfservicelibrary package. 
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

    private final static QName _MSG_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "MSG");
    private final static QName _MSGInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "info");
    private final static QName _MSGTokenApp_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "tokenApp");
    private final static QName _MSGTokenUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "tokenUser");
    private final static QName _MSGOperationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "operationName");
    private final static QName _MSGData_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "data");
    private final static QName _MSGOperationVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "operationVersion");
    private final static QName _MSGAppVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary", "appVersion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfservicelibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MSG }
     * 
     */
    public MSG createMSG() {
        return new MSG();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "MSG")
    public JAXBElement<MSG> createMSG(MSG value) {
        return new JAXBElement<MSG>(_MSG_QNAME, MSG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "info", scope = MSG.class)
    public JAXBElement<String> createMSGInfo(String value) {
        return new JAXBElement<String>(_MSGInfo_QNAME, String.class, MSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "tokenApp", scope = MSG.class)
    public JAXBElement<String> createMSGTokenApp(String value) {
        return new JAXBElement<String>(_MSGTokenApp_QNAME, String.class, MSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "tokenUser", scope = MSG.class)
    public JAXBElement<String> createMSGTokenUser(String value) {
        return new JAXBElement<String>(_MSGTokenUser_QNAME, String.class, MSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "operationName", scope = MSG.class)
    public JAXBElement<String> createMSGOperationName(String value) {
        return new JAXBElement<String>(_MSGOperationName_QNAME, String.class, MSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "data", scope = MSG.class)
    public JAXBElement<ArrayOfanyType> createMSGData(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_MSGData_QNAME, ArrayOfanyType.class, MSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "operationVersion", scope = MSG.class)
    public JAXBElement<String> createMSGOperationVersion(String value) {
        return new JAXBElement<String>(_MSGOperationVersion_QNAME, String.class, MSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", name = "appVersion", scope = MSG.class)
    public JAXBElement<String> createMSGAppVersion(String value) {
        return new JAXBElement<String>(_MSGAppVersion_QNAME, String.class, MSG.class, value);
    }

}
