
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGeoLocationPolicyRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGeoLocationPolicyRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geoLocationPolicy" type="{http://www.cisco.com/AXL/API/11.5}RGeoLocationPolicy"/&gt;
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
@XmlType(name = "GetGeoLocationPolicyRes", propOrder = {
    "_return"
})
public class GetGeoLocationPolicyRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGeoLocationPolicyRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGeoLocationPolicyRes.Return }
     *     
     */
    public GetGeoLocationPolicyRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGeoLocationPolicyRes.Return }
     *     
     */
    public void setReturn(GetGeoLocationPolicyRes.Return value) {
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
     *         &lt;element name="geoLocationPolicy" type="{http://www.cisco.com/AXL/API/11.5}RGeoLocationPolicy"/&gt;
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
        "geoLocationPolicy"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGeoLocationPolicy geoLocationPolicy;

        /**
         * Gets the value of the geoLocationPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link RGeoLocationPolicy }
         *     
         */
        public RGeoLocationPolicy getGeoLocationPolicy() {
            return geoLocationPolicy;
        }

        /**
         * Sets the value of the geoLocationPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGeoLocationPolicy }
         *     
         */
        public void setGeoLocationPolicy(RGeoLocationPolicy value) {
            this.geoLocationPolicy = value;
        }

    }

}
