
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTodAccessReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTodAccessReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/11.5}String128" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.5}String255" minOccurs="0"/&gt;
 *         &lt;element name="members" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XTODAccessMember"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTodAccessReq", propOrder = {
    "newName",
    "description",
    "members"
})
public class UpdateTodAccessReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected UpdateTodAccessReq.Members members;

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
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateTodAccessReq.Members }
     *     
     */
    public UpdateTodAccessReq.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateTodAccessReq.Members }
     *     
     */
    public void setMembers(UpdateTodAccessReq.Members value) {
        this.members = value;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/11.5}XTODAccessMember"/&gt;
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
        "member"
    })
    public static class Members {

        protected XTODAccessMember member;

        /**
         * Gets the value of the member property.
         * 
         * @return
         *     possible object is
         *     {@link XTODAccessMember }
         *     
         */
        public XTODAccessMember getMember() {
            return member;
        }

        /**
         * Sets the value of the member property.
         * 
         * @param value
         *     allowed object is
         *     {@link XTODAccessMember }
         *     
         */
        public void setMember(XTODAccessMember value) {
            this.member = value;
        }

    }

}
