
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "messageCategory",
    "procedureSteps"
})
public class ProcedureStepCompletionDtls {

    @JsonProperty("messageCategory")
    private String messageCategory;
    @JsonProperty("procedureSteps")
    private ProcedureSteps procedureSteps;

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
     *     The procedureSteps
     */
    @JsonProperty("procedureSteps")
    public ProcedureSteps getProcedureSteps() {
        return procedureSteps;
    }

    /**
     * 
     * @param procedureSteps
     *     The procedureSteps
     */
    @JsonProperty("procedureSteps")
    public void setProcedureSteps(ProcedureSteps procedureSteps) {
        this.procedureSteps = procedureSteps;
    }

}
