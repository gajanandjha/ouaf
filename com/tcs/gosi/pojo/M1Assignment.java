
package com.tcs.gosi.pojo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tcs.gosi.pojo.syncdata.ScheduleDetails;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskId",
    "shiftId",
    "queue",
    "scheduleDetails",
    "bo"
})
public class M1Assignment {

    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("queue")
    private String queue;
    @JsonProperty("scheduleDetails")
    private ScheduleDetails scheduleDetails;
    @JsonProperty("bo")
    private String bo;

    /**
     * 
     * @return
     *     The taskId
     */
    @JsonProperty("taskId")
    public String getTaskId() {
        return taskId;
    }

    /**
     * 
     * @param taskId
     *     The taskId
     */
    @JsonProperty("taskId")
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * 
     * @return
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public String getShiftId() {
        return shiftId;
    }

    /**
     * 
     * @param shiftId
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    /**
     * 
     * @return
     *     The queue
     */
    @JsonProperty("queue")
    public String getQueue() {
        return queue;
    }

    /**
     * 
     * @param queue
     *     The queue
     */
    @JsonProperty("queue")
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * 
     * @return
     *     The scheduleDetails
     */
    @JsonProperty("scheduleDetails")
    public ScheduleDetails getScheduleDetails() {
        return scheduleDetails;
    }

    /**
     * 
     * @param scheduleDetails
     *     The scheduleDetails
     */
    @JsonProperty("scheduleDetails")
    public void setScheduleDetails(ScheduleDetails scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * 
     * @return
     *     The bo
     */
    @JsonProperty("bo")
    public String getBo() {
        return bo;
    }

    /**
     * 
     * @param bo
     *     The bo
     */
    @JsonProperty("bo")
    public void setBo(String bo) {
        this.bo = bo;
    }

}
