
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGatewaySccpEndpointsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGatewaySccpEndpointsReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gatewaySccpEndpoints" type="{http://www.cisco.com/AXL/API/11.5}XGatewaySccpEndpoints"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGatewaySccpEndpointsReq", propOrder = {
    "gatewaySccpEndpoints"
})
public class AddGatewaySccpEndpointsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGatewaySccpEndpoints gatewaySccpEndpoints;

    /**
     * Gets the value of the gatewaySccpEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewaySccpEndpoints }
     *     
     */
    public XGatewaySccpEndpoints getGatewaySccpEndpoints() {
        return gatewaySccpEndpoints;
    }

    /**
     * Sets the value of the gatewaySccpEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewaySccpEndpoints }
     *     
     */
    public void setGatewaySccpEndpoints(XGatewaySccpEndpoints value) {
        this.gatewaySccpEndpoints = value;
    }

}
