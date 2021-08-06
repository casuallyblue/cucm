
package com.github.casuallyblue.cucm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListGeoLocationPolicyRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListGeoLocationPolicyRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geoLocationPolicy" type="{http://www.cisco.com/AXL/API/11.5}LGeoLocationPolicy" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ListGeoLocationPolicyRes", propOrder = {
    "_return"
})
public class ListGeoLocationPolicyRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListGeoLocationPolicyRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListGeoLocationPolicyRes.Return }
     *     
     */
    public ListGeoLocationPolicyRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListGeoLocationPolicyRes.Return }
     *     
     */
    public void setReturn(ListGeoLocationPolicyRes.Return value) {
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
     *         &lt;element name="geoLocationPolicy" type="{http://www.cisco.com/AXL/API/11.5}LGeoLocationPolicy" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "geoLocationPolicy"
    })
    public static class Return {

        protected List<LGeoLocationPolicy> geoLocationPolicy;

        /**
         * Gets the value of the geoLocationPolicy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geoLocationPolicy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeoLocationPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LGeoLocationPolicy }
         * 
         * 
         */
        public List<LGeoLocationPolicy> getGeoLocationPolicy() {
            if (geoLocationPolicy == null) {
                geoLocationPolicy = new ArrayList<LGeoLocationPolicy>();
            }
            return this.geoLocationPolicy;
        }

    }

}