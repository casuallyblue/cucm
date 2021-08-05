
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXDirectoryUri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXDirectoryUri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="partition" type="{http://www.cisco.com/AXL/API/11.5}OXFkType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OXDirectoryUri", propOrder = {
    "partition"
})
public class OXDirectoryUri {

    protected OXFkType partition;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setPartition(OXFkType value) {
        this.partition = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
