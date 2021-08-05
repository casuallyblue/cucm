
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUniversalLineTemplateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUniversalLineTemplateRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="universalLineTemplate" type="{http://www.cisco.com/AXL/API/11.5}RUniversalLineTemplate"/&gt;
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
@XmlType(name = "GetUniversalLineTemplateRes", propOrder = {
    "_return"
})
public class GetUniversalLineTemplateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetUniversalLineTemplateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetUniversalLineTemplateRes.Return }
     *     
     */
    public GetUniversalLineTemplateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUniversalLineTemplateRes.Return }
     *     
     */
    public void setReturn(GetUniversalLineTemplateRes.Return value) {
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
     *         &lt;element name="universalLineTemplate" type="{http://www.cisco.com/AXL/API/11.5}RUniversalLineTemplate"/&gt;
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
        "universalLineTemplate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RUniversalLineTemplate universalLineTemplate;

        /**
         * Gets the value of the universalLineTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link RUniversalLineTemplate }
         *     
         */
        public RUniversalLineTemplate getUniversalLineTemplate() {
            return universalLineTemplate;
        }

        /**
         * Sets the value of the universalLineTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RUniversalLineTemplate }
         *     
         */
        public void setUniversalLineTemplate(RUniversalLineTemplate value) {
            this.universalLineTemplate = value;
        }

    }

}
