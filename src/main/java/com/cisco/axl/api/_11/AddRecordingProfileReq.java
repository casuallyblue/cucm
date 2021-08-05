
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddRecordingProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRecordingProfileReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordingProfile" type="{http://www.cisco.com/AXL/API/11.5}XRecordingProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRecordingProfileReq", propOrder = {
    "recordingProfile"
})
public class AddRecordingProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XRecordingProfile recordingProfile;

    /**
     * Gets the value of the recordingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XRecordingProfile }
     *     
     */
    public XRecordingProfile getRecordingProfile() {
        return recordingProfile;
    }

    /**
     * Sets the value of the recordingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRecordingProfile }
     *     
     */
    public void setRecordingProfile(XRecordingProfile value) {
        this.recordingProfile = value;
    }

}
