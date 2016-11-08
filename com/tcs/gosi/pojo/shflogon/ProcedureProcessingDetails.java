
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "allowOverride",
    "takeAttendance"
})
public class ProcedureProcessingDetails {

    @JsonProperty("allowOverride")
    private String allowOverride;
    @JsonProperty("takeAttendance")
    private String takeAttendance;

    /**
     * 
     * @return
     *     The allowOverride
     */
    @JsonProperty("allowOverride")
    public String getAllowOverride() {
        return allowOverride;
    }

    /**
     * 
     * @param allowOverride
     *     The allowOverride
     */
    @JsonProperty("allowOverride")
    public void setAllowOverride(String allowOverride) {
        this.allowOverride = allowOverride;
    }

    /**
     * 
     * @return
     *     The takeAttendance
     */
    @JsonProperty("takeAttendance")
    public String getTakeAttendance() {
        return takeAttendance;
    }

    /**
     * 
     * @param takeAttendance
     *     The takeAttendance
     */
    @JsonProperty("takeAttendance")
    public void setTakeAttendance(String takeAttendance) {
        this.takeAttendance = takeAttendance;
    }

}
