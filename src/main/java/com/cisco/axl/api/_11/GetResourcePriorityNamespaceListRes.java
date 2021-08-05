
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourcePriorityNamespaceListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourcePriorityNamespaceListRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="resourcePriorityNamespaceList" type="{http://www.cisco.com/AXL/API/11.5}RResourcePriorityNamespaceList"/&gt;
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
@XmlType(name = "GetResourcePriorityNamespaceListRes", propOrder = {
    "_return"
})
public class GetResourcePriorityNamespaceListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetResourcePriorityNamespaceListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetResourcePriorityNamespaceListRes.Return }
     *     
     */
    public GetResourcePriorityNamespaceListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResourcePriorityNamespaceListRes.Return }
     *     
     */
    public void setReturn(GetResourcePriorityNamespaceListRes.Return value) {
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
     *         &lt;element name="resourcePriorityNamespaceList" type="{http://www.cisco.com/AXL/API/11.5}RResourcePriorityNamespaceList"/&gt;
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
        "resourcePriorityNamespaceList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RResourcePriorityNamespaceList resourcePriorityNamespaceList;

        /**
         * Gets the value of the resourcePriorityNamespaceList property.
         * 
         * @return
         *     possible object is
         *     {@link RResourcePriorityNamespaceList }
         *     
         */
        public RResourcePriorityNamespaceList getResourcePriorityNamespaceList() {
            return resourcePriorityNamespaceList;
        }

        /**
         * Sets the value of the resourcePriorityNamespaceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RResourcePriorityNamespaceList }
         *     
         */
        public void setResourcePriorityNamespaceList(RResourcePriorityNamespaceList value) {
            this.resourcePriorityNamespaceList = value;
        }

    }

}
