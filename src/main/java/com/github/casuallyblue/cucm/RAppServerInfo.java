
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RAppServerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAppServerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="appServerName" type="{http://www.cisco.com/AXL/API/11.5}XFkType" minOccurs="0"/&gt;
 *         &lt;element name="appServerContent" type="{http://www.cisco.com/AXL/API/11.5}XAppServerContent" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://www.cisco.com/AXL/API/11.5}XContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RAppServerInfo", propOrder = {
    "appServerName",
    "appServerContent",
    "content"
})
public class RAppServerInfo {

    protected XFkType appServerName;
    protected String appServerContent;
    protected XContent content;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the appServerName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAppServerName() {
        return appServerName;
    }

    /**
     * Sets the value of the appServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAppServerName(XFkType value) {
        this.appServerName = value;
    }

    /**
     * Gets the value of the appServerContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppServerContent() {
        return appServerContent;
    }

    /**
     * Sets the value of the appServerContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppServerContent(String value) {
        this.appServerContent = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link XContent }
     *     
     */
    public XContent getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link XContent }
     *     
     */
    public void setContent(XContent value) {
        this.content = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
