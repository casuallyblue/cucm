
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSNMPUserRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSNMPUserRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SNMPUser" type="{http://www.cisco.com/AXL/API/11.5}RSNMPGetUser"/&gt;
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
@XmlType(name = "GetSNMPUserRes", propOrder = {
    "_return"
})
public class GetSNMPUserRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSNMPUserRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSNMPUserRes.Return }
     *     
     */
    public GetSNMPUserRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSNMPUserRes.Return }
     *     
     */
    public void setReturn(GetSNMPUserRes.Return value) {
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
     *         &lt;element name="SNMPUser" type="{http://www.cisco.com/AXL/API/11.5}RSNMPGetUser"/&gt;
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
        "snmpUser"
    })
    public static class Return {

        @XmlElement(name = "SNMPUser", required = true)
        protected RSNMPGetUser snmpUser;

        /**
         * Gets the value of the snmpUser property.
         * 
         * @return
         *     possible object is
         *     {@link RSNMPGetUser }
         *     
         */
        public RSNMPGetUser getSNMPUser() {
            return snmpUser;
        }

        /**
         * Sets the value of the snmpUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSNMPGetUser }
         *     
         */
        public void setSNMPUser(RSNMPGetUser value) {
            this.snmpUser = value;
        }

    }

}
