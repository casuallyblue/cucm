
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewayEndpointAnalogAccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewayEndpointAnalogAccessReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/11.5}XGatewayEndpointAnalog" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewayEndpointAnalogAccessReq", propOrder = {
    "endpoint"
})
public class UpdateGatewayEndpointAnalogAccessReq
    extends NameAndGUIDRequest
{

    protected XGatewayEndpointAnalog endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointAnalog }
     *     
     */
    public XGatewayEndpointAnalog getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointAnalog }
     *     
     */
    public void setEndpoint(XGatewayEndpointAnalog value) {
        this.endpoint = value;
    }

}
