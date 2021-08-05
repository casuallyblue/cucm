
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetIlsConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIlsConfigRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ilsConfig" type="{http://www.cisco.com/AXL/API/11.5}NewIlsConfig"/&gt;
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
@XmlType(name = "GetIlsConfigRes", propOrder = {
    "_return"
})
public class GetIlsConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetIlsConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetIlsConfigRes.Return }
     *     
     */
    public GetIlsConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIlsConfigRes.Return }
     *     
     */
    public void setReturn(GetIlsConfigRes.Return value) {
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
     *         &lt;element name="ilsConfig" type="{http://www.cisco.com/AXL/API/11.5}NewIlsConfig"/&gt;
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
        "ilsConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected NewIlsConfig ilsConfig;

        /**
         * Gets the value of the ilsConfig property.
         * 
         * @return
         *     possible object is
         *     {@link NewIlsConfig }
         *     
         */
        public NewIlsConfig getIlsConfig() {
            return ilsConfig;
        }

        /**
         * Sets the value of the ilsConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewIlsConfig }
         *     
         */
        public void setIlsConfig(NewIlsConfig value) {
            this.ilsConfig = value;
        }

    }

}
