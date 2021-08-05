
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMlppDomainReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMlppDomainReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mlppDomain" type="{http://www.cisco.com/AXL/API/11.5}XMlppDomain"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMlppDomainReq", propOrder = {
    "mlppDomain"
})
public class AddMlppDomainReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XMlppDomain mlppDomain;

    /**
     * Gets the value of the mlppDomain property.
     * 
     * @return
     *     possible object is
     *     {@link XMlppDomain }
     *     
     */
    public XMlppDomain getMlppDomain() {
        return mlppDomain;
    }

    /**
     * Sets the value of the mlppDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMlppDomain }
     *     
     */
    public void setMlppDomain(XMlppDomain value) {
        this.mlppDomain = value;
    }

}
