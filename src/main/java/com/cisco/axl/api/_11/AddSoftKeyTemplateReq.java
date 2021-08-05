
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSoftKeyTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSoftKeyTemplateReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="softKeyTemplate" type="{http://www.cisco.com/AXL/API/11.5}XSoftKeyTemplate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSoftKeyTemplateReq", propOrder = {
    "softKeyTemplate"
})
public class AddSoftKeyTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSoftKeyTemplate softKeyTemplate;

    /**
     * Gets the value of the softKeyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XSoftKeyTemplate }
     *     
     */
    public XSoftKeyTemplate getSoftKeyTemplate() {
        return softKeyTemplate;
    }

    /**
     * Sets the value of the softKeyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSoftKeyTemplate }
     *     
     */
    public void setSoftKeyTemplate(XSoftKeyTemplate value) {
        this.softKeyTemplate = value;
    }

}
