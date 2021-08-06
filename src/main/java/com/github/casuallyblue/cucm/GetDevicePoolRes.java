
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDevicePoolRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDevicePoolRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="devicePool" type="{http://www.cisco.com/AXL/API/11.5}RDevicePool"/&gt;
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
@XmlType(name = "GetDevicePoolRes", propOrder = {
    "_return"
})
public class GetDevicePoolRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDevicePoolRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDevicePoolRes.Return }
     *     
     */
    public GetDevicePoolRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDevicePoolRes.Return }
     *     
     */
    public void setReturn(GetDevicePoolRes.Return value) {
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
     *         &lt;element name="devicePool" type="{http://www.cisco.com/AXL/API/11.5}RDevicePool"/&gt;
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
        "devicePool"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDevicePool devicePool;

        /**
         * Gets the value of the devicePool property.
         * 
         * @return
         *     possible object is
         *     {@link RDevicePool }
         *     
         */
        public RDevicePool getDevicePool() {
            return devicePool;
        }

        /**
         * Sets the value of the devicePool property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDevicePool }
         *     
         */
        public void setDevicePool(RDevicePool value) {
            this.devicePool = value;
        }

    }

}