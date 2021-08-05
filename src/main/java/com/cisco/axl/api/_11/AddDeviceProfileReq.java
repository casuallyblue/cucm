
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDeviceProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDeviceProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceProfile" type="{http://www.cisco.com/AXL/API/11.5}XDeviceProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDeviceProfileReq", propOrder = {
    "deviceProfile"
})
public class AddDeviceProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDeviceProfile deviceProfile;

    /**
     * Gets the value of the deviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XDeviceProfile }
     *     
     */
    public XDeviceProfile getDeviceProfile() {
        return deviceProfile;
    }

    /**
     * Sets the value of the deviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDeviceProfile }
     *     
     */
    public void setDeviceProfile(XDeviceProfile value) {
        this.deviceProfile = value;
    }

}
