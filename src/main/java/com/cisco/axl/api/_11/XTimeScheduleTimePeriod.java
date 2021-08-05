
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XTimeScheduleTimePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XTimeScheduleTimePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="timePeriodName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XTimeScheduleTimePeriod", propOrder = {
    "timePeriodName"
})
public class XTimeScheduleTimePeriod {

    protected XFkType timePeriodName;

    /**
     * Gets the value of the timePeriodName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getTimePeriodName() {
        return timePeriodName;
    }

    /**
     * Sets the value of the timePeriodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setTimePeriodName(XFkType value) {
        this.timePeriodName = value;
    }

}
