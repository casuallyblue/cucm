
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhoneSecurityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneSecurityProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="phoneSecurityProfile" type="{http://www.cisco.com/AXL/API/11.5}RPhoneSecurityProfile"/&gt;
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
@XmlType(name = "GetPhoneSecurityProfileRes", propOrder = {
    "_return"
})
public class GetPhoneSecurityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPhoneSecurityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPhoneSecurityProfileRes.Return }
     *     
     */
    public GetPhoneSecurityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPhoneSecurityProfileRes.Return }
     *     
     */
    public void setReturn(GetPhoneSecurityProfileRes.Return value) {
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
     *         &lt;element name="phoneSecurityProfile" type="{http://www.cisco.com/AXL/API/11.5}RPhoneSecurityProfile"/&gt;
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
        "phoneSecurityProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPhoneSecurityProfile phoneSecurityProfile;

        /**
         * Gets the value of the phoneSecurityProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RPhoneSecurityProfile }
         *     
         */
        public RPhoneSecurityProfile getPhoneSecurityProfile() {
            return phoneSecurityProfile;
        }

        /**
         * Sets the value of the phoneSecurityProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPhoneSecurityProfile }
         *     
         */
        public void setPhoneSecurityProfile(RPhoneSecurityProfile value) {
            this.phoneSecurityProfile = value;
        }

    }

}
