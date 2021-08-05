
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRecordingProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRecordingProfileRes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="recordingProfile" type="{http://www.cisco.com/AXL/API/11.5}RRecordingProfile"/&gt;
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
@XmlType(name = "GetRecordingProfileRes", propOrder = {
    "_return"
})
public class GetRecordingProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetRecordingProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetRecordingProfileRes.Return }
     *     
     */
    public GetRecordingProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRecordingProfileRes.Return }
     *     
     */
    public void setReturn(GetRecordingProfileRes.Return value) {
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
     *         &lt;element name="recordingProfile" type="{http://www.cisco.com/AXL/API/11.5}RRecordingProfile"/&gt;
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
        "recordingProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RRecordingProfile recordingProfile;

        /**
         * Gets the value of the recordingProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RRecordingProfile }
         *     
         */
        public RRecordingProfile getRecordingProfile() {
            return recordingProfile;
        }

        /**
         * Sets the value of the recordingProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RRecordingProfile }
         *     
         */
        public void setRecordingProfile(RRecordingProfile value) {
            this.recordingProfile = value;
        }

    }

}
