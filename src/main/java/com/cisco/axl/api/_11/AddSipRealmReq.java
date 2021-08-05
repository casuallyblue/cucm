
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipRealmReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipRealmReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sipRealm" type="{http://www.cisco.com/AXL/API/11.5}XSipRealm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipRealmReq", propOrder = {
    "sipRealm"
})
public class AddSipRealmReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipRealm sipRealm;

    /**
     * Gets the value of the sipRealm property.
     * 
     * @return
     *     possible object is
     *     {@link XSipRealm }
     *     
     */
    public XSipRealm getSipRealm() {
        return sipRealm;
    }

    /**
     * Sets the value of the sipRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipRealm }
     *     
     */
    public void setSipRealm(XSipRealm value) {
        this.sipRealm = value;
    }

}
