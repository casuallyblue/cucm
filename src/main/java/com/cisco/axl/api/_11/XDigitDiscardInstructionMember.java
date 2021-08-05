
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XDigitDiscardInstructionMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XDigitDiscardInstructionMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="dialPlanTagName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XDigitDiscardInstructionMember", propOrder = {
    "dialPlanTagName"
})
public class XDigitDiscardInstructionMember {

    protected XFkType dialPlanTagName;

    /**
     * Gets the value of the dialPlanTagName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDialPlanTagName() {
        return dialPlanTagName;
    }

    /**
     * Sets the value of the dialPlanTagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDialPlanTagName(XFkType value) {
        this.dialPlanTagName = value;
    }

}
