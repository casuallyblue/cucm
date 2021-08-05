
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVoiceMailProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVoiceMailProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="voiceMailProfile" type="{http://www.cisco.com/AXL/API/11.5}RVoiceMailProfile"/&gt;
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
@XmlType(name = "GetVoiceMailProfileRes", propOrder = {
    "_return"
})
public class GetVoiceMailProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVoiceMailProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVoiceMailProfileRes.Return }
     *     
     */
    public GetVoiceMailProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVoiceMailProfileRes.Return }
     *     
     */
    public void setReturn(GetVoiceMailProfileRes.Return value) {
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
     *         &lt;element name="voiceMailProfile" type="{http://www.cisco.com/AXL/API/11.5}RVoiceMailProfile"/&gt;
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
        "voiceMailProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVoiceMailProfile voiceMailProfile;

        /**
         * Gets the value of the voiceMailProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RVoiceMailProfile }
         *     
         */
        public RVoiceMailProfile getVoiceMailProfile() {
            return voiceMailProfile;
        }

        /**
         * Sets the value of the voiceMailProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVoiceMailProfile }
         *     
         */
        public void setVoiceMailProfile(RVoiceMailProfile value) {
            this.voiceMailProfile = value;
        }

    }

}
