
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListAdvertisedPatternsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAdvertisedPatternsRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/11.5}LAdvertisedPatterns" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ListAdvertisedPatternsRes", propOrder = {
    "_return"
})
public class ListAdvertisedPatternsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListAdvertisedPatternsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListAdvertisedPatternsRes.Return }
     *     
     */
    public ListAdvertisedPatternsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAdvertisedPatternsRes.Return }
     *     
     */
    public void setReturn(ListAdvertisedPatternsRes.Return value) {
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
     *         &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/11.5}LAdvertisedPatterns" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "advertisedPatterns"
    })
    public static class Return {

        protected List<LAdvertisedPatterns> advertisedPatterns;

        /**
         * Gets the value of the advertisedPatterns property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the advertisedPatterns property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdvertisedPatterns().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LAdvertisedPatterns }
         * 
         * 
         */
        public List<LAdvertisedPatterns> getAdvertisedPatterns() {
            if (advertisedPatterns == null) {
                advertisedPatterns = new ArrayList<LAdvertisedPatterns>();
            }
            return this.advertisedPatterns;
        }

    }

}
