
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSyslogConfigurationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSyslogConfigurationReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="serviceGroup" type="{http://www.cisco.com/AXL/API/11.5}XServiceGrouping"/&gt;
 *           &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="alarmConfigs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AlarmConfig" type="{http://www.cisco.com/AXL/API/11.5}XSyslogConfig" maxOccurs="4"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EndPointAlarm" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSyslogConfigurationReq", propOrder = {
    "serverName",
    "serviceGroup",
    "service",
    "alarmConfigs",
    "endPointAlarm"
})
public class UpdateSyslogConfigurationReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String serverName;
    @XmlElement(required = true, defaultValue = "CM Services")
    @XmlSchemaType(name = "anySimpleType")
    protected String serviceGroup;
    @XmlElement(required = true)
    protected String service;
    @XmlElement(required = true)
    protected UpdateSyslogConfigurationReq.AlarmConfigs alarmConfigs;
    @XmlElement(name = "EndPointAlarm")
    protected String endPointAlarm;

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceGroup(String value) {
        this.serviceGroup = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the alarmConfigs property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSyslogConfigurationReq.AlarmConfigs }
     *     
     */
    public UpdateSyslogConfigurationReq.AlarmConfigs getAlarmConfigs() {
        return alarmConfigs;
    }

    /**
     * Sets the value of the alarmConfigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSyslogConfigurationReq.AlarmConfigs }
     *     
     */
    public void setAlarmConfigs(UpdateSyslogConfigurationReq.AlarmConfigs value) {
        this.alarmConfigs = value;
    }

    /**
     * Gets the value of the endPointAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPointAlarm() {
        return endPointAlarm;
    }

    /**
     * Sets the value of the endPointAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPointAlarm(String value) {
        this.endPointAlarm = value;
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
     *         &lt;element name="AlarmConfig" type="{http://www.cisco.com/AXL/API/11.5}XSyslogConfig" maxOccurs="4"/&gt;
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
        "alarmConfig"
    })
    public static class AlarmConfigs {

        @XmlElement(name = "AlarmConfig", required = true)
        protected List<XSyslogConfig> alarmConfig;

        /**
         * Gets the value of the alarmConfig property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alarmConfig property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlarmConfig().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XSyslogConfig }
         * 
         * 
         */
        public List<XSyslogConfig> getAlarmConfig() {
            if (alarmConfig == null) {
                alarmConfig = new ArrayList<XSyslogConfig>();
            }
            return this.alarmConfig;
        }

    }

}
