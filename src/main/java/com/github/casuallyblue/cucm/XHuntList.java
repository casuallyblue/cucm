
package com.github.casuallyblue.cucm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XHuntList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XHuntList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callManagerGroupName" type="{http://www.cisco.com/AXL/API/11.5}XFkType"/&gt;
 *         &lt;element name="routeListEnabled" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailUsage" type="{http://www.cisco.com/AXL/API/11.5}boolean" minOccurs="0"/&gt;
 *         &lt;element name="members" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XHuntList", propOrder = {
    "description",
    "callManagerGroupName",
    "routeListEnabled",
    "voiceMailUsage",
    "members",
    "name"
})
public class XHuntList {

    protected String description;
    @XmlElementRef(name = "callManagerGroupName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> callManagerGroupName;
    @XmlElement(defaultValue = "false")
    protected String routeListEnabled;
    @XmlElement(defaultValue = "false")
    protected String voiceMailUsage;
    protected XHuntList.Members members;
    protected String name;

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
     * Gets the value of the callManagerGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallManagerGroupName() {
        return callManagerGroupName;
    }

    /**
     * Sets the value of the callManagerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallManagerGroupName(JAXBElement<XFkType> value) {
        this.callManagerGroupName = value;
    }

    /**
     * Gets the value of the routeListEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteListEnabled() {
        return routeListEnabled;
    }

    /**
     * Sets the value of the routeListEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteListEnabled(String value) {
        this.routeListEnabled = value;
    }

    /**
     * Gets the value of the voiceMailUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceMailUsage() {
        return voiceMailUsage;
    }

    /**
     * Sets the value of the voiceMailUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceMailUsage(String value) {
        this.voiceMailUsage = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link XHuntList.Members }
     *     
     */
    public XHuntList.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHuntList.Members }
     *     
     */
    public void setMembers(XHuntList.Members value) {
        this.members = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XHuntListMember" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "member"
    })
    public static class Members
        extends XCommonMembersExtension
    {

        protected List<XHuntListMember> member;

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XHuntListMember }
         * 
         * 
         */
        public List<XHuntListMember> getMember() {
            if (member == null) {
                member = new ArrayList<XHuntListMember>();
            }
            return this.member;
        }

    }

}