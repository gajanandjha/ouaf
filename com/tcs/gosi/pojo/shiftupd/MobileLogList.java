
package com.tcs.gosi.pojo.shiftupd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "crewShiftId",
    "sequence",
    "logEntryType",
    "logDateTime",
    "boStatus",
    "messageCategory",
    "messageNumber",
    "user",
    "messageParameters",
    "statusReason"
})
public class MobileLogList {

    @JsonProperty("crewShiftId")
    private String crewShiftId;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("logEntryType")
    private String logEntryType;
    @JsonProperty("logDateTime")
    private String logDateTime;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("messageCategory")
    private String messageCategory;
    @JsonProperty("messageNumber")
    private String messageNumber;
    @JsonProperty("user")
    private String user;
    @JsonProperty("messageParameters")
    private List<MessageParameter> messageParameters = new ArrayList<MessageParameter>();
    @JsonProperty("statusReason")
    private String statusReason;

    /**
     * 
     * @return
     *     The crewShiftId
     */
    @JsonProperty("crewShiftId")
    public String getCrewShiftId() {
        return crewShiftId;
    }

    /**
     * 
     * @param crewShiftId
     *     The crewShiftId
     */
    @JsonProperty("crewShiftId")
    public void setCrewShiftId(String crewShiftId) {
        this.crewShiftId = crewShiftId;
    }

    /**
     * 
     * @return
     *     The sequence
     */
    @JsonProperty("sequence")
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 
     * @param sequence
     *     The sequence
     */
    @JsonProperty("sequence")
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 
     * @return
     *     The logEntryType
     */
    @JsonProperty("logEntryType")
    public String getLogEntryType() {
        return logEntryType;
    }

    /**
     * 
     * @param logEntryType
     *     The logEntryType
     */
    @JsonProperty("logEntryType")
    public void setLogEntryType(String logEntryType) {
        this.logEntryType = logEntryType;
    }

    /**
     * 
     * @return
     *     The logDateTime
     */
    @JsonProperty("logDateTime")
    public String getLogDateTime() {
        return logDateTime;
    }

    /**
     * 
     * @param logDateTime
     *     The logDateTime
     */
    @JsonProperty("logDateTime")
    public void setLogDateTime(String logDateTime) {
        this.logDateTime = logDateTime;
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
     *     The messageCategory
     */
    @JsonProperty("messageCategory")
    public String getMessageCategory() {
        return messageCategory;
    }

    /**
     * 
     * @param messageCategory
     *     The messageCategory
     */
    @JsonProperty("messageCategory")
    public void setMessageCategory(String messageCategory) {
        this.messageCategory = messageCategory;
    }

    /**
     * 
     * @return
     *     The messageNumber
     */
    @JsonProperty("messageNumber")
    public String getMessageNumber() {
        return messageNumber;
    }

    /**
     * 
     * @param messageNumber
     *     The messageNumber
     */
    @JsonProperty("messageNumber")
    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The messageParameters
     */
    @JsonProperty("messageParameters")
    public List<MessageParameter> getMessageParameters() {
        return messageParameters;
    }

    /**
     * 
     * @param messageParameters
     *     The messageParameters
     */
    @JsonProperty("messageParameters")
    public void setMessageParameters(List<MessageParameter> messageParameters) {
        this.messageParameters = messageParameters;
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

}
