
package com.tcs.gosi.pojo.tmshmnt;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "timesheetId",
    "bo",
    "boStatus",
    "creationDateTime",
    "shiftId",
    "resourceId",
    "userId",
    "timesheetType",
    "timeZone",
    "startDateTime",
    "endDateTime",
    "reviewOnDevice"
})
public class BoData {

    @JsonProperty("timesheetId")
    private String timesheetId;
    @JsonProperty("bo")
    private String bo;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("creationDateTime")
    private String creationDateTime;
    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("resourceId")
    private String resourceId;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("timesheetType")
    private String timesheetType;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("reviewOnDevice")
    private String reviewOnDevice;

    /**
     * 
     * @return
     *     The timesheetId
     */
    @JsonProperty("timesheetId")
    public String getTimesheetId() {
        return timesheetId;
    }

    /**
     * 
     * @param timesheetId
     *     The timesheetId
     */
    @JsonProperty("timesheetId")
    public void setTimesheetId(String timesheetId) {
        this.timesheetId = timesheetId;
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
     *     The creationDateTime
     */
    @JsonProperty("creationDateTime")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * 
     * @param creationDateTime
     *     The creationDateTime
     */
    @JsonProperty("creationDateTime")
    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
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
     *     The resourceId
     */
    @JsonProperty("resourceId")
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 
     * @param resourceId
     *     The resourceId
     */
    @JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The timesheetType
     */
    @JsonProperty("timesheetType")
    public String getTimesheetType() {
        return timesheetType;
    }

    /**
     * 
     * @param timesheetType
     *     The timesheetType
     */
    @JsonProperty("timesheetType")
    public void setTimesheetType(String timesheetType) {
        this.timesheetType = timesheetType;
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
     *     The startDateTime
     */
    @JsonProperty("startDateTime")
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * 
     * @param startDateTime
     *     The startDateTime
     */
    @JsonProperty("startDateTime")
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * 
     * @return
     *     The endDateTime
     */
    @JsonProperty("endDateTime")
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * 
     * @param endDateTime
     *     The endDateTime
     */
    @JsonProperty("endDateTime")
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * 
     * @return
     *     The reviewOnDevice
     */
    @JsonProperty("reviewOnDevice")
    public String getReviewOnDevice() {
        return reviewOnDevice;
    }

    /**
     * 
     * @param reviewOnDevice
     *     The reviewOnDevice
     */
    @JsonProperty("reviewOnDevice")
    public void setReviewOnDevice(String reviewOnDevice) {
        this.reviewOnDevice = reviewOnDevice;
    }

}
