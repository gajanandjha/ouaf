
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureStepCompletionDtls"
})
public class CompletionInformation {

    @JsonProperty("procedureStepCompletionDtls")
    private ProcedureStepCompletionDtls procedureStepCompletionDtls;

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

}
