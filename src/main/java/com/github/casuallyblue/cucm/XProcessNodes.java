
package com.github.casuallyblue.cucm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XProcessNodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XProcessNodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="lbmAssignedServices" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XProcessNodes", propOrder = {
    "lbmAssignedServices"
})
public class XProcessNodes {

    @XmlElementRef(name = "lbmAssignedServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> lbmAssignedServices;

    /**
     * Gets the value of the lbmAssignedServices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLbmAssignedServices() {
        return lbmAssignedServices;
    }

    /**
     * Sets the value of the lbmAssignedServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLbmAssignedServices(JAXBElement<XFkType> value) {
        this.lbmAssignedServices = value;
    }

}
