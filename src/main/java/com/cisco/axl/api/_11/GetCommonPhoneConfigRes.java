
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCommonPhoneConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCommonPhoneConfigRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="commonPhoneConfig" type="{http://www.cisco.com/AXL/API/11.5}RCommonPhoneConfig"/&gt;
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
@XmlType(name = "GetCommonPhoneConfigRes", propOrder = {
    "_return"
})
public class GetCommonPhoneConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCommonPhoneConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCommonPhoneConfigRes.Return }
     *     
     */
    public GetCommonPhoneConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCommonPhoneConfigRes.Return }
     *     
     */
    public void setReturn(GetCommonPhoneConfigRes.Return value) {
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
     *         &lt;element name="commonPhoneConfig" type="{http://www.cisco.com/AXL/API/11.5}RCommonPhoneConfig"/&gt;
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
        "commonPhoneConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCommonPhoneConfig commonPhoneConfig;

        /**
         * Gets the value of the commonPhoneConfig property.
         * 
         * @return
         *     possible object is
         *     {@link RCommonPhoneConfig }
         *     
         */
        public RCommonPhoneConfig getCommonPhoneConfig() {
            return commonPhoneConfig;
        }

        /**
         * Sets the value of the commonPhoneConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCommonPhoneConfig }
         *     
         */
        public void setCommonPhoneConfig(RCommonPhoneConfig value) {
            this.commonPhoneConfig = value;
        }

    }

}
