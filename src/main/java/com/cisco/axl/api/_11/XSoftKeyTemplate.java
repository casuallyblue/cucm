
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSoftKeyTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSoftKeyTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String100"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String100"/&gt;
 *         &lt;element name="baseSoftkeyTemplateName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="isDefault" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSoftKeyTemplate", propOrder = {
    "name",
    "description",
    "baseSoftkeyTemplateName",
    "isDefault"
})
public class XSoftKeyTemplate {

    protected String name;
    protected String description;
    protected XFkType baseSoftkeyTemplateName;
    protected String isDefault;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the baseSoftkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getBaseSoftkeyTemplateName() {
        return baseSoftkeyTemplateName;
    }

    /**
     * Sets the value of the baseSoftkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setBaseSoftkeyTemplateName(XFkType value) {
        this.baseSoftkeyTemplateName = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

}
