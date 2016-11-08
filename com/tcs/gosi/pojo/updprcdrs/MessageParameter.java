
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureId",
    "sequence",
    "parameterSequence",
    "messageParameter"
})
public class MessageParameter {

    @JsonProperty("procedureId")
    private String procedureId;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("parameterSequence")
    private Integer parameterSequence;
    @JsonProperty("messageParameter")
    private String messageParameter;

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
     *     The parameterSequence
     */
    @JsonProperty("parameterSequence")
    public Integer getParameterSequence() {
        return parameterSequence;
    }

    /**
     * 
     * @param parameterSequence
     *     The parameterSequence
     */
    @JsonProperty("parameterSequence")
    public void setParameterSequence(Integer parameterSequence) {
        this.parameterSequence = parameterSequence;
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
