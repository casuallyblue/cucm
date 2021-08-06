
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSpeeddial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSpeeddial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="dirn" type="{http://www.cisco.com/AXL/API/11.5}String255"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="index" type="{http://www.cisco.com/AXL/API/11.5}XInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSpeeddial", propOrder = {
    "dirn",
    "label",
    "index"
})
public class XSpeeddial {

    protected String dirn;
    protected String label;
    protected String index;

    /**
     * Gets the value of the dirn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirn() {
        return dirn;
    }

    /**
     * Sets the value of the dirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirn(String value) {
        this.dirn = value;
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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}
