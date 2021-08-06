
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCcdHostedDNReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCcdHostedDNReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ccdHostedDN" type="{http://www.cisco.com/AXL/API/11.5}XCcdHostedDN"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCcdHostedDNReq", propOrder = {
    "ccdHostedDN"
})
public class AddCcdHostedDNReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCcdHostedDN ccdHostedDN;

    /**
     * Gets the value of the ccdHostedDN property.
     * 
     * @return
     *     possible object is
     *     {@link XCcdHostedDN }
     *     
     */
    public XCcdHostedDN getCcdHostedDN() {
        return ccdHostedDN;
    }

    /**
     * Sets the value of the ccdHostedDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCcdHostedDN }
     *     
     */
    public void setCcdHostedDN(XCcdHostedDN value) {
        this.ccdHostedDN = value;
    }

}