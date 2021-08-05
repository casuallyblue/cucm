
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGatewayEndpointAnalogAccessRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGatewayEndpointAnalogAccessRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gatewayEndpointAnalogAccess" type="{http://www.cisco.com/AXL/API/11.5}RGatewayEndpointAnalogAccess"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGatewayEndpointAnalogAccessRes", propOrder = {
    "_return"
})
public class GetGatewayEndpointAnalogAccessRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGatewayEndpointAnalogAccessRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGatewayEndpointAnalogAccessRes.Return }
     *     
     */
    public GetGatewayEndpointAnalogAccessRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGatewayEndpointAnalogAccessRes.Return }
     *     
     */
    public void setReturn(GetGatewayEndpointAnalogAccessRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="gatewayEndpointAnalogAccess" type="{http://www.cisco.com/AXL/API/11.5}RGatewayEndpointAnalogAccess"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gatewayEndpointAnalogAccess"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGatewayEndpointAnalogAccess gatewayEndpointAnalogAccess;

        /**
         * Gets the value of the gatewayEndpointAnalogAccess property.
         * 
         * @return
         *     possible object is
         *     {@link RGatewayEndpointAnalogAccess }
         *     
         */
        public RGatewayEndpointAnalogAccess getGatewayEndpointAnalogAccess() {
            return gatewayEndpointAnalogAccess;
        }

        /**
         * Sets the value of the gatewayEndpointAnalogAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGatewayEndpointAnalogAccess }
         *     
         */
        public void setGatewayEndpointAnalogAccess(RGatewayEndpointAnalogAccess value) {
            this.gatewayEndpointAnalogAccess = value;
        }

    }

}
