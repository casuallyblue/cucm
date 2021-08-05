
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LElinGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LElinGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}UniqueString50" minOccurs="0"/&gt;
 *         &lt;element name="elinNumbers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="elinNumber" type="{http://www.cisco.com/AXL/API/11.5}LELINNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "LElinGroup", propOrder = {
    "name",
    "elinNumbers"
})
public class LElinGroup {

    protected String name;
    protected LElinGroup.ElinNumbers elinNumbers;
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
     * Gets the value of the elinNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link LElinGroup.ElinNumbers }
     *     
     */
    public LElinGroup.ElinNumbers getElinNumbers() {
        return elinNumbers;
    }

    /**
     * Sets the value of the elinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LElinGroup.ElinNumbers }
     *     
     */
    public void setElinNumbers(LElinGroup.ElinNumbers value) {
        this.elinNumbers = value;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}XCommonMembersExtension"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="elinNumber" type="{http://www.cisco.com/AXL/API/11.5}LELINNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "elinNumber"
    })
    public static class ElinNumbers
        extends XCommonMembersExtension
    {

        protected List<LELINNumber> elinNumber;

        /**
         * Gets the value of the elinNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elinNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElinNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LELINNumber }
         * 
         * 
         */
        public List<LELINNumber> getElinNumber() {
            if (elinNumber == null) {
                elinNumber = new ArrayList<LELINNumber>();
            }
            return this.elinNumber;
        }

    }

}
