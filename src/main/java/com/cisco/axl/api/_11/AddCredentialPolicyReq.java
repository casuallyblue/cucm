
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCredentialPolicyReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCredentialPolicyReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credentialPolicy" type="{http://www.cisco.com/AXL/API/11.5}XCredentialPolicy"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCredentialPolicyReq", propOrder = {
    "credentialPolicy"
})
public class AddCredentialPolicyReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCredentialPolicy credentialPolicy;

    /**
     * Gets the value of the credentialPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link XCredentialPolicy }
     *     
     */
    public XCredentialPolicy getCredentialPolicy() {
        return credentialPolicy;
    }

    /**
     * Sets the value of the credentialPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCredentialPolicy }
     *     
     */
    public void setCredentialPolicy(XCredentialPolicy value) {
        this.credentialPolicy = value;
    }

}
