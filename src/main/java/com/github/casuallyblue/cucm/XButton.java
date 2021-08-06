
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XButton complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XButton"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="feature" type="{http://www.cisco.com/AXL/API/11.5}XFeature"/&gt;
 *         &lt;element name="label" type="{http://www.cisco.com/AXL/API/11.5}String50" minOccurs="0"/&gt;
 *         &lt;element name="buttonNumber" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XButton", propOrder = {
    "feature",
    "label",
    "buttonNumber"
})
public class XButton {

    protected String feature;
    protected String label;
    protected String buttonNumber;

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the buttonNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonNumber() {
        return buttonNumber;
    }

    /**
     * Sets the value of the buttonNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonNumber(String value) {
        this.buttonNumber = value;
    }

}
