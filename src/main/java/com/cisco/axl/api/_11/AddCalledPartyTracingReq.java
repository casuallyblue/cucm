
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCalledPartyTracingReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCalledPartyTracingReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calledPartyTracing" type="{http://www.cisco.com/AXL/API/11.5}XCalledPartyTracing"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCalledPartyTracingReq", propOrder = {
    "calledPartyTracing"
})
public class AddCalledPartyTracingReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCalledPartyTracing calledPartyTracing;

    /**
     * Gets the value of the calledPartyTracing property.
     * 
     * @return
     *     possible object is
     *     {@link XCalledPartyTracing }
     *     
     */
    public XCalledPartyTracing getCalledPartyTracing() {
        return calledPartyTracing;
    }

    /**
     * Sets the value of the calledPartyTracing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCalledPartyTracing }
     *     
     */
    public void setCalledPartyTracing(XCalledPartyTracing value) {
        this.calledPartyTracing = value;
    }

}
