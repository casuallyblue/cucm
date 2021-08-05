
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFeatureControlPolicyRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeatureControlPolicyRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/11.5}RFeatureControlPolicy"/&gt;
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
@XmlType(name = "GetFeatureControlPolicyRes", propOrder = {
    "_return"
})
public class GetFeatureControlPolicyRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetFeatureControlPolicyRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeatureControlPolicyRes.Return }
     *     
     */
    public GetFeatureControlPolicyRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeatureControlPolicyRes.Return }
     *     
     */
    public void setReturn(GetFeatureControlPolicyRes.Return value) {
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
     *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/11.5}RFeatureControlPolicy"/&gt;
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
        "featureControlPolicy"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RFeatureControlPolicy featureControlPolicy;

        /**
         * Gets the value of the featureControlPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link RFeatureControlPolicy }
         *     
         */
        public RFeatureControlPolicy getFeatureControlPolicy() {
            return featureControlPolicy;
        }

        /**
         * Sets the value of the featureControlPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link RFeatureControlPolicy }
         *     
         */
        public void setFeatureControlPolicy(RFeatureControlPolicy value) {
            this.featureControlPolicy = value;
        }

    }

}
