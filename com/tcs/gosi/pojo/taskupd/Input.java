
package com.tcs.gosi.pojo.taskupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sentFromMDT",
    "boName",
    "updateAction",
    "boData"
})
public class Input {

    @JsonProperty("sentFromMDT")
    private String sentFromMDT;
    @JsonProperty("boName")
    private String boName;
    @JsonProperty("updateAction")
    private Boolean updateAction;
    @JsonProperty("boData")
    private BoData boData;

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
