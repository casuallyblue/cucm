
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddGeoLocationFilterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddGeoLocationFilterReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoLocationFilter" type="{http://www.cisco.com/AXL/API/11.5}XGeoLocationFilter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddGeoLocationFilterReq", propOrder = {
    "geoLocationFilter"
})
public class AddGeoLocationFilterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XGeoLocationFilter geoLocationFilter;

    /**
     * Gets the value of the geoLocationFilter property.
     * 
     * @return
     *     possible object is
     *     {@link XGeoLocationFilter }
     *     
     */
    public XGeoLocationFilter getGeoLocationFilter() {
        return geoLocationFilter;
    }

    /**
     * Sets the value of the geoLocationFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGeoLocationFilter }
     *     
     */
    public void setGeoLocationFilter(XGeoLocationFilter value) {
        this.geoLocationFilter = value;
    }

}
