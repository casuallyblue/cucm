
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeExclusionNumberRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeExclusionNumberRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeExclusionNumber" type="{http://www.cisco.com/AXL/API/11.5}RImeExclusionNumber"/&gt;
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
@XmlType(name = "GetImeExclusionNumberRes", propOrder = {
    "_return"
})
public class GetImeExclusionNumberRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeExclusionNumberRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeExclusionNumberRes.Return }
     *     
     */
    public GetImeExclusionNumberRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeExclusionNumberRes.Return }
     *     
     */
    public void setReturn(GetImeExclusionNumberRes.Return value) {
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
     *         &lt;element name="imeExclusionNumber" type="{http://www.cisco.com/AXL/API/11.5}RImeExclusionNumber"/&gt;
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
        "imeExclusionNumber"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeExclusionNumber imeExclusionNumber;

        /**
         * Gets the value of the imeExclusionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link RImeExclusionNumber }
         *     
         */
        public RImeExclusionNumber getImeExclusionNumber() {
            return imeExclusionNumber;
        }

        /**
         * Sets the value of the imeExclusionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeExclusionNumber }
         *     
         */
        public void setImeExclusionNumber(RImeExclusionNumber value) {
            this.imeExclusionNumber = value;
        }

    }

}
