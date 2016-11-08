
package com.tcs.gosi.pojo.shiftupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "shiftId",
    "bo",
    "boStatus",
    "boStatusDateTime",
    "crewShiftType",
    "shiftCostProfile",
    "dripMode",
    "dripHorizon",
    "logonDetails",
    "logoffDetails",
    "serviceClass",
    "reserveCapacitiesGroup",
    "gpsDataEnabled",
    "timeZone",
    "advancedDispatchOffset",
    "advancedDispatchTasks",
    "numberOfActivities",
    "variableShift",
    "shiftDuration",
    "roundStartTimeOption",
    "crewId",
    "shiftUsage",
    "plannedStartDateTime",
    "plannedEndDateTime",
    "crewName",
    "resourceAllocation",
    "logonUser",
    "mdt",
    "forcedLogoff",
    "overridden",
    "mobileLog",
    "mobileUse",
    "version",
    "statusReason",
    "businessStatusDateTime"
})
public class BoData {

    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("bo")
    private String bo;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("boStatusDateTime")
    private String boStatusDateTime;
    @JsonProperty("crewShiftType")
    private String crewShiftType;
    @JsonProperty("shiftCostProfile")
    private String shiftCostProfile;
    @JsonProperty("dripMode")
    private String dripMode;
    @JsonProperty("dripHorizon")
    private String dripHorizon;
    @JsonProperty("logonDetails")
    private LogonDetails logonDetails;
    @JsonProperty("logoffDetails")
    private LogoffDetails logoffDetails;
    @JsonProperty("serviceClass")
    private ServiceClass serviceClass;
    @JsonProperty("reserveCapacitiesGroup")
    private ReserveCapacitiesGroup reserveCapacitiesGroup;
    @JsonProperty("gpsDataEnabled")
    private String gpsDataEnabled;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("advancedDispatchOffset")
    private String advancedDispatchOffset;
    @JsonProperty("advancedDispatchTasks")
    private String advancedDispatchTasks;
    @JsonProperty("numberOfActivities")
    private String numberOfActivities;
    @JsonProperty("variableShift")
    private String variableShift;
    @JsonProperty("shiftDuration")
    private String shiftDuration;
    @JsonProperty("roundStartTimeOption")
    private String roundStartTimeOption;
    @JsonProperty("crewId")
    private String crewId;
    @JsonProperty("shiftUsage")
    private String shiftUsage;
    @JsonProperty("plannedStartDateTime")
    private String plannedStartDateTime;
    @JsonProperty("plannedEndDateTime")
    private String plannedEndDateTime;
    @JsonProperty("crewName")
    private String crewName;
    @JsonProperty("resourceAllocation")
    private ResourceAllocation resourceAllocation;
    @JsonProperty("logonUser")
    private String logonUser;
    @JsonProperty("mdt")
    private String mdt;
    @JsonProperty("forcedLogoff")
    private String forcedLogoff;
    @JsonProperty("overridden")
    private String overridden;
    @JsonProperty("mobileLog")
    private MobileLog mobileLog;
    @JsonProperty("mobileUse")
    private MobileUse mobileUse;
    @JsonProperty("version")
    private String version;
    @JsonProperty("statusReason")
    private String statusReason;
    @JsonProperty("businessStatusDateTime")
    private String businessStatusDateTime;

    /**
     * 
     * @return
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public String getShiftId() {
        return shiftId;
    }

    /**
     * 
     * @param shiftId
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    /**
     * 
     * @return
     *     The bo
     */
    @JsonProperty("bo")
    public String getBo() {
        return bo;
    }

    /**
     * 
     * @param bo
     *     The bo
     */
    @JsonProperty("bo")
    public void setBo(String bo) {
        this.bo = bo;
    }

    /**
     * 
     * @return
     *     The boStatus
     */
    @JsonProperty("boStatus")
    public String getBoStatus() {
        return boStatus;
    }

    /**
     * 
     * @param boStatus
     *     The boStatus
     */
    @JsonProperty("boStatus")
    public void setBoStatus(String boStatus) {
        this.boStatus = boStatus;
    }

    /**
     * 
     * @return
     *     The boStatusDateTime
     */
    @JsonProperty("boStatusDateTime")
    public String getBoStatusDateTime() {
        return boStatusDateTime;
    }

