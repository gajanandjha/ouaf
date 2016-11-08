
package com.tcs.gosi.pojo.prmlfrdvc;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "bo",
    "subject",
    "message",
    "queue",
    "statusReason",
    "timeLimit",
    "mdtId",
    "messageClass",
    "deliverNow",
    "userId",
    "crewShiftId",
    "mobileUse",
    "sendTo",
    "mailId",
    "boStatusDateTime",
    "creationDateTime",
    "acknowledgementRequired",
    "boStatus"
})
public class BoData {

    @JsonProperty("bo")
    private String bo;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("message")
    private String message;
    @JsonProperty("queue")
    private String queue;
    @JsonProperty("statusReason")
    private String statusReason;
    @JsonProperty("timeLimit")
    private String timeLimit;
    @JsonProperty("mdtId")
    private String mdtId;
    @JsonProperty("messageClass")
    private String messageClass;
    @JsonProperty("deliverNow")
    private String deliverNow;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("crewShiftId")
    private String crewShiftId;
    @JsonProperty("mobileUse")
    private MobileUse mobileUse;
    @JsonProperty("sendTo")
    private SendTo sendTo;
    @JsonProperty("mailId")
    private String mailId;
    @JsonProperty("boStatusDateTime")
    private String boStatusDateTime;
    @JsonProperty("creationDateTime")
    private String creationDateTime;
    @JsonProperty("acknowledgementRequired")
    private String acknowledgementRequired;
    @JsonProperty("boStatus")
    private String boStatus;

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
     *     The subject
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
     *     The timeLimit
     */
    @JsonProperty("timeLimit")
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * 
     * @param timeLimit
     *     The timeLimit
     */
    @JsonProperty("timeLimit")
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * 
     * @return
     *     The mdtId
     */
    @JsonProperty("mdtId")
    public String getMdtId() {
        return mdtId;
    }

    /**
     * 
     * @param mdtId
     *     The mdtId
     */
    @JsonProperty("mdtId")
    public void setMdtId(String mdtId) {
        this.mdtId = mdtId;
    }

    /**
     * 
     * @return
     *     The messageClass
     */
    @JsonProperty("messageClass")
    public String getMessageClass() {
        return messageClass;
    }

    /**
     * 
     * @param messageClass
     *     The messageClass
     */
    @JsonProperty("messageClass")
    public void setMessageClass(String messageClass) {
        this.messageClass = messageClass;
    }

    /**
     * 
     * @return
     *     The deliverNow
     */
    @JsonProperty("deliverNow")
    public String getDeliverNow() {
        return deliverNow;
    }

    /**
     * 
     * @param deliverNow
     *     The deliverNow
     */
    @JsonProperty("deliverNow")
    public void setDeliverNow(String deliverNow) {
        this.deliverNow = deliverNow;
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
     *     The sendTo
     */
    @JsonProperty("sendTo")
    public SendTo getSendTo() {
        return sendTo;
    }

    /**
     * 
     * @param sendTo
     *     The sendTo
     */
    @JsonProperty("sendTo")
    public void setSendTo(SendTo sendTo) {
        this.sendTo = sendTo;
    }

    /**
     * 
     * @return
     *     The mailId
     */
    @JsonProperty("mailId")
    public String getMailId() {
        return mailId;
    }

    /**
     * 
     * @param mailId
     *     The mailId
     */
    @JsonProperty("mailId")
    public void setMailId(String mailId) {
        this.mailId = mailId;
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

}
