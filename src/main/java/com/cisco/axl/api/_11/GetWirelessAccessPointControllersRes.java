
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWirelessAccessPointControllersRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWirelessAccessPointControllersRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="wirelessAccessPointControllers" type="{http://www.cisco.com/AXL/API/11.5}RWirelessAccessPointControllers"/&gt;
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
@XmlType(name = "GetWirelessAccessPointControllersRes", propOrder = {
    "_return"
})
public class GetWirelessAccessPointControllersRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetWirelessAccessPointControllersRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetWirelessAccessPointControllersRes.Return }
     *     
     */
    public GetWirelessAccessPointControllersRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWirelessAccessPointControllersRes.Return }
     *     
     */
    public void setReturn(GetWirelessAccessPointControllersRes.Return value) {
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
     *         &lt;element name="wirelessAccessPointControllers" type="{http://www.cisco.com/AXL/API/11.5}RWirelessAccessPointControllers"/&gt;
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
        "wirelessAccessPointControllers"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RWirelessAccessPointControllers wirelessAccessPointControllers;

        /**
         * Gets the value of the wirelessAccessPointControllers property.
         * 
         * @return
         *     possible object is
         *     {@link RWirelessAccessPointControllers }
         *     
         */
        public RWirelessAccessPointControllers getWirelessAccessPointControllers() {
            return wirelessAccessPointControllers;
        }

        /**
         * Sets the value of the wirelessAccessPointControllers property.
         * 
         * @param value
         *     allowed object is
         *     {@link RWirelessAccessPointControllers }
         *     
         */
        public void setWirelessAccessPointControllers(RWirelessAccessPointControllers value) {
            this.wirelessAccessPointControllers = value;
        }

    }

}
