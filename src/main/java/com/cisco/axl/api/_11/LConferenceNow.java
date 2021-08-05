
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LConferenceNow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LConferenceNow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="conferenceNowNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxWaitTimeForHost" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="MohAudioSourceId" type="{http://www.cisco.com/AXL/API/11.5}XMOHAudioSourceId" minOccurs="0"/&gt;
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
@XmlType(name = "LConferenceNow", propOrder = {
    "conferenceNowNumber",
    "routePartitionName",
    "description",
    "maxWaitTimeForHost",
    "mohAudioSourceId"
})
public class LConferenceNow {

    protected String conferenceNowNumber;
    protected XFkType routePartitionName;
    protected String description;
    @XmlSchemaType(name = "anySimpleType")
    protected String maxWaitTimeForHost;
    @XmlElement(name = "MohAudioSourceId")
    @XmlSchemaType(name = "anySimpleType")
    protected String mohAudioSourceId;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the conferenceNowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceNowNumber() {
        return conferenceNowNumber;
    }

    /**
     * Sets the value of the conferenceNowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceNowNumber(String value) {
        this.conferenceNowNumber = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRoutePartitionName(XFkType value) {
        this.routePartitionName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the maxWaitTimeForHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWaitTimeForHost() {
        return maxWaitTimeForHost;
    }

    /**
     * Sets the value of the maxWaitTimeForHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWaitTimeForHost(String value) {
        this.maxWaitTimeForHost = value;
    }

    /**
     * Gets the value of the mohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMohAudioSourceId() {
        return mohAudioSourceId;
    }

    /**
     * Sets the value of the mohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMohAudioSourceId(String value) {
        this.mohAudioSourceId = value;
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
