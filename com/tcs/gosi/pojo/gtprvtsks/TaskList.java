
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskBoName",
    "relatedEntities",
    "taskBoData",
    "taskId"
})
public class TaskList {

    @JsonProperty("taskBoName")
    private String taskBoName;
    @JsonProperty("relatedEntities")
    private String relatedEntities;
    @JsonProperty("taskBoData")
    private TaskBoData taskBoData;
    @JsonProperty("taskId")
    private String taskId;

    /**
     * 
     * @return
     *     The taskBoName
     */
    @JsonProperty("taskBoName")
    public String getTaskBoName() {
        return taskBoName;
    }

    /**
     * 
     * @param taskBoName
     *     The taskBoName
     */
    @JsonProperty("taskBoName")
    public void setTaskBoName(String taskBoName) {
        this.taskBoName = taskBoName;
    }

    /**
     * 
     * @return
     *     The relatedEntities
     */
    @JsonProperty("relatedEntities")
    public String getRelatedEntities() {
        return relatedEntities;
    }

    /**
     * 
     * @param relatedEntities
     *     The relatedEntities
     */
    @JsonProperty("relatedEntities")
    public void setRelatedEntities(String relatedEntities) {
        this.relatedEntities = relatedEntities;
    }

    /**
     * 
     * @return
     *     The taskBoData
     */
    @JsonProperty("taskBoData")
    public TaskBoData getTaskBoData() {
        return taskBoData;
    }

    /**
     * 
     * @param taskBoData
     *     The taskBoData
     */
    @JsonProperty("taskBoData")
    public void setTaskBoData(TaskBoData taskBoData) {
        this.taskBoData = taskBoData;
    }

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

}
