
package com.tcs.gosi.pojo.shflogon;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureStepsList"
})
public class ProcedureSteps {

    @JsonProperty("procedureStepsList")
    private List<ProcedureStepsList> procedureStepsList = new ArrayList<ProcedureStepsList>();

    /**
     * 
     * @return
     *     The procedureStepsList
     */
    @JsonProperty("procedureStepsList")
    public List<ProcedureStepsList> getProcedureStepsList() {
        return procedureStepsList;
    }

    /**
     * 
     * @param procedureStepsList
     *     The procedureStepsList
     */
    @JsonProperty("procedureStepsList")
    public void setProcedureStepsList(List<ProcedureStepsList> procedureStepsList) {
        this.procedureStepsList = procedureStepsList;
    }

}
