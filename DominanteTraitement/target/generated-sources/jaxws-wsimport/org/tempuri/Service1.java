
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "Service1", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8733/Design_Time_Addresses/WcfServiceLibrary/Service1/?wsdl")
public class Service1
    extends Service
{

    private final static URL SERVICE1_WSDL_LOCATION;
    private final static WebServiceException SERVICE1_EXCEPTION;
    private final static QName SERVICE1_QNAME = new QName("http://tempuri.org/", "Service1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8733/Design_Time_Addresses/WcfServiceLibrary/Service1/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICE1_WSDL_LOCATION = url;
        SERVICE1_EXCEPTION = e;
    }

    public Service1() {
        super(__getWsdlLocation(), SERVICE1_QNAME);
    }

    public Service1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns IService1
     */
    @WebEndpoint(name = "BasicHttpBinding_IService1")
    public IService1 getBasicHttpBindingIService1() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IService1"), IService1.class);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE1_EXCEPTION!= null) {
            throw SERVICE1_EXCEPTION;
        }
        return SERVICE1_WSDL_LOCATION;
    }

}
