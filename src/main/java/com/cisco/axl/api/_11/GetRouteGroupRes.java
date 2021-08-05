
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRouteGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRouteGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="routeGroup" type="{http://www.cisco.com/AXL/API/11.5}RRouteGroup"/&gt;
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
@XmlType(name = "GetRouteGroupRes", propOrder = {
    "_return"
})
public class GetRouteGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRouteGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRouteGroupRes.Return }
     *     
     */
    public GetRouteGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRouteGroupRes.Return }
     *     
     */
    public void setReturn(GetRouteGroupRes.Return value) {
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
     *         &lt;element name="routeGroup" type="{http://www.cisco.com/AXL/API/11.5}RRouteGroup"/&gt;
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
        "routeGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRouteGroup routeGroup;

        /**
         * Gets the value of the routeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RRouteGroup }
         *     
         */
        public RRouteGroup getRouteGroup() {
            return routeGroup;
        }

        /**
         * Sets the value of the routeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRouteGroup }
         *     
         */
        public void setRouteGroup(RRouteGroup value) {
            this.routeGroup = value;
        }

    }

}
