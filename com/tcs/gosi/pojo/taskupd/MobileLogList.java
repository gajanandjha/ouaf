
package com.tcs.gosi.pojo.taskupd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskId",
    "logDateTime",
    "sequence",
    "boStatus",
    "statusReason",
    "user",
    "logEntryType",
    "messageCategory",
    "messageNumber",
    "messageParameters"
})
public class MobileLogList {

    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("logDateTime")
    private String logDateTime;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("statusReason")
    private String statusReason;
    @JsonProperty("user")
    private String user;
    @JsonProperty("logEntryType")
    private String logEntryType;
    @JsonProperty("messageCategory")
    private String messageCategory;
    @JsonProperty("messageNumber")
    private String messageNumber;
    @JsonProperty("messageParameters")
    private List<MessageParameter> messageParameters = new ArrayList<MessageParameter>();

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

}
