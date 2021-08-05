
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeFirewallRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeFirewallRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeFirewall" type="{http://www.cisco.com/AXL/API/11.5}RImeFirewall"/&gt;
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
@XmlType(name = "GetImeFirewallRes", propOrder = {
    "_return"
})
public class GetImeFirewallRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeFirewallRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeFirewallRes.Return }
     *     
     */
    public GetImeFirewallRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeFirewallRes.Return }
     *     
     */
    public void setReturn(GetImeFirewallRes.Return value) {
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
     *         &lt;element name="imeFirewall" type="{http://www.cisco.com/AXL/API/11.5}RImeFirewall"/&gt;
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
        "imeFirewall"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeFirewall imeFirewall;

        /**
         * Gets the value of the imeFirewall property.
         * 
         * @return
         *     possible object is
         *     {@link RImeFirewall }
         *     
         */
        public RImeFirewall getImeFirewall() {
            return imeFirewall;
        }

        /**
         * Sets the value of the imeFirewall property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeFirewall }
         *     
         */
        public void setImeFirewall(RImeFirewall value) {
            this.imeFirewall = value;
        }

    }

}
