
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConferenceNowRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConferenceNowRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="conferenceNow" type="{http://www.cisco.com/AXL/API/11.5}RConferenceNow"/&gt;
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
@XmlType(name = "GetConferenceNowRes", propOrder = {
    "_return"
})
public class GetConferenceNowRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetConferenceNowRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetConferenceNowRes.Return }
     *     
     */
    public GetConferenceNowRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetConferenceNowRes.Return }
     *     
     */
    public void setReturn(GetConferenceNowRes.Return value) {
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
     *         &lt;element name="conferenceNow" type="{http://www.cisco.com/AXL/API/11.5}RConferenceNow"/&gt;
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
        "conferenceNow"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RConferenceNow conferenceNow;

        /**
         * Gets the value of the conferenceNow property.
         * 
         * @return
         *     possible object is
         *     {@link RConferenceNow }
         *     
         */
        public RConferenceNow getConferenceNow() {
            return conferenceNow;
        }

        /**
         * Sets the value of the conferenceNow property.
         * 
         * @param value
         *     allowed object is
         *     {@link RConferenceNow }
         *     
         */
        public void setConferenceNow(RConferenceNow value) {
            this.conferenceNow = value;
        }

    }

}
