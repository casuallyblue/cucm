
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServiceProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/11.5}RServiceProfile"/&gt;
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
@XmlType(name = "GetServiceProfileRes", propOrder = {
    "_return"
})
public class GetServiceProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetServiceProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetServiceProfileRes.Return }
     *     
     */
    public GetServiceProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServiceProfileRes.Return }
     *     
     */
    public void setReturn(GetServiceProfileRes.Return value) {
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
     *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/11.5}RServiceProfile"/&gt;
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
        "serviceProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RServiceProfile serviceProfile;

        /**
         * Gets the value of the serviceProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RServiceProfile }
         *     
         */
        public RServiceProfile getServiceProfile() {
            return serviceProfile;
        }

        /**
         * Sets the value of the serviceProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RServiceProfile }
         *     
         */
        public void setServiceProfile(RServiceProfile value) {
            this.serviceProfile = value;
        }

    }

}
