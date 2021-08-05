
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDefaultDeviceProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDefaultDeviceProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="defaultDeviceProfile" type="{http://www.cisco.com/AXL/API/11.5}RDefaultDeviceProfile"/&gt;
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
@XmlType(name = "GetDefaultDeviceProfileRes", propOrder = {
    "_return"
})
public class GetDefaultDeviceProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDefaultDeviceProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDefaultDeviceProfileRes.Return }
     *     
     */
    public GetDefaultDeviceProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDefaultDeviceProfileRes.Return }
     *     
     */
    public void setReturn(GetDefaultDeviceProfileRes.Return value) {
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
     *         &lt;element name="defaultDeviceProfile" type="{http://www.cisco.com/AXL/API/11.5}RDefaultDeviceProfile"/&gt;
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
        "defaultDeviceProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDefaultDeviceProfile defaultDeviceProfile;

        /**
         * Gets the value of the defaultDeviceProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RDefaultDeviceProfile }
         *     
         */
        public RDefaultDeviceProfile getDefaultDeviceProfile() {
            return defaultDeviceProfile;
        }

        /**
         * Sets the value of the defaultDeviceProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDefaultDeviceProfile }
         *     
         */
        public void setDefaultDeviceProfile(RDefaultDeviceProfile value) {
            this.defaultDeviceProfile = value;
        }

    }

}
