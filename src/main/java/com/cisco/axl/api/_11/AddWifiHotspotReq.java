
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddWifiHotspotReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddWifiHotspotReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wifiHotspot" type="{http://www.cisco.com/AXL/API/11.5}XWifiHotspot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddWifiHotspotReq", propOrder = {
    "wifiHotspot"
})
public class AddWifiHotspotReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XWifiHotspot wifiHotspot;

    /**
     * Gets the value of the wifiHotspot property.
     * 
     * @return
     *     possible object is
     *     {@link XWifiHotspot }
     *     
     */
    public XWifiHotspot getWifiHotspot() {
        return wifiHotspot;
    }

    /**
     * Sets the value of the wifiHotspot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XWifiHotspot }
     *     
     */
    public void setWifiHotspot(XWifiHotspot value) {
        this.wifiHotspot = value;
    }

}
