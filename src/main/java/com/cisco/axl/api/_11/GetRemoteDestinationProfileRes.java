
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRemoteDestinationProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRemoteDestinationProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="remoteDestinationProfile" type="{http://www.cisco.com/AXL/API/11.5}RRemoteDestinationProfile"/&gt;
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
@XmlType(name = "GetRemoteDestinationProfileRes", propOrder = {
    "_return"
})
public class GetRemoteDestinationProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRemoteDestinationProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRemoteDestinationProfileRes.Return }
     *     
     */
    public GetRemoteDestinationProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRemoteDestinationProfileRes.Return }
     *     
     */
    public void setReturn(GetRemoteDestinationProfileRes.Return value) {
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
     *         &lt;element name="remoteDestinationProfile" type="{http://www.cisco.com/AXL/API/11.5}RRemoteDestinationProfile"/&gt;
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
        "remoteDestinationProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRemoteDestinationProfile remoteDestinationProfile;

        /**
         * Gets the value of the remoteDestinationProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RRemoteDestinationProfile }
         *     
         */
        public RRemoteDestinationProfile getRemoteDestinationProfile() {
            return remoteDestinationProfile;
        }

        /**
         * Sets the value of the remoteDestinationProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRemoteDestinationProfile }
         *     
         */
        public void setRemoteDestinationProfile(RRemoteDestinationProfile value) {
            this.remoteDestinationProfile = value;
        }

    }

}
