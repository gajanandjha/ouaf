
package com.tcs.gosi.pojo.getgeocod;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskId",
    "output"
})
public class TaskList {

    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("output")
    private Output output;

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
     *     The output
     */
    @JsonProperty("output")
    public Output getOutput() {
        return output;
    }

    /**
     * 
     * @param output
     *     The output
     */
    @JsonProperty("output")
    public void setOutput(Output output) {
        this.output = output;
    }

}
