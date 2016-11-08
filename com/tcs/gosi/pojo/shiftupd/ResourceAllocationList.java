
package com.tcs.gosi.pojo.shiftupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sequenceNumber",
    "resourceId",
    "effectiveDateTime",
    "expirationDateTime",
    "vehicleStartOdometer",
    "vehicleEndOdometer",
    "resourceClass",
    "userId",
    "resourceName"
})
public class ResourceAllocationList {

    @JsonProperty("sequenceNumber")
    private String sequenceNumber;
    @JsonProperty("resourceId")
    private String resourceId;
    @JsonProperty("effectiveDateTime")
    private String effectiveDateTime;
    @JsonProperty("expirationDateTime")
    private String expirationDateTime;
    @JsonProperty("vehicleStartOdometer")
    private String vehicleStartOdometer;
    @JsonProperty("vehicleEndOdometer")
    private String vehicleEndOdometer;
    @JsonProperty("resourceClass")
    private String resourceClass;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("resourceName")
    private String resourceName;

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
     *     The resourceId
     */
    @JsonProperty("resourceId")
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 
     * @param resourceId
     *     The resourceId
     */
    @JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 
     * @return
     *     The effectiveDateTime
     */
    @JsonProperty("effectiveDateTime")
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * 
     * @param effectiveDateTime
     *     The effectiveDateTime
     */
    @JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(String effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }

    /**
     * 
     * @return
     *     The expirationDateTime
     */
    @JsonProperty("expirationDateTime")
    public String getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * 
     * @param expirationDateTime
     *     The expirationDateTime
     */
    @JsonProperty("expirationDateTime")
    public void setExpirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    /**
     * 
     * @return
     *     The vehicleStartOdometer
     */
    @JsonProperty("vehicleStartOdometer")
    public String getVehicleStartOdometer() {
        return vehicleStartOdometer;
    }

    /**
     * 
     * @param vehicleStartOdometer
     *     The vehicleStartOdometer
     */
    @JsonProperty("vehicleStartOdometer")
    public void setVehicleStartOdometer(String vehicleStartOdometer) {
        this.vehicleStartOdometer = vehicleStartOdometer;
    }

    /**
     * 
     * @return
     *     The vehicleEndOdometer
     */
    @JsonProperty("vehicleEndOdometer")
    public String getVehicleEndOdometer() {
        return vehicleEndOdometer;
    }

    /**
     * 
     * @param vehicleEndOdometer
     *     The vehicleEndOdometer
     */
    @JsonProperty("vehicleEndOdometer")
    public void setVehicleEndOdometer(String vehicleEndOdometer) {
        this.vehicleEndOdometer = vehicleEndOdometer;
    }

    /**
     * 
     * @return
     *     The resourceClass
     */
    @JsonProperty("resourceClass")
    public String getResourceClass() {
        return resourceClass;
    }

    /**
     * 
     * @param resourceClass
     *     The resourceClass
     */
    @JsonProperty("resourceClass")
    public void setResourceClass(String resourceClass) {
        this.resourceClass = resourceClass;
    }

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The resourceName
     */
    @JsonProperty("resourceName")
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 
     * @param resourceName
     *     The resourceName
     */
    @JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

}
