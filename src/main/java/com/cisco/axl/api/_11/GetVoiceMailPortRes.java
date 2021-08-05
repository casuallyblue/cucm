
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVoiceMailPortRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVoiceMailPortRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="voiceMailPort" type="{http://www.cisco.com/AXL/API/11.5}RVoiceMailPort"/&gt;
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
@XmlType(name = "GetVoiceMailPortRes", propOrder = {
    "_return"
})
public class GetVoiceMailPortRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVoiceMailPortRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVoiceMailPortRes.Return }
     *     
     */
    public GetVoiceMailPortRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVoiceMailPortRes.Return }
     *     
     */
    public void setReturn(GetVoiceMailPortRes.Return value) {
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
     *         &lt;element name="voiceMailPort" type="{http://www.cisco.com/AXL/API/11.5}RVoiceMailPort"/&gt;
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
        "voiceMailPort"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVoiceMailPort voiceMailPort;

        /**
         * Gets the value of the voiceMailPort property.
         * 
         * @return
         *     possible object is
         *     {@link RVoiceMailPort }
         *     
         */
        public RVoiceMailPort getVoiceMailPort() {
            return voiceMailPort;
        }

        /**
         * Sets the value of the voiceMailPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVoiceMailPort }
         *     
         */
        public void setVoiceMailPort(RVoiceMailPort value) {
            this.voiceMailPort = value;
        }

    }

}
