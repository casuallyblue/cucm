
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCtiRoutePointRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCtiRoutePointRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ctiRoutePoint" type="{http://www.cisco.com/AXL/API/11.5}RCtiRoutePoint"/&gt;
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
@XmlType(name = "GetCtiRoutePointRes", propOrder = {
    "_return"
})
public class GetCtiRoutePointRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCtiRoutePointRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCtiRoutePointRes.Return }
     *     
     */
    public GetCtiRoutePointRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCtiRoutePointRes.Return }
     *     
     */
    public void setReturn(GetCtiRoutePointRes.Return value) {
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
     *         &lt;element name="ctiRoutePoint" type="{http://www.cisco.com/AXL/API/11.5}RCtiRoutePoint"/&gt;
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
        "ctiRoutePoint"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCtiRoutePoint ctiRoutePoint;

        /**
         * Gets the value of the ctiRoutePoint property.
         * 
         * @return
         *     possible object is
         *     {@link RCtiRoutePoint }
         *     
         */
        public RCtiRoutePoint getCtiRoutePoint() {
            return ctiRoutePoint;
        }

        /**
         * Sets the value of the ctiRoutePoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCtiRoutePoint }
         *     
         */
        public void setCtiRoutePoint(RCtiRoutePoint value) {
            this.ctiRoutePoint = value;
        }

    }

}
