
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "siteAddress",
    "serviceAddress",
    "serviceArea",
    "timeZone"
})
public class Location {

    @JsonProperty("siteAddress")
    private SiteAddress siteAddress;
    @JsonProperty("serviceAddress")
    private String serviceAddress;
    @JsonProperty("serviceArea")
    private String serviceArea;
    @JsonProperty("timeZone")
    private String timeZone;

    /**
     * 
     * @return
     *     The siteAddress
     */
    @JsonProperty("siteAddress")
    public SiteAddress getSiteAddress() {
        return siteAddress;
    }

    /**
     * 
     * @param siteAddress
     *     The siteAddress
     */
    @JsonProperty("siteAddress")
    public void setSiteAddress(SiteAddress siteAddress) {
        this.siteAddress = siteAddress;
    }

    /**
     * 
     * @return
     *     The serviceAddress
     */
    @JsonProperty("serviceAddress")
    public String getServiceAddress() {
        return serviceAddress;
    }

    /**
     * 
     * @param serviceAddress
     *     The serviceAddress
     */
    @JsonProperty("serviceAddress")
    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
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
     *     The timeZone
     */
    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 
     * @param timeZone
     *     The timeZone
     */
    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
