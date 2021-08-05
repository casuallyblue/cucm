
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCallingPartyTransformationPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCallingPartyTransformationPatternRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="callingPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.5}RCallingPartyTransformationPattern"/&gt;
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
@XmlType(name = "GetCallingPartyTransformationPatternRes", propOrder = {
    "_return"
})
public class GetCallingPartyTransformationPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCallingPartyTransformationPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCallingPartyTransformationPatternRes.Return }
     *     
     */
    public GetCallingPartyTransformationPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCallingPartyTransformationPatternRes.Return }
     *     
     */
    public void setReturn(GetCallingPartyTransformationPatternRes.Return value) {
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
     *         &lt;element name="callingPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.5}RCallingPartyTransformationPattern"/&gt;
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
        "callingPartyTransformationPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCallingPartyTransformationPattern callingPartyTransformationPattern;

        /**
         * Gets the value of the callingPartyTransformationPattern property.
         * 
         * @return
         *     possible object is
         *     {@link RCallingPartyTransformationPattern }
         *     
         */
        public RCallingPartyTransformationPattern getCallingPartyTransformationPattern() {
            return callingPartyTransformationPattern;
        }

        /**
         * Sets the value of the callingPartyTransformationPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCallingPartyTransformationPattern }
         *     
         */
        public void setCallingPartyTransformationPattern(RCallingPartyTransformationPattern value) {
            this.callingPartyTransformationPattern = value;
        }

    }

}
