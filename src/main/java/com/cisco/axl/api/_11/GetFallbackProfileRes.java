
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFallbackProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFallbackProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fallbackProfile" type="{http://www.cisco.com/AXL/API/11.5}RFallbackProfile"/&gt;
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
@XmlType(name = "GetFallbackProfileRes", propOrder = {
    "_return"
})
public class GetFallbackProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetFallbackProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetFallbackProfileRes.Return }
     *     
     */
    public GetFallbackProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFallbackProfileRes.Return }
     *     
     */
    public void setReturn(GetFallbackProfileRes.Return value) {
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
     *         &lt;element name="fallbackProfile" type="{http://www.cisco.com/AXL/API/11.5}RFallbackProfile"/&gt;
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
        "fallbackProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RFallbackProfile fallbackProfile;

        /**
         * Gets the value of the fallbackProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RFallbackProfile }
         *     
         */
        public RFallbackProfile getFallbackProfile() {
            return fallbackProfile;
        }

        /**
         * Sets the value of the fallbackProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RFallbackProfile }
         *     
         */
        public void setFallbackProfile(RFallbackProfile value) {
            this.fallbackProfile = value;
        }

    }

}
