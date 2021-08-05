
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewayEndpointDigitalAccessBriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewayEndpointDigitalAccessBriReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/11.5}XGatewayEndpointDigitalBri" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewayEndpointDigitalAccessBriReq", propOrder = {
    "endpoint"
})
public class UpdateGatewayEndpointDigitalAccessBriReq
    extends NameAndGUIDRequest
{

    protected XGatewayEndpointDigitalBri endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalBri }
     *     
     */
    public XGatewayEndpointDigitalBri getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalBri }
     *     
     */
    public void setEndpoint(XGatewayEndpointDigitalBri value) {
        this.endpoint = value;
    }

}
