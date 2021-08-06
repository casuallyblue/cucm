
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCcdFeatureConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCcdFeatureConfigRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ccdFeatureConfig" type="{http://www.cisco.com/AXL/API/11.5}XCcdFeatureConfig"/&gt;
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
@XmlType(name = "GetCcdFeatureConfigRes", propOrder = {
    "_return"
})
public class GetCcdFeatureConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCcdFeatureConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCcdFeatureConfigRes.Return }
     *     
     */
    public GetCcdFeatureConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCcdFeatureConfigRes.Return }
     *     
     */
    public void setReturn(GetCcdFeatureConfigRes.Return value) {
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
     *         &lt;element name="ccdFeatureConfig" type="{http://www.cisco.com/AXL/API/11.5}XCcdFeatureConfig"/&gt;
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
        "ccdFeatureConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected XCcdFeatureConfig ccdFeatureConfig;

        /**
         * Gets the value of the ccdFeatureConfig property.
         * 
         * @return
         *     possible object is
         *     {@link XCcdFeatureConfig }
         *     
         */
        public XCcdFeatureConfig getCcdFeatureConfig() {
            return ccdFeatureConfig;
        }

        /**
         * Sets the value of the ccdFeatureConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link XCcdFeatureConfig }
         *     
         */
        public void setCcdFeatureConfig(XCcdFeatureConfig value) {
            this.ccdFeatureConfig = value;
        }

    }

}