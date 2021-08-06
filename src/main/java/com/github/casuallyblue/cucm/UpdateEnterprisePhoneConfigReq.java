
package com.github.casuallyblue.cucm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateEnterprisePhoneConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateEnterprisePhoneConfigReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/11.5}XVendorConfig" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateEnterprisePhoneConfigReq", propOrder = {
    "vendorConfig"
})
public class UpdateEnterprisePhoneConfigReq {

    @XmlElementRef(name = "vendorConfig", type = JAXBElement.class, required = false)
    protected JAXBElement<XVendorConfig> vendorConfig;

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XVendorConfig }{@code >}
     *     
     */
    public JAXBElement<XVendorConfig> getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XVendorConfig }{@code >}
     *     
     */
    public void setVendorConfig(JAXBElement<XVendorConfig> value) {
        this.vendorConfig = value;
    }

}
