
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDhcpSubnetRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDhcpSubnetRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dhcpSubnet" type="{http://www.cisco.com/AXL/API/11.5}RDhcpSubnet"/&gt;
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
@XmlType(name = "GetDhcpSubnetRes", propOrder = {
    "_return"
})
public class GetDhcpSubnetRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDhcpSubnetRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDhcpSubnetRes.Return }
     *     
     */
    public GetDhcpSubnetRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDhcpSubnetRes.Return }
     *     
     */
    public void setReturn(GetDhcpSubnetRes.Return value) {
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
     *         &lt;element name="dhcpSubnet" type="{http://www.cisco.com/AXL/API/11.5}RDhcpSubnet"/&gt;
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
        "dhcpSubnet"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDhcpSubnet dhcpSubnet;

        /**
         * Gets the value of the dhcpSubnet property.
         * 
         * @return
         *     possible object is
         *     {@link RDhcpSubnet }
         *     
         */
        public RDhcpSubnet getDhcpSubnet() {
            return dhcpSubnet;
        }

        /**
         * Sets the value of the dhcpSubnet property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDhcpSubnet }
         *     
         */
        public void setDhcpSubnet(RDhcpSubnet value) {
            this.dhcpSubnet = value;
        }

    }

}
