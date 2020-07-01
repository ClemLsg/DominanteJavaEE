
package org.datacontract.schemas._2004._07.wcfservicelibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * <p>Java class for MSG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statutOp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tokenApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSG", propOrder = {
    "appVersion",
    "data",
    "info",
    "operationName",
    "operationVersion",
    "statutOp",
    "tokenApp",
    "tokenUser"
})
public class MSG {

    @XmlElementRef(name = "appVersion", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appVersion;
    @XmlElementRef(name = "data", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfanyType> data;
    @XmlElementRef(name = "info", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info;
    @XmlElementRef(name = "operationName", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationName;
    @XmlElementRef(name = "operationVersion", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationVersion;
    protected Boolean statutOp;
    @XmlElementRef(name = "tokenApp", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenApp;
    @XmlElementRef(name = "tokenUser", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenUser;

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppVersion(JAXBElement<String> value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setData(JAXBElement<ArrayOfanyType> value) {
        this.data = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo(JAXBElement<String> value) {
        this.info = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationName(JAXBElement<String> value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the operationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationVersion() {
        return operationVersion;
    }

    /**
     * Sets the value of the operationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationVersion(JAXBElement<String> value) {
        this.operationVersion = value;
    }

    /**
     * Gets the value of the statutOp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatutOp() {
        return statutOp;
    }

    /**
     * Sets the value of the statutOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatutOp(Boolean value) {
        this.statutOp = value;
    }

    /**
     * Gets the value of the tokenApp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenApp() {
        return tokenApp;
    }

    /**
     * Sets the value of the tokenApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenApp(JAXBElement<String> value) {
        this.tokenApp = value;
    }

    /**
     * Gets the value of the tokenUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenUser() {
        return tokenUser;
    }

    /**
     * Sets the value of the tokenUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenUser(JAXBElement<String> value) {
        this.tokenUser = value;
    }

}
