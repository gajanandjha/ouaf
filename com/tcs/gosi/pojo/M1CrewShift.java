
package com.tcs.gosi.pojo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tcs.gosi.pojo.syncdata.LogoffDetails;
import com.tcs.gosi.pojo.syncdata.LogonDetails;
import com.tcs.gosi.pojo.syncdata.MobileUse;
import com.tcs.gosi.pojo.syncdata.ResourceAllocation;
import com.tcs.gosi.pojo.syncdata.ServiceClass;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "shiftId",
    "bo",
    "crewShiftType",
    "logonDetails",
    "logoffDetails",
    "serviceClass",
    "gpsDataEnabled",
    "timeZone",
    "advancedDispatchTasks",
    "crewId",
    "plannedStartDateTime",
    "plannedEndDateTime",
    "crewName",
    "resourceAllocation",
    "logonUser",
    "mdt",
    "mobileUse"
})
public class M1CrewShift {

    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("bo")
    private String bo;
    @JsonProperty("crewShiftType")
    private String crewShiftType;
    @JsonProperty("logonDetails")
    private LogonDetails logonDetails;
    @JsonProperty("logoffDetails")
    private LogoffDetails logoffDetails;
    @JsonProperty("serviceClass")
    private ServiceClass serviceClass;
    @JsonProperty("gpsDataEnabled")
    private String gpsDataEnabled;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("advancedDispatchTasks")
    private String advancedDispatchTasks;
    @JsonProperty("crewId")
    private String crewId;
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
    @JsonProperty("mobileUse")
    private MobileUse mobileUse;

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

}
