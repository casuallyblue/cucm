
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveSNMPCommunityStringReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveSNMPCommunityStringReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommunityString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveSNMPCommunityStringReq", propOrder = {
    "communityString"
})
public class RemoveSNMPCommunityStringReq
    extends APIRequest
{

    @XmlElement(name = "CommunityString", required = true)
    protected String communityString;

    /**
     * Gets the value of the communityString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityString() {
        return communityString;
    }

    /**
     * Sets the value of the communityString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityString(String value) {
        this.communityString = value;
    }

}
