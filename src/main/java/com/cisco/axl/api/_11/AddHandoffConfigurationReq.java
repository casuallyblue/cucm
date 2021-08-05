
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddHandoffConfigurationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddHandoffConfigurationReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="handoffConfiguration" type="{http://www.cisco.com/AXL/API/11.5}XHandoffConfiguration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddHandoffConfigurationReq", propOrder = {
    "handoffConfiguration"
})
public class AddHandoffConfigurationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XHandoffConfiguration handoffConfiguration;

    /**
     * Gets the value of the handoffConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link XHandoffConfiguration }
     *     
     */
    public XHandoffConfiguration getHandoffConfiguration() {
        return handoffConfiguration;
    }

    /**
     * Sets the value of the handoffConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHandoffConfiguration }
     *     
     */
    public void setHandoffConfiguration(XHandoffConfiguration value) {
        this.handoffConfiguration = value;
    }

}
