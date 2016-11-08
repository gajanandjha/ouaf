
package com.tcs.gosi.pojo.taskupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "remainingDuration",
    "workDuration",
    "remarkTypes",
    "crewTimeUsage",
    "earningTime",
    "resourceCompletion"
})
public class CompletionInformation {

    @JsonProperty("remainingDuration")
    private String remainingDuration;
    @JsonProperty("workDuration")
    private String workDuration;
    @JsonProperty("remarkTypes")
    private RemarkTypes remarkTypes;
    @JsonProperty("crewTimeUsage")
    private CrewTimeUsage crewTimeUsage;
    @JsonProperty("earningTime")
    private EarningTime earningTime;
    @JsonProperty("resourceCompletion")
    private ResourceCompletion resourceCompletion;

    /**
     * 
     * @return
     *     The remainingDuration
     */
    @JsonProperty("remainingDuration")
    public String getRemainingDuration() {
        return remainingDuration;
    }

    /**
     * 
     * @param remainingDuration
     *     The remainingDuration
     */
    @JsonProperty("remainingDuration")
    public void setRemainingDuration(String remainingDuration) {
        this.remainingDuration = remainingDuration;
    }

    /**
     * 
     * @return
     *     The workDuration
     */
    @JsonProperty("workDuration")
    public String getWorkDuration() {
        return workDuration;
    }

    /**
     * 
     * @param workDuration
     *     The workDuration
     */
    @JsonProperty("workDuration")
    public void setWorkDuration(String workDuration) {
        this.workDuration = workDuration;
    }

    /**
     * 
     * @return
     *     The remarkTypes
     */
    @JsonProperty("remarkTypes")
    public RemarkTypes getRemarkTypes() {
        return remarkTypes;
    }

    /**
     * 
     * @param remarkTypes
     *     The remarkTypes
     */
    @JsonProperty("remarkTypes")
    public void setRemarkTypes(RemarkTypes remarkTypes) {
        this.remarkTypes = remarkTypes;
    }

    /**
     * 
     * @return
     *     The crewTimeUsage
     */
    @JsonProperty("crewTimeUsage")
    public CrewTimeUsage getCrewTimeUsage() {
        return crewTimeUsage;
    }

    /**
     * 
     * @param crewTimeUsage
     *     The crewTimeUsage
     */
    @JsonProperty("crewTimeUsage")
    public void setCrewTimeUsage(CrewTimeUsage crewTimeUsage) {
        this.crewTimeUsage = crewTimeUsage;
    }

    /**
     * 
     * @return
     *     The earningTime
     */
    @JsonProperty("earningTime")
    public EarningTime getEarningTime() {
        return earningTime;
    }

    /**
     * 
     * @param earningTime
     *     The earningTime
     */
    @JsonProperty("earningTime")
    public void setEarningTime(EarningTime earningTime) {
        this.earningTime = earningTime;
    }

    /**
     * 
     * @return
     *     The resourceCompletion
     */
    @JsonProperty("resourceCompletion")
    public ResourceCompletion getResourceCompletion() {
        return resourceCompletion;
    }

    /**
     * 
     * @param resourceCompletion
     *     The resourceCompletion
     */
    @JsonProperty("resourceCompletion")
    public void setResourceCompletion(ResourceCompletion resourceCompletion) {
        this.resourceCompletion = resourceCompletion;
    }

}
