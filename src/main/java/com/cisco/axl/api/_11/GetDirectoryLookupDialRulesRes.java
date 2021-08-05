
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDirectoryLookupDialRulesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDirectoryLookupDialRulesRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="directoryLookupDialRules" type="{http://www.cisco.com/AXL/API/11.5}RDirectoryLookupDialRules"/&gt;
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
@XmlType(name = "GetDirectoryLookupDialRulesRes", propOrder = {
    "_return"
})
public class GetDirectoryLookupDialRulesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDirectoryLookupDialRulesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDirectoryLookupDialRulesRes.Return }
     *     
     */
    public GetDirectoryLookupDialRulesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDirectoryLookupDialRulesRes.Return }
     *     
     */
    public void setReturn(GetDirectoryLookupDialRulesRes.Return value) {
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
     *         &lt;element name="directoryLookupDialRules" type="{http://www.cisco.com/AXL/API/11.5}RDirectoryLookupDialRules"/&gt;
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
        "directoryLookupDialRules"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDirectoryLookupDialRules directoryLookupDialRules;

        /**
         * Gets the value of the directoryLookupDialRules property.
         * 
         * @return
         *     possible object is
         *     {@link RDirectoryLookupDialRules }
         *     
         */
        public RDirectoryLookupDialRules getDirectoryLookupDialRules() {
            return directoryLookupDialRules;
        }

        /**
         * Sets the value of the directoryLookupDialRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDirectoryLookupDialRules }
         *     
         */
        public void setDirectoryLookupDialRules(RDirectoryLookupDialRules value) {
            this.directoryLookupDialRules = value;
        }

    }

}
