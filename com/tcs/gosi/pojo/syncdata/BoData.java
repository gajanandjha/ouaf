
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskId",
    "shiftId",
    "queue",
    "scheduleDetails",
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
    "mobileUse",
    "boStatus",
    "boStatusDateTime",
    "taskType",
    "activityId",
    "acknowledgementRequired",
    "customerInformation",
    "location",
    "appointmentInformation",
    "appointmentRequired",
    "keyGroup",
    "hostNotifications",
    "completionInformation",
    "mobileLog",
    "sendNowUpdate",
    "version"
})
public class BoData {

    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("queue")
    private String queue;
    @JsonProperty("scheduleDetails")
    private ScheduleDetails scheduleDetails;
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
    
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("boStatusDateTime")
    private String boStatusDateTime;
    @JsonProperty("taskType")
    private String taskType;
    @JsonProperty("activityId")
    private String activityId;
    @JsonProperty("acknowledgementRequired")
    private String acknowledgementRequired;
    @JsonProperty("customerInformation")
    private String customerInformation;
    @JsonProperty("location")
    private Location location;
	@JsonProperty("appointmentInformation")
    private AppointmentInformation appointmentInformation;
    @JsonProperty("appointmentRequired")
    private String appointmentRequired;
    @JsonProperty("keyGroup")
    private String keyGroup;
    @JsonProperty("hostNotifications")
    private HostNotifications hostNotifications;
    @JsonProperty("completionInformation")
    private CompletionInformation completionInformation;
    @JsonProperty("mobileLog")
    private String mobileLog;
    @JsonProperty("sendNowUpdate")
    private String sendNowUpdate;
    @JsonProperty("version")
    private String version;

    /**
     * 
     * @return
     *     The taskId
     */
    @JsonProperty("taskId")
    public String getTaskId() {
        return taskId;
    }

    /**
     * 
     * @param taskId
     *     The taskId
     */
    @JsonProperty("taskId")
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

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
     *     The queue
     */
    @JsonProperty("queue")
    public String getQueue() {
        return queue;
    }

    /**
     * 
     * @param queue
     *     The queue
     */
    @JsonProperty("queue")
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * 
     * @return
     *     The scheduleDetails
     */
    @JsonProperty("scheduleDetails")
    public ScheduleDetails getScheduleDetails() {
        return scheduleDetails;
    }

    /**
     * 
     * @param scheduleDetails
     *     The scheduleDetails
     */
    @JsonProperty("scheduleDetails")
    public void setScheduleDetails(ScheduleDetails scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
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

    @JsonProperty("boStatus")
	public String getBoStatus() {
		return boStatus;
	}

    @JsonProperty("boStatus")
	public void setBoStatus(String boStatus) {
		this.boStatus = boStatus;
	}

    @JsonProperty("boStatusDateTime")
	public String getBoStatusDateTime() {
		return boStatusDateTime;
	}

    @JsonProperty("boStatusDateTime")
	public void setBoStatusDateTime(String boStatusDateTime) {
		this.boStatusDateTime = boStatusDateTime;
	}

    @JsonProperty("taskType")
	public String getTaskType() {
		return taskType;
	}

    @JsonProperty("taskType")
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

    @JsonProperty("activityId")
	public String getActivityId() {
		return activityId;
	}

    @JsonProperty("activityId")
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    @JsonProperty("acknowledgementRequired")
	public String getAcknowledgementRequired() {
		return acknowledgementRequired;
	}

    @JsonProperty("acknowledgementRequired")
	public void setAcknowledgementRequired(String acknowledgementRequired) {
		this.acknowledgementRequired = acknowledgementRequired;
	}

    @JsonProperty("customerInformation")
	public String getCustomerInformation() {
		return customerInformation;
	}

    @JsonProperty("customerInformation")
	public void setCustomerInformation(String customerInformation) {
		this.customerInformation = customerInformation;
	}

    @JsonProperty("appointmentRequired")
	public String getAppointmentRequired() {
		return appointmentRequired;
	}

    @JsonProperty("appointmentRequired")
	public void setAppointmentRequired(String appointmentRequired) {
		this.appointmentRequired = appointmentRequired;
	}

    @JsonProperty("keyGroup")
	public String getKeyGroup() {
		return keyGroup;
	}

    @JsonProperty("keyGroup")
	public void setKeyGroup(String keyGroup) {
		this.keyGroup = keyGroup;
	}

    @JsonProperty("mobileLog")
	public String getMobileLog() {
		return mobileLog;
	}

    @JsonProperty("mobileLog")
	public void setMobileLog(String mobileLog) {
		this.mobileLog = mobileLog;
	}

    @JsonProperty("sendNowUpdate")
	public String getSendNowUpdate() {
		return sendNowUpdate;
	}

    @JsonProperty("sendNowUpdate")
	public void setSendNowUpdate(String sendNowUpdate) {
		this.sendNowUpdate = sendNowUpdate;
	}

    @JsonProperty("version")
	public String getVersion() {
		return version;
	}

    @JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}
    
    @JsonProperty("location")
    public void setLocation(Location location) {
		this.location = location;
	}

    @JsonProperty("appointmentInformation")
	public void setAppointmentInformation(AppointmentInformation appointmentInformation) {
		this.appointmentInformation = appointmentInformation;
	}

    @JsonProperty("hostNotifications")
	public void setHostNotifications(HostNotifications hostNotifications) {
		this.hostNotifications = hostNotifications;
	}

    @JsonProperty("completionInformation")
	public void setCompletionInformation(CompletionInformation completionInformation) {
		this.completionInformation = completionInformation;
	}

    @JsonProperty("location")
	public Location getLocation() {
		return location;
	}

    @JsonProperty("appointmentInformation")
	public AppointmentInformation getAppointmentInformation() {
		return appointmentInformation;
	}

    @JsonProperty("hostNotifications")
	public HostNotifications getHostNotifications() {
		return hostNotifications;
	}

    @JsonProperty("completionInformation")
	public CompletionInformation getCompletionInformation() {
		return completionInformation;
	}
}
