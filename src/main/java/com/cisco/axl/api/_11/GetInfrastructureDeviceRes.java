
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInfrastructureDeviceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInfrastructureDeviceRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="infrastructureDevice" type="{http://www.cisco.com/AXL/API/11.5}RInfrastructureDevice"/&gt;
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
@XmlType(name = "GetInfrastructureDeviceRes", propOrder = {
    "_return"
})
public class GetInfrastructureDeviceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetInfrastructureDeviceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetInfrastructureDeviceRes.Return }
     *     
     */
    public GetInfrastructureDeviceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInfrastructureDeviceRes.Return }
     *     
     */
    public void setReturn(GetInfrastructureDeviceRes.Return value) {
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
     *         &lt;element name="infrastructureDevice" type="{http://www.cisco.com/AXL/API/11.5}RInfrastructureDevice"/&gt;
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
        "infrastructureDevice"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RInfrastructureDevice infrastructureDevice;

        /**
         * Gets the value of the infrastructureDevice property.
         * 
         * @return
         *     possible object is
         *     {@link RInfrastructureDevice }
         *     
         */
        public RInfrastructureDevice getInfrastructureDevice() {
            return infrastructureDevice;
        }

        /**
         * Sets the value of the infrastructureDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link RInfrastructureDevice }
         *     
         */
        public void setInfrastructureDevice(RInfrastructureDevice value) {
            this.infrastructureDevice = value;
        }

    }

}
