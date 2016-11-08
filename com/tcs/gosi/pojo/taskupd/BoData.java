
package com.tcs.gosi.pojo.taskupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tcs.gosi.pojo.syncdata.MobileUse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskId",
    "boStatus",
    "statusReason",
    "businessStatusDateTime",
    "completionInformation",
    "mobileLog",
    "shiftId",
    "mobileUse"
})
public class BoData {

    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("statusReason")
    private String statusReason;
    @JsonProperty("businessStatusDateTime")
    private String businessStatusDateTime;
    @JsonProperty("completionInformation")
    private CompletionInformation completionInformation;
    @JsonProperty("mobileLog")
    private MobileLog mobileLog;
    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("mobileUse")
    private MobileUse mobileUse;

    @JsonProperty("mobileUse")
    public MobileUse getMobileUse() {
		return mobileUse;
	}

    @JsonProperty("mobileUse")
	public void setMobileUse(MobileUse mobileUse) {
		this.mobileUse = mobileUse;
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

    /**
     * 
     * @return
     *     The completionInformation
     */
    @JsonProperty("completionInformation")
    public CompletionInformation getCompletionInformation() {
        return completionInformation;
    }

    /**
     * 
     * @param completionInformation
     *     The completionInformation
     */
    @JsonProperty("completionInformation")
    public void setCompletionInformation(CompletionInformation completionInformation) {
        this.completionInformation = completionInformation;
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

}
