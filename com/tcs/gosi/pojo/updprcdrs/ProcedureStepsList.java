
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sequence",
    "messageNumber",
    "procedureStepText",
    "stepRequired",
    "answerType",
    "passSelection",
    "answers"
})
public class ProcedureStepsList {

    @JsonProperty("sequence")
    private String sequence;
    @JsonProperty("messageNumber")
    private String messageNumber;
    @JsonProperty("procedureStepText")
    private String procedureStepText;
    @JsonProperty("stepRequired")
    private String stepRequired;
    @JsonProperty("answerType")
    private String answerType;
    @JsonProperty("passSelection")
    private String passSelection;
    @JsonProperty("answers")
    private Answers answers;

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
     *     The procedureStepText
     */
    @JsonProperty("procedureStepText")
    public String getProcedureStepText() {
        return procedureStepText;
    }

    /**
     * 
     * @param procedureStepText
     *     The procedureStepText
     */
    @JsonProperty("procedureStepText")
    public void setProcedureStepText(String procedureStepText) {
        this.procedureStepText = procedureStepText;
    }

    /**
     * 
     * @return
     *     The stepRequired
     */
    @JsonProperty("stepRequired")
    public String getStepRequired() {
        return stepRequired;
    }

    /**
     * 
     * @param stepRequired
     *     The stepRequired
     */
    @JsonProperty("stepRequired")
    public void setStepRequired(String stepRequired) {
        this.stepRequired = stepRequired;
    }

    /**
     * 
     * @return
     *     The answerType
     */
    @JsonProperty("answerType")
    public String getAnswerType() {
        return answerType;
    }

    /**
     * 
     * @param answerType
     *     The answerType
     */
    @JsonProperty("answerType")
    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    /**
     * 
     * @return
     *     The passSelection
     */
    @JsonProperty("passSelection")
    public String getPassSelection() {
        return passSelection;
    }

    /**
     * 
     * @param passSelection
     *     The passSelection
     */
    @JsonProperty("passSelection")
    public void setPassSelection(String passSelection) {
        this.passSelection = passSelection;
    }

    /**
     * 
     * @return
     *     The answers
     */
    @JsonProperty("answers")
    public Answers getAnswers() {
        return answers;
    }

    /**
     * 
     * @param answers
     *     The answers
     */
    @JsonProperty("answers")
    public void setAnswers(Answers answers) {
        this.answers = answers;
    }

}
