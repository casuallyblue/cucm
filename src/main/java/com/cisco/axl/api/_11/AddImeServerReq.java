
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeServerReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeServer" type="{http://www.cisco.com/AXL/API/11.5}XImeServer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeServerReq", propOrder = {
    "imeServer"
})
public class AddImeServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeServer imeServer;

    /**
     * Gets the value of the imeServer property.
     * 
     * @return
     *     possible object is
     *     {@link XImeServer }
     *     
     */
    public XImeServer getImeServer() {
        return imeServer;
    }

    /**
     * Sets the value of the imeServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeServer }
     *     
     */
    public void setImeServer(XImeServer value) {
        this.imeServer = value;
    }

}
