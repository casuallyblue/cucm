
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapSyncCustomFieldRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapSyncCustomFieldRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ldapSyncCustomField" type="{http://www.cisco.com/AXL/API/11.5}RLdapSyncCustomField"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLdapSyncCustomFieldRes", propOrder = {
    "_return"
})
public class GetLdapSyncCustomFieldRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapSyncCustomFieldRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapSyncCustomFieldRes.Return }
     *     
     */
    public GetLdapSyncCustomFieldRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapSyncCustomFieldRes.Return }
     *     
     */
    public void setReturn(GetLdapSyncCustomFieldRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ldapSyncCustomField" type="{http://www.cisco.com/AXL/API/11.5}RLdapSyncCustomField"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ldapSyncCustomField"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapSyncCustomField ldapSyncCustomField;

        /**
         * Gets the value of the ldapSyncCustomField property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapSyncCustomField }
         *     
         */
        public RLdapSyncCustomField getLdapSyncCustomField() {
            return ldapSyncCustomField;
        }

        /**
         * Sets the value of the ldapSyncCustomField property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapSyncCustomField }
         *     
         */
        public void setLdapSyncCustomField(RLdapSyncCustomField value) {
            this.ldapSyncCustomField = value;
        }

    }

}
