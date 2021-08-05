
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUserProfileProvisionReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUserProfileProvisionReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userProfileProvision" type="{http://www.cisco.com/AXL/API/11.5}XUserProfileProvision"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUserProfileProvisionReq", propOrder = {
    "userProfileProvision"
})
public class AddUserProfileProvisionReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUserProfileProvision userProfileProvision;

    /**
     * Gets the value of the userProfileProvision property.
     * 
     * @return
     *     possible object is
     *     {@link XUserProfileProvision }
     *     
     */
    public XUserProfileProvision getUserProfileProvision() {
        return userProfileProvision;
    }

    /**
     * Sets the value of the userProfileProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUserProfileProvision }
     *     
     */
    public void setUserProfileProvision(XUserProfileProvision value) {
        this.userProfileProvision = value;
    }

}
