
package com.tcs.gosi.pojo.updprcdrs;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureId",
    "logDateTime",
    "sequence",
    "boStatus",
    "user",
    "logEntryType",
    "messageCategory",
    "messageNumber",
    "messageParameters"
})
public class MobileLogList {

    @JsonProperty("procedureId")
    private String procedureId;
    @JsonProperty("logDateTime")
    private String logDateTime;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("boStatus")
    private String boStatus;
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
     *     The procedureId
     */
    @JsonProperty("procedureId")
    public String getProcedureId() {
        return procedureId;
    }

    /**
     * 
     * @param procedureId
     *     The procedureId
     */
    @JsonProperty("procedureId")
    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
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
