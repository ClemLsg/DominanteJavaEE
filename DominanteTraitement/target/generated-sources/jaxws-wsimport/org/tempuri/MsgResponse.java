
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelibrary.MSG;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLibrary}MSG" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msgResult"
})
@XmlRootElement(name = "MsgResponse")
public class MsgResponse {

    @XmlElement(name = "MsgResult")
    protected MSG msgResult;

    /**
     * Gets the value of the msgResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSG }
     *     
     */
    public MSG getMsgResult() {
        return msgResult;
    }

    /**
     * Sets the value of the msgResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSG }
     *     
     */
    public void setMsgResult(MSG value) {
        this.msgResult = value;
    }

}
