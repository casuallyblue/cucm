
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomUserFieldReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomUserFieldReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/11.5}XCustomUserField"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomUserFieldReq", propOrder = {
    "customUserField"
})
public class AddCustomUserFieldReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCustomUserField customUserField;

    /**
     * Gets the value of the customUserField property.
     * 
     * @return
     *     possible object is
     *     {@link XCustomUserField }
     *     
     */
    public XCustomUserField getCustomUserField() {
        return customUserField;
    }

    /**
     * Sets the value of the customUserField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCustomUserField }
     *     
     */
    public void setCustomUserField(XCustomUserField value) {
        this.customUserField = value;
    }

}
