
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUserPhoneAssociationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUserPhoneAssociationReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userPhoneAssociation" type="{http://www.cisco.com/AXL/API/11.5}XUserPhoneAssociation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUserPhoneAssociationReq", propOrder = {
    "userPhoneAssociation"
})
public class AddUserPhoneAssociationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUserPhoneAssociation userPhoneAssociation;

    /**
     * Gets the value of the userPhoneAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link XUserPhoneAssociation }
     *     
     */
    public XUserPhoneAssociation getUserPhoneAssociation() {
        return userPhoneAssociation;
    }

    /**
     * Sets the value of the userPhoneAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUserPhoneAssociation }
     *     
     */
    public void setUserPhoneAssociation(XUserPhoneAssociation value) {
        this.userPhoneAssociation = value;
    }

}
