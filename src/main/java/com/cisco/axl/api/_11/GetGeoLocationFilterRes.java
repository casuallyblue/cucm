
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGeoLocationFilterRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGeoLocationFilterRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geoLocationFilter" type="{http://www.cisco.com/AXL/API/11.5}RGeoLocationFilter"/&gt;
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
@XmlType(name = "GetGeoLocationFilterRes", propOrder = {
    "_return"
})
public class GetGeoLocationFilterRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetGeoLocationFilterRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetGeoLocationFilterRes.Return }
     *     
     */
    public GetGeoLocationFilterRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGeoLocationFilterRes.Return }
     *     
     */
    public void setReturn(GetGeoLocationFilterRes.Return value) {
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
     *         &lt;element name="geoLocationFilter" type="{http://www.cisco.com/AXL/API/11.5}RGeoLocationFilter"/&gt;
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
        "geoLocationFilter"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RGeoLocationFilter geoLocationFilter;

        /**
         * Gets the value of the geoLocationFilter property.
         * 
         * @return
         *     possible object is
         *     {@link RGeoLocationFilter }
         *     
         */
        public RGeoLocationFilter getGeoLocationFilter() {
            return geoLocationFilter;
        }

        /**
         * Sets the value of the geoLocationFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link RGeoLocationFilter }
         *     
         */
        public void setGeoLocationFilter(RGeoLocationFilter value) {
            this.geoLocationFilter = value;
        }

    }

}
