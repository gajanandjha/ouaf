
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sentFromMDT",
    "updateAction",
    "procedureBoName",
    "procedureBoData"
})
public class Input {

    @JsonProperty("sentFromMDT")
    private String sentFromMDT;
    @JsonProperty("updateAction")
    private Boolean updateAction;
    @JsonProperty("procedureBoName")
    private String procedureBoName;
    @JsonProperty("procedureBoData")
    private ProcedureBoData procedureBoData;

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
     *     The procedureBoName
     */
    @JsonProperty("procedureBoName")
    public String getProcedureBoName() {
        return procedureBoName;
    }

    /**
     * 
     * @param procedureBoName
     *     The procedureBoName
     */
    @JsonProperty("procedureBoName")
    public void setProcedureBoName(String procedureBoName) {
        this.procedureBoName = procedureBoName;
    }

    /**
     * 
     * @return
     *     The procedureBoData
     */
    @JsonProperty("procedureBoData")
    public ProcedureBoData getProcedureBoData() {
        return procedureBoData;
    }

    /**
     * 
     * @param procedureBoData
     *     The procedureBoData
     */
    @JsonProperty("procedureBoData")
    public void setProcedureBoData(ProcedureBoData procedureBoData) {
        this.procedureBoData = procedureBoData;
    }

}
