
package com.tcs.gosi.pojo.shiftupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sequenceNumber",
    "serviceClass",
    "serviceClassUsage"
})
public class ServiceClassList {

    @JsonProperty("sequenceNumber")
    private String sequenceNumber;
    @JsonProperty("serviceClass")
    private String serviceClass;
    @JsonProperty("serviceClassUsage")
    private String serviceClassUsage;

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
     *     The serviceClass
     */
    @JsonProperty("serviceClass")
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * 
     * @param serviceClass
     *     The serviceClass
     */
    @JsonProperty("serviceClass")
    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    /**
     * 
     * @return
     *     The serviceClassUsage
     */
    @JsonProperty("serviceClassUsage")
    public String getServiceClassUsage() {
        return serviceClassUsage;
    }

    /**
     * 
     * @param serviceClassUsage
     *     The serviceClassUsage
     */
    @JsonProperty("serviceClassUsage")
    public void setServiceClassUsage(String serviceClassUsage) {
        this.serviceClassUsage = serviceClassUsage;
    }

}
