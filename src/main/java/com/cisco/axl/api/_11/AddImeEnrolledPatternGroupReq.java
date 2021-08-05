
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeEnrolledPatternGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeEnrolledPatternGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeEnrolledPatternGroup" type="{http://www.cisco.com/AXL/API/11.5}XImeEnrolledPatternGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeEnrolledPatternGroupReq", propOrder = {
    "imeEnrolledPatternGroup"
})
public class AddImeEnrolledPatternGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeEnrolledPatternGroup imeEnrolledPatternGroup;

    /**
     * Gets the value of the imeEnrolledPatternGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XImeEnrolledPatternGroup }
     *     
     */
    public XImeEnrolledPatternGroup getImeEnrolledPatternGroup() {
        return imeEnrolledPatternGroup;
    }

    /**
     * Sets the value of the imeEnrolledPatternGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeEnrolledPatternGroup }
     *     
     */
    public void setImeEnrolledPatternGroup(XImeEnrolledPatternGroup value) {
        this.imeEnrolledPatternGroup = value;
    }

}
