
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORBusyLampField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORBusyLampField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="blfDirn" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *             &lt;element name="routePartition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORBusyLampField", propOrder = {
    "blfDirn",
    "routePartition"
})
public class ORBusyLampField {

    protected String blfDirn;
    protected String routePartition;

    /**
     * Gets the value of the blfDirn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlfDirn() {
        return blfDirn;
    }

    /**
     * Sets the value of the blfDirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlfDirn(String value) {
        this.blfDirn = value;
    }

    /**
     * Gets the value of the routePartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePartition(String value) {
        this.routePartition = value;
    }

}
