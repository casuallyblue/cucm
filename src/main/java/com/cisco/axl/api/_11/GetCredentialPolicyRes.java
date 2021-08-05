
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCredentialPolicyRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCredentialPolicyRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="credentialPolicy" type="{http://www.cisco.com/AXL/API/11.5}RCredentialPolicy"/&gt;
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
@XmlType(name = "GetCredentialPolicyRes", propOrder = {
    "_return"
})
public class GetCredentialPolicyRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCredentialPolicyRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCredentialPolicyRes.Return }
     *     
     */
    public GetCredentialPolicyRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCredentialPolicyRes.Return }
     *     
     */
    public void setReturn(GetCredentialPolicyRes.Return value) {
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
     *         &lt;element name="credentialPolicy" type="{http://www.cisco.com/AXL/API/11.5}RCredentialPolicy"/&gt;
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
        "credentialPolicy"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCredentialPolicy credentialPolicy;

        /**
         * Gets the value of the credentialPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link RCredentialPolicy }
         *     
         */
        public RCredentialPolicy getCredentialPolicy() {
            return credentialPolicy;
        }

        /**
         * Sets the value of the credentialPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCredentialPolicy }
         *     
         */
        public void setCredentialPolicy(RCredentialPolicy value) {
            this.credentialPolicy = value;
        }

    }

}
