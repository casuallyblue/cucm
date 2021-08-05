
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateWirelessAccessPointControllersReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateWirelessAccessPointControllersReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="snmpVersion" type="{http://www.cisco.com/AXL/API/11.5}XSNMPVersion" minOccurs="0"/&gt;
 *         &lt;element name="snmpUserIdOrCommunityString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="snmpAuthenticationProtocol" type="{http://www.cisco.com/AXL/API/11.5}XSNMPAuthenticationProtocol" minOccurs="0"/&gt;
 *         &lt;element name="snmpAuthenticationPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="snmpPrivacyProtocol" type="{http://www.cisco.com/AXL/API/11.5}XSNMPPrivacyProtocol" minOccurs="0"/&gt;
 *         &lt;element name="snmpPrivacyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="syncNow" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="resyncInterval" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="nextSyncTime" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="scheduleUnit" type="{http://www.cisco.com/AXL/API/11.5}XScheduleUnit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateWirelessAccessPointControllersReq", propOrder = {
    "newName",
    "description",
    "snmpVersion",
    "snmpUserIdOrCommunityString",
    "snmpAuthenticationProtocol",
    "snmpAuthenticationPassword",
    "snmpPrivacyProtocol",
    "snmpPrivacyPassword",
    "syncNow",
    "resyncInterval",
    "nextSyncTime",
    "scheduleUnit"
})
public class UpdateWirelessAccessPointControllersReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    @XmlSchemaType(name = "anySimpleType")
    protected String snmpVersion;
    protected String snmpUserIdOrCommunityString;
    @XmlSchemaType(name = "anySimpleType")
    protected String snmpAuthenticationProtocol;
    protected String snmpAuthenticationPassword;
    @XmlSchemaType(name = "anySimpleType")
    protected String snmpPrivacyProtocol;
    protected String snmpPrivacyPassword;
    protected String syncNow;
    @XmlElement(defaultValue = "32")
    @XmlSchemaType(name = "anySimpleType")
    protected String resyncInterval;
    @XmlSchemaType(name = "anySimpleType")
    protected String nextSyncTime;
    @XmlSchemaType(name = "anySimpleType")
    protected String scheduleUnit;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpVersion(String value) {
        this.snmpVersion = value;
    }

    /**
     * Gets the value of the snmpUserIdOrCommunityString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpUserIdOrCommunityString() {
        return snmpUserIdOrCommunityString;
    }

    /**
     * Sets the value of the snmpUserIdOrCommunityString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpUserIdOrCommunityString(String value) {
        this.snmpUserIdOrCommunityString = value;
    }

    /**
     * Gets the value of the snmpAuthenticationProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpAuthenticationProtocol() {
        return snmpAuthenticationProtocol;
    }

    /**
     * Sets the value of the snmpAuthenticationProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpAuthenticationProtocol(String value) {
        this.snmpAuthenticationProtocol = value;
    }

    /**
     * Gets the value of the snmpAuthenticationPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpAuthenticationPassword() {
        return snmpAuthenticationPassword;
    }

    /**
     * Sets the value of the snmpAuthenticationPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpAuthenticationPassword(String value) {
        this.snmpAuthenticationPassword = value;
    }

    /**
     * Gets the value of the snmpPrivacyProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpPrivacyProtocol() {
        return snmpPrivacyProtocol;
    }

    /**
     * Sets the value of the snmpPrivacyProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpPrivacyProtocol(String value) {
        this.snmpPrivacyProtocol = value;
    }

    /**
     * Gets the value of the snmpPrivacyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpPrivacyPassword() {
        return snmpPrivacyPassword;
    }

    /**
     * Sets the value of the snmpPrivacyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpPrivacyPassword(String value) {
        this.snmpPrivacyPassword = value;
    }

    /**
     * Gets the value of the syncNow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncNow() {
        return syncNow;
    }

    /**
     * Sets the value of the syncNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncNow(String value) {
        this.syncNow = value;
    }

    /**
     * Gets the value of the resyncInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResyncInterval() {
        return resyncInterval;
    }

    /**
     * Sets the value of the resyncInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResyncInterval(String value) {
        this.resyncInterval = value;
    }

    /**
     * Gets the value of the nextSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextSyncTime() {
        return nextSyncTime;
    }

    /**
     * Sets the value of the nextSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextSyncTime(String value) {
        this.nextSyncTime = value;
    }

    /**
     * Gets the value of the scheduleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleUnit() {
        return scheduleUnit;
    }

    /**
     * Sets the value of the scheduleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleUnit(String value) {
        this.scheduleUnit = value;
    }

}
