
package com.cisco.axl.api._11;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * All requests must extend abstractRequest.
 * 
 * <p>Java class for APIRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIRequest")
@XmlSeeAlso({
    AddSipProfileReq.class,
    AddSipTrunkSecurityProfileReq.class,
    AddTimePeriodReq.class,
    AddTimeScheduleReq.class,
    AddTodAccessReq.class,
    AddVoiceMailPilotReq.class,
    UpdateVoiceMailPilotReq.class,
    AddProcessNodeReq.class,
    AddCallerFilterListReq.class,
    AddRoutePartitionReq.class,
    AddCssReq.class,
    AddMediaResourceGroupReq.class,
    AddMediaResourceListReq.class,
    AddRegionReq.class,
    AddAarGroupReq.class,
    AddPhysicalLocationReq.class,
    AddRouteGroupReq.class,
    AddDevicePoolReq.class,
    AddDeviceMobilityGroupReq.class,
    AddLocationReq.class,
    AddSoftKeyTemplateReq.class,
    AddTranscoderReq.class,
    AddCommonDeviceConfigReq.class,
    AddResourcePriorityNamespaceReq.class,
    UpdateResourcePriorityNamespaceReq.class,
    AddResourcePriorityNamespaceListReq.class,
    AddDeviceMobilityReq.class,
    AddCmcInfoReq.class,
    UpdateCmcInfoReq.class,
    AddCredentialPolicyReq.class,
    AddFacInfoReq.class,
    AddHuntListReq.class,
    AddIvrUserLocaleReq.class,
    UpdateIvrUserLocaleReq.class,
    AddLineGroupReq.class,
    AddRecordingProfileReq.class,
    AddRouteFilterReq.class,
    AddCallManagerGroupReq.class,
    AddUserGroupReq.class,
    UpdateProcessNodeServiceReq.class,
    UpdateMohAudioSourceReq.class,
    AddDhcpServerReq.class,
    UpdateDhcpServerReq.class,
    AddDhcpSubnetReq.class,
    UpdateDhcpSubnetReq.class,
    AddCallParkReq.class,
    UpdateCallParkReq.class,
    AddDirectedCallParkReq.class,
    UpdateDirectedCallParkReq.class,
    AddMeetMeReq.class,
    UpdateMeetMeReq.class,
    AddConferenceNowReq.class,
    UpdateConferenceNowReq.class,
    AddMobileVoiceAccessReq.class,
    UpdateMobileVoiceAccessReq.class,
    AddRouteListReq.class,
    AddUserReq.class,
    UpdateUserReq.class,
    AddAppUserReq.class,
    UpdateAppUserReq.class,
    AddSipRealmReq.class,
    UpdateSipRealmReq.class,
    AddPhoneNtpReq.class,
    UpdatePhoneNtpReq.class,
    AddDateTimeGroupReq.class,
    AddPresenceGroupReq.class,
    AddGeoLocationReq.class,
    AddSrstReq.class,
    AddMlppDomainReq.class,
    UpdateMlppDomainReq.class,
    AddCumaServerSecurityProfileReq.class,
    AddApplicationServerReq.class,
    UpdateApplicationServerReq.class,
    AddApplicationUserCapfProfileReq.class,
    UpdateApplicationUserCapfProfileReq.class,
    AddEndUserCapfProfileReq.class,
    UpdateEndUserCapfProfileReq.class,
    UpdateServiceParameterReq.class,
    AddUserPhoneAssociationReq.class,
    AddGeoLocationFilterReq.class,
    AddVoiceMailProfileReq.class,
    AddVoiceMailPortReq.class,
    AddGatekeeperReq.class,
    AddPhoneButtonTemplateReq.class,
    AddCommonPhoneConfigReq.class,
    AddMessageWaitingReq.class,
    UpdateMessageWaitingReq.class,
    AddIpPhoneServicesReq.class,
    UpdateIpPhoneServicesReq.class,
    AddCtiRoutePointReq.class,
    AddTransPatternReq.class,
    UpdateTransPatternReq.class,
    AddCallingPartyTransformationPatternReq.class,
    UpdateCallingPartyTransformationPatternReq.class,
    AddSipRoutePatternReq.class,
    UpdateSipRoutePatternReq.class,
    AddHuntPilotReq.class,
    UpdateHuntPilotReq.class,
    AddRoutePatternReq.class,
    UpdateRoutePatternReq.class,
    AddApplicationDialRulesReq.class,
    AddDirectoryLookupDialRulesReq.class,
    AddPhoneSecurityProfileReq.class,
    AddSipDialRulesReq.class,
    AddConferenceBridgeReq.class,
    AddMtpReq.class,
    UpdateAarGroupMatrixReq.class,
    AddRemoteDestinationProfileReq.class,
    AddLineReq.class,
    UpdateLineReq.class,
    AddDefaultDeviceProfileReq.class,
    AddH323PhoneReq.class,
    AddH323TrunkReq.class,
    AddPhoneReq.class,
    AddH323GatewayReq.class,
    AddDeviceProfileReq.class,
    AddRemoteDestinationReq.class,
    UpdateRemoteDestinationReq.class,
    AddVg224Req.class,
    UpdateVg224Req.class,
    AddGatewayReq.class,
    UpdateGatewayReq.class,
    AddGatewayEndpointAnalogAccessReq.class,
    AddGatewayEndpointDigitalAccessPriReq.class,
    AddGatewayEndpointDigitalAccessBriReq.class,
    AddGatewayEndpointDigitalAccessT1Req.class,
    AddCiscoCatalyst600024PortFXSGatewayReq.class,
    AddCiscoCatalyst6000E1VoIPGatewayReq.class,
    AddCiscoCatalyst6000T1VoIPGatewayPriReq.class,
    AddCiscoCatalyst6000T1VoIPGatewayT1Req.class,
    AddCallPickupGroupReq.class,
    UpdateCallPickupGroupReq.class,
    AddGeoLocationPolicyReq.class,
    AddSipTrunkReq.class,
    UpdateRegionMatrixReq.class,
    AddCalledPartyTransformationPatternReq.class,
    UpdateCalledPartyTransformationPatternReq.class,
    AddExternalCallControlProfileReq.class,
    AddSafSecurityProfileReq.class,
    AddSafForwarderReq.class,
    AddCcdHostedDNReq.class,
    UpdateCcdHostedDNReq.class,
    AddCcdHostedDNGroupReq.class,
    AddCcdRequestingServiceReq.class,
    UpdateInterClusterServiceProfileReq.class,
    AddRemoteClusterReq.class,
    UpdateRemoteClusterReq.class,
    AddCcdAdvertisingServiceReq.class,
    AddUnitsToGatewayReq.class,
    AddGatewaySubunitsReq.class,
    AddLdapDirectoryReq.class,
    UpdateEmccFeatureConfigReq.class,
    AddSafCcdPurgeBlockLearnedRoutesReq.class,
    UpdateSafCcdPurgeBlockLearnedRoutesReq.class,
    AddVpnGatewayReq.class,
    AddVpnGroupReq.class,
    AddVpnProfileReq.class,
    AddImeServerReq.class,
    AddImeRouteFilterGroupReq.class,
    AddImeRouteFilterElementReq.class,
    AddImeClientReq.class,
    AddImeEnrolledPatternReq.class,
    UpdateImeEnrolledPatternReq.class,
    AddImeEnrolledPatternGroupReq.class,
    AddImeExclusionNumberReq.class,
    UpdateImeExclusionNumberReq.class,
    AddImeExclusionNumberGroupReq.class,
    AddImeFirewallReq.class,
    AddImeE164TransformationReq.class,
    AddTransformationProfileReq.class,
    AddFallbackProfileReq.class,
    AddLdapFilterReq.class,
    AddAppServerInfoReq.class,
    UpdateAppServerInfoReq.class,
    UpdateTvsCertificateReq.class,
    AddFeatureControlPolicyReq.class,
    AddMobilityProfileReq.class,
    AddEnterpriseFeatureAccessConfigurationReq.class,
    UpdateEnterpriseFeatureAccessConfigurationReq.class,
    AddHandoffConfigurationReq.class,
    UpdateHandoffConfigurationReq.class,
    AddCalledPartyTracingReq.class,
    AddSIPNormalizationScriptReq.class,
    AddCustomUserFieldReq.class,
    UpdateCustomUserFieldReq.class,
    AddGatewaySccpEndpointsReq.class,
    AddBillingServerReq.class,
    AddLbmGroupReq.class,
    AddAnnouncementReq.class,
    AddServiceProfileReq.class,
    AddLdapSyncCustomFieldReq.class,
    UpdateLdapSyncCustomFieldReq.class,
    AddAudioCodecPreferenceListReq.class,
    AddUcServiceReq.class,
    AddLbmHubGroupReq.class,
    AddImportedDirectoryUriCatalogsReq.class,
    AddVohServerReq.class,
    AddSdpTransparencyProfileReq.class,
    AddFeatureGroupTemplateReq.class,
    AddDirNumberAliasLookupandSyncReq.class,
    AddLocalRouteGroupReq.class,
    AddAdvertisedPatternsReq.class,
    UpdateAdvertisedPatternsReq.class,
    AddBlockedLearnedPatternsReq.class,
    UpdateBlockedLearnedPatternsReq.class,
    AddCCAProfilesReq.class,
    UpdateCCAProfilesReq.class,
    AddUniversalDeviceTemplateReq.class,
    AddUserProfileProvisionReq.class,
    AddPresenceRedundancyGroupReq.class,
    AddWifiHotspotReq.class,
    AddWlanProfileGroupReq.class,
    AddWLANProfileReq.class,
    AddUniversalLineTemplateReq.class,
    AddNetworkAccessProfileReq.class,
    AddHttpProfileReq.class,
    AddElinGroupReq.class,
    AddInfrastructureDeviceReq.class,
    UpdateInfrastructureDeviceReq.class,
    UpdateLdapSearchReq.class,
    AddWirelessAccessPointControllersReq.class,
    ExecuteSQLQueryReq.class,
    ExecuteSQLUpdateReq.class,
    DoAuthenticateUserReq.class,
    DoDeviceLoginReq.class,
    DoDeviceLogoutReq.class,
    DoDeviceResetReq.class,
    GetNumDevicesReq.class,
    AddMobilityReq.class,
    AddApplicationToSoftkeyTemplateReq.class,
    UpdateImeLearnedRoutesReq.class,
    GetImeLearnedRoutesReq.class,
    DoLdapSyncReq.class,
    GetLdapSyncStatusReq.class,
    NameAndGUIDRequest.class,
    DoUpdateRemoteClusterReq.class,
    UpdateSyslogConfigurationReq.class,
    GetPhoneTypeDisplayInstanceReq.class,
    UpdateInterClusterDirectoryUriReq.class,
    UpdateIlsConfigReq.class,
    AddSNMPCommunityStringReq.class,
    RemoveSNMPCommunityStringReq.class,
    GetSNMPCommunityStringReq.class,
    UpdateSNMPCommunityStringReq.class,
    AddSNMPUserReq.class,
    GetSNMPUserReq.class,
    RemoveSNMPUserReq.class,
    UpdateSNMPUserReq.class,
    GetSNMPMIB2ListReq.class,
    UpdateSNMPMIB2ListReq.class,
    UpdateCcdFeatureConfigReq.class,
    UpdateBillingServerReq.class,
    UpdateRoutePartitionsForLearnedPatternsReq.class,
    UpdateLocalRouteGroupReq.class,
    UpdatePageLayoutPreferencesReq.class,
    GetPageLayoutPreferencesReq.class,
    AssignPresenceUserReq.class,
    UnassignPresenceUserReq.class,
    UpdateCredentialPolicyDefaultReq.class,
    UpdateSelfProvisioningReq.class,
    ListChangeReq.class,
    DoChangeDNDStatusReq.class,
    DoServiceParametersResetReq.class
})
public abstract class APIRequest {

    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}
