
package com.tcs.gosi.pojo.syncdata;

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
    private ServiceClassList serviceClassList;

    /**
     * 
     * @return
     *     The serviceClassList
     */
    @JsonProperty("serviceClassList")
    public ServiceClassList getServiceClassList() {
        return serviceClassList;
    }

    /**
     * 
     * @param serviceClassList
     *     The serviceClassList
     */
    @JsonProperty("serviceClassList")
    public void setServiceClassList(ServiceClassList serviceClassList) {
        this.serviceClassList = serviceClassList;
    }

}
