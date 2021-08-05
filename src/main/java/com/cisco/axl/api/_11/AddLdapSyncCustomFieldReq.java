
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLdapSyncCustomFieldReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLdapSyncCustomFieldReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ldapSyncCustomField" type="{http://www.cisco.com/AXL/API/11.5}XLdapSyncCustomField"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLdapSyncCustomFieldReq", propOrder = {
    "ldapSyncCustomField"
})
public class AddLdapSyncCustomFieldReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLdapSyncCustomField ldapSyncCustomField;

    /**
     * Gets the value of the ldapSyncCustomField property.
     * 
     * @return
     *     possible object is
     *     {@link XLdapSyncCustomField }
     *     
     */
    public XLdapSyncCustomField getLdapSyncCustomField() {
        return ldapSyncCustomField;
    }

    /**
     * Sets the value of the ldapSyncCustomField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLdapSyncCustomField }
     *     
     */
    public void setLdapSyncCustomField(XLdapSyncCustomField value) {
        this.ldapSyncCustomField = value;
    }

}
