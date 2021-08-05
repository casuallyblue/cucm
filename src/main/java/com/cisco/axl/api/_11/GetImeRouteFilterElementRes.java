
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeRouteFilterElementRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeRouteFilterElementRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeRouteFilterElement" type="{http://www.cisco.com/AXL/API/11.5}RImeRouteFilterElement"/&gt;
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
@XmlType(name = "GetImeRouteFilterElementRes", propOrder = {
    "_return"
})
public class GetImeRouteFilterElementRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeRouteFilterElementRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeRouteFilterElementRes.Return }
     *     
     */
    public GetImeRouteFilterElementRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeRouteFilterElementRes.Return }
     *     
     */
    public void setReturn(GetImeRouteFilterElementRes.Return value) {
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
     *         &lt;element name="imeRouteFilterElement" type="{http://www.cisco.com/AXL/API/11.5}RImeRouteFilterElement"/&gt;
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
        "imeRouteFilterElement"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeRouteFilterElement imeRouteFilterElement;

        /**
         * Gets the value of the imeRouteFilterElement property.
         * 
         * @return
         *     possible object is
         *     {@link RImeRouteFilterElement }
         *     
         */
        public RImeRouteFilterElement getImeRouteFilterElement() {
            return imeRouteFilterElement;
        }

        /**
         * Sets the value of the imeRouteFilterElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeRouteFilterElement }
         *     
         */
        public void setImeRouteFilterElement(RImeRouteFilterElement value) {
            this.imeRouteFilterElement = value;
        }

    }

}
