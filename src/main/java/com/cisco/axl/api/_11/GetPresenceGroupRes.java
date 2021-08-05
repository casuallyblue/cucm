
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPresenceGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPresenceGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="presenceGroup" type="{http://www.cisco.com/AXL/API/11.5}RPresenceGroup"/&gt;
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
@XmlType(name = "GetPresenceGroupRes", propOrder = {
    "_return"
})
public class GetPresenceGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPresenceGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPresenceGroupRes.Return }
     *     
     */
    public GetPresenceGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPresenceGroupRes.Return }
     *     
     */
    public void setReturn(GetPresenceGroupRes.Return value) {
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
     *         &lt;element name="presenceGroup" type="{http://www.cisco.com/AXL/API/11.5}RPresenceGroup"/&gt;
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
        "presenceGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPresenceGroup presenceGroup;

        /**
         * Gets the value of the presenceGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RPresenceGroup }
         *     
         */
        public RPresenceGroup getPresenceGroup() {
            return presenceGroup;
        }

        /**
         * Sets the value of the presenceGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPresenceGroup }
         *     
         */
        public void setPresenceGroup(RPresenceGroup value) {
            this.presenceGroup = value;
        }

    }

}
