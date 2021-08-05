
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddServiceProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddServiceProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/11.5}XServiceProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddServiceProfileReq", propOrder = {
    "serviceProfile"
})
public class AddServiceProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XServiceProfile serviceProfile;

    /**
     * Gets the value of the serviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XServiceProfile }
     *     
     */
    public XServiceProfile getServiceProfile() {
        return serviceProfile;
    }

    /**
     * Sets the value of the serviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XServiceProfile }
     *     
     */
    public void setServiceProfile(XServiceProfile value) {
        this.serviceProfile = value;
    }

}
