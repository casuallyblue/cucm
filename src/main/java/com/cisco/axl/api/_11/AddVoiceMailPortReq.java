
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVoiceMailPortReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVoiceMailPortReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="voiceMailPort" type="{http://www.cisco.com/AXL/API/11.5}XVoiceMailPort"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVoiceMailPortReq", propOrder = {
    "voiceMailPort"
})
public class AddVoiceMailPortReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVoiceMailPort voiceMailPort;

    /**
     * Gets the value of the voiceMailPort property.
     * 
     * @return
     *     possible object is
     *     {@link XVoiceMailPort }
     *     
     */
    public XVoiceMailPort getVoiceMailPort() {
        return voiceMailPort;
    }

    /**
     * Sets the value of the voiceMailPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVoiceMailPort }
     *     
     */
    public void setVoiceMailPort(XVoiceMailPort value) {
        this.voiceMailPort = value;
    }

}
