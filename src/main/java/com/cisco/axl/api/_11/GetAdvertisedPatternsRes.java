
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAdvertisedPatternsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAdvertisedPatternsRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/11.5}RAdvertisedPatterns"/&gt;
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
@XmlType(name = "GetAdvertisedPatternsRes", propOrder = {
    "_return"
})
public class GetAdvertisedPatternsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAdvertisedPatternsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAdvertisedPatternsRes.Return }
     *     
     */
    public GetAdvertisedPatternsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAdvertisedPatternsRes.Return }
     *     
     */
    public void setReturn(GetAdvertisedPatternsRes.Return value) {
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
     *         &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/11.5}RAdvertisedPatterns"/&gt;
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
        "advertisedPatterns"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAdvertisedPatterns advertisedPatterns;

        /**
         * Gets the value of the advertisedPatterns property.
         * 
         * @return
         *     possible object is
         *     {@link RAdvertisedPatterns }
         *     
         */
        public RAdvertisedPatterns getAdvertisedPatterns() {
            return advertisedPatterns;
        }

        /**
         * Sets the value of the advertisedPatterns property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAdvertisedPatterns }
         *     
         */
        public void setAdvertisedPatterns(RAdvertisedPatterns value) {
            this.advertisedPatterns = value;
        }

    }

}
