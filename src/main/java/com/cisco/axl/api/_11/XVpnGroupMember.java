
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XVpnGroupMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XVpnGroupMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="vpnGatewayName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="priority" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XVpnGroupMember", propOrder = {
    "vpnGatewayName",
    "priority"
})
public class XVpnGroupMember {

    protected XFkType vpnGatewayName;
    @XmlSchemaType(name = "anySimpleType")
    protected String priority;

    /**
     * Gets the value of the vpnGatewayName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getVpnGatewayName() {
        return vpnGatewayName;
    }

    /**
     * Sets the value of the vpnGatewayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setVpnGatewayName(XFkType value) {
        this.vpnGatewayName = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

}
