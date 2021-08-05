
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeExclusionNumberGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeExclusionNumberGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeExclusionNumberGroup" type="{http://www.cisco.com/AXL/API/11.5}XImeExclusionNumberGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeExclusionNumberGroupReq", propOrder = {
    "imeExclusionNumberGroup"
})
public class AddImeExclusionNumberGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeExclusionNumberGroup imeExclusionNumberGroup;

    /**
     * Gets the value of the imeExclusionNumberGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XImeExclusionNumberGroup }
     *     
     */
    public XImeExclusionNumberGroup getImeExclusionNumberGroup() {
        return imeExclusionNumberGroup;
    }

    /**
     * Sets the value of the imeExclusionNumberGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeExclusionNumberGroup }
     *     
     */
    public void setImeExclusionNumberGroup(XImeExclusionNumberGroup value) {
        this.imeExclusionNumberGroup = value;
    }

}
