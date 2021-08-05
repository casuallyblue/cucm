
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImeFirewallReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImeFirewallReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeFirewall" type="{http://www.cisco.com/AXL/API/11.5}XImeFirewall"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImeFirewallReq", propOrder = {
    "imeFirewall"
})
public class AddImeFirewallReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImeFirewall imeFirewall;

    /**
     * Gets the value of the imeFirewall property.
     * 
     * @return
     *     possible object is
     *     {@link XImeFirewall }
     *     
     */
    public XImeFirewall getImeFirewall() {
        return imeFirewall;
    }

    /**
     * Sets the value of the imeFirewall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImeFirewall }
     *     
     */
    public void setImeFirewall(XImeFirewall value) {
        this.imeFirewall = value;
    }

}
