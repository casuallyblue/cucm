
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImeExclusionNumberGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImeExclusionNumberGroupRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imeExclusionNumberGroup" type="{http://www.cisco.com/AXL/API/11.5}RImeExclusionNumberGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImeExclusionNumberGroupRes", propOrder = {
    "_return"
})
public class GetImeExclusionNumberGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImeExclusionNumberGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImeExclusionNumberGroupRes.Return }
     *     
     */
    public GetImeExclusionNumberGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImeExclusionNumberGroupRes.Return }
     *     
     */
    public void setReturn(GetImeExclusionNumberGroupRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="imeExclusionNumberGroup" type="{http://www.cisco.com/AXL/API/11.5}RImeExclusionNumberGroup"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "imeExclusionNumberGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImeExclusionNumberGroup imeExclusionNumberGroup;

        /**
         * Gets the value of the imeExclusionNumberGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RImeExclusionNumberGroup }
         *     
         */
        public RImeExclusionNumberGroup getImeExclusionNumberGroup() {
            return imeExclusionNumberGroup;
        }

        /**
         * Sets the value of the imeExclusionNumberGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImeExclusionNumberGroup }
         *     
         */
        public void setImeExclusionNumberGroup(RImeExclusionNumberGroup value) {
            this.imeExclusionNumberGroup = value;
        }

    }

}
