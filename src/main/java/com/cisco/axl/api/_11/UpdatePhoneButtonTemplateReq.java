
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePhoneButtonTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePhoneButtonTemplateReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}NameAndGUIDRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buttons" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="button" type="{http://www.cisco.com/AXL/API/11.5}XButton" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "UpdatePhoneButtonTemplateReq", propOrder = {
    "newName",
    "buttons"
})
public class UpdatePhoneButtonTemplateReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected UpdatePhoneButtonTemplateReq.Buttons buttons;

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
     * Gets the value of the buttons property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePhoneButtonTemplateReq.Buttons }
     *     
     */
    public UpdatePhoneButtonTemplateReq.Buttons getButtons() {
        return buttons;
    }

    /**
     * Sets the value of the buttons property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePhoneButtonTemplateReq.Buttons }
     *     
     */
    public void setButtons(UpdatePhoneButtonTemplateReq.Buttons value) {
        this.buttons = value;
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
     *         &lt;element name="button" type="{http://www.cisco.com/AXL/API/11.5}XButton" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "button"
    })
    public static class Buttons {

        protected List<XButton> button;

        /**
         * Gets the value of the button property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the button property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getButton().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XButton }
         * 
         * 
         */
        public List<XButton> getButton() {
            if (button == null) {
                button = new ArrayList<XButton>();
            }
            return this.button;
        }

    }

}
