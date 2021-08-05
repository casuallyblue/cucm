
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHandoffConfigurationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHandoffConfigurationRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="handoffConfiguration" type="{http://www.cisco.com/AXL/API/11.5}RHandoffConfiguration"/&gt;
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
@XmlType(name = "GetHandoffConfigurationRes", propOrder = {
    "_return"
})
public class GetHandoffConfigurationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetHandoffConfigurationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetHandoffConfigurationRes.Return }
     *     
     */
    public GetHandoffConfigurationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHandoffConfigurationRes.Return }
     *     
     */
    public void setReturn(GetHandoffConfigurationRes.Return value) {
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
     *         &lt;element name="handoffConfiguration" type="{http://www.cisco.com/AXL/API/11.5}RHandoffConfiguration"/&gt;
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
        "handoffConfiguration"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RHandoffConfiguration handoffConfiguration;

        /**
         * Gets the value of the handoffConfiguration property.
         * 
         * @return
         *     possible object is
         *     {@link RHandoffConfiguration }
         *     
         */
        public RHandoffConfiguration getHandoffConfiguration() {
            return handoffConfiguration;
        }

        /**
         * Sets the value of the handoffConfiguration property.
         * 
         * @param value
         *     allowed object is
         *     {@link RHandoffConfiguration }
         *     
         */
        public void setHandoffConfiguration(RHandoffConfiguration value) {
            this.handoffConfiguration = value;
        }

    }

}
