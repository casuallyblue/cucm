
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapSearchRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapSearchRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ldapSearch" type="{http://www.cisco.com/AXL/API/11.5}RLdapSearch"/&gt;
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
@XmlType(name = "GetLdapSearchRes", propOrder = {
    "_return"
})
public class GetLdapSearchRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapSearchRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapSearchRes.Return }
     *     
     */
    public GetLdapSearchRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapSearchRes.Return }
     *     
     */
    public void setReturn(GetLdapSearchRes.Return value) {
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
     *         &lt;element name="ldapSearch" type="{http://www.cisco.com/AXL/API/11.5}RLdapSearch"/&gt;
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
        "ldapSearch"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapSearch ldapSearch;

        /**
         * Gets the value of the ldapSearch property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapSearch }
         *     
         */
        public RLdapSearch getLdapSearch() {
            return ldapSearch;
        }

        /**
         * Sets the value of the ldapSearch property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapSearch }
         *     
         */
        public void setLdapSearch(RLdapSearch value) {
            this.ldapSearch = value;
        }

    }

}
