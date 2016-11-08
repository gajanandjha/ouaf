
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "shiftId",
    "appointmentInformation",
    "boStatus",
    "acknowledgementRequired",
    "hostNotifications",
    "appointmentRequired",
    "keyGroup",
    "bo",
    "dependencyReason",
    "activityId",
    "taskType",
    "customerInformation",
    "location",
    "taskId",
    "queue",
    "scheduleDetails",
    "loadInstructions",
    "mobileUse"
})
public class TaskBoData {

    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("appointmentInformation")
    private AppointmentInformation appointmentInformation;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("acknowledgementRequired")
    private String acknowledgementRequired;
    @JsonProperty("hostNotifications")
    private HostNotifications hostNotifications;
    @JsonProperty("appointmentRequired")
    private String appointmentRequired;
    @JsonProperty("keyGroup")
    private String keyGroup;
    @JsonProperty("bo")
    private String bo;
    @JsonProperty("dependencyReason")
    private String dependencyReason;
    @JsonProperty("activityId")
    private String activityId;
    @JsonProperty("taskType")
    private String taskType;
    @JsonProperty("customerInformation")
    private String customerInformation;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("queue")
    private String queue;
    @JsonProperty("scheduleDetails")
    private ScheduleDetails scheduleDetails;
    @JsonProperty("loadInstructions")
    private String loadInstructions;
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
     *     The appointmentInformation
     */
    @JsonProperty("appointmentInformation")
    public AppointmentInformation getAppointmentInformation() {
        return appointmentInformation;
    }

    /**
     * 
     * @param appointmentInformation
     *     The appointmentInformation
     */
    @JsonProperty("appointmentInformation")
    public void setAppointmentInformation(AppointmentInformation appointmentInformation) {
        this.appointmentInformation = appointmentInformation;
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
     *     The acknowledgementRequired
     */
    @JsonProperty("acknowledgementRequired")
    public String getAcknowledgementRequired() {
        return acknowledgementRequired;
    }

    /**
     * 
     * @param acknowledgementRequired
     *     The acknowledgementRequired
     */
    @JsonProperty("acknowledgementRequired")
    public void setAcknowledgementRequired(String acknowledgementRequired) {
        this.acknowledgementRequired = acknowledgementRequired;
    }

    /**
     * 
     * @return
     *     The hostNotifications
     */
    @JsonProperty("hostNotifications")
    public HostNotifications getHostNotifications() {
        return hostNotifications;
    }

    /**
     * 
     * @param hostNotifications
     *     The hostNotifications
     */
    @JsonProperty("hostNotifications")
    public void setHostNotifications(HostNotifications hostNotifications) {
        this.hostNotifications = hostNotifications;
    }

    /**
     * 
     * @return
     *     The appointmentRequired
     */
    @JsonProperty("appointmentRequired")
    public String getAppointmentRequired() {
        return appointmentRequired;
    }

    /**
     * 
     * @param appointmentRequired
     *     The appointmentRequired
     */
    @JsonProperty("appointmentRequired")
    public void setAppointmentRequired(String appointmentRequired) {
        this.appointmentRequired = appointmentRequired;
    }

    /**
     * 
     * @return
     *     The keyGroup
     */
    @JsonProperty("keyGroup")
    public String getKeyGroup() {
        return keyGroup;
    }

    /**
     * 
     * @param keyGroup
     *     The keyGroup
     */
    @JsonProperty("keyGroup")
    public void setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
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
     *     The dependencyReason
     */
    @JsonProperty("dependencyReason")
    public String getDependencyReason() {
        return dependencyReason;
    }

    /**
     * 
     * @param dependencyReason
     *     The dependencyReason
     */
    @JsonProperty("dependencyReason")
    public void setDependencyReason(String dependencyReason) {
        this.dependencyReason = dependencyReason;
    }

    /**
     * 
     * @return
     *     The activityId
     */
    @JsonProperty("activityId")
    public String getActivityId() {
        return activityId;
    }

    /**
     * 
     * @param activityId
     *     The activityId
     */
    @JsonProperty("activityId")
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * 
     * @return
     *     The taskType
     */
    @JsonProperty("taskType")
    public String getTaskType() {
        return taskType;
    }

    /**
     * 
     * @param taskType
     *     The taskType
     */
    @JsonProperty("taskType")
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * 
     * @return
     *     The customerInformation
     */
    @JsonProperty("customerInformation")
    public String getCustomerInformation() {
        return customerInformation;
    }

    /**
     * 
     * @param customerInformation
     *     The customerInformation
     */
    @JsonProperty("customerInformation")
    public void setCustomerInformation(String customerInformation) {
        this.customerInformation = customerInformation;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

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
     *     The loadInstructions
     */
    @JsonProperty("loadInstructions")
    public String getLoadInstructions() {
        return loadInstructions;
    }

    /**
     * 
     * @param loadInstructions
     *     The loadInstructions
     */
    @JsonProperty("loadInstructions")
    public void setLoadInstructions(String loadInstructions) {
        this.loadInstructions = loadInstructions;
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
