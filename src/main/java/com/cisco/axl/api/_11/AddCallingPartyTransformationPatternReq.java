
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCallingPartyTransformationPatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCallingPartyTransformationPatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callingPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.5}XCallingPartyTransformationPattern"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCallingPartyTransformationPatternReq", propOrder = {
    "callingPartyTransformationPattern"
})
public class AddCallingPartyTransformationPatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCallingPartyTransformationPattern callingPartyTransformationPattern;

    /**
     * Gets the value of the callingPartyTransformationPattern property.
     * 
     * @return
     *     possible object is
     *     {@link XCallingPartyTransformationPattern }
     *     
     */
    public XCallingPartyTransformationPattern getCallingPartyTransformationPattern() {
        return callingPartyTransformationPattern;
    }

    /**
     * Sets the value of the callingPartyTransformationPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCallingPartyTransformationPattern }
     *     
     */
    public void setCallingPartyTransformationPattern(XCallingPartyTransformationPattern value) {
        this.callingPartyTransformationPattern = value;
    }

}
