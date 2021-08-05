
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFeatureGroupTemplateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeatureGroupTemplateRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="featureGroupTemplate" type="{http://www.cisco.com/AXL/API/11.5}RFeatureGroupTemplate"/&gt;
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
@XmlType(name = "GetFeatureGroupTemplateRes", propOrder = {
    "_return"
})
public class GetFeatureGroupTemplateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetFeatureGroupTemplateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetFeatureGroupTemplateRes.Return }
     *     
     */
    public GetFeatureGroupTemplateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFeatureGroupTemplateRes.Return }
     *     
     */
    public void setReturn(GetFeatureGroupTemplateRes.Return value) {
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
     *         &lt;element name="featureGroupTemplate" type="{http://www.cisco.com/AXL/API/11.5}RFeatureGroupTemplate"/&gt;
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
        "featureGroupTemplate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RFeatureGroupTemplate featureGroupTemplate;

        /**
         * Gets the value of the featureGroupTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link RFeatureGroupTemplate }
         *     
         */
        public RFeatureGroupTemplate getFeatureGroupTemplate() {
            return featureGroupTemplate;
        }

        /**
         * Sets the value of the featureGroupTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RFeatureGroupTemplate }
         *     
         */
        public void setFeatureGroupTemplate(RFeatureGroupTemplate value) {
            this.featureGroupTemplate = value;
        }

    }

}
