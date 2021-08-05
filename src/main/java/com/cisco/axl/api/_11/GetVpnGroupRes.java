
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVpnGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVpnGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vpnGroup" type="{http://www.cisco.com/AXL/API/11.5}RVpnGroup"/&gt;
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
@XmlType(name = "GetVpnGroupRes", propOrder = {
    "_return"
})
public class GetVpnGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVpnGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVpnGroupRes.Return }
     *     
     */
    public GetVpnGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVpnGroupRes.Return }
     *     
     */
    public void setReturn(GetVpnGroupRes.Return value) {
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
     *         &lt;element name="vpnGroup" type="{http://www.cisco.com/AXL/API/11.5}RVpnGroup"/&gt;
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
        "vpnGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVpnGroup vpnGroup;

        /**
         * Gets the value of the vpnGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RVpnGroup }
         *     
         */
        public RVpnGroup getVpnGroup() {
            return vpnGroup;
        }

        /**
         * Sets the value of the vpnGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVpnGroup }
         *     
         */
        public void setVpnGroup(RVpnGroup value) {
            this.vpnGroup = value;
        }

    }

}
