
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMeetMeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMeetMeReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meetMe" type="{http://www.cisco.com/AXL/API/11.5}XMeetMe"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMeetMeReq", propOrder = {
    "meetMe"
})
public class AddMeetMeReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMeetMe meetMe;

    /**
     * Gets the value of the meetMe property.
     * 
     * @return
     *     possible object is
     *     {@link XMeetMe }
     *     
     */
    public XMeetMe getMeetMe() {
        return meetMe;
    }

    /**
     * Sets the value of the meetMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMeetMe }
     *     
     */
    public void setMeetMe(XMeetMe value) {
        this.meetMe = value;
    }

}
