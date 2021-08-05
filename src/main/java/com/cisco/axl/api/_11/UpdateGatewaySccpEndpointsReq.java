
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewaySccpEndpointsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewaySccpEndpointsReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/11.5}XGatewaySccp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewaySccpEndpointsReq", propOrder = {
    "endpoint"
})
public class UpdateGatewaySccpEndpointsReq
    extends NameAndGUIDRequest
{

    protected XGatewaySccp endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewaySccp }
     *     
     */
    public XGatewaySccp getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewaySccp }
     *     
     */
    public void setEndpoint(XGatewaySccp value) {
        this.endpoint = value;
    }

}
