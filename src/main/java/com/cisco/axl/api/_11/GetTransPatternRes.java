
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransPatternRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/11.5}RTransPattern"/&gt;
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
@XmlType(name = "GetTransPatternRes", propOrder = {
    "_return"
})
public class GetTransPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTransPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransPatternRes.Return }
     *     
     */
    public GetTransPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransPatternRes.Return }
     *     
     */
    public void setReturn(GetTransPatternRes.Return value) {
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
     *         &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/11.5}RTransPattern"/&gt;
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
        "transPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTransPattern transPattern;

        /**
         * Gets the value of the transPattern property.
         * 
         * @return
         *     possible object is
         *     {@link RTransPattern }
         *     
         */
        public RTransPattern getTransPattern() {
            return transPattern;
        }

        /**
         * Sets the value of the transPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTransPattern }
         *     
         */
        public void setTransPattern(RTransPattern value) {
            this.transPattern = value;
        }

    }

}
