
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCcdFeatureConfigReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCcdFeatureConfigReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ccdParam" type="{http://www.cisco.com/AXL/API/11.5}RCcdParam" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCcdFeatureConfigReq", propOrder = {
    "ccdParam"
})
public class UpdateCcdFeatureConfigReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected List<RCcdParam> ccdParam;

    /**
     * Gets the value of the ccdParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccdParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcdParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RCcdParam }
     * 
     * 
     */
    public List<RCcdParam> getCcdParam() {
        if (ccdParam == null) {
            ccdParam = new ArrayList<RCcdParam>();
        }
        return this.ccdParam;
    }

}
