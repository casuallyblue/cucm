
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipRoutePatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipRoutePatternReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sipRoutePattern" type="{http://www.cisco.com/AXL/API/11.5}XSipRoutePattern"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipRoutePatternReq", propOrder = {
    "sipRoutePattern"
})
public class AddSipRoutePatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipRoutePattern sipRoutePattern;

    /**
     * Gets the value of the sipRoutePattern property.
     * 
     * @return
     *     possible object is
     *     {@link XSipRoutePattern }
     *     
     */
    public XSipRoutePattern getSipRoutePattern() {
        return sipRoutePattern;
    }

    /**
     * Sets the value of the sipRoutePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipRoutePattern }
     *     
     */
    public void setSipRoutePattern(XSipRoutePattern value) {
        this.sipRoutePattern = value;
    }

}
