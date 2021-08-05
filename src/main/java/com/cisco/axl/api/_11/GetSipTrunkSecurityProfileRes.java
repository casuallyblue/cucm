
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipTrunkSecurityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipTrunkSecurityProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sipTrunkSecurityProfile" type="{http://www.cisco.com/AXL/API/11.5}RSipTrunkSecurityProfile"/&gt;
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
@XmlType(name = "GetSipTrunkSecurityProfileRes", propOrder = {
    "_return"
})
public class GetSipTrunkSecurityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipTrunkSecurityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipTrunkSecurityProfileRes.Return }
     *     
     */
    public GetSipTrunkSecurityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipTrunkSecurityProfileRes.Return }
     *     
     */
    public void setReturn(GetSipTrunkSecurityProfileRes.Return value) {
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
     *         &lt;element name="sipTrunkSecurityProfile" type="{http://www.cisco.com/AXL/API/11.5}RSipTrunkSecurityProfile"/&gt;
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
        "sipTrunkSecurityProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipTrunkSecurityProfile sipTrunkSecurityProfile;

        /**
         * Gets the value of the sipTrunkSecurityProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RSipTrunkSecurityProfile }
         *     
         */
        public RSipTrunkSecurityProfile getSipTrunkSecurityProfile() {
            return sipTrunkSecurityProfile;
        }

        /**
         * Sets the value of the sipTrunkSecurityProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipTrunkSecurityProfile }
         *     
         */
        public void setSipTrunkSecurityProfile(RSipTrunkSecurityProfile value) {
            this.sipTrunkSecurityProfile = value;
        }

    }

}
