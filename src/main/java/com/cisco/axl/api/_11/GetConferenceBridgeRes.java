
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConferenceBridgeRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConferenceBridgeRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="conferenceBridge" type="{http://www.cisco.com/AXL/API/11.5}RConferenceBridge"/&gt;
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
@XmlType(name = "GetConferenceBridgeRes", propOrder = {
    "_return"
})
public class GetConferenceBridgeRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetConferenceBridgeRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetConferenceBridgeRes.Return }
     *     
     */
    public GetConferenceBridgeRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetConferenceBridgeRes.Return }
     *     
     */
    public void setReturn(GetConferenceBridgeRes.Return value) {
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
     *         &lt;element name="conferenceBridge" type="{http://www.cisco.com/AXL/API/11.5}RConferenceBridge"/&gt;
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
        "conferenceBridge"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RConferenceBridge conferenceBridge;

        /**
         * Gets the value of the conferenceBridge property.
         * 
         * @return
         *     possible object is
         *     {@link RConferenceBridge }
         *     
         */
        public RConferenceBridge getConferenceBridge() {
            return conferenceBridge;
        }

        /**
         * Sets the value of the conferenceBridge property.
         * 
         * @param value
         *     allowed object is
         *     {@link RConferenceBridge }
         *     
         */
        public void setConferenceBridge(RConferenceBridge value) {
            this.conferenceBridge = value;
        }

    }

}
