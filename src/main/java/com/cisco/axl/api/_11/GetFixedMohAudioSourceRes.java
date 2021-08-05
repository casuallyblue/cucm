
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFixedMohAudioSourceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFixedMohAudioSourceRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fixedMohAudioSource" type="{http://www.cisco.com/AXL/API/11.5}RFixedMohAudioSource"/&gt;
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
@XmlType(name = "GetFixedMohAudioSourceRes", propOrder = {
    "_return"
})
public class GetFixedMohAudioSourceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetFixedMohAudioSourceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetFixedMohAudioSourceRes.Return }
     *     
     */
    public GetFixedMohAudioSourceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFixedMohAudioSourceRes.Return }
     *     
     */
    public void setReturn(GetFixedMohAudioSourceRes.Return value) {
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
     *         &lt;element name="fixedMohAudioSource" type="{http://www.cisco.com/AXL/API/11.5}RFixedMohAudioSource"/&gt;
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
        "fixedMohAudioSource"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RFixedMohAudioSource fixedMohAudioSource;

        /**
         * Gets the value of the fixedMohAudioSource property.
         * 
         * @return
         *     possible object is
         *     {@link RFixedMohAudioSource }
         *     
         */
        public RFixedMohAudioSource getFixedMohAudioSource() {
            return fixedMohAudioSource;
        }

        /**
         * Sets the value of the fixedMohAudioSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link RFixedMohAudioSource }
         *     
         */
        public void setFixedMohAudioSource(RFixedMohAudioSource value) {
            this.fixedMohAudioSource = value;
        }

    }

}
