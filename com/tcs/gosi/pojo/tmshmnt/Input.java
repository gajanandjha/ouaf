
package com.tcs.gosi.pojo.tmshmnt;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sentFromMDT",
    "updateAction",
    "timesheetList"
})
public class Input {

    @JsonProperty("sentFromMDT")
    private String sentFromMDT;
    @JsonProperty("updateAction")
    private Boolean updateAction;
    @JsonProperty("timesheetList")
    private List<TimesheetList> timesheetList = new ArrayList<TimesheetList>();

    /**
     * 
     * @return
     *     The sentFromMDT
     */
    @JsonProperty("sentFromMDT")
    public String getSentFromMDT() {
        return sentFromMDT;
    }

    /**
     * 
     * @param sentFromMDT
     *     The sentFromMDT
     */
    @JsonProperty("sentFromMDT")
    public void setSentFromMDT(String sentFromMDT) {
        this.sentFromMDT = sentFromMDT;
    }

    /**
     * 
     * @return
     *     The updateAction
     */
    @JsonProperty("updateAction")
    public Boolean getUpdateAction() {
        return updateAction;
    }

    /**
     * 
     * @param updateAction
     *     The updateAction
     */
    @JsonProperty("updateAction")
    public void setUpdateAction(Boolean updateAction) {
        this.updateAction = updateAction;
    }

    /**
     * 
     * @return
     *     The timesheetList
     */
    @JsonProperty("timesheetList")
    public List<TimesheetList> getTimesheetList() {
        return timesheetList;
    }

    /**
     * 
     * @param timesheetList
     *     The timesheetList
     */
    @JsonProperty("timesheetList")
    public void setTimesheetList(List<TimesheetList> timesheetList) {
        this.timesheetList = timesheetList;
    }

}
