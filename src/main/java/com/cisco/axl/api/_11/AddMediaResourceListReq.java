
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMediaResourceListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMediaResourceListReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediaResourceList" type="{http://www.cisco.com/AXL/API/11.5}XMediaResourceList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMediaResourceListReq", propOrder = {
    "mediaResourceList"
})
public class AddMediaResourceListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMediaResourceList mediaResourceList;

    /**
     * Gets the value of the mediaResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link XMediaResourceList }
     *     
     */
    public XMediaResourceList getMediaResourceList() {
        return mediaResourceList;
    }

    /**
     * Sets the value of the mediaResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMediaResourceList }
     *     
     */
    public void setMediaResourceList(XMediaResourceList value) {
        this.mediaResourceList = value;
    }

}
