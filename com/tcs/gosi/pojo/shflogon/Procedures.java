
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "proceduresList"
})
public class Procedures {

    @JsonProperty("proceduresList")
    private ProceduresList proceduresList;

    /**
     * 
     * @return
     *     The proceduresList
     */
    @JsonProperty("proceduresList")
    public ProceduresList getProceduresList() {
        return proceduresList;
    }

    /**
     * 
     * @param proceduresList
     *     The proceduresList
     */
    @JsonProperty("proceduresList")
    public void setProceduresList(ProceduresList proceduresList) {
        this.proceduresList = proceduresList;
    }

}
