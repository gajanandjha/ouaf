
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureProcessingDetails"
})
public class TypeDetails {

    @JsonProperty("procedureProcessingDetails")
    private ProcedureProcessingDetails procedureProcessingDetails;

    /**
     * 
     * @return
     *     The procedureProcessingDetails
     */
    @JsonProperty("procedureProcessingDetails")
    public ProcedureProcessingDetails getProcedureProcessingDetails() {
        return procedureProcessingDetails;
    }

    /**
     * 
     * @param procedureProcessingDetails
     *     The procedureProcessingDetails
     */
    @JsonProperty("procedureProcessingDetails")
    public void setProcedureProcessingDetails(ProcedureProcessingDetails procedureProcessingDetails) {
        this.procedureProcessingDetails = procedureProcessingDetails;
    }

}
