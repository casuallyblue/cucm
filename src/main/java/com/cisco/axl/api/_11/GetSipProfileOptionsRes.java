
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipProfileOptionsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipProfileOptionsRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sipProfile" type="{http://www.cisco.com/AXL/API/11.5}ORSipProfile"/&gt;
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
@XmlType(name = "GetSipProfileOptionsRes", propOrder = {
    "_return"
})
public class GetSipProfileOptionsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipProfileOptionsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipProfileOptionsRes.Return }
     *     
     */
    public GetSipProfileOptionsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipProfileOptionsRes.Return }
     *     
     */
    public void setReturn(GetSipProfileOptionsRes.Return value) {
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
     *         &lt;element name="sipProfile" type="{http://www.cisco.com/AXL/API/11.5}ORSipProfile"/&gt;
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
        "sipProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected ORSipProfile sipProfile;

        /**
         * Gets the value of the sipProfile property.
         * 
         * @return
         *     possible object is
         *     {@link ORSipProfile }
         *     
         */
        public ORSipProfile getSipProfile() {
            return sipProfile;
        }

        /**
         * Sets the value of the sipProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORSipProfile }
         *     
         */
        public void setSipProfile(ORSipProfile value) {
            this.sipProfile = value;
        }

    }

}
