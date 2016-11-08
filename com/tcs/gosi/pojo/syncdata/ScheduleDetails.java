
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "workSequence",
    "calculatedTravelTime",
    "calculatedTravelDistance",
    "arrivalDateTime",
    "startDateTime",
    "completionDateTime",
    "distanceUnitAbbr"
})
public class ScheduleDetails {

    @JsonProperty("workSequence")
    private String workSequence;
    @JsonProperty("calculatedTravelTime")
    private String calculatedTravelTime;
    @JsonProperty("calculatedTravelDistance")
    private String calculatedTravelDistance;
    @JsonProperty("arrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("completionDateTime")
    private String completionDateTime;
    @JsonProperty("distanceUnitAbbr")
    private String distanceUnitAbbr;

    /**
     * 
     * @return
     *     The workSequence
     */
    @JsonProperty("workSequence")
    public String getWorkSequence() {
        return workSequence;
    }

    /**
     * 
     * @param workSequence
     *     The workSequence
     */
    @JsonProperty("workSequence")
    public void setWorkSequence(String workSequence) {
        this.workSequence = workSequence;
    }

    /**
     * 
     * @return
     *     The calculatedTravelTime
     */
    @JsonProperty("calculatedTravelTime")
    public String getCalculatedTravelTime() {
        return calculatedTravelTime;
    }

    /**
     * 
     * @param calculatedTravelTime
     *     The calculatedTravelTime
     */
    @JsonProperty("calculatedTravelTime")
    public void setCalculatedTravelTime(String calculatedTravelTime) {
        this.calculatedTravelTime = calculatedTravelTime;
    }

    /**
     * 
     * @return
     *     The calculatedTravelDistance
     */
    @JsonProperty("calculatedTravelDistance")
    public String getCalculatedTravelDistance() {
        return calculatedTravelDistance;
    }

    /**
     * 
     * @param calculatedTravelDistance
     *     The calculatedTravelDistance
     */
    @JsonProperty("calculatedTravelDistance")
    public void setCalculatedTravelDistance(String calculatedTravelDistance) {
        this.calculatedTravelDistance = calculatedTravelDistance;
    }

    /**
     * 
     * @return
     *     The arrivalDateTime
     */
    @JsonProperty("arrivalDateTime")
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * 
     * @param arrivalDateTime
     *     The arrivalDateTime
     */
    @JsonProperty("arrivalDateTime")
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    /**
     * 
     * @return
     *     The startDateTime
     */
    @JsonProperty("startDateTime")
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * 
     * @param startDateTime
     *     The startDateTime
     */
    @JsonProperty("startDateTime")
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * 
     * @return
     *     The completionDateTime
     */
    @JsonProperty("completionDateTime")
    public String getCompletionDateTime() {
        return completionDateTime;
    }

    /**
     * 
     * @param completionDateTime
     *     The completionDateTime
     */
    @JsonProperty("completionDateTime")
    public void setCompletionDateTime(String completionDateTime) {
        this.completionDateTime = completionDateTime;
    }

    /**
     * 
     * @return
     *     The distanceUnitAbbr
     */
    @JsonProperty("distanceUnitAbbr")
    public String getDistanceUnitAbbr() {
        return distanceUnitAbbr;
    }

    /**
     * 
     * @param distanceUnitAbbr
     *     The distanceUnitAbbr
     */
    @JsonProperty("distanceUnitAbbr")
    public void setDistanceUnitAbbr(String distanceUnitAbbr) {
        this.distanceUnitAbbr = distanceUnitAbbr;
    }

}
