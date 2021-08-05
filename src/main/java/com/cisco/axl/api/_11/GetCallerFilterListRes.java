
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallerFilterListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallerFilterListRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="callerFilterList" type="{http://www.cisco.com/AXL/API/11.5}RCallerFilterList"/&gt;
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
@XmlType(name = "GetCallerFilterListRes", propOrder = {
    "_return"
})
public class GetCallerFilterListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallerFilterListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallerFilterListRes.Return }
     *     
     */
    public GetCallerFilterListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallerFilterListRes.Return }
     *     
     */
    public void setReturn(GetCallerFilterListRes.Return value) {
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
     *         &lt;element name="callerFilterList" type="{http://www.cisco.com/AXL/API/11.5}RCallerFilterList"/&gt;
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
        "callerFilterList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallerFilterList callerFilterList;

        /**
         * Gets the value of the callerFilterList property.
         * 
         * @return
         *     possible object is
         *     {@link RCallerFilterList }
         *     
         */
        public RCallerFilterList getCallerFilterList() {
            return callerFilterList;
        }

        /**
         * Sets the value of the callerFilterList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallerFilterList }
         *     
         */
        public void setCallerFilterList(RCallerFilterList value) {
            this.callerFilterList = value;
        }

    }

}
