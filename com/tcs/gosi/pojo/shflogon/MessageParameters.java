
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "crewShiftId",
    "sequence",
    "parameterSequence",
    "boName",
    "boStatus",
    "messageParameter"
})
public class MessageParameters {

    @JsonProperty("crewShiftId")
    private String crewShiftId;
    @JsonProperty("sequence")
    private String sequence;
    @JsonProperty("parameterSequence")
    private String parameterSequence;
    @JsonProperty("boName")
    private String boName;
    @JsonProperty("boStatus")
    private String boStatus;
    @JsonProperty("messageParameter")
    private String messageParameter;

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
    public String getSequence() {
        return sequence;
    }

    /**
     * 
     * @param sequence
     *     The sequence
     */
    @JsonProperty("sequence")
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /**
     * 
     * @return
     *     The parameterSequence
     */
    @JsonProperty("parameterSequence")
    public String getParameterSequence() {
        return parameterSequence;
    }

    /**
     * 
     * @param parameterSequence
     *     The parameterSequence
     */
    @JsonProperty("parameterSequence")
    public void setParameterSequence(String parameterSequence) {
        this.parameterSequence = parameterSequence;
    }

    /**
     * 
     * @return
     *     The boName
     */
    @JsonProperty("boName")
    public String getBoName() {
        return boName;
    }

    /**
     * 
     * @param boName
     *     The boName
     */
    @JsonProperty("boName")
    public void setBoName(String boName) {
        this.boName = boName;
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
     *     The messageParameter
     */
    @JsonProperty("messageParameter")
    public String getMessageParameter() {
        return messageParameter;
    }

    /**
     * 
     * @param messageParameter
     *     The messageParameter
     */
    @JsonProperty("messageParameter")
    public void setMessageParameter(String messageParameter) {
        this.messageParameter = messageParameter;
    }

}
