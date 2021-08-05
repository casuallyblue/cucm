
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDateTimeGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDateTimeGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTimeGroup" type="{http://www.cisco.com/AXL/API/11.5}XDateTimeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDateTimeGroupReq", propOrder = {
    "dateTimeGroup"
})
public class AddDateTimeGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDateTimeGroup dateTimeGroup;

    /**
     * Gets the value of the dateTimeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XDateTimeGroup }
     *     
     */
    public XDateTimeGroup getDateTimeGroup() {
        return dateTimeGroup;
    }

    /**
     * Sets the value of the dateTimeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDateTimeGroup }
     *     
     */
    public void setDateTimeGroup(XDateTimeGroup value) {
        this.dateTimeGroup = value;
    }

}
