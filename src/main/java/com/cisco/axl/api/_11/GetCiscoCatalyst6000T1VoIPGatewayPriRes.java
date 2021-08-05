
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCiscoCatalyst6000T1VoIPGatewayPriRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCiscoCatalyst6000T1VoIPGatewayPriRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ciscoCatalyst6000T1VoIPGatewayPri" type="{http://www.cisco.com/AXL/API/11.5}RCiscoCatalyst6000T1VoIPGatewayPri"/&gt;
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
@XmlType(name = "GetCiscoCatalyst6000T1VoIPGatewayPriRes", propOrder = {
    "_return"
})
public class GetCiscoCatalyst6000T1VoIPGatewayPriRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return }
     *     
     */
    public GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return }
     *     
     */
    public void setReturn(GetCiscoCatalyst6000T1VoIPGatewayPriRes.Return value) {
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
     *         &lt;element name="ciscoCatalyst6000T1VoIPGatewayPri" type="{http://www.cisco.com/AXL/API/11.5}RCiscoCatalyst6000T1VoIPGatewayPri"/&gt;
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
        "ciscoCatalyst6000T1VoIPGatewayPri"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCiscoCatalyst6000T1VoIPGatewayPri ciscoCatalyst6000T1VoIPGatewayPri;

        /**
         * Gets the value of the ciscoCatalyst6000T1VoIPGatewayPri property.
         * 
         * @return
         *     possible object is
         *     {@link RCiscoCatalyst6000T1VoIPGatewayPri }
         *     
         */
        public RCiscoCatalyst6000T1VoIPGatewayPri getCiscoCatalyst6000T1VoIPGatewayPri() {
            return ciscoCatalyst6000T1VoIPGatewayPri;
        }

        /**
         * Sets the value of the ciscoCatalyst6000T1VoIPGatewayPri property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCiscoCatalyst6000T1VoIPGatewayPri }
         *     
         */
        public void setCiscoCatalyst6000T1VoIPGatewayPri(RCiscoCatalyst6000T1VoIPGatewayPri value) {
            this.ciscoCatalyst6000T1VoIPGatewayPri = value;
        }

    }

}
