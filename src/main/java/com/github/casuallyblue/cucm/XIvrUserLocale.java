
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XIvrUserLocale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XIvrUserLocale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/11.5}XUserLocale"/&gt;
 *         &lt;element name="orderIndex" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XIvrUserLocale", propOrder = {
    "userLocale",
    "orderIndex"
})
public class XIvrUserLocale {

    protected String userLocale;
    protected String orderIndex;

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the orderIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIndex() {
        return orderIndex;
    }

    /**
     * Sets the value of the orderIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIndex(String value) {
        this.orderIndex = value;
    }

}
