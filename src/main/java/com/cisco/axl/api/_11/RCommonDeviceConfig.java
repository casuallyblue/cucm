
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCommonDeviceConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCommonDeviceConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}UniqueString50" minOccurs="0"/&gt;
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/11.5}XUserLocale" minOccurs="0"/&gt;
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/11.5}XMOHAudioSourceId" minOccurs="0"/&gt;
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/11.5}XMOHAudioSourceId" minOccurs="0"/&gt;
 *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/&gt;
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/11.5}XPreemption" minOccurs="0"/&gt;
 *         &lt;element name="ipAddressingMode" type="{http://www.cisco.com/AXL/API/11.5}XIPAddressingMode" minOccurs="0"/&gt;
 *         &lt;element name="ipAddressingModePreferenceControl" type="{http://www.cisco.com/AXL/API/11.5}XIPAddressingModePrefControl" minOccurs="0"/&gt;
 *         &lt;element name="allowAutoConfigurationForPhones" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="useImeForOutboundCalls" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="confidentialAccess" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/11.5}XCALMode" minOccurs="0"/&gt;
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="allowDuplicateAddressDetection" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="acceptRedirectMessages" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
 *         &lt;element name="replyMulticastEchoRequest" type="{http://www.cisco.com/AXL/API/11.5}XStatus" minOccurs="0"/&gt;
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
@XmlType(name = "RCommonDeviceConfig", propOrder = {
    "name",
    "softkeyTemplateName",
    "userLocale",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "mlppDomainId",
    "mlppIndicationStatus",
    "useTrustedRelayPoint",
    "preemption",
    "ipAddressingMode",
    "ipAddressingModePreferenceControl",
    "allowAutoConfigurationForPhones",
    "useImeForOutboundCalls",
    "confidentialAccess",
    "allowDuplicateAddressDetection",
    "acceptRedirectMessages",
    "replyMulticastEchoRequest"
})
public class RCommonDeviceConfig {

    protected String name;
    protected XFkType softkeyTemplateName;
    @XmlSchemaType(name = "anySimpleType")
    protected String userLocale;
    @XmlSchemaType(name = "anySimpleType")
    protected String networkHoldMohAudioSourceId;
    @XmlSchemaType(name = "anySimpleType")
    protected String userHoldMohAudioSourceId;
    protected String mlppDomainId;
    @XmlSchemaType(name = "anySimpleType")
    protected String mlppIndicationStatus;
    protected String useTrustedRelayPoint;
    @XmlSchemaType(name = "anySimpleType")
    protected String preemption;
    @XmlSchemaType(name = "anySimpleType")
    protected String ipAddressingMode;
    @XmlSchemaType(name = "anySimpleType")
    protected String ipAddressingModePreferenceControl;
    @XmlSchemaType(name = "anySimpleType")
    protected String allowAutoConfigurationForPhones;
    @XmlSchemaType(name = "anySimpleType")
    protected String useImeForOutboundCalls;
    protected RCommonDeviceConfig.ConfidentialAccess confidentialAccess;
    @XmlSchemaType(name = "anySimpleType")
    protected String allowDuplicateAddressDetection;
    @XmlSchemaType(name = "anySimpleType")
    protected String acceptRedirectMessages;
    @XmlSchemaType(name = "anySimpleType")
    protected String replyMulticastEchoRequest;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSoftkeyTemplateName(XFkType value) {
        this.softkeyTemplateName = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkHoldMohAudioSourceId(String value) {
        this.networkHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHoldMohAudioSourceId(String value) {
        this.userHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the mlppDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppDomainId(String value) {
        this.mlppDomainId = value;
    }

    /**
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndicationStatus(String value) {
        this.mlppIndicationStatus = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrustedRelayPoint(String value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemption(String value) {
        this.preemption = value;
    }

    /**
     * Gets the value of the ipAddressingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressingMode() {
        return ipAddressingMode;
    }

    /**
     * Sets the value of the ipAddressingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressingMode(String value) {
        this.ipAddressingMode = value;
    }

    /**
     * Gets the value of the ipAddressingModePreferenceControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressingModePreferenceControl() {
        return ipAddressingModePreferenceControl;
    }

    /**
     * Sets the value of the ipAddressingModePreferenceControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressingModePreferenceControl(String value) {
        this.ipAddressingModePreferenceControl = value;
    }

    /**
     * Gets the value of the allowAutoConfigurationForPhones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAutoConfigurationForPhones() {
        return allowAutoConfigurationForPhones;
    }

    /**
     * Sets the value of the allowAutoConfigurationForPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAutoConfigurationForPhones(String value) {
        this.allowAutoConfigurationForPhones = value;
    }

    /**
     * Gets the value of the useImeForOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseImeForOutboundCalls() {
        return useImeForOutboundCalls;
    }

    /**
     * Sets the value of the useImeForOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseImeForOutboundCalls(String value) {
        this.useImeForOutboundCalls = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link RCommonDeviceConfig.ConfidentialAccess }
     *     
     */
    public RCommonDeviceConfig.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCommonDeviceConfig.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(RCommonDeviceConfig.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the allowDuplicateAddressDetection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowDuplicateAddressDetection() {
        return allowDuplicateAddressDetection;
    }

    /**
     * Sets the value of the allowDuplicateAddressDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowDuplicateAddressDetection(String value) {
        this.allowDuplicateAddressDetection = value;
    }

    /**
     * Gets the value of the acceptRedirectMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptRedirectMessages() {
        return acceptRedirectMessages;
    }

    /**
     * Sets the value of the acceptRedirectMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptRedirectMessages(String value) {
        this.acceptRedirectMessages = value;
    }

    /**
     * Gets the value of the replyMulticastEchoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyMulticastEchoRequest() {
        return replyMulticastEchoRequest;
    }

    /**
     * Sets the value of the replyMulticastEchoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyMulticastEchoRequest(String value) {
        this.replyMulticastEchoRequest = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/11.5}XCALMode" minOccurs="0"/&gt;
     *         &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
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
        "confidentialAccessMode",
        "confidentialAccessLevel"
    })
    public static class ConfidentialAccess {

        @XmlSchemaType(name = "anySimpleType")
        protected String confidentialAccessMode;
        @XmlSchemaType(name = "anySimpleType")
        protected String confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidentialAccessMode(String value) {
            this.confidentialAccessMode = value;
        }

        /**
         * Gets the value of the confidentialAccessLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidentialAccessLevel() {
            return confidentialAccessLevel;
        }

        /**
         * Sets the value of the confidentialAccessLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidentialAccessLevel(String value) {
            this.confidentialAccessLevel = value;
        }

    }

}
