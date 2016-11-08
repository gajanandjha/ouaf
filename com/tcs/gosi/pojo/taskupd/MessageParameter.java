
package com.tcs.gosi.pojo.taskupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskId",
    "sequence",
    "parameterSequence",
    "messageParameter"
})
public class MessageParameter {

    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("parameterSequence")
    private Integer parameterSequence;
    @JsonProperty("messageParameter")
    private String messageParameter;

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
