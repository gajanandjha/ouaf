
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sequenceNumber",
    "serviceArea",
    "serviceAreaUsage"
})
public class ServiceAreaList {

    @JsonProperty("sequenceNumber")
    private String sequenceNumber;
    @JsonProperty("serviceArea")
    private String serviceArea;
    @JsonProperty("serviceAreaUsage")
    private String serviceAreaUsage;

    /**
     * 
     * @return
     *     The sequenceNumber
     */
    @JsonProperty("sequenceNumber")
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 
     * @param sequenceNumber
     *     The sequenceNumber
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * 
     * @return
     *     The serviceArea
     */
    @JsonProperty("serviceArea")
    public String getServiceArea() {
        return serviceArea;
    }

    /**
     * 
     * @param serviceArea
     *     The serviceArea
     */
    @JsonProperty("serviceArea")
    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    /**
     * 
     * @return
     *     The serviceAreaUsage
     */
    @JsonProperty("serviceAreaUsage")
    public String getServiceAreaUsage() {
        return serviceAreaUsage;
    }

    /**
     * 
     * @param serviceAreaUsage
     *     The serviceAreaUsage
     */
    @JsonProperty("serviceAreaUsage")
    public void setServiceAreaUsage(String serviceAreaUsage) {
        this.serviceAreaUsage = serviceAreaUsage;
    }

}
