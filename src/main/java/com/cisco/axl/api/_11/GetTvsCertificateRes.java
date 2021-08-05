
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTvsCertificateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTvsCertificateRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tvsCertificate" type="{http://www.cisco.com/AXL/API/11.5}RTvsCertificate"/&gt;
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
@XmlType(name = "GetTvsCertificateRes", propOrder = {
    "_return"
})
public class GetTvsCertificateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTvsCertificateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTvsCertificateRes.Return }
     *     
     */
    public GetTvsCertificateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTvsCertificateRes.Return }
     *     
     */
    public void setReturn(GetTvsCertificateRes.Return value) {
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
     *         &lt;element name="tvsCertificate" type="{http://www.cisco.com/AXL/API/11.5}RTvsCertificate"/&gt;
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
        "tvsCertificate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTvsCertificate tvsCertificate;

        /**
         * Gets the value of the tvsCertificate property.
         * 
         * @return
         *     possible object is
         *     {@link RTvsCertificate }
         *     
         */
        public RTvsCertificate getTvsCertificate() {
            return tvsCertificate;
        }

        /**
         * Sets the value of the tvsCertificate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTvsCertificate }
         *     
         */
        public void setTvsCertificate(RTvsCertificate value) {
            this.tvsCertificate = value;
        }

    }

}
