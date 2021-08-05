
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSNMPCommunityStringReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSNMPCommunityStringReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="communityName" type="{http://www.cisco.com/AXL/API/11.5}String32"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSNMPCommunityStringReq", propOrder = {
    "communityName"
})
public class GetSNMPCommunityStringReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String communityName;

    /**
     * Gets the value of the communityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     * Sets the value of the communityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityName(String value) {
        this.communityName = value;
    }

}
