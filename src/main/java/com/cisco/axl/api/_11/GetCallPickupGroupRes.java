
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallPickupGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallPickupGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="callPickupGroup" type="{http://www.cisco.com/AXL/API/11.5}RCallPickupGroup"/&gt;
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
@XmlType(name = "GetCallPickupGroupRes", propOrder = {
    "_return"
})
public class GetCallPickupGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallPickupGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallPickupGroupRes.Return }
     *     
     */
    public GetCallPickupGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallPickupGroupRes.Return }
     *     
     */
    public void setReturn(GetCallPickupGroupRes.Return value) {
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
     *         &lt;element name="callPickupGroup" type="{http://www.cisco.com/AXL/API/11.5}RCallPickupGroup"/&gt;
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
        "callPickupGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallPickupGroup callPickupGroup;

        /**
         * Gets the value of the callPickupGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RCallPickupGroup }
         *     
         */
        public RCallPickupGroup getCallPickupGroup() {
            return callPickupGroup;
        }

        /**
         * Sets the value of the callPickupGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallPickupGroup }
         *     
         */
        public void setCallPickupGroup(RCallPickupGroup value) {
            this.callPickupGroup = value;
        }

    }

}
