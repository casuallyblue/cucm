
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPhysicalLocationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPhysicalLocationReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physicalLocation" type="{http://www.cisco.com/AXL/API/11.5}XPhysicalLocation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPhysicalLocationReq", propOrder = {
    "physicalLocation"
})
public class AddPhysicalLocationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPhysicalLocation physicalLocation;

    /**
     * Gets the value of the physicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link XPhysicalLocation }
     *     
     */
    public XPhysicalLocation getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Sets the value of the physicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPhysicalLocation }
     *     
     */
    public void setPhysicalLocation(XPhysicalLocation value) {
        this.physicalLocation = value;
    }

}
