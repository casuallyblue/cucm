
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGeoLocationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGeoLocationRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geoLocation" type="{http://www.cisco.com/AXL/API/11.5}RGeoLocation"/&gt;
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
@XmlType(name = "GetGeoLocationRes", propOrder = {
    "_return"
})
public class GetGeoLocationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGeoLocationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGeoLocationRes.Return }
     *     
     */
    public GetGeoLocationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGeoLocationRes.Return }
     *     
     */
    public void setReturn(GetGeoLocationRes.Return value) {
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
     *         &lt;element name="geoLocation" type="{http://www.cisco.com/AXL/API/11.5}RGeoLocation"/&gt;
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
        "geoLocation"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGeoLocation geoLocation;

        /**
         * Gets the value of the geoLocation property.
         * 
         * @return
         *     possible object is
         *     {@link RGeoLocation }
         *     
         */
        public RGeoLocation getGeoLocation() {
            return geoLocation;
        }

        /**
         * Sets the value of the geoLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGeoLocation }
         *     
         */
        public void setGeoLocation(RGeoLocation value) {
            this.geoLocation = value;
        }

    }

}
