
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHttpProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHttpProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="httpProfile" type="{http://www.cisco.com/AXL/API/11.5}RHttpProfile"/&gt;
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
@XmlType(name = "GetHttpProfileRes", propOrder = {
    "_return"
})
public class GetHttpProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetHttpProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetHttpProfileRes.Return }
     *     
     */
    public GetHttpProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHttpProfileRes.Return }
     *     
     */
    public void setReturn(GetHttpProfileRes.Return value) {
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
     *         &lt;element name="httpProfile" type="{http://www.cisco.com/AXL/API/11.5}RHttpProfile"/&gt;
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
        "httpProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RHttpProfile httpProfile;

        /**
         * Gets the value of the httpProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RHttpProfile }
         *     
         */
        public RHttpProfile getHttpProfile() {
            return httpProfile;
        }

        /**
         * Sets the value of the httpProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RHttpProfile }
         *     
         */
        public void setHttpProfile(RHttpProfile value) {
            this.httpProfile = value;
        }

    }

}
