
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTimeScheduleRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTimeScheduleRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="timeSchedule" type="{http://www.cisco.com/AXL/API/11.5}RTimeSchedule"/&gt;
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
@XmlType(name = "GetTimeScheduleRes", propOrder = {
    "_return"
})
public class GetTimeScheduleRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTimeScheduleRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTimeScheduleRes.Return }
     *     
     */
    public GetTimeScheduleRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTimeScheduleRes.Return }
     *     
     */
    public void setReturn(GetTimeScheduleRes.Return value) {
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
     *         &lt;element name="timeSchedule" type="{http://www.cisco.com/AXL/API/11.5}RTimeSchedule"/&gt;
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
        "timeSchedule"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTimeSchedule timeSchedule;

        /**
         * Gets the value of the timeSchedule property.
         * 
         * @return
         *     possible object is
         *     {@link RTimeSchedule }
         *     
         */
        public RTimeSchedule getTimeSchedule() {
            return timeSchedule;
        }

        /**
         * Sets the value of the timeSchedule property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTimeSchedule }
         *     
         */
        public void setTimeSchedule(RTimeSchedule value) {
            this.timeSchedule = value;
        }

    }

}
