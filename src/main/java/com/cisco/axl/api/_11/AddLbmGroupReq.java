
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLbmGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLbmGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lbmGroup" type="{http://www.cisco.com/AXL/API/11.5}XLbmGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLbmGroupReq", propOrder = {
    "lbmGroup"
})
public class AddLbmGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLbmGroup lbmGroup;

    /**
     * Gets the value of the lbmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XLbmGroup }
     *     
     */
    public XLbmGroup getLbmGroup() {
        return lbmGroup;
    }

    /**
     * Sets the value of the lbmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLbmGroup }
     *     
     */
    public void setLbmGroup(XLbmGroup value) {
        this.lbmGroup = value;
    }

}
