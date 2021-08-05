
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLocalRouteGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLocalRouteGroupReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localRouteGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="newDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "UpdateLocalRouteGroupReq", propOrder = {
    "localRouteGroup"
})
public class UpdateLocalRouteGroupReq
    extends APIRequest
{

    protected UpdateLocalRouteGroupReq.LocalRouteGroup localRouteGroup;

    /**
     * Gets the value of the localRouteGroup property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLocalRouteGroupReq.LocalRouteGroup }
     *     
     */
    public UpdateLocalRouteGroupReq.LocalRouteGroup getLocalRouteGroup() {
        return localRouteGroup;
    }

    /**
     * Sets the value of the localRouteGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLocalRouteGroupReq.LocalRouteGroup }
     *     
     */
    public void setLocalRouteGroup(UpdateLocalRouteGroupReq.LocalRouteGroup value) {
        this.localRouteGroup = value;
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
     *         &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="newDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "uuid",
        "name",
        "description",
        "newName",
        "newDescription"
    })
    public static class LocalRouteGroup {

        protected String uuid;
        protected String name;
        protected String description;
        protected String newName;
        protected String newDescription;

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
         * Gets the value of the newDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewDescription() {
            return newDescription;
        }

        /**
         * Sets the value of the newDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewDescription(String value) {
            this.newDescription = value;
        }

    }

}
