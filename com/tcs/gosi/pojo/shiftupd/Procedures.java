
package com.tcs.gosi.pojo.shiftupd;

import java.util.ArrayList;
import java.util.List;
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
    private List<ProceduresList> proceduresList = new ArrayList<ProceduresList>();

    /**
     * 
     * @return
     *     The proceduresList
     */
    @JsonProperty("proceduresList")
    public List<ProceduresList> getProceduresList() {
        return proceduresList;
    }

    /**
     * 
     * @param proceduresList
     *     The proceduresList
     */
    @JsonProperty("proceduresList")
    public void setProceduresList(List<ProceduresList> proceduresList) {
        this.proceduresList = proceduresList;
    }

}
