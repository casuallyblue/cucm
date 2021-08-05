
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LPickupGroupMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LPickupGroupMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="priority" type="{http://www.cisco.com/AXL/API/11.5}XInteger" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="pickupGroupName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *           &lt;element name="pickupDnAndPartition" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *                     &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "LPickupGroupMember", propOrder = {
    "priority",
    "pickupGroupName",
    "pickupDnAndPartition"
})
public class LPickupGroupMember {

    @XmlSchemaType(name = "anySimpleType")
    protected String priority;
    protected XFkType pickupGroupName;
    protected LPickupGroupMember.PickupDnAndPartition pickupDnAndPartition;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the pickupGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPickupGroupName() {
        return pickupGroupName;
    }

    /**
     * Sets the value of the pickupGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPickupGroupName(XFkType value) {
        this.pickupGroupName = value;
    }

    /**
     * Gets the value of the pickupDnAndPartition property.
     * 
     * @return
     *     possible object is
     *     {@link LPickupGroupMember.PickupDnAndPartition }
     *     
     */
    public LPickupGroupMember.PickupDnAndPartition getPickupDnAndPartition() {
        return pickupDnAndPartition;
    }

    /**
     * Sets the value of the pickupDnAndPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LPickupGroupMember.PickupDnAndPartition }
     *     
     */
    public void setPickupDnAndPartition(LPickupGroupMember.PickupDnAndPartition value) {
        this.pickupDnAndPartition = value;
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
     *         &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
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
        "dnPattern",
        "routePartitionName"
    })
    public static class PickupDnAndPartition {

        protected String dnPattern;
        protected XFkType routePartitionName;

        /**
         * Gets the value of the dnPattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDnPattern() {
            return dnPattern;
        }

        /**
         * Sets the value of the dnPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDnPattern(String value) {
            this.dnPattern = value;
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

    }

}
