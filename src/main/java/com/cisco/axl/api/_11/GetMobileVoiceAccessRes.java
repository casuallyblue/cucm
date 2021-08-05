
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMobileVoiceAccessRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileVoiceAccessRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mobileVoiceAccess" type="{http://www.cisco.com/AXL/API/11.5}RMobileVoiceAccess"/&gt;
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
@XmlType(name = "GetMobileVoiceAccessRes", propOrder = {
    "_return"
})
public class GetMobileVoiceAccessRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMobileVoiceAccessRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMobileVoiceAccessRes.Return }
     *     
     */
    public GetMobileVoiceAccessRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMobileVoiceAccessRes.Return }
     *     
     */
    public void setReturn(GetMobileVoiceAccessRes.Return value) {
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
     *         &lt;element name="mobileVoiceAccess" type="{http://www.cisco.com/AXL/API/11.5}RMobileVoiceAccess"/&gt;
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
        "mobileVoiceAccess"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMobileVoiceAccess mobileVoiceAccess;

        /**
         * Gets the value of the mobileVoiceAccess property.
         * 
         * @return
         *     possible object is
         *     {@link RMobileVoiceAccess }
         *     
         */
        public RMobileVoiceAccess getMobileVoiceAccess() {
            return mobileVoiceAccess;
        }

        /**
         * Sets the value of the mobileVoiceAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMobileVoiceAccess }
         *     
         */
        public void setMobileVoiceAccess(RMobileVoiceAccess value) {
            this.mobileVoiceAccess = value;
        }

    }

}
