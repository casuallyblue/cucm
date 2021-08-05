
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLbmHubGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLbmHubGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lbmHubGroup" type="{http://www.cisco.com/AXL/API/11.5}XLbmHubGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLbmHubGroupReq", propOrder = {
    "lbmHubGroup"
})
public class AddLbmHubGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLbmHubGroup lbmHubGroup;

    /**
     * Gets the value of the lbmHubGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XLbmHubGroup }
     *     
     */
    public XLbmHubGroup getLbmHubGroup() {
        return lbmHubGroup;
    }

    /**
     * Sets the value of the lbmHubGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLbmHubGroup }
     *     
     */
    public void setLbmHubGroup(XLbmHubGroup value) {
        this.lbmHubGroup = value;
    }

}
