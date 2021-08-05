
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCallPickupGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCallPickupGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callPickupGroup" type="{http://www.cisco.com/AXL/API/11.5}XCallPickupGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCallPickupGroupReq", propOrder = {
    "callPickupGroup"
})
public class AddCallPickupGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCallPickupGroup callPickupGroup;

    /**
     * Gets the value of the callPickupGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XCallPickupGroup }
     *     
     */
    public XCallPickupGroup getCallPickupGroup() {
        return callPickupGroup;
    }

    /**
     * Sets the value of the callPickupGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallPickupGroup }
     *     
     */
    public void setCallPickupGroup(XCallPickupGroup value) {
        this.callPickupGroup = value;
    }

}
