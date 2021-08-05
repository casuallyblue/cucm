
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRoutePartitionRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRoutePartitionRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/11.5}RRoutePartition"/&gt;
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
@XmlType(name = "GetRoutePartitionRes", propOrder = {
    "_return"
})
public class GetRoutePartitionRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRoutePartitionRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoutePartitionRes.Return }
     *     
     */
    public GetRoutePartitionRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoutePartitionRes.Return }
     *     
     */
    public void setReturn(GetRoutePartitionRes.Return value) {
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
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/11.5}RRoutePartition"/&gt;
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
        "routePartition"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRoutePartition routePartition;

        /**
         * Gets the value of the routePartition property.
         * 
         * @return
         *     possible object is
         *     {@link RRoutePartition }
         *     
         */
        public RRoutePartition getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRoutePartition }
         *     
         */
        public void setRoutePartition(RRoutePartition value) {
            this.routePartition = value;
        }

    }

}
