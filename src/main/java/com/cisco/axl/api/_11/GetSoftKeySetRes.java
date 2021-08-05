
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSoftKeySetRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSoftKeySetRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="softKeySet" type="{http://www.cisco.com/AXL/API/11.5}RSoftKeySet"/&gt;
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
@XmlType(name = "GetSoftKeySetRes", propOrder = {
    "_return"
})
public class GetSoftKeySetRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSoftKeySetRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSoftKeySetRes.Return }
     *     
     */
    public GetSoftKeySetRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSoftKeySetRes.Return }
     *     
     */
    public void setReturn(GetSoftKeySetRes.Return value) {
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
     *         &lt;element name="softKeySet" type="{http://www.cisco.com/AXL/API/11.5}RSoftKeySet"/&gt;
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
        "softKeySet"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSoftKeySet softKeySet;

        /**
         * Gets the value of the softKeySet property.
         * 
         * @return
         *     possible object is
         *     {@link RSoftKeySet }
         *     
         */
        public RSoftKeySet getSoftKeySet() {
            return softKeySet;
        }

        /**
         * Sets the value of the softKeySet property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSoftKeySet }
         *     
         */
        public void setSoftKeySet(RSoftKeySet value) {
            this.softKeySet = value;
        }

    }

}
