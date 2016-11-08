
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
    "resourceList"
})
public class Resources {

    @JsonProperty("resourceList")
    private List<Object> resourceList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The resourceList
     */
    @JsonProperty("resourceList")
    public List<Object> getResourceList() {
        return resourceList;
    }

    /**
     * 
     * @param resourceList
     *     The resourceList
     */
    @JsonProperty("resourceList")
    public void setResourceList(List<Object> resourceList) {
        this.resourceList = resourceList;
    }

}
