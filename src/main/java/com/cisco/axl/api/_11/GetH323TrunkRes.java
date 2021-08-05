
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetH323TrunkRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetH323TrunkRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="h323Trunk" type="{http://www.cisco.com/AXL/API/11.5}RH323Trunk"/&gt;
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
@XmlType(name = "GetH323TrunkRes", propOrder = {
    "_return"
})
public class GetH323TrunkRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetH323TrunkRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetH323TrunkRes.Return }
     *     
     */
    public GetH323TrunkRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetH323TrunkRes.Return }
     *     
     */
    public void setReturn(GetH323TrunkRes.Return value) {
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
     *         &lt;element name="h323Trunk" type="{http://www.cisco.com/AXL/API/11.5}RH323Trunk"/&gt;
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
        "h323Trunk"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RH323Trunk h323Trunk;

        /**
         * Gets the value of the h323Trunk property.
         * 
         * @return
         *     possible object is
         *     {@link RH323Trunk }
         *     
         */
        public RH323Trunk getH323Trunk() {
            return h323Trunk;
        }

        /**
         * Sets the value of the h323Trunk property.
         * 
         * @param value
         *     allowed object is
         *     {@link RH323Trunk }
         *     
         */
        public void setH323Trunk(RH323Trunk value) {
            this.h323Trunk = value;
        }

    }

}
