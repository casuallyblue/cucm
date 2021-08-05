
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPresenceRedundancyGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPresenceRedundancyGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="presenceRedundancyGroup" type="{http://www.cisco.com/AXL/API/11.5}RPresenceRedundancyGroup"/&gt;
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
@XmlType(name = "GetPresenceRedundancyGroupRes", propOrder = {
    "_return"
})
public class GetPresenceRedundancyGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPresenceRedundancyGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPresenceRedundancyGroupRes.Return }
     *     
     */
    public GetPresenceRedundancyGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPresenceRedundancyGroupRes.Return }
     *     
     */
    public void setReturn(GetPresenceRedundancyGroupRes.Return value) {
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
     *         &lt;element name="presenceRedundancyGroup" type="{http://www.cisco.com/AXL/API/11.5}RPresenceRedundancyGroup"/&gt;
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
        "presenceRedundancyGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPresenceRedundancyGroup presenceRedundancyGroup;

        /**
         * Gets the value of the presenceRedundancyGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RPresenceRedundancyGroup }
         *     
         */
        public RPresenceRedundancyGroup getPresenceRedundancyGroup() {
            return presenceRedundancyGroup;
        }

        /**
         * Sets the value of the presenceRedundancyGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPresenceRedundancyGroup }
         *     
         */
        public void setPresenceRedundancyGroup(RPresenceRedundancyGroup value) {
            this.presenceRedundancyGroup = value;
        }

    }

}
