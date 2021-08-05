
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVpnProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVpnProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vpnProfile" type="{http://www.cisco.com/AXL/API/11.5}RVpnProfile"/&gt;
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
@XmlType(name = "GetVpnProfileRes", propOrder = {
    "_return"
})
public class GetVpnProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVpnProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVpnProfileRes.Return }
     *     
     */
    public GetVpnProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVpnProfileRes.Return }
     *     
     */
    public void setReturn(GetVpnProfileRes.Return value) {
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
     *         &lt;element name="vpnProfile" type="{http://www.cisco.com/AXL/API/11.5}RVpnProfile"/&gt;
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
        "vpnProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVpnProfile vpnProfile;

        /**
         * Gets the value of the vpnProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RVpnProfile }
         *     
         */
        public RVpnProfile getVpnProfile() {
            return vpnProfile;
        }

        /**
         * Sets the value of the vpnProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVpnProfile }
         *     
         */
        public void setVpnProfile(RVpnProfile value) {
            this.vpnProfile = value;
        }

    }

}
