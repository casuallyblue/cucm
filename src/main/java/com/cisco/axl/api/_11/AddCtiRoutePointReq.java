
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCtiRoutePointReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCtiRoutePointReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ctiRoutePoint" type="{http://www.cisco.com/AXL/API/11.5}XCtiRoutePoint"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCtiRoutePointReq", propOrder = {
    "ctiRoutePoint"
})
public class AddCtiRoutePointReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCtiRoutePoint ctiRoutePoint;

    /**
     * Gets the value of the ctiRoutePoint property.
     * 
     * @return
     *     possible object is
     *     {@link XCtiRoutePoint }
     *     
     */
    public XCtiRoutePoint getCtiRoutePoint() {
        return ctiRoutePoint;
    }

    /**
     * Sets the value of the ctiRoutePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCtiRoutePoint }
     *     
     */
    public void setCtiRoutePoint(XCtiRoutePoint value) {
        this.ctiRoutePoint = value;
    }

}
