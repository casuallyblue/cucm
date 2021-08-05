
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUniversalDeviceTemplateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUniversalDeviceTemplateRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="universalDeviceTemplate" type="{http://www.cisco.com/AXL/API/11.5}RUniversalDeviceTemplate"/&gt;
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
@XmlType(name = "GetUniversalDeviceTemplateRes", propOrder = {
    "_return"
})
public class GetUniversalDeviceTemplateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetUniversalDeviceTemplateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetUniversalDeviceTemplateRes.Return }
     *     
     */
    public GetUniversalDeviceTemplateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUniversalDeviceTemplateRes.Return }
     *     
     */
    public void setReturn(GetUniversalDeviceTemplateRes.Return value) {
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
     *         &lt;element name="universalDeviceTemplate" type="{http://www.cisco.com/AXL/API/11.5}RUniversalDeviceTemplate"/&gt;
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
        "universalDeviceTemplate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RUniversalDeviceTemplate universalDeviceTemplate;

        /**
         * Gets the value of the universalDeviceTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link RUniversalDeviceTemplate }
         *     
         */
        public RUniversalDeviceTemplate getUniversalDeviceTemplate() {
            return universalDeviceTemplate;
        }

        /**
         * Sets the value of the universalDeviceTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RUniversalDeviceTemplate }
         *     
         */
        public void setUniversalDeviceTemplate(RUniversalDeviceTemplate value) {
            this.universalDeviceTemplate = value;
        }

    }

}
