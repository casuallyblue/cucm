
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIpPhoneServicesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIpPhoneServicesRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ipPhoneServices" type="{http://www.cisco.com/AXL/API/11.5}RIpPhoneServices"/&gt;
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
@XmlType(name = "GetIpPhoneServicesRes", propOrder = {
    "_return"
})
public class GetIpPhoneServicesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetIpPhoneServicesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetIpPhoneServicesRes.Return }
     *     
     */
    public GetIpPhoneServicesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIpPhoneServicesRes.Return }
     *     
     */
    public void setReturn(GetIpPhoneServicesRes.Return value) {
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
     *         &lt;element name="ipPhoneServices" type="{http://www.cisco.com/AXL/API/11.5}RIpPhoneServices"/&gt;
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
        "ipPhoneServices"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RIpPhoneServices ipPhoneServices;

        /**
         * Gets the value of the ipPhoneServices property.
         * 
         * @return
         *     possible object is
         *     {@link RIpPhoneServices }
         *     
         */
        public RIpPhoneServices getIpPhoneServices() {
            return ipPhoneServices;
        }

        /**
         * Sets the value of the ipPhoneServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link RIpPhoneServices }
         *     
         */
        public void setIpPhoneServices(RIpPhoneServices value) {
            this.ipPhoneServices = value;
        }

    }

}
