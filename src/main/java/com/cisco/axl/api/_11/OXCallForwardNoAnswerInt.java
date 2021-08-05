
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXCallForwardNoAnswerInt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXCallForwardNoAnswerInt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/11.5}OXFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OXCallForwardNoAnswerInt", propOrder = {
    "callingSearchSpaceName"
})
public class OXCallForwardNoAnswerInt {

    protected OXFkType callingSearchSpaceName;

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingSearchSpaceName(OXFkType value) {
        this.callingSearchSpaceName = value;
    }

}
