
package com.tcs.gosi.pojo.taskupd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "crewTimeUsageList"
})
public class CrewTimeUsage {

    @JsonProperty("crewTimeUsageList")
    private List<Object> crewTimeUsageList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The crewTimeUsageList
     */
    @JsonProperty("crewTimeUsageList")
    public List<Object> getCrewTimeUsageList() {
        return crewTimeUsageList;
    }

    /**
     * 
     * @param crewTimeUsageList
     *     The crewTimeUsageList
     */
    @JsonProperty("crewTimeUsageList")
    public void setCrewTimeUsageList(List<Object> crewTimeUsageList) {
        this.crewTimeUsageList = crewTimeUsageList;
    }

}
