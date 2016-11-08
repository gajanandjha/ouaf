
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "locationType",
    "location"
})
public class LogonDetails {

    @JsonProperty("locationType")
    private String locationType;
    @JsonProperty("location")
    private String location;

    /**
     * 
     * @return
     *     The locationType
     */
    @JsonProperty("locationType")
    public String getLocationType() {
        return locationType;
    }

    /**
     * 
     * @param locationType
     *     The locationType
     */
    @JsonProperty("locationType")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

}
