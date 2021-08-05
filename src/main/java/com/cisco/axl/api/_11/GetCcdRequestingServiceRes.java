
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCcdRequestingServiceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCcdRequestingServiceRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ccdRequestingService" type="{http://www.cisco.com/AXL/API/11.5}RCcdRequestingService"/&gt;
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
@XmlType(name = "GetCcdRequestingServiceRes", propOrder = {
    "_return"
})
public class GetCcdRequestingServiceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCcdRequestingServiceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCcdRequestingServiceRes.Return }
     *     
     */
    public GetCcdRequestingServiceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCcdRequestingServiceRes.Return }
     *     
     */
    public void setReturn(GetCcdRequestingServiceRes.Return value) {
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
     *         &lt;element name="ccdRequestingService" type="{http://www.cisco.com/AXL/API/11.5}RCcdRequestingService"/&gt;
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
        "ccdRequestingService"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCcdRequestingService ccdRequestingService;

        /**
         * Gets the value of the ccdRequestingService property.
         * 
         * @return
         *     possible object is
         *     {@link RCcdRequestingService }
         *     
         */
        public RCcdRequestingService getCcdRequestingService() {
            return ccdRequestingService;
        }

        /**
         * Sets the value of the ccdRequestingService property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCcdRequestingService }
         *     
         */
        public void setCcdRequestingService(RCcdRequestingService value) {
            this.ccdRequestingService = value;
        }

    }

}
