
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDateTimeGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDateTimeGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dateTimeGroup" type="{http://www.cisco.com/AXL/API/11.5}RDateTimeGroup"/&gt;
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
@XmlType(name = "GetDateTimeGroupRes", propOrder = {
    "_return"
})
public class GetDateTimeGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDateTimeGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDateTimeGroupRes.Return }
     *     
     */
    public GetDateTimeGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDateTimeGroupRes.Return }
     *     
     */
    public void setReturn(GetDateTimeGroupRes.Return value) {
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
     *         &lt;element name="dateTimeGroup" type="{http://www.cisco.com/AXL/API/11.5}RDateTimeGroup"/&gt;
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
        "dateTimeGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDateTimeGroup dateTimeGroup;

        /**
         * Gets the value of the dateTimeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RDateTimeGroup }
         *     
         */
        public RDateTimeGroup getDateTimeGroup() {
            return dateTimeGroup;
        }

        /**
         * Sets the value of the dateTimeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDateTimeGroup }
         *     
         */
        public void setDateTimeGroup(RDateTimeGroup value) {
            this.dateTimeGroup = value;
        }

    }

}
