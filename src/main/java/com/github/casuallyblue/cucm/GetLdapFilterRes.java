
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapFilterRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapFilterRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ldapFilter" type="{http://www.cisco.com/AXL/API/11.5}RLdapFilter"/&gt;
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
@XmlType(name = "GetLdapFilterRes", propOrder = {
    "_return"
})
public class GetLdapFilterRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapFilterRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapFilterRes.Return }
     *     
     */
    public GetLdapFilterRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapFilterRes.Return }
     *     
     */
    public void setReturn(GetLdapFilterRes.Return value) {
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
     *         &lt;element name="ldapFilter" type="{http://www.cisco.com/AXL/API/11.5}RLdapFilter"/&gt;
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
        "ldapFilter"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapFilter ldapFilter;

        /**
         * Gets the value of the ldapFilter property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapFilter }
         *     
         */
        public RLdapFilter getLdapFilter() {
            return ldapFilter;
        }

        /**
         * Sets the value of the ldapFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapFilter }
         *     
         */
        public void setLdapFilter(RLdapFilter value) {
            this.ldapFilter = value;
        }

    }

}