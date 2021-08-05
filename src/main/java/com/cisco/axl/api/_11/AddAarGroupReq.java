
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAarGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAarGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aarGroup" type="{http://www.cisco.com/AXL/API/11.5}XAarGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAarGroupReq", propOrder = {
    "aarGroup"
})
public class AddAarGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAarGroup aarGroup;

    /**
     * Gets the value of the aarGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XAarGroup }
     *     
     */
    public XAarGroup getAarGroup() {
        return aarGroup;
    }

    /**
     * Sets the value of the aarGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAarGroup }
     *     
     */
    public void setAarGroup(XAarGroup value) {
        this.aarGroup = value;
    }

}
