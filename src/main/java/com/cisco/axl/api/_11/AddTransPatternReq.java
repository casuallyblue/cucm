
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTransPatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTransPatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/11.5}XTransPattern"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTransPatternReq", propOrder = {
    "transPattern"
})
public class AddTransPatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XTransPattern transPattern;

    /**
     * Gets the value of the transPattern property.
     * 
     * @return
     *     possible object is
     *     {@link XTransPattern }
     *     
     */
    public XTransPattern getTransPattern() {
        return transPattern;
    }

    /**
     * Sets the value of the transPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTransPattern }
     *     
     */
    public void setTransPattern(XTransPattern value) {
        this.transPattern = value;
    }

}
