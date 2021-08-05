
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCcdHostedDNRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCcdHostedDNRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ccdHostedDN" type="{http://www.cisco.com/AXL/API/11.5}RCcdHostedDN"/&gt;
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
@XmlType(name = "GetCcdHostedDNRes", propOrder = {
    "_return"
})
public class GetCcdHostedDNRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCcdHostedDNRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCcdHostedDNRes.Return }
     *     
     */
    public GetCcdHostedDNRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCcdHostedDNRes.Return }
     *     
     */
    public void setReturn(GetCcdHostedDNRes.Return value) {
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
     *         &lt;element name="ccdHostedDN" type="{http://www.cisco.com/AXL/API/11.5}RCcdHostedDN"/&gt;
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
        "ccdHostedDN"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCcdHostedDN ccdHostedDN;

        /**
         * Gets the value of the ccdHostedDN property.
         * 
         * @return
         *     possible object is
         *     {@link RCcdHostedDN }
         *     
         */
        public RCcdHostedDN getCcdHostedDN() {
            return ccdHostedDN;
        }

        /**
         * Sets the value of the ccdHostedDN property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCcdHostedDN }
         *     
         */
        public void setCcdHostedDN(RCcdHostedDN value) {
            this.ccdHostedDN = value;
        }

    }

}
