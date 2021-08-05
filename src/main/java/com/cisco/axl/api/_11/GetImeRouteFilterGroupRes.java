
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeRouteFilterGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeRouteFilterGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeRouteFilterGroup" type="{http://www.cisco.com/AXL/API/11.5}RImeRouteFilterGroup"/&gt;
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
@XmlType(name = "GetImeRouteFilterGroupRes", propOrder = {
    "_return"
})
public class GetImeRouteFilterGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeRouteFilterGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeRouteFilterGroupRes.Return }
     *     
     */
    public GetImeRouteFilterGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeRouteFilterGroupRes.Return }
     *     
     */
    public void setReturn(GetImeRouteFilterGroupRes.Return value) {
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
     *         &lt;element name="imeRouteFilterGroup" type="{http://www.cisco.com/AXL/API/11.5}RImeRouteFilterGroup"/&gt;
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
        "imeRouteFilterGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeRouteFilterGroup imeRouteFilterGroup;

        /**
         * Gets the value of the imeRouteFilterGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RImeRouteFilterGroup }
         *     
         */
        public RImeRouteFilterGroup getImeRouteFilterGroup() {
            return imeRouteFilterGroup;
        }

        /**
         * Sets the value of the imeRouteFilterGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeRouteFilterGroup }
         *     
         */
        public void setImeRouteFilterGroup(RImeRouteFilterGroup value) {
            this.imeRouteFilterGroup = value;
        }

    }

}
