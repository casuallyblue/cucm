
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddBillingServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBillingServerReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingServer" type="{http://www.cisco.com/AXL/API/11.5}XBillingServer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBillingServerReq", propOrder = {
    "billingServer"
})
public class AddBillingServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XBillingServer billingServer;

    /**
     * Gets the value of the billingServer property.
     * 
     * @return
     *     possible object is
     *     {@link XBillingServer }
     *     
     */
    public XBillingServer getBillingServer() {
        return billingServer;
    }

    /**
     * Sets the value of the billingServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XBillingServer }
     *     
     */
    public void setBillingServer(XBillingServer value) {
        this.billingServer = value;
    }

}
