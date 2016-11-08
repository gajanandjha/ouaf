
package com.tcs.gosi.pojo.syncdata;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "resourceAllocationList"
})
public class ResourceAllocation {

    @JsonProperty("resourceAllocationList")
    private List<ResourceAllocationList> resourceAllocationList = new ArrayList<ResourceAllocationList>();

    /**
     * 
     * @return
     *     The resourceAllocationList
     */
    @JsonProperty("resourceAllocationList")
    public List<ResourceAllocationList> getResourceAllocationList() {
        return resourceAllocationList;
    }

    /**
     * 
     * @param resourceAllocationList
     *     The resourceAllocationList
     */
    @JsonProperty("resourceAllocationList")
    public void setResourceAllocationList(List<ResourceAllocationList> resourceAllocationList) {
        this.resourceAllocationList = resourceAllocationList;
    }

}
