
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLicensedUserRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLicensedUserRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="licensedUser" type="{http://www.cisco.com/AXL/API/11.5}RLicensedUser"/&gt;
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
@XmlType(name = "GetLicensedUserRes", propOrder = {
    "_return"
})
public class GetLicensedUserRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLicensedUserRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLicensedUserRes.Return }
     *     
     */
    public GetLicensedUserRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLicensedUserRes.Return }
     *     
     */
    public void setReturn(GetLicensedUserRes.Return value) {
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
     *         &lt;element name="licensedUser" type="{http://www.cisco.com/AXL/API/11.5}RLicensedUser"/&gt;
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
        "licensedUser"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLicensedUser licensedUser;

        /**
         * Gets the value of the licensedUser property.
         * 
         * @return
         *     possible object is
         *     {@link RLicensedUser }
         *     
         */
        public RLicensedUser getLicensedUser() {
            return licensedUser;
        }

        /**
         * Sets the value of the licensedUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLicensedUser }
         *     
         */
        public void setLicensedUser(RLicensedUser value) {
            this.licensedUser = value;
        }

    }

}
