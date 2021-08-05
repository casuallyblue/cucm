
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewayReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewayReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gateway" type="{http://www.cisco.com/AXL/API/11.5}XGateway"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewayReq", propOrder = {
    "gateway"
})
public class AddGatewayReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGateway gateway;

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link XGateway }
     *     
     */
    public XGateway getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGateway }
     *     
     */
    public void setGateway(XGateway value) {
        this.gateway = value;
    }

}
