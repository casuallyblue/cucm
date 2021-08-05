
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSdpTransparencyProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSdpTransparencyProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sdpTransparencyProfile" type="{http://www.cisco.com/AXL/API/11.5}RSdpTransparencyProfile"/&gt;
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
@XmlType(name = "GetSdpTransparencyProfileRes", propOrder = {
    "_return"
})
public class GetSdpTransparencyProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSdpTransparencyProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSdpTransparencyProfileRes.Return }
     *     
     */
    public GetSdpTransparencyProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSdpTransparencyProfileRes.Return }
     *     
     */
    public void setReturn(GetSdpTransparencyProfileRes.Return value) {
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
     *         &lt;element name="sdpTransparencyProfile" type="{http://www.cisco.com/AXL/API/11.5}RSdpTransparencyProfile"/&gt;
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
        "sdpTransparencyProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSdpTransparencyProfile sdpTransparencyProfile;

        /**
         * Gets the value of the sdpTransparencyProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RSdpTransparencyProfile }
         *     
         */
        public RSdpTransparencyProfile getSdpTransparencyProfile() {
            return sdpTransparencyProfile;
        }

        /**
         * Sets the value of the sdpTransparencyProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSdpTransparencyProfile }
         *     
         */
        public void setSdpTransparencyProfile(RSdpTransparencyProfile value) {
            this.sdpTransparencyProfile = value;
        }

    }

}
