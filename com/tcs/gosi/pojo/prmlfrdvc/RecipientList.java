
package com.tcs.gosi.pojo.prmlfrdvc;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sequenceNumber",
    "mailingListId",
    "userId",
    "crewShiftId",
    "predefinedSendToOption"
})
public class RecipientList {

    @JsonProperty("sequenceNumber")
    private Integer sequenceNumber;
    @JsonProperty("mailingListId")
    private String mailingListId;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("crewShiftId")
    private String crewShiftId;
    @JsonProperty("predefinedSendToOption")
    private String predefinedSendToOption;

    /**
     * 
     * @return
     *     The sequenceNumber
     */
    @JsonProperty("sequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 
     * @param sequenceNumber
     *     The sequenceNumber
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * 
     * @return
     *     The mailingListId
     */
    @JsonProperty("mailingListId")
    public String getMailingListId() {
        return mailingListId;
    }

    /**
     * 
     * @param mailingListId
     *     The mailingListId
     */
    @JsonProperty("mailingListId")
    public void setMailingListId(String mailingListId) {
        this.mailingListId = mailingListId;
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
     *     The predefinedSendToOption
     */
    @JsonProperty("predefinedSendToOption")
    public String getPredefinedSendToOption() {
        return predefinedSendToOption;
    }

    /**
     * 
     * @param predefinedSendToOption
     *     The predefinedSendToOption
     */
    @JsonProperty("predefinedSendToOption")
    public void setPredefinedSendToOption(String predefinedSendToOption) {
        this.predefinedSendToOption = predefinedSendToOption;
    }

}
