
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhoneNtpRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneNtpRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="phoneNtp" type="{http://www.cisco.com/AXL/API/11.5}RPhoneNtp"/&gt;
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
@XmlType(name = "GetPhoneNtpRes", propOrder = {
    "_return"
})
public class GetPhoneNtpRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPhoneNtpRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPhoneNtpRes.Return }
     *     
     */
    public GetPhoneNtpRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPhoneNtpRes.Return }
     *     
     */
    public void setReturn(GetPhoneNtpRes.Return value) {
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
     *         &lt;element name="phoneNtp" type="{http://www.cisco.com/AXL/API/11.5}RPhoneNtp"/&gt;
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
        "phoneNtp"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPhoneNtp phoneNtp;

        /**
         * Gets the value of the phoneNtp property.
         * 
         * @return
         *     possible object is
         *     {@link RPhoneNtp }
         *     
         */
        public RPhoneNtp getPhoneNtp() {
            return phoneNtp;
        }

        /**
         * Sets the value of the phoneNtp property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPhoneNtp }
         *     
         */
        public void setPhoneNtp(RPhoneNtp value) {
            this.phoneNtp = value;
        }

    }

}
