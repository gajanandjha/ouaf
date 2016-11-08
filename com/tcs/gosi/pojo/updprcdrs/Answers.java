
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "textAnswer",
    "stepState"
})
public class Answers {

    @JsonProperty("textAnswer")
    private String textAnswer;
    @JsonProperty("stepState")
    private String stepState;

    /**
     * 
     * @return
     *     The textAnswer
     */
    @JsonProperty("textAnswer")
    public String getTextAnswer() {
        return textAnswer;
    }

    /**
     * 
     * @param textAnswer
     *     The textAnswer
     */
    @JsonProperty("textAnswer")
    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    /**
     * 
     * @return
     *     The stepState
     */
    @JsonProperty("stepState")
    public String getStepState() {
        return stepState;
    }

    /**
     * 
     * @param stepState
     *     The stepState
     */
    @JsonProperty("stepState")
    public void setStepState(String stepState) {
        this.stepState = stepState;
    }

}