    /**
     * 
     * @param boStatusDateTime
     *     The boStatusDateTime
     */
    @JsonProperty("boStatusDateTime")
    public void setBoStatusDateTime(String boStatusDateTime) {
        this.boStatusDateTime = boStatusDateTime;
    }

    /**
     * 
     * @return
     *     The crewShiftType
     */
    @JsonProperty("crewShiftType")
    public String getCrewShiftType() {
        return crewShiftType;
    }

    /**
     * 
     * @param crewShiftType
     *     The crewShiftType
     */
    @JsonProperty("crewShiftType")
    public void setCrewShiftType(String crewShiftType) {
        this.crewShiftType = crewShiftType;
    }

    /**
     * 
     * @return
     *     The shiftCostProfile
     */
    @JsonProperty("shiftCostProfile")
    public String getShiftCostProfile() {
        return shiftCostProfile;
    }

    /**
     * 
     * @param shiftCostProfile
     *     The shiftCostProfile
     */
    @JsonProperty("shiftCostProfile")
    public void setShiftCostProfile(String shiftCostProfile) {
        this.shiftCostProfile = shiftCostProfile;
    }

    /**
     * 
     * @return
     *     The dripMode
     */
    @JsonProperty("dripMode")
    public String getDripMode() {
        return dripMode;
    }

    /**
     * 
     * @param dripMode
     *     The dripMode
     */
    @JsonProperty("dripMode")
    public void setDripMode(String dripMode) {
        this.dripMode = dripMode;
    }

    /**
     * 
     * @return
     *     The dripHorizon
     */
    @JsonProperty("dripHorizon")
    public String getDripHorizon() {
        return dripHorizon;
    }

    /**
     * 
     * @param dripHorizon
     *     The dripHorizon
     */
    @JsonProperty("dripHorizon")
    public void setDripHorizon(String dripHorizon) {
        this.dripHorizon = dripHorizon;
    }

    /**
     * 
     * @return
     *     The logonDetails
     */
    @JsonProperty("logonDetails")
    public LogonDetails getLogonDetails() {
        return logonDetails;
    }

    /**
     * 
     * @param logonDetails
     *     The logonDetails
     */
    @JsonProperty("logonDetails")
    public void setLogonDetails(LogonDetails logonDetails) {
        this.logonDetails = logonDetails;
    }

    /**
     * 
     * @return
     *     The logoffDetails
     */
    @JsonProperty("logoffDetails")
    public LogoffDetails getLogoffDetails() {
        return logoffDetails;
    }

    /**
     * 
     * @param logoffDetails
     *     The logoffDetails
     */
    @JsonProperty("logoffDetails")
    public void setLogoffDetails(LogoffDetails logoffDetails) {
        this.logoffDetails = logoffDetails;
    }

    /**
     * 
     * @return
     *     The serviceClass
     */
    @JsonProperty("serviceClass")
    public ServiceClass getServiceClass() {
        return serviceClass;
    }

    /**
     * 
     * @param serviceClass
     *     The serviceClass
     */
    @JsonProperty("serviceClass")
    public void setServiceClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    /**
     * 
     * @return
     *     The reserveCapacitiesGroup
     */
    @JsonProperty("reserveCapacitiesGroup")
    public ReserveCapacitiesGroup getReserveCapacitiesGroup() {
        return reserveCapacitiesGroup;
    }

    /**
     * 
     * @param reserveCapacitiesGroup
     *     The reserveCapacitiesGroup
     */
    @JsonProperty("reserveCapacitiesGroup")
    public void setReserveCapacitiesGroup(ReserveCapacitiesGroup reserveCapacitiesGroup) {
        this.reserveCapacitiesGroup = reserveCapacitiesGroup;
    }

    /**
     * 
     * @return
     *     The gpsDataEnabled
     */
    @JsonProperty("gpsDataEnabled")
    public String getGpsDataEnabled() {
        return gpsDataEnabled;
    }

    /**
     * 
     * @param gpsDataEnabled
     *     The gpsDataEnabled
     */
    @JsonProperty("gpsDataEnabled")
    public void setGpsDataEnabled(String gpsDataEnabled) {
        this.gpsDataEnabled = gpsDataEnabled;
    }

