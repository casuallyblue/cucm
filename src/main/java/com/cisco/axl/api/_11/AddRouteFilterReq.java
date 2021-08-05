
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRouteFilterReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRouteFilterReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeFilter" type="{http://www.cisco.com/AXL/API/11.5}XRouteFilter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRouteFilterReq", propOrder = {
    "routeFilter"
})
public class AddRouteFilterReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRouteFilter routeFilter;

    /**
     * Gets the value of the routeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link XRouteFilter }
     *     
     */
    public XRouteFilter getRouteFilter() {
        return routeFilter;
    }

    /**
     * Sets the value of the routeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRouteFilter }
     *     
     */
    public void setRouteFilter(XRouteFilter value) {
        this.routeFilter = value;
    }

}
