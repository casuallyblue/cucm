
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImportedDirectoryUriCatalogsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImportedDirectoryUriCatalogsRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="importedDirectoryUriCatalogs" type="{http://www.cisco.com/AXL/API/11.5}RImportedDirectoryUriCatalogs"/&gt;
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
@XmlType(name = "GetImportedDirectoryUriCatalogsRes", propOrder = {
    "_return"
})
public class GetImportedDirectoryUriCatalogsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImportedDirectoryUriCatalogsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImportedDirectoryUriCatalogsRes.Return }
     *     
     */
    public GetImportedDirectoryUriCatalogsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImportedDirectoryUriCatalogsRes.Return }
     *     
     */
    public void setReturn(GetImportedDirectoryUriCatalogsRes.Return value) {
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
     *         &lt;element name="importedDirectoryUriCatalogs" type="{http://www.cisco.com/AXL/API/11.5}RImportedDirectoryUriCatalogs"/&gt;
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
        "importedDirectoryUriCatalogs"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImportedDirectoryUriCatalogs importedDirectoryUriCatalogs;

        /**
         * Gets the value of the importedDirectoryUriCatalogs property.
         * 
         * @return
         *     possible object is
         *     {@link RImportedDirectoryUriCatalogs }
         *     
         */
        public RImportedDirectoryUriCatalogs getImportedDirectoryUriCatalogs() {
            return importedDirectoryUriCatalogs;
        }

        /**
         * Sets the value of the importedDirectoryUriCatalogs property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImportedDirectoryUriCatalogs }
         *     
         */
        public void setImportedDirectoryUriCatalogs(RImportedDirectoryUriCatalogs value) {
            this.importedDirectoryUriCatalogs = value;
        }

    }

}
