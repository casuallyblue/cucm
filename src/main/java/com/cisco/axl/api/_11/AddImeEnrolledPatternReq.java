
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeEnrolledPatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeEnrolledPatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeEnrolledPattern" type="{http://www.cisco.com/AXL/API/11.5}XImeEnrolledPattern"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeEnrolledPatternReq", propOrder = {
    "imeEnrolledPattern"
})
public class AddImeEnrolledPatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeEnrolledPattern imeEnrolledPattern;

    /**
     * Gets the value of the imeEnrolledPattern property.
     * 
     * @return
     *     possible object is
     *     {@link XImeEnrolledPattern }
     *     
     */
    public XImeEnrolledPattern getImeEnrolledPattern() {
        return imeEnrolledPattern;
    }

    /**
     * Sets the value of the imeEnrolledPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeEnrolledPattern }
     *     
     */
    public void setImeEnrolledPattern(XImeEnrolledPattern value) {
        this.imeEnrolledPattern = value;
    }

}
