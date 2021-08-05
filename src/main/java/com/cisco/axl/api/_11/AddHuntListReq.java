
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddHuntListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddHuntListReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="huntList" type="{http://www.cisco.com/AXL/API/11.5}XHuntList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddHuntListReq", propOrder = {
    "huntList"
})
public class AddHuntListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XHuntList huntList;

    /**
     * Gets the value of the huntList property.
     * 
     * @return
     *     possible object is
     *     {@link XHuntList }
     *     
     */
    public XHuntList getHuntList() {
        return huntList;
    }

    /**
     * Sets the value of the huntList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XHuntList }
     *     
     */
    public void setHuntList(XHuntList value) {
        this.huntList = value;
    }

}
