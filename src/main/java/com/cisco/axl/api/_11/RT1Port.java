
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RT1Port complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RT1Port"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="portNumber" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="attendantDn" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="unattendedPort" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callerIdDn" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="callerIdEnable" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callingPartySelection" type="{http://www.cisco.com/AXL/API/11.5}XCallingPartySelection" minOccurs="0"/&gt;
 *         &lt;element name="digitSending" type="{http://www.cisco.com/AXL/API/11.5}XDigitSending" minOccurs="0"/&gt;
 *         &lt;element name="expectedDigits" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="sigDigits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.cisco.com/AXL/API/11.5&gt;XInteger"&gt;
 *                 &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="prefixDn" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="presentationBit" type="{http://www.cisco.com/AXL/API/11.5}XPresentationBit" minOccurs="0"/&gt;
 *         &lt;element name="silenceSuppressionThreshold" type="{http://www.cisco.com/AXL/API/11.5}XSilenceSuppressionThreshold" minOccurs="0"/&gt;
 *         &lt;element name="startDialProtocol" type="{http://www.cisco.com/AXL/API/11.5}XStartDialProtocol" minOccurs="0"/&gt;
 *         &lt;element name="trunk" type="{http://www.cisco.com/AXL/API/11.5}XTrunk" minOccurs="0"/&gt;
 *         &lt;element name="trunkDirection" type="{http://www.cisco.com/AXL/API/11.5}XTrunkDirection" minOccurs="0"/&gt;
 *         &lt;element name="trunkLevel" type="{http://www.cisco.com/AXL/API/11.5}XTrunkLevel" minOccurs="0"/&gt;
 *         &lt;element name="trunkPadRx" type="{http://www.cisco.com/AXL/API/11.5}XTrunkPad" minOccurs="0"/&gt;
 *         &lt;element name="trunkPadTx" type="{http://www.cisco.com/AXL/API/11.5}XTrunkPad" minOccurs="0"/&gt;
 *         &lt;element name="vendorConfig" type="{http://www.cisco.com/AXL/API/11.5}XVendorConfig" minOccurs="0"/&gt;
 *         &lt;element name="callerId" type="{http://www.cisco.com/AXL/API/11.5}XCallerID" minOccurs="0"/&gt;
 *         &lt;element name="endpointId" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/&gt;
 *         &lt;element name="timer1" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="timer2" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="timer3" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="timer4" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="timer5" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;element name="timer6" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
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
@XmlType(name = "RT1Port", propOrder = {
    "portNumber",
    "attendantDn",
    "unattendedPort",
    "callerIdDn",
    "callerIdEnable",
    "callingPartySelection",
    "digitSending",
    "expectedDigits",
    "sigDigits",
    "prefixDn",
    "presentationBit",
    "silenceSuppressionThreshold",
    "startDialProtocol",
    "trunk",
    "trunkDirection",
    "trunkLevel",
    "trunkPadRx",
    "trunkPadTx",
    "vendorConfig",
    "callerId",
    "endpointId",
    "timer1",
    "timer2",
    "timer3",
    "timer4",
    "timer5",
    "timer6"
})
public class RT1Port {

    @XmlSchemaType(name = "anySimpleType")
    protected String portNumber;
    protected String attendantDn;
    protected String unattendedPort;
    protected String callerIdDn;
    protected String callerIdEnable;
    @XmlSchemaType(name = "anySimpleType")
    protected String callingPartySelection;
    @XmlSchemaType(name = "anySimpleType")
    protected String digitSending;
    @XmlSchemaType(name = "anySimpleType")
    protected String expectedDigits;
    protected RT1Port.SigDigits sigDigits;
    protected String prefixDn;
    @XmlSchemaType(name = "anySimpleType")
    protected String presentationBit;
    @XmlSchemaType(name = "anySimpleType")
    protected String silenceSuppressionThreshold;
    @XmlSchemaType(name = "anySimpleType")
    protected String startDialProtocol;
    @XmlSchemaType(name = "anySimpleType")
    protected String trunk;
    @XmlSchemaType(name = "anySimpleType")
    protected String trunkDirection;
    @XmlSchemaType(name = "anySimpleType")
    protected String trunkLevel;
    @XmlSchemaType(name = "anySimpleType")
    protected String trunkPadRx;
    @XmlSchemaType(name = "anySimpleType")
    protected String trunkPadTx;
    protected XVendorConfig vendorConfig;
    @XmlSchemaType(name = "anySimpleType")
    protected String callerId;
    protected String endpointId;
    @XmlSchemaType(name = "anySimpleType")
    protected String timer1;
    @XmlSchemaType(name = "anySimpleType")
    protected String timer2;
    @XmlSchemaType(name = "anySimpleType")
    protected String timer3;
    @XmlSchemaType(name = "anySimpleType")
    protected String timer4;
    @XmlSchemaType(name = "anySimpleType")
    protected String timer5;
    @XmlSchemaType(name = "anySimpleType")
    protected String timer6;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNumber(String value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the attendantDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantDn() {
        return attendantDn;
    }

    /**
     * Sets the value of the attendantDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantDn(String value) {
        this.attendantDn = value;
    }

    /**
     * Gets the value of the unattendedPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnattendedPort() {
        return unattendedPort;
    }

    /**
     * Sets the value of the unattendedPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnattendedPort(String value) {
        this.unattendedPort = value;
    }

    /**
     * Gets the value of the callerIdDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdDn() {
        return callerIdDn;
    }

    /**
     * Sets the value of the callerIdDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdDn(String value) {
        this.callerIdDn = value;
    }

    /**
     * Gets the value of the callerIdEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdEnable() {
        return callerIdEnable;
    }

    /**
     * Sets the value of the callerIdEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdEnable(String value) {
        this.callerIdEnable = value;
    }

    /**
     * Gets the value of the callingPartySelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartySelection() {
        return callingPartySelection;
    }

    /**
     * Sets the value of the callingPartySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartySelection(String value) {
        this.callingPartySelection = value;
    }

    /**
     * Gets the value of the digitSending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitSending() {
        return digitSending;
    }

    /**
     * Sets the value of the digitSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitSending(String value) {
        this.digitSending = value;
    }

    /**
     * Gets the value of the expectedDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedDigits() {
        return expectedDigits;
    }

    /**
     * Sets the value of the expectedDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDigits(String value) {
        this.expectedDigits = value;
    }

    /**
     * Gets the value of the sigDigits property.
     * 
     * @return
     *     possible object is
     *     {@link RT1Port.SigDigits }
     *     
     */
    public RT1Port.SigDigits getSigDigits() {
        return sigDigits;
    }

    /**
     * Sets the value of the sigDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RT1Port.SigDigits }
     *     
     */
    public void setSigDigits(RT1Port.SigDigits value) {
        this.sigDigits = value;
    }

    /**
     * Gets the value of the prefixDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixDn() {
        return prefixDn;
    }

    /**
     * Sets the value of the prefixDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixDn(String value) {
        this.prefixDn = value;
    }

    /**
     * Gets the value of the presentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationBit() {
        return presentationBit;
    }

    /**
     * Sets the value of the presentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationBit(String value) {
        this.presentationBit = value;
    }

    /**
     * Gets the value of the silenceSuppressionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilenceSuppressionThreshold() {
        return silenceSuppressionThreshold;
    }

    /**
     * Sets the value of the silenceSuppressionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilenceSuppressionThreshold(String value) {
        this.silenceSuppressionThreshold = value;
    }

    /**
     * Gets the value of the startDialProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDialProtocol() {
        return startDialProtocol;
    }

    /**
     * Sets the value of the startDialProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDialProtocol(String value) {
        this.startDialProtocol = value;
    }

    /**
     * Gets the value of the trunk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunk() {
        return trunk;
    }

    /**
     * Sets the value of the trunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunk(String value) {
        this.trunk = value;
    }

    /**
     * Gets the value of the trunkDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkDirection() {
        return trunkDirection;
    }

    /**
     * Sets the value of the trunkDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkDirection(String value) {
        this.trunkDirection = value;
    }

    /**
     * Gets the value of the trunkLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkLevel() {
        return trunkLevel;
    }

    /**
     * Sets the value of the trunkLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkLevel(String value) {
        this.trunkLevel = value;
    }

    /**
     * Gets the value of the trunkPadRx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPadRx() {
        return trunkPadRx;
    }

    /**
     * Sets the value of the trunkPadRx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPadRx(String value) {
        this.trunkPadRx = value;
    }

    /**
     * Gets the value of the trunkPadTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPadTx() {
        return trunkPadTx;
    }

    /**
     * Sets the value of the trunkPadTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPadTx(String value) {
        this.trunkPadTx = value;
    }

    /**
     * Gets the value of the vendorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getVendorConfig() {
        return vendorConfig;
    }

    /**
     * Sets the value of the vendorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setVendorConfig(XVendorConfig value) {
        this.vendorConfig = value;
    }

    /**
     * Gets the value of the callerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerId() {
        return callerId;
    }

    /**
     * Sets the value of the callerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerId(String value) {
        this.callerId = value;
    }

    /**
     * Gets the value of the endpointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * Sets the value of the endpointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointId(String value) {
        this.endpointId = value;
    }

    /**
     * Gets the value of the timer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimer1() {
        return timer1;
    }

    /**
     * Sets the value of the timer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimer1(String value) {
        this.timer1 = value;
    }

    /**
     * Gets the value of the timer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimer2() {
        return timer2;
    }

    /**
     * Sets the value of the timer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimer2(String value) {
        this.timer2 = value;
    }

    /**
     * Gets the value of the timer3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimer3() {
        return timer3;
    }

    /**
     * Sets the value of the timer3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimer3(String value) {
        this.timer3 = value;
    }

    /**
     * Gets the value of the timer4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimer4() {
        return timer4;
    }

    /**
     * Sets the value of the timer4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimer4(String value) {
        this.timer4 = value;
    }

    /**
     * Gets the value of the timer5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimer5() {
        return timer5;
    }

    /**
     * Sets the value of the timer5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimer5(String value) {
        this.timer5 = value;
    }

    /**
     * Gets the value of the timer6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimer6() {
        return timer6;
    }

    /**
     * Sets the value of the timer6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimer6(String value) {
        this.timer6 = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.cisco.com/AXL/API/11.5&gt;XInteger"&gt;
     *       &lt;attribute name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SigDigits {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "enable")
        protected Boolean enable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the enable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnable() {
            return enable;
        }

        /**
         * Sets the value of the enable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnable(Boolean value) {
            this.enable = value;
        }

    }

}
