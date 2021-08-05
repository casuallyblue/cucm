
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDateTimeGroupNtpReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDateTimeGroupNtpReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="phoneNtpName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="selectionOrder" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RDateTimeGroupNtpReference", propOrder = {
    "phoneNtpName",
    "selectionOrder"
})
public class RDateTimeGroupNtpReference {

    protected XFkType phoneNtpName;
    @XmlSchemaType(name = "anySimpleType")
    protected String selectionOrder;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the phoneNtpName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPhoneNtpName() {
        return phoneNtpName;
    }

    /**
     * Sets the value of the phoneNtpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPhoneNtpName(XFkType value) {
        this.phoneNtpName = value;
    }

    /**
     * Gets the value of the selectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionOrder() {
        return selectionOrder;
    }

    /**
     * Sets the value of the selectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionOrder(String value) {
        this.selectionOrder = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
