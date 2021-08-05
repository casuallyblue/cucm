
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSipRealm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSipRealm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="realm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="digestCredentials" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSipRealm", propOrder = {
    "realm",
    "userid",
    "digestCredentials"
})
public class XSipRealm {

    protected String realm;
    protected String userid;
    protected String digestCredentials;

    /**
     * Gets the value of the realm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealm() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealm(String value) {
        this.realm = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the digestCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestCredentials() {
        return digestCredentials;
    }

    /**
     * Sets the value of the digestCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestCredentials(String value) {
        this.digestCredentials = value;
    }

}
