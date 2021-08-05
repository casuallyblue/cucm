
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCalledPartyTransformationPatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCalledPartyTransformationPatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calledPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.5}XCalledPartyTransformationPattern"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCalledPartyTransformationPatternReq", propOrder = {
    "calledPartyTransformationPattern"
})
public class AddCalledPartyTransformationPatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCalledPartyTransformationPattern calledPartyTransformationPattern;

    /**
     * Gets the value of the calledPartyTransformationPattern property.
     * 
     * @return
     *     possible object is
     *     {@link XCalledPartyTransformationPattern }
     *     
     */
    public XCalledPartyTransformationPattern getCalledPartyTransformationPattern() {
        return calledPartyTransformationPattern;
    }

    /**
     * Sets the value of the calledPartyTransformationPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCalledPartyTransformationPattern }
     *     
     */
    public void setCalledPartyTransformationPattern(XCalledPartyTransformationPattern value) {
        this.calledPartyTransformationPattern = value;
    }

}
