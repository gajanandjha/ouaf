
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "taskList"
})
public class Output {

    @JsonProperty("taskList")
    private TaskList taskList;

    /**
     * 
     * @return
     *     The taskList
     */
    @JsonProperty("taskList")
    public TaskList getTaskList() {
        return taskList;
    }

    /**
     * 
     * @param taskList
     *     The taskList
     */
    @JsonProperty("taskList")
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

}
