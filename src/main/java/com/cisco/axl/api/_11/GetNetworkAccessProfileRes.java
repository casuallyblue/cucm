
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNetworkAccessProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNetworkAccessProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="networkAccessProfile" type="{http://www.cisco.com/AXL/API/11.5}RNetworkAccessProfile"/&gt;
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
@XmlType(name = "GetNetworkAccessProfileRes", propOrder = {
    "_return"
})
public class GetNetworkAccessProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetNetworkAccessProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetNetworkAccessProfileRes.Return }
     *     
     */
    public GetNetworkAccessProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNetworkAccessProfileRes.Return }
     *     
     */
    public void setReturn(GetNetworkAccessProfileRes.Return value) {
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
     *         &lt;element name="networkAccessProfile" type="{http://www.cisco.com/AXL/API/11.5}RNetworkAccessProfile"/&gt;
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
        "networkAccessProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RNetworkAccessProfile networkAccessProfile;

        /**
         * Gets the value of the networkAccessProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RNetworkAccessProfile }
         *     
         */
        public RNetworkAccessProfile getNetworkAccessProfile() {
            return networkAccessProfile;
        }

        /**
         * Sets the value of the networkAccessProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RNetworkAccessProfile }
         *     
         */
        public void setNetworkAccessProfile(RNetworkAccessProfile value) {
            this.networkAccessProfile = value;
        }

    }

}
