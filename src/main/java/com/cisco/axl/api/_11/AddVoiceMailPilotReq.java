
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVoiceMailPilotReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVoiceMailPilotReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="voiceMailPilot" type="{http://www.cisco.com/AXL/API/11.5}XVoiceMailPilot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVoiceMailPilotReq", propOrder = {
    "voiceMailPilot"
})
public class AddVoiceMailPilotReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XVoiceMailPilot voiceMailPilot;

    /**
     * Gets the value of the voiceMailPilot property.
     * 
     * @return
     *     possible object is
     *     {@link XVoiceMailPilot }
     *     
     */
    public XVoiceMailPilot getVoiceMailPilot() {
        return voiceMailPilot;
    }

    /**
     * Sets the value of the voiceMailPilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVoiceMailPilot }
     *     
     */
    public void setVoiceMailPilot(XVoiceMailPilot value) {
        this.voiceMailPilot = value;
    }

}
