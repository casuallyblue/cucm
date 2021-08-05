
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCalledPartyTransformationPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCalledPartyTransformationPatternRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="calledPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.5}RCalledPartyTransformationPattern"/&gt;
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
@XmlType(name = "GetCalledPartyTransformationPatternRes", propOrder = {
    "_return"
})
public class GetCalledPartyTransformationPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCalledPartyTransformationPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCalledPartyTransformationPatternRes.Return }
     *     
     */
    public GetCalledPartyTransformationPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCalledPartyTransformationPatternRes.Return }
     *     
     */
    public void setReturn(GetCalledPartyTransformationPatternRes.Return value) {
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
     *         &lt;element name="calledPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.5}RCalledPartyTransformationPattern"/&gt;
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
        "calledPartyTransformationPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCalledPartyTransformationPattern calledPartyTransformationPattern;

        /**
         * Gets the value of the calledPartyTransformationPattern property.
         * 
         * @return
         *     possible object is
         *     {@link RCalledPartyTransformationPattern }
         *     
         */
        public RCalledPartyTransformationPattern getCalledPartyTransformationPattern() {
            return calledPartyTransformationPattern;
        }

        /**
         * Sets the value of the calledPartyTransformationPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCalledPartyTransformationPattern }
         *     
         */
        public void setCalledPartyTransformationPattern(RCalledPartyTransformationPattern value) {
            this.calledPartyTransformationPattern = value;
        }

    }

}
