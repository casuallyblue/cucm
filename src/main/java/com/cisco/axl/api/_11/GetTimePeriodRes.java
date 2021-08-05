
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTimePeriodRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTimePeriodRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="timePeriod" type="{http://www.cisco.com/AXL/API/11.5}RTimePeriod"/&gt;
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
@XmlType(name = "GetTimePeriodRes", propOrder = {
    "_return"
})
public class GetTimePeriodRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTimePeriodRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTimePeriodRes.Return }
     *     
     */
    public GetTimePeriodRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTimePeriodRes.Return }
     *     
     */
    public void setReturn(GetTimePeriodRes.Return value) {
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
     *         &lt;element name="timePeriod" type="{http://www.cisco.com/AXL/API/11.5}RTimePeriod"/&gt;
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
        "timePeriod"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTimePeriod timePeriod;

        /**
         * Gets the value of the timePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link RTimePeriod }
         *     
         */
        public RTimePeriod getTimePeriod() {
            return timePeriod;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTimePeriod }
         *     
         */
        public void setTimePeriod(RTimePeriod value) {
            this.timePeriod = value;
        }

    }

}
