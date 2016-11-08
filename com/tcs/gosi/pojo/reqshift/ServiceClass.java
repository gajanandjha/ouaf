
package com.tcs.gosi.pojo.reqshift;

import java.util.List;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "serviceClassList"
})
public class ServiceClass {

    @JsonProperty("serviceClassList")
    private List<ServiceClassList> serviceClassList;

    /**
     * 
     * @return
     *     The serviceClassList
     */
    @JsonProperty("serviceClassList")
    public List<ServiceClassList> getServiceClassList() {
        return serviceClassList;
    }

    /**
     * 
     * @param serviceClassList
     *     The serviceClassList
     */
    @JsonProperty("serviceClassList")
    public void setServiceClassList(List<ServiceClassList> serviceClassList) {
        this.serviceClassList = serviceClassList;
    }

}
