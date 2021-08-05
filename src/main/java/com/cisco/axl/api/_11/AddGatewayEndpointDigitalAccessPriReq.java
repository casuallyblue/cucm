
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewayEndpointDigitalAccessPriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewayEndpointDigitalAccessPriReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gatewayEndpointDigitalAccessPri" type="{http://www.cisco.com/AXL/API/11.5}XGatewayEndpointDigitalAccessPri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewayEndpointDigitalAccessPriReq", propOrder = {
    "gatewayEndpointDigitalAccessPri"
})
public class AddGatewayEndpointDigitalAccessPriReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGatewayEndpointDigitalAccessPri gatewayEndpointDigitalAccessPri;

    /**
     * Gets the value of the gatewayEndpointDigitalAccessPri property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalAccessPri }
     *     
     */
    public XGatewayEndpointDigitalAccessPri getGatewayEndpointDigitalAccessPri() {
        return gatewayEndpointDigitalAccessPri;
    }

    /**
     * Sets the value of the gatewayEndpointDigitalAccessPri property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalAccessPri }
     *     
     */
    public void setGatewayEndpointDigitalAccessPri(XGatewayEndpointDigitalAccessPri value) {
        this.gatewayEndpointDigitalAccessPri = value;
    }

}
