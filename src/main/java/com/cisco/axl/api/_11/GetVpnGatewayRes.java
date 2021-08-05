
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVpnGatewayRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVpnGatewayRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vpnGateway" type="{http://www.cisco.com/AXL/API/11.5}RVpnGateway"/&gt;
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
@XmlType(name = "GetVpnGatewayRes", propOrder = {
    "_return"
})
public class GetVpnGatewayRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVpnGatewayRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVpnGatewayRes.Return }
     *     
     */
    public GetVpnGatewayRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVpnGatewayRes.Return }
     *     
     */
    public void setReturn(GetVpnGatewayRes.Return value) {
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
     *         &lt;element name="vpnGateway" type="{http://www.cisco.com/AXL/API/11.5}RVpnGateway"/&gt;
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
        "vpnGateway"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVpnGateway vpnGateway;

        /**
         * Gets the value of the vpnGateway property.
         * 
         * @return
         *     possible object is
         *     {@link RVpnGateway }
         *     
         */
        public RVpnGateway getVpnGateway() {
            return vpnGateway;
        }

        /**
         * Sets the value of the vpnGateway property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVpnGateway }
         *     
         */
        public void setVpnGateway(RVpnGateway value) {
            this.vpnGateway = value;
        }

    }

}
