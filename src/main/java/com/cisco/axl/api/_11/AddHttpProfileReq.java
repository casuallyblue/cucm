
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddHttpProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddHttpProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="httpProfile" type="{http://www.cisco.com/AXL/API/11.5}XHttpProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddHttpProfileReq", propOrder = {
    "httpProfile"
})
public class AddHttpProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XHttpProfile httpProfile;

    /**
     * Gets the value of the httpProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XHttpProfile }
     *     
     */
    public XHttpProfile getHttpProfile() {
        return httpProfile;
    }

    /**
     * Sets the value of the httpProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHttpProfile }
     *     
     */
    public void setHttpProfile(XHttpProfile value) {
        this.httpProfile = value;
    }

}
