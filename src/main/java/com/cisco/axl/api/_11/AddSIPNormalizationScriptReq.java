
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSIPNormalizationScriptReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSIPNormalizationScriptReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sIPNormalizationScript" type="{http://www.cisco.com/AXL/API/11.5}XSIPNormalizationScript"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSIPNormalizationScriptReq", propOrder = {
    "sipNormalizationScript"
})
public class AddSIPNormalizationScriptReq
    extends APIRequest
{

    @XmlElement(name = "sIPNormalizationScript", required = true)
    protected XSIPNormalizationScript sipNormalizationScript;

    /**
     * Gets the value of the sipNormalizationScript property.
     * 
     * @return
     *     possible object is
     *     {@link XSIPNormalizationScript }
     *     
     */
    public XSIPNormalizationScript getSIPNormalizationScript() {
        return sipNormalizationScript;
    }

    /**
     * Sets the value of the sipNormalizationScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSIPNormalizationScript }
     *     
     */
    public void setSIPNormalizationScript(XSIPNormalizationScript value) {
        this.sipNormalizationScript = value;
    }

}
