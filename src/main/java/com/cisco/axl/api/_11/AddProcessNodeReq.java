
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddProcessNodeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddProcessNodeReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processNode" type="{http://www.cisco.com/AXL/API/11.5}XProcessNode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddProcessNodeReq", propOrder = {
    "processNode"
})
public class AddProcessNodeReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XProcessNode processNode;

    /**
     * Gets the value of the processNode property.
     * 
     * @return
     *     possible object is
     *     {@link XProcessNode }
     *     
     */
    public XProcessNode getProcessNode() {
        return processNode;
    }

    /**
     * Sets the value of the processNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link XProcessNode }
     *     
     */
    public void setProcessNode(XProcessNode value) {
        this.processNode = value;
    }

}
