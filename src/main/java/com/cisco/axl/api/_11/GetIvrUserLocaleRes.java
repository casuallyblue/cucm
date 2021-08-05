
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIvrUserLocaleRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIvrUserLocaleRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ivrUserLocale" type="{http://www.cisco.com/AXL/API/11.5}RIvrUserLocale"/&gt;
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
@XmlType(name = "GetIvrUserLocaleRes", propOrder = {
    "_return"
})
public class GetIvrUserLocaleRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetIvrUserLocaleRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetIvrUserLocaleRes.Return }
     *     
     */
    public GetIvrUserLocaleRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIvrUserLocaleRes.Return }
     *     
     */
    public void setReturn(GetIvrUserLocaleRes.Return value) {
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
     *         &lt;element name="ivrUserLocale" type="{http://www.cisco.com/AXL/API/11.5}RIvrUserLocale"/&gt;
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
        "ivrUserLocale"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RIvrUserLocale ivrUserLocale;

        /**
         * Gets the value of the ivrUserLocale property.
         * 
         * @return
         *     possible object is
         *     {@link RIvrUserLocale }
         *     
         */
        public RIvrUserLocale getIvrUserLocale() {
            return ivrUserLocale;
        }

        /**
         * Sets the value of the ivrUserLocale property.
         * 
         * @param value
         *     allowed object is
         *     {@link RIvrUserLocale }
         *     
         */
        public void setIvrUserLocale(RIvrUserLocale value) {
            this.ivrUserLocale = value;
        }

    }

}