    /**
     * 
     * @return
     *     The timeZone
     */
    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 
     * @param timeZone
     *     The timeZone
     */
    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 
     * @return
     *     The advancedDispatchOffset
     */
    @JsonProperty("advancedDispatchOffset")
    public String getAdvancedDispatchOffset() {
        return advancedDispatchOffset;
    }

    /**
     * 
     * @param advancedDispatchOffset
     *     The advancedDispatchOffset
     */
    @JsonProperty("advancedDispatchOffset")
    public void setAdvancedDispatchOffset(String advancedDispatchOffset) {
        this.advancedDispatchOffset = advancedDispatchOffset;
    }

    /**
     * 
     * @return
     *     The advancedDispatchTasks
     */
    @JsonProperty("advancedDispatchTasks")
    public String getAdvancedDispatchTasks() {
        return advancedDispatchTasks;
    }

    /**
     * 
     * @param advancedDispatchTasks
     *     The advancedDispatchTasks
     */
    @JsonProperty("advancedDispatchTasks")
    public void setAdvancedDispatchTasks(String advancedDispatchTasks) {
        this.advancedDispatchTasks = advancedDispatchTasks;
    }

    /**
     * 
     * @return
     *     The numberOfActivities
     */
    @JsonProperty("numberOfActivities")
    public String getNumberOfActivities() {
        return numberOfActivities;
    }

    /**
     * 
     * @param numberOfActivities
     *     The numberOfActivities
     */
    @JsonProperty("numberOfActivities")
    public void setNumberOfActivities(String numberOfActivities) {
        this.numberOfActivities = numberOfActivities;
    }

    /**
     * 
     * @return
     *     The variableShift
     */
    @JsonProperty("variableShift")
    public String getVariableShift() {
        return variableShift;
    }

    /**
     * 
     * @param variableShift
     *     The variableShift
     */
    @JsonProperty("variableShift")
    public void setVariableShift(String variableShift) {
        this.variableShift = variableShift;
    }

    /**
     * 
     * @return
     *     The shiftDuration
     */
    @JsonProperty("shiftDuration")
    public String getShiftDuration() {
        return shiftDuration;
    }

    /**
     * 
     * @param shiftDuration
     *     The shiftDuration
     */
    @JsonProperty("shiftDuration")
    public void setShiftDuration(String shiftDuration) {
        this.shiftDuration = shiftDuration;
    }

    /**
     * 
     * @return
     *     The roundStartTimeOption
     */
    @JsonProperty("roundStartTimeOption")
    public String getRoundStartTimeOption() {
        return roundStartTimeOption;
    }

    /**
     * 
     * @param roundStartTimeOption
     *     The roundStartTimeOption
     */
    @JsonProperty("roundStartTimeOption")
    public void setRoundStartTimeOption(String roundStartTimeOption) {
        this.roundStartTimeOption = roundStartTimeOption;
    }

    /**
     * 
     * @return
     *     The crewId
     */
    @JsonProperty("crewId")
    public String getCrewId() {
        return crewId;
    }

    /**
     * 
     * @param crewId
     *     The crewId
     */
    @JsonProperty("crewId")
    public void setCrewId(String crewId) {
        this.crewId = crewId;
    }

    /**
     * 
     * @return
     *     The shiftUsage
     */
    @JsonProperty("shiftUsage")
    public String getShiftUsage() {
        return shiftUsage;
    }

    /**
     * 
     * @param shiftUsage
     *     The shiftUsage
     */
    @JsonProperty("shiftUsage")
    public void setShiftUsage(String shiftUsage) {
        this.shiftUsage = shiftUsage;
    }

    /**
     * 
     * @return
     *     The plannedStartDateTime
     */
    @JsonProperty("plannedStartDateTime")
    public String getPlannedStartDateTime() {
        return plannedStartDateTime;
    }

    /**
     * 
     * @param plannedStartDateTime
     *     The plannedStartDateTime
     */
    @JsonProperty("plannedStartDateTime")
    public void setPlannedStartDateTime(String plannedStartDateTime) {
        this.plannedStartDateTime = plannedStartDateTime;
    }

