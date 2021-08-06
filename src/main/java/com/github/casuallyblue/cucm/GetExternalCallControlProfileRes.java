
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetExternalCallControlProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExternalCallControlProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/11.5}RExternalCallControlProfile"/&gt;
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
@XmlType(name = "GetExternalCallControlProfileRes", propOrder = {
    "_return"
})
public class GetExternalCallControlProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetExternalCallControlProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetExternalCallControlProfileRes.Return }
     *     
     */
    public GetExternalCallControlProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExternalCallControlProfileRes.Return }
     *     
     */
    public void setReturn(GetExternalCallControlProfileRes.Return value) {
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
     *         &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/11.5}RExternalCallControlProfile"/&gt;
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
        "externalCallControlProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RExternalCallControlProfile externalCallControlProfile;

        /**
         * Gets the value of the externalCallControlProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RExternalCallControlProfile }
         *     
         */
        public RExternalCallControlProfile getExternalCallControlProfile() {
            return externalCallControlProfile;
        }

        /**
         * Sets the value of the externalCallControlProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RExternalCallControlProfile }
         *     
         */
        public void setExternalCallControlProfile(RExternalCallControlProfile value) {
            this.externalCallControlProfile = value;
        }

    }

}