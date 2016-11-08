
package com.tcs.gosi.pojo.updprcdrs;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "mobileWorkersList"
})
public class MobileWorkers {

    @JsonProperty("mobileWorkersList")
    private List<Object> mobileWorkersList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The mobileWorkersList
     */
    @JsonProperty("mobileWorkersList")
    public List<Object> getMobileWorkersList() {
        return mobileWorkersList;
    }

    /**
     * 
     * @param mobileWorkersList
     *     The mobileWorkersList
     */
    @JsonProperty("mobileWorkersList")
    public void setMobileWorkersList(List<Object> mobileWorkersList) {
        this.mobileWorkersList = mobileWorkersList;
    }

}
