
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetApplicationDialRulesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApplicationDialRulesRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="applicationDialRules" type="{http://www.cisco.com/AXL/API/11.5}RApplicationDialRules"/&gt;
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
@XmlType(name = "GetApplicationDialRulesRes", propOrder = {
    "_return"
})
public class GetApplicationDialRulesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetApplicationDialRulesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetApplicationDialRulesRes.Return }
     *     
     */
    public GetApplicationDialRulesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetApplicationDialRulesRes.Return }
     *     
     */
    public void setReturn(GetApplicationDialRulesRes.Return value) {
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
     *         &lt;element name="applicationDialRules" type="{http://www.cisco.com/AXL/API/11.5}RApplicationDialRules"/&gt;
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
        "applicationDialRules"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RApplicationDialRules applicationDialRules;

        /**
         * Gets the value of the applicationDialRules property.
         * 
         * @return
         *     possible object is
         *     {@link RApplicationDialRules }
         *     
         */
        public RApplicationDialRules getApplicationDialRules() {
            return applicationDialRules;
        }

        /**
         * Sets the value of the applicationDialRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link RApplicationDialRules }
         *     
         */
        public void setApplicationDialRules(RApplicationDialRules value) {
            this.applicationDialRules = value;
        }

    }

}
