
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewayEndpointDigitalAccessT1Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewayEndpointDigitalAccessT1Req"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/11.5}UGatewayEndpointDigitalT1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewayEndpointDigitalAccessT1Req", propOrder = {
    "endpoint"
})
public class UpdateGatewayEndpointDigitalAccessT1Req
    extends NameAndGUIDRequest
{

    protected UGatewayEndpointDigitalT1 endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link UGatewayEndpointDigitalT1 }
     *     
     */
    public UGatewayEndpointDigitalT1 getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link UGatewayEndpointDigitalT1 }
     *     
     */
    public void setEndpoint(UGatewayEndpointDigitalT1 value) {
        this.endpoint = value;
    }

}
