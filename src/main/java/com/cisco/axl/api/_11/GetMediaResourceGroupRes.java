
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMediaResourceGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMediaResourceGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mediaResourceGroup" type="{http://www.cisco.com/AXL/API/11.5}RMediaResourceGroup"/&gt;
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
@XmlType(name = "GetMediaResourceGroupRes", propOrder = {
    "_return"
})
public class GetMediaResourceGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetMediaResourceGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetMediaResourceGroupRes.Return }
     *     
     */
    public GetMediaResourceGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMediaResourceGroupRes.Return }
     *     
     */
    public void setReturn(GetMediaResourceGroupRes.Return value) {
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
     *         &lt;element name="mediaResourceGroup" type="{http://www.cisco.com/AXL/API/11.5}RMediaResourceGroup"/&gt;
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
        "mediaResourceGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RMediaResourceGroup mediaResourceGroup;

        /**
         * Gets the value of the mediaResourceGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RMediaResourceGroup }
         *     
         */
        public RMediaResourceGroup getMediaResourceGroup() {
            return mediaResourceGroup;
        }

        /**
         * Sets the value of the mediaResourceGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RMediaResourceGroup }
         *     
         */
        public void setMediaResourceGroup(RMediaResourceGroup value) {
            this.mediaResourceGroup = value;
        }

    }

}
