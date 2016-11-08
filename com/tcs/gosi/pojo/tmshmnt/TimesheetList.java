
package com.tcs.gosi.pojo.tmshmnt;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "boName",
    "boData"
})
public class TimesheetList {

    @JsonProperty("boName")
    private String boName;
    @JsonProperty("boData")
    private BoData boData;

    /**
     * 
     * @return
     *     The boName
     */
    @JsonProperty("boName")
    public String getBoName() {
        return boName;
    }

    /**
     * 
     * @param boName
     *     The boName
     */
    @JsonProperty("boName")
    public void setBoName(String boName) {
        this.boName = boName;
    }

    /**
     * 
     * @return
     *     The boData
     */
    @JsonProperty("boData")
    public BoData getBoData() {
        return boData;
    }

    /**
     * 
     * @param boData
     *     The boData
     */
    @JsonProperty("boData")
    public void setBoData(BoData boData) {
        this.boData = boData;
    }

}
