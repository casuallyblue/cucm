
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAnnouncementReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAnnouncementReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="announcement" type="{http://www.cisco.com/AXL/API/11.5}XAnnouncement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAnnouncementReq", propOrder = {
    "announcement"
})
public class AddAnnouncementReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAnnouncement announcement;

    /**
     * Gets the value of the announcement property.
     * 
     * @return
     *     possible object is
     *     {@link XAnnouncement }
     *     
     */
    public XAnnouncement getAnnouncement() {
        return announcement;
    }

    /**
     * Sets the value of the announcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAnnouncement }
     *     
     */
    public void setAnnouncement(XAnnouncement value) {
        this.announcement = value;
    }

}
