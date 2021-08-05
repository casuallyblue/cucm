
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeFeatureConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeFeatureConfigRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeFeatureConfig" type="{http://www.cisco.com/AXL/API/11.5}RImeFeatureConfig"/&gt;
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
@XmlType(name = "GetImeFeatureConfigRes", propOrder = {
    "_return"
})
public class GetImeFeatureConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeFeatureConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeFeatureConfigRes.Return }
     *     
     */
    public GetImeFeatureConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeFeatureConfigRes.Return }
     *     
     */
    public void setReturn(GetImeFeatureConfigRes.Return value) {
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
     *         &lt;element name="imeFeatureConfig" type="{http://www.cisco.com/AXL/API/11.5}RImeFeatureConfig"/&gt;
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
        "imeFeatureConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeFeatureConfig imeFeatureConfig;

        /**
         * Gets the value of the imeFeatureConfig property.
         * 
         * @return
         *     possible object is
         *     {@link RImeFeatureConfig }
         *     
         */
        public RImeFeatureConfig getImeFeatureConfig() {
            return imeFeatureConfig;
        }

        /**
         * Sets the value of the imeFeatureConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeFeatureConfig }
         *     
         */
        public void setImeFeatureConfig(RImeFeatureConfig value) {
            this.imeFeatureConfig = value;
        }

    }

}
