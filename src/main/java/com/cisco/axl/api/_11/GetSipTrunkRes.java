
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSipTrunkRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSipTrunkRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="sipTrunk" type="{http://www.cisco.com/AXL/API/11.5}RSipTrunk"/&gt;
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
@XmlType(name = "GetSipTrunkRes", propOrder = {
    "_return"
})
public class GetSipTrunkRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSipTrunkRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSipTrunkRes.Return }
     *     
     */
    public GetSipTrunkRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSipTrunkRes.Return }
     *     
     */
    public void setReturn(GetSipTrunkRes.Return value) {
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
     *         &lt;element name="sipTrunk" type="{http://www.cisco.com/AXL/API/11.5}RSipTrunk"/&gt;
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
        "sipTrunk"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSipTrunk sipTrunk;

        /**
         * Gets the value of the sipTrunk property.
         * 
         * @return
         *     possible object is
         *     {@link RSipTrunk }
         *     
         */
        public RSipTrunk getSipTrunk() {
            return sipTrunk;
        }

        /**
         * Sets the value of the sipTrunk property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSipTrunk }
         *     
         */
        public void setSipTrunk(RSipTrunk value) {
            this.sipTrunk = value;
        }

    }

}
