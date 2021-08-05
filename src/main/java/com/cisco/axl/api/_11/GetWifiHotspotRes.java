
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWifiHotspotRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWifiHotspotRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="wifiHotspot" type="{http://www.cisco.com/AXL/API/11.5}RWifiHotspot"/&gt;
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
@XmlType(name = "GetWifiHotspotRes", propOrder = {
    "_return"
})
public class GetWifiHotspotRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetWifiHotspotRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetWifiHotspotRes.Return }
     *     
     */
    public GetWifiHotspotRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWifiHotspotRes.Return }
     *     
     */
    public void setReturn(GetWifiHotspotRes.Return value) {
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
     *         &lt;element name="wifiHotspot" type="{http://www.cisco.com/AXL/API/11.5}RWifiHotspot"/&gt;
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
        "wifiHotspot"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RWifiHotspot wifiHotspot;

        /**
         * Gets the value of the wifiHotspot property.
         * 
         * @return
         *     possible object is
         *     {@link RWifiHotspot }
         *     
         */
        public RWifiHotspot getWifiHotspot() {
            return wifiHotspot;
        }

        /**
         * Sets the value of the wifiHotspot property.
         * 
         * @param value
         *     allowed object is
         *     {@link RWifiHotspot }
         *     
         */
        public void setWifiHotspot(RWifiHotspot value) {
            this.wifiHotspot = value;
        }

    }

}
