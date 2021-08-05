
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMohAudioSourceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMohAudioSourceRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mohAudioSource" type="{http://www.cisco.com/AXL/API/11.5}RMohAudioSource"/&gt;
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
@XmlType(name = "GetMohAudioSourceRes", propOrder = {
    "_return"
})
public class GetMohAudioSourceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMohAudioSourceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMohAudioSourceRes.Return }
     *     
     */
    public GetMohAudioSourceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMohAudioSourceRes.Return }
     *     
     */
    public void setReturn(GetMohAudioSourceRes.Return value) {
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
     *         &lt;element name="mohAudioSource" type="{http://www.cisco.com/AXL/API/11.5}RMohAudioSource"/&gt;
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
        "mohAudioSource"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMohAudioSource mohAudioSource;

        /**
         * Gets the value of the mohAudioSource property.
         * 
         * @return
         *     possible object is
         *     {@link RMohAudioSource }
         *     
         */
        public RMohAudioSource getMohAudioSource() {
            return mohAudioSource;
        }

        /**
         * Sets the value of the mohAudioSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMohAudioSource }
         *     
         */
        public void setMohAudioSource(RMohAudioSource value) {
            this.mohAudioSource = value;
        }

    }

}
