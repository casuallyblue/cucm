
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListPhoneSecurityProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListPhoneSecurityProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="phoneSecurityProfile" type="{http://www.cisco.com/AXL/API/11.5}LPhoneSecurityProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ListPhoneSecurityProfileRes", propOrder = {
    "_return"
})
public class ListPhoneSecurityProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListPhoneSecurityProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListPhoneSecurityProfileRes.Return }
     *     
     */
    public ListPhoneSecurityProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPhoneSecurityProfileRes.Return }
     *     
     */
    public void setReturn(ListPhoneSecurityProfileRes.Return value) {
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
     *         &lt;element name="phoneSecurityProfile" type="{http://www.cisco.com/AXL/API/11.5}LPhoneSecurityProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "phoneSecurityProfile"
    })
    public static class Return {

        protected List<LPhoneSecurityProfile> phoneSecurityProfile;

        /**
         * Gets the value of the phoneSecurityProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneSecurityProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneSecurityProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LPhoneSecurityProfile }
         * 
         * 
         */
        public List<LPhoneSecurityProfile> getPhoneSecurityProfile() {
            if (phoneSecurityProfile == null) {
                phoneSecurityProfile = new ArrayList<LPhoneSecurityProfile>();
            }
            return this.phoneSecurityProfile;
        }

    }

}
