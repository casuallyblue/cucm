
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCmcInfoRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCmcInfoRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cmcInfo" type="{http://www.cisco.com/AXL/API/11.5}RCmcInfo"/&gt;
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
@XmlType(name = "GetCmcInfoRes", propOrder = {
    "_return"
})
public class GetCmcInfoRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCmcInfoRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCmcInfoRes.Return }
     *     
     */
    public GetCmcInfoRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCmcInfoRes.Return }
     *     
     */
    public void setReturn(GetCmcInfoRes.Return value) {
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
     *         &lt;element name="cmcInfo" type="{http://www.cisco.com/AXL/API/11.5}RCmcInfo"/&gt;
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
        "cmcInfo"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCmcInfo cmcInfo;

        /**
         * Gets the value of the cmcInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RCmcInfo }
         *     
         */
        public RCmcInfo getCmcInfo() {
            return cmcInfo;
        }

        /**
         * Sets the value of the cmcInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCmcInfo }
         *     
         */
        public void setCmcInfo(RCmcInfo value) {
            this.cmcInfo = value;
        }

    }

}
