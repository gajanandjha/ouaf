
package com.tcs.gosi.pojo.getgeocod;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskLocLat",
    "taskLocLon",
    "activityID",
    "workSeq",
    "taskClass",
    "locationOption",
    "address",
    "city",
    "state"
})
public class Output {

    @JsonProperty("taskLocLat")
    private String taskLocLat;
    @JsonProperty("taskLocLon")
    private String taskLocLon;
    @JsonProperty("activityID")
    private String activityID;
    @JsonProperty("workSeq")
    private String workSeq;
    @JsonProperty("taskClass")
    private String taskClass;
    @JsonProperty("locationOption")
    private String locationOption;
    @JsonProperty("address")
    private String address;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;

    /**
     * 
     * @return
     *     The taskLocLat
     */
    @JsonProperty("taskLocLat")
    public String getTaskLocLat() {
        return taskLocLat;
    }

    /**
     * 
     * @param taskLocLat
     *     The taskLocLat
     */
    @JsonProperty("taskLocLat")
    public void setTaskLocLat(String taskLocLat) {
        this.taskLocLat = taskLocLat;
    }

    /**
     * 
     * @return
     *     The taskLocLon
     */
    @JsonProperty("taskLocLon")
    public String getTaskLocLon() {
        return taskLocLon;
    }

    /**
     * 
     * @param taskLocLon
     *     The taskLocLon
     */
    @JsonProperty("taskLocLon")
    public void setTaskLocLon(String taskLocLon) {
        this.taskLocLon = taskLocLon;
    }

    /**
     * 
     * @return
     *     The activityID
     */
    @JsonProperty("activityID")
    public String getActivityID() {
        return activityID;
    }

    /**
     * 
     * @param activityID
     *     The activityID
     */
    @JsonProperty("activityID")
    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    /**
     * 
     * @return
     *     The workSeq
     */
    @JsonProperty("workSeq")
    public String getWorkSeq() {
        return workSeq;
    }

    /**
     * 
     * @param workSeq
     *     The workSeq
     */
    @JsonProperty("workSeq")
    public void setWorkSeq(String workSeq) {
        this.workSeq = workSeq;
    }

    /**
     * 
     * @return
     *     The taskClass
     */
    @JsonProperty("taskClass")
    public String getTaskClass() {
        return taskClass;
    }

    /**
     * 
     * @param taskClass
     *     The taskClass
     */
    @JsonProperty("taskClass")
    public void setTaskClass(String taskClass) {
        this.taskClass = taskClass;
    }

    /**
     * 
     * @return
     *     The locationOption
     */
    @JsonProperty("locationOption")
    public String getLocationOption() {
        return locationOption;
    }

    /**
     * 
     * @param locationOption
     *     The locationOption
     */
    @JsonProperty("locationOption")
    public void setLocationOption(String locationOption) {
        this.locationOption = locationOption;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

}
