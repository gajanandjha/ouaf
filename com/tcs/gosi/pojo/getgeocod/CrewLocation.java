
package com.tcs.gosi.pojo.getgeocod;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "startFromCrewLocation"
})
public class CrewLocation {

    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("startFromCrewLocation")
    private String startFromCrewLocation;

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The startFromCrewLocation
     */
    @JsonProperty("startFromCrewLocation")
    public String getStartFromCrewLocation() {
        return startFromCrewLocation;
    }

    /**
     * 
     * @param startFromCrewLocation
     *     The startFromCrewLocation
     */
    @JsonProperty("startFromCrewLocation")
    public void setStartFromCrewLocation(String startFromCrewLocation) {
        this.startFromCrewLocation = startFromCrewLocation;
    }

}
