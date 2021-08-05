
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapDirectoryRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapDirectoryRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ldapDirectory" type="{http://www.cisco.com/AXL/API/11.5}RLdapDirectory"/&gt;
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
@XmlType(name = "GetLdapDirectoryRes", propOrder = {
    "_return"
})
public class GetLdapDirectoryRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapDirectoryRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapDirectoryRes.Return }
     *     
     */
    public GetLdapDirectoryRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapDirectoryRes.Return }
     *     
     */
    public void setReturn(GetLdapDirectoryRes.Return value) {
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
     *         &lt;element name="ldapDirectory" type="{http://www.cisco.com/AXL/API/11.5}RLdapDirectory"/&gt;
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
        "ldapDirectory"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapDirectory ldapDirectory;

        /**
         * Gets the value of the ldapDirectory property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapDirectory }
         *     
         */
        public RLdapDirectory getLdapDirectory() {
            return ldapDirectory;
        }

        /**
         * Sets the value of the ldapDirectory property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapDirectory }
         *     
         */
        public void setLdapDirectory(RLdapDirectory value) {
            this.ldapDirectory = value;
        }

    }

}
