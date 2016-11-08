
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureStepCompletionDtls",
    "mobileWorkers",
    "procedureComments",
    "overrideFailure"
})
public class CompletionInformation {

    @JsonProperty("procedureStepCompletionDtls")
    private ProcedureStepCompletionDtls procedureStepCompletionDtls;
    @JsonProperty("mobileWorkers")
    private MobileWorkers mobileWorkers;
    @JsonProperty("procedureComments")
    private String procedureComments;
    @JsonProperty("overrideFailure")
    private String overrideFailure;

    /**
     * 
     * @return
     *     The procedureStepCompletionDtls
     */
    @JsonProperty("procedureStepCompletionDtls")
    public ProcedureStepCompletionDtls getProcedureStepCompletionDtls() {
        return procedureStepCompletionDtls;
    }

    /**
     * 
     * @param procedureStepCompletionDtls
     *     The procedureStepCompletionDtls
     */
    @JsonProperty("procedureStepCompletionDtls")
    public void setProcedureStepCompletionDtls(ProcedureStepCompletionDtls procedureStepCompletionDtls) {
        this.procedureStepCompletionDtls = procedureStepCompletionDtls;
    }

    /**
     * 
     * @return
     *     The mobileWorkers
     */
    @JsonProperty("mobileWorkers")
    public MobileWorkers getMobileWorkers() {
        return mobileWorkers;
    }

    /**
     * 
     * @param mobileWorkers
     *     The mobileWorkers
     */
    @JsonProperty("mobileWorkers")
    public void setMobileWorkers(MobileWorkers mobileWorkers) {
        this.mobileWorkers = mobileWorkers;
    }

    /**
     * 
     * @return
     *     The procedureComments
     */
    @JsonProperty("procedureComments")
    public String getProcedureComments() {
        return procedureComments;
    }

    /**
     * 
     * @param procedureComments
     *     The procedureComments
     */
    @JsonProperty("procedureComments")
    public void setProcedureComments(String procedureComments) {
        this.procedureComments = procedureComments;
    }

    /**
     * 
     * @return
     *     The overrideFailure
     */
    @JsonProperty("overrideFailure")
    public String getOverrideFailure() {
        return overrideFailure;
    }

    /**
     * 
     * @param overrideFailure
     *     The overrideFailure
     */
    @JsonProperty("overrideFailure")
    public void setOverrideFailure(String overrideFailure) {
        this.overrideFailure = overrideFailure;
    }

}
