
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPhoneReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPhoneReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phone" type="{http://www.cisco.com/AXL/API/11.5}XPhone"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPhoneReq", propOrder = {
    "phone"
})
public class AddPhoneReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPhone phone;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link XPhone }
     *     
     */
    public XPhone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhone }
     *     
     */
    public void setPhone(XPhone value) {
        this.phone = value;
    }

}
