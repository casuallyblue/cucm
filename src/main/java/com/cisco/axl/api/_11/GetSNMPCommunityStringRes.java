
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSNMPCommunityStringRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSNMPCommunityStringRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SNMPCommunityString" type="{http://www.cisco.com/AXL/API/11.5}RSNMPCommunityString"/&gt;
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
@XmlType(name = "GetSNMPCommunityStringRes", propOrder = {
    "_return"
})
public class GetSNMPCommunityStringRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSNMPCommunityStringRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSNMPCommunityStringRes.Return }
     *     
     */
    public GetSNMPCommunityStringRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSNMPCommunityStringRes.Return }
     *     
     */
    public void setReturn(GetSNMPCommunityStringRes.Return value) {
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
     *         &lt;element name="SNMPCommunityString" type="{http://www.cisco.com/AXL/API/11.5}RSNMPCommunityString"/&gt;
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
        "snmpCommunityString"
    })
    public static class Return {

        @XmlElement(name = "SNMPCommunityString", required = true)
        protected RSNMPCommunityString snmpCommunityString;

        /**
         * Gets the value of the snmpCommunityString property.
         * 
         * @return
         *     possible object is
         *     {@link RSNMPCommunityString }
         *     
         */
        public RSNMPCommunityString getSNMPCommunityString() {
            return snmpCommunityString;
        }

        /**
         * Sets the value of the snmpCommunityString property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSNMPCommunityString }
         *     
         */
        public void setSNMPCommunityString(RSNMPCommunityString value) {
            this.snmpCommunityString = value;
        }

    }

}
