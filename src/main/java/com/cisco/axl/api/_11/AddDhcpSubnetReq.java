
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDhcpSubnetReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDhcpSubnetReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dhcpSubnet" type="{http://www.cisco.com/AXL/API/11.5}XDhcpSubnet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDhcpSubnetReq", propOrder = {
    "dhcpSubnet"
})
public class AddDhcpSubnetReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDhcpSubnet dhcpSubnet;

    /**
     * Gets the value of the dhcpSubnet property.
     * 
     * @return
     *     possible object is
     *     {@link XDhcpSubnet }
     *     
     */
    public XDhcpSubnet getDhcpSubnet() {
        return dhcpSubnet;
    }

    /**
     * Sets the value of the dhcpSubnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDhcpSubnet }
     *     
     */
    public void setDhcpSubnet(XDhcpSubnet value) {
        this.dhcpSubnet = value;
    }

}
