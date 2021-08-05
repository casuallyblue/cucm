
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRemoteDestinationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRemoteDestinationRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="remoteDestination" type="{http://www.cisco.com/AXL/API/11.5}RRemoteDestination"/&gt;
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
@XmlType(name = "GetRemoteDestinationRes", propOrder = {
    "_return"
})
public class GetRemoteDestinationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRemoteDestinationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRemoteDestinationRes.Return }
     *     
     */
    public GetRemoteDestinationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRemoteDestinationRes.Return }
     *     
     */
    public void setReturn(GetRemoteDestinationRes.Return value) {
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
     *         &lt;element name="remoteDestination" type="{http://www.cisco.com/AXL/API/11.5}RRemoteDestination"/&gt;
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
        "remoteDestination"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRemoteDestination remoteDestination;

        /**
         * Gets the value of the remoteDestination property.
         * 
         * @return
         *     possible object is
         *     {@link RRemoteDestination }
         *     
         */
        public RRemoteDestination getRemoteDestination() {
            return remoteDestination;
        }

        /**
         * Sets the value of the remoteDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRemoteDestination }
         *     
         */
        public void setRemoteDestination(RRemoteDestination value) {
            this.remoteDestination = value;
        }

    }

}
