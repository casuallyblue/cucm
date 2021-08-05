
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHuntPilotRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHuntPilotRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="huntPilot" type="{http://www.cisco.com/AXL/API/11.5}RHuntPilot"/&gt;
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
@XmlType(name = "GetHuntPilotRes", propOrder = {
    "_return"
})
public class GetHuntPilotRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetHuntPilotRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetHuntPilotRes.Return }
     *     
     */
    public GetHuntPilotRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHuntPilotRes.Return }
     *     
     */
    public void setReturn(GetHuntPilotRes.Return value) {
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
     *         &lt;element name="huntPilot" type="{http://www.cisco.com/AXL/API/11.5}RHuntPilot"/&gt;
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
        "huntPilot"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RHuntPilot huntPilot;

        /**
         * Gets the value of the huntPilot property.
         * 
         * @return
         *     possible object is
         *     {@link RHuntPilot }
         *     
         */
        public RHuntPilot getHuntPilot() {
            return huntPilot;
        }

        /**
         * Sets the value of the huntPilot property.
         * 
         * @param value
         *     allowed object is
         *     {@link RHuntPilot }
         *     
         */
        public void setHuntPilot(RHuntPilot value) {
            this.huntPilot = value;
        }

    }

}
