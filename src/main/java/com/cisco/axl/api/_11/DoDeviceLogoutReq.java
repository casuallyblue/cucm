
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This method logs-out whichever user is logged-into the device.
 * 
 * <p>Java class for DoDeviceLogoutReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoDeviceLogoutReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoDeviceLogoutReq", propOrder = {
    "deviceName"
})
public class DoDeviceLogoutReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XFkType deviceName;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDeviceName(XFkType value) {
        this.deviceName = value;
    }

}
