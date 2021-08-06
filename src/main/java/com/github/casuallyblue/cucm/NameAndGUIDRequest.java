
package com.github.casuallyblue.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a utility object that created because many of the Get, Remove, and Update methods allow the user to specify either the name or the uuid.
 * 
 * <p>Java class for NameAndGUIDRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameAndGUIDRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.5}String100"/&gt;
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/11.5}XUUID"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndGUIDRequest", propOrder = {
    "name",
    "uuid"
})
@XmlSeeAlso({
    UpdateSipProfileReq.class,
    UpdateSipTrunkSecurityProfileReq.class,
    UpdateTimePeriodReq.class,
    UpdateTimeScheduleReq.class,
    UpdateTodAccessReq.class,
    UpdateProcessNodeReq.class,
    UpdateCallerFilterListReq.class,
    UpdateRoutePartitionReq.class,
    UpdateCssReq.class,
    UpdateCallManagerReq.class,
    UpdateMediaResourceGroupReq.class,
    UpdateMediaResourceListReq.class,
    UpdateRegionReq.class,
    UpdateAarGroupReq.class,
    UpdatePhysicalLocationReq.class,
    UpdateRouteGroupReq.class,
    UpdateDevicePoolReq.class,
    UpdateDeviceMobilityGroupReq.class,
    UpdateLocationReq.class,
    UpdateSoftKeyTemplateReq.class,
    UpdateTranscoderReq.class,
    UpdateCommonDeviceConfigReq.class,
    UpdateResourcePriorityNamespaceListReq.class,
    UpdateDeviceMobilityReq.class,
    UpdateCredentialPolicyReq.class,
    UpdateFacInfoReq.class,
    UpdateHuntListReq.class,
    UpdateLineGroupReq.class,
    UpdateRecordingProfileReq.class,
    UpdateRouteFilterReq.class,
    UpdateCallManagerGroupReq.class,
    UpdateUserGroupReq.class,
    UpdateRouteListReq.class,
    UpdateDateTimeGroupReq.class,
    UpdatePresenceGroupReq.class,
    UpdateGeoLocationReq.class,
    UpdateSrstReq.class,
    UpdateCumaServerSecurityProfileReq.class,
    UpdateGeoLocationFilterReq.class,
    UpdateVoiceMailProfileReq.class,
    UpdateVoiceMailPortReq.class,
    UpdateGatekeeperReq.class,
    UpdatePhoneButtonTemplateReq.class,
    UpdateCommonPhoneConfigReq.class,
    UpdateCtiRoutePointReq.class,
    UpdateApplicationDialRulesReq.class,
    UpdateDirectoryLookupDialRulesReq.class,
    UpdatePhoneSecurityProfileReq.class,
    UpdateSipDialRulesReq.class,
    UpdateConferenceBridgeReq.class,
    UpdateAnnunciatorReq.class,
    UpdateInteractiveVoiceResponseReq.class,
    UpdateMtpReq.class,
    UpdateFixedMohAudioSourceReq.class,
    UpdateRemoteDestinationProfileReq.class,
    UpdateDefaultDeviceProfileReq.class,
    UpdateH323PhoneReq.class,
    UpdateMohServerReq.class,
    UpdateH323TrunkReq.class,
    UpdatePhoneReq.class,
    UpdateH323GatewayReq.class,
    UpdateDeviceProfileReq.class,
    UpdateGatewayEndpointAnalogAccessReq.class,
    UpdateGatewayEndpointDigitalAccessPriReq.class,
    UpdateGatewayEndpointDigitalAccessBriReq.class,
    UpdateGatewayEndpointDigitalAccessT1Req.class,
    UpdateCiscoCatalyst600024PortFXSGatewayReq.class,
    UpdateCiscoCatalyst6000E1VoIPGatewayReq.class,
    UpdateCiscoCatalyst6000T1VoIPGatewayPriReq.class,
    UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.class,
    UpdateGeoLocationPolicyReq.class,
    UpdateSipTrunkReq.class,
    UpdateExternalCallControlProfileReq.class,
    UpdateSafSecurityProfileReq.class,
    UpdateSafForwarderReq.class,
    UpdateCcdHostedDNGroupReq.class,
    UpdateCcdRequestingServiceReq.class,
    UpdateCcdAdvertisingServiceReq.class,
    UpdateLdapDirectoryReq.class,
    UpdateVpnGatewayReq.class,
    UpdateVpnGroupReq.class,
    UpdateVpnProfileReq.class,
    UpdateImeServerReq.class,
    UpdateImeRouteFilterGroupReq.class,
    UpdateImeRouteFilterElementReq.class,
    UpdateImeClientReq.class,
    UpdateImeEnrolledPatternGroupReq.class,
    UpdateImeExclusionNumberGroupReq.class,
    UpdateImeFirewallReq.class,
    UpdateImeE164TransformationReq.class,
    UpdateTransformationProfileReq.class,
    UpdateFallbackProfileReq.class,
    UpdateLdapFilterReq.class,
    UpdateFeatureControlPolicyReq.class,
    UpdateMobilityProfileReq.class,
    UpdateSIPNormalizationScriptReq.class,
    UpdateGatewaySccpEndpointsReq.class,
    UpdateLbmGroupReq.class,
    UpdateAnnouncementReq.class,
    UpdateServiceProfileReq.class,
    UpdateAudioCodecPreferenceListReq.class,
    UpdateUcServiceReq.class,
    UpdateLbmHubGroupReq.class,
    UpdateImportedDirectoryUriCatalogsReq.class,
    UpdateVohServerReq.class,
    UpdateSdpTransparencyProfileReq.class,
    UpdateFeatureGroupTemplateReq.class,
    UpdateDirNumberAliasLookupandSyncReq.class,
    UpdateUniversalDeviceTemplateReq.class,
    UpdateUserProfileProvisionReq.class,
    UpdatePresenceRedundancyGroupReq.class,
    UpdateWifiHotspotReq.class,
    UpdateWlanProfileGroupReq.class,
    UpdateWLANProfileReq.class,
    UpdateUniversalLineTemplateReq.class,
    UpdateNetworkAccessProfileReq.class,
    UpdateHttpProfileReq.class,
    UpdateElinGroupReq.class,
    UpdateSecureConfigReq.class,
    UpdateWirelessAccessPointControllersReq.class,
    UpdateSoftKeySetReq.class
})
public class NameAndGUIDRequest
    extends APIRequest
{

    protected String name;
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
