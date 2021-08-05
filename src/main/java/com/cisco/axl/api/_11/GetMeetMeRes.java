
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMeetMeRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMeetMeRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="meetMe" type="{http://www.cisco.com/AXL/API/11.5}RMeetMe"/&gt;
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
@XmlType(name = "GetMeetMeRes", propOrder = {
    "_return"
})
public class GetMeetMeRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMeetMeRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMeetMeRes.Return }
     *     
     */
    public GetMeetMeRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMeetMeRes.Return }
     *     
     */
    public void setReturn(GetMeetMeRes.Return value) {
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
     *         &lt;element name="meetMe" type="{http://www.cisco.com/AXL/API/11.5}RMeetMe"/&gt;
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
        "meetMe"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMeetMe meetMe;

        /**
         * Gets the value of the meetMe property.
         * 
         * @return
         *     possible object is
         *     {@link RMeetMe }
         *     
         */
        public RMeetMe getMeetMe() {
            return meetMe;
        }

        /**
         * Sets the value of the meetMe property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMeetMe }
         *     
         */
        public void setMeetMe(RMeetMe value) {
            this.meetMe = value;
        }

    }

}
