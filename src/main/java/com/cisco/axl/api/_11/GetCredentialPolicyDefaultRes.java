
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCredentialPolicyDefaultRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCredentialPolicyDefaultRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="credentialPolicyDefault" type="{http://www.cisco.com/AXL/API/11.5}RCredentialPolicyDefault"/&gt;
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
@XmlType(name = "GetCredentialPolicyDefaultRes", propOrder = {
    "_return"
})
public class GetCredentialPolicyDefaultRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCredentialPolicyDefaultRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCredentialPolicyDefaultRes.Return }
     *     
     */
    public GetCredentialPolicyDefaultRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCredentialPolicyDefaultRes.Return }
     *     
     */
    public void setReturn(GetCredentialPolicyDefaultRes.Return value) {
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
     *         &lt;element name="credentialPolicyDefault" type="{http://www.cisco.com/AXL/API/11.5}RCredentialPolicyDefault"/&gt;
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
        "credentialPolicyDefault"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCredentialPolicyDefault credentialPolicyDefault;

        /**
         * Gets the value of the credentialPolicyDefault property.
         * 
         * @return
         *     possible object is
         *     {@link RCredentialPolicyDefault }
         *     
         */
        public RCredentialPolicyDefault getCredentialPolicyDefault() {
            return credentialPolicyDefault;
        }

        /**
         * Sets the value of the credentialPolicyDefault property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCredentialPolicyDefault }
         *     
         */
        public void setCredentialPolicyDefault(RCredentialPolicyDefault value) {
            this.credentialPolicyDefault = value;
        }

    }

}