    /**
     * 
     * @return
     *     The plannedEndDateTime
     */
    @JsonProperty("plannedEndDateTime")
    public String getPlannedEndDateTime() {
        return plannedEndDateTime;
    }

    /**
     * 
     * @param plannedEndDateTime
     *     The plannedEndDateTime
     */
    @JsonProperty("plannedEndDateTime")
    public void setPlannedEndDateTime(String plannedEndDateTime) {
        this.plannedEndDateTime = plannedEndDateTime;
    }

    /**
     * 
     * @return
     *     The crewName
     */
    @JsonProperty("crewName")
    public String getCrewName() {
        return crewName;
    }

    /**
     * 
     * @param crewName
     *     The crewName
     */
    @JsonProperty("crewName")
    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    /**
     * 
     * @return
     *     The resourceAllocation
     */
    @JsonProperty("resourceAllocation")
    public ResourceAllocation getResourceAllocation() {
        return resourceAllocation;
    }

    /**
     * 
     * @param resourceAllocation
     *     The resourceAllocation
     */
    @JsonProperty("resourceAllocation")
    public void setResourceAllocation(ResourceAllocation resourceAllocation) {
        this.resourceAllocation = resourceAllocation;
    }

    /**
     * 
     * @return
     *     The logonUser
     */
    @JsonProperty("logonUser")
    public String getLogonUser() {
        return logonUser;
    }

    /**
     * 
     * @param logonUser
     *     The logonUser
     */
    @JsonProperty("logonUser")
    public void setLogonUser(String logonUser) {
        this.logonUser = logonUser;
    }

    /**
     * 
     * @return
     *     The mdt
     */
    @JsonProperty("mdt")
    public String getMdt() {
        return mdt;
    }

    /**
     * 
     * @param mdt
     *     The mdt
     */
    @JsonProperty("mdt")
    public void setMdt(String mdt) {
        this.mdt = mdt;
    }

    /**
     * 
     * @return
     *     The forcedLogoff
     */
    @JsonProperty("forcedLogoff")
    public String getForcedLogoff() {
        return forcedLogoff;
    }

    /**
     * 
     * @param forcedLogoff
     *     The forcedLogoff
     */
    @JsonProperty("forcedLogoff")
    public void setForcedLogoff(String forcedLogoff) {
        this.forcedLogoff = forcedLogoff;
    }

    /**
     * 
     * @return
     *     The overridden
     */
    @JsonProperty("overridden")
    public String getOverridden() {
        return overridden;
    }

    /**
     * 
     * @param overridden
     *     The overridden
     */
    @JsonProperty("overridden")
    public void setOverridden(String overridden) {
        this.overridden = overridden;
    }

    /**
     * 
     * @return
     *     The mobileLog
     */
    @JsonProperty("mobileLog")
    public MobileLog getMobileLog() {
        return mobileLog;
    }

    /**
     * 
     * @param mobileLog
     *     The mobileLog
     */
    @JsonProperty("mobileLog")
    public void setMobileLog(MobileLog mobileLog) {
        this.mobileLog = mobileLog;
    }

    /**
     * 
     * @return
     *     The mobileUse
     */
    @JsonProperty("mobileUse")
    public MobileUse getMobileUse() {
        return mobileUse;
    }

    /**
     * 
     * @param mobileUse
     *     The mobileUse
     */
    @JsonProperty("mobileUse")
    public void setMobileUse(MobileUse mobileUse) {
        this.mobileUse = mobileUse;
    }

    /**
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The statusReason
     */
    @JsonProperty("statusReason")
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * 
     * @param statusReason
     *     The statusReason
     */
    @JsonProperty("statusReason")
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * 
     * @return
     *     The businessStatusDateTime
     */
    @JsonProperty("businessStatusDateTime")
    public String getBusinessStatusDateTime() {
        return businessStatusDateTime;
    }

    /**
     * 
     * @param businessStatusDateTime
     *     The businessStatusDateTime
     */
    @JsonProperty("businessStatusDateTime")
    public void setBusinessStatusDateTime(String businessStatusDateTime) {
        this.businessStatusDateTime = businessStatusDateTime;
    }

}
