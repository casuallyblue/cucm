
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDirectedCallParkRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDirectedCallParkRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="directedCallPark" type="{http://www.cisco.com/AXL/API/11.5}RDirectedCallPark"/&gt;
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
@XmlType(name = "GetDirectedCallParkRes", propOrder = {
    "_return"
})
public class GetDirectedCallParkRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDirectedCallParkRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDirectedCallParkRes.Return }
     *     
     */
    public GetDirectedCallParkRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDirectedCallParkRes.Return }
     *     
     */
    public void setReturn(GetDirectedCallParkRes.Return value) {
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
     *         &lt;element name="directedCallPark" type="{http://www.cisco.com/AXL/API/11.5}RDirectedCallPark"/&gt;
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
        "directedCallPark"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDirectedCallPark directedCallPark;

        /**
         * Gets the value of the directedCallPark property.
         * 
         * @return
         *     possible object is
         *     {@link RDirectedCallPark }
         *     
         */
        public RDirectedCallPark getDirectedCallPark() {
            return directedCallPark;
        }

        /**
         * Sets the value of the directedCallPark property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDirectedCallPark }
         *     
         */
        public void setDirectedCallPark(RDirectedCallPark value) {
            this.directedCallPark = value;
        }

    }

}
