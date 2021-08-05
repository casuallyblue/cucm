
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddWirelessAccessPointControllersReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddWirelessAccessPointControllersReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wirelessAccessPointControllers" type="{http://www.cisco.com/AXL/API/11.5}XWirelessAccessPointControllers"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddWirelessAccessPointControllersReq", propOrder = {
    "wirelessAccessPointControllers"
})
public class AddWirelessAccessPointControllersReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XWirelessAccessPointControllers wirelessAccessPointControllers;

    /**
     * Gets the value of the wirelessAccessPointControllers property.
     * 
     * @return
     *     possible object is
     *     {@link XWirelessAccessPointControllers }
     *     
     */
    public XWirelessAccessPointControllers getWirelessAccessPointControllers() {
        return wirelessAccessPointControllers;
    }

    /**
     * Sets the value of the wirelessAccessPointControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XWirelessAccessPointControllers }
     *     
     */
    public void setWirelessAccessPointControllers(XWirelessAccessPointControllers value) {
        this.wirelessAccessPointControllers = value;
    }

}
