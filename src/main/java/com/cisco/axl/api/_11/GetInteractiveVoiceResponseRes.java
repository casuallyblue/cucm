
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInteractiveVoiceResponseRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInteractiveVoiceResponseRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="interactiveVoiceResponse" type="{http://www.cisco.com/AXL/API/11.5}RInteractiveVoiceResponse"/&gt;
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
@XmlType(name = "GetInteractiveVoiceResponseRes", propOrder = {
    "_return"
})
public class GetInteractiveVoiceResponseRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetInteractiveVoiceResponseRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetInteractiveVoiceResponseRes.Return }
     *     
     */
    public GetInteractiveVoiceResponseRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInteractiveVoiceResponseRes.Return }
     *     
     */
    public void setReturn(GetInteractiveVoiceResponseRes.Return value) {
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
     *         &lt;element name="interactiveVoiceResponse" type="{http://www.cisco.com/AXL/API/11.5}RInteractiveVoiceResponse"/&gt;
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
        "interactiveVoiceResponse"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RInteractiveVoiceResponse interactiveVoiceResponse;

        /**
         * Gets the value of the interactiveVoiceResponse property.
         * 
         * @return
         *     possible object is
         *     {@link RInteractiveVoiceResponse }
         *     
         */
        public RInteractiveVoiceResponse getInteractiveVoiceResponse() {
            return interactiveVoiceResponse;
        }

        /**
         * Sets the value of the interactiveVoiceResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link RInteractiveVoiceResponse }
         *     
         */
        public void setInteractiveVoiceResponse(RInteractiveVoiceResponse value) {
            this.interactiveVoiceResponse = value;
        }

    }

}
