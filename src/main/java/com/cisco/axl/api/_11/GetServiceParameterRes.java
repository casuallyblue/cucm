
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServiceParameterRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceParameterRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="serviceParameter" type="{http://www.cisco.com/AXL/API/11.5}RServiceParameter"/&gt;
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
@XmlType(name = "GetServiceParameterRes", propOrder = {
    "_return"
})
public class GetServiceParameterRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetServiceParameterRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetServiceParameterRes.Return }
     *     
     */
    public GetServiceParameterRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServiceParameterRes.Return }
     *     
     */
    public void setReturn(GetServiceParameterRes.Return value) {
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
     *         &lt;element name="serviceParameter" type="{http://www.cisco.com/AXL/API/11.5}RServiceParameter"/&gt;
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
        "serviceParameter"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RServiceParameter serviceParameter;

        /**
         * Gets the value of the serviceParameter property.
         * 
         * @return
         *     possible object is
         *     {@link RServiceParameter }
         *     
         */
        public RServiceParameter getServiceParameter() {
            return serviceParameter;
        }

        /**
         * Sets the value of the serviceParameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link RServiceParameter }
         *     
         */
        public void setServiceParameter(RServiceParameter value) {
            this.serviceParameter = value;
        }

    }

}
