
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddFeatureGroupTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFeatureGroupTemplateReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="featureGroupTemplate" type="{http://www.cisco.com/AXL/API/11.5}XFeatureGroupTemplate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFeatureGroupTemplateReq", propOrder = {
    "featureGroupTemplate"
})
public class AddFeatureGroupTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XFeatureGroupTemplate featureGroupTemplate;

    /**
     * Gets the value of the featureGroupTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XFeatureGroupTemplate }
     *     
     */
    public XFeatureGroupTemplate getFeatureGroupTemplate() {
        return featureGroupTemplate;
    }

    /**
     * Sets the value of the featureGroupTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFeatureGroupTemplate }
     *     
     */
    public void setFeatureGroupTemplate(XFeatureGroupTemplate value) {
        this.featureGroupTemplate = value;
    }

}
