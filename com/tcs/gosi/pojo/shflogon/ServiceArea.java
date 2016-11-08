
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "serviceAreaList"
})
public class ServiceArea {

    @JsonProperty("serviceAreaList")
    private ServiceAreaList serviceAreaList;

    /**
     * 
     * @return
     *     The serviceAreaList
     */
    @JsonProperty("serviceAreaList")
    public ServiceAreaList getServiceAreaList() {
        return serviceAreaList;
    }

    /**
     * 
     * @param serviceAreaList
     *     The serviceAreaList
     */
    @JsonProperty("serviceAreaList")
    public void setServiceAreaList(ServiceAreaList serviceAreaList) {
        this.serviceAreaList = serviceAreaList;
    }

}
