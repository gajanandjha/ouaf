
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "procedureId"
})
public class ProceduresList {

    @JsonProperty("procedureId")
    private String procedureId;

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

}
