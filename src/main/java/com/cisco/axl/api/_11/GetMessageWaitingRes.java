
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMessageWaitingRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMessageWaitingRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="messageWaiting" type="{http://www.cisco.com/AXL/API/11.5}RMessageWaiting"/&gt;
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
@XmlType(name = "GetMessageWaitingRes", propOrder = {
    "_return"
})
public class GetMessageWaitingRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMessageWaitingRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMessageWaitingRes.Return }
     *     
     */
    public GetMessageWaitingRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMessageWaitingRes.Return }
     *     
     */
    public void setReturn(GetMessageWaitingRes.Return value) {
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
     *         &lt;element name="messageWaiting" type="{http://www.cisco.com/AXL/API/11.5}RMessageWaiting"/&gt;
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
        "messageWaiting"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMessageWaiting messageWaiting;

        /**
         * Gets the value of the messageWaiting property.
         * 
         * @return
         *     possible object is
         *     {@link RMessageWaiting }
         *     
         */
        public RMessageWaiting getMessageWaiting() {
            return messageWaiting;
        }

        /**
         * Sets the value of the messageWaiting property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMessageWaiting }
         *     
         */
        public void setMessageWaiting(RMessageWaiting value) {
            this.messageWaiting = value;
        }

    }

}
