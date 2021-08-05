
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddConferenceBridgeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddConferenceBridgeReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceBridge" type="{http://www.cisco.com/AXL/API/11.5}XConferenceBridge"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddConferenceBridgeReq", propOrder = {
    "conferenceBridge"
})
public class AddConferenceBridgeReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XConferenceBridge conferenceBridge;

    /**
     * Gets the value of the conferenceBridge property.
     * 
     * @return
     *     possible object is
     *     {@link XConferenceBridge }
     *     
     */
    public XConferenceBridge getConferenceBridge() {
        return conferenceBridge;
    }

    /**
     * Sets the value of the conferenceBridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link XConferenceBridge }
     *     
     */
    public void setConferenceBridge(XConferenceBridge value) {
        this.conferenceBridge = value;
    }

}
