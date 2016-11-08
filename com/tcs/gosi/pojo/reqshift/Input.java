
package com.tcs.gosi.pojo.reqshift;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "userId",
    "mdtId",
    "currentShiftId"
})
public class Input {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("mdtId")
    private String mdtId;
    @JsonProperty("currentShiftId")
    private String currentShiftId;

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The mdtId
     */
    @JsonProperty("mdtId")
    public String getMdtId() {
        return mdtId;
    }

    /**
     * 
     * @param mdtId
     *     The mdtId
     */
    @JsonProperty("mdtId")
    public void setMdtId(String mdtId) {
        this.mdtId = mdtId;
    }

    /**
     * 
     * @return
     *     The currentShiftId
     */
    @JsonProperty("currentShiftId")
    public String getCurrentShiftId() {
        return currentShiftId;
    }

    /**
     * 
     * @param currentShiftId
     *     The currentShiftId
     */
    @JsonProperty("currentShiftId")
    public void setCurrentShiftId(String currentShiftId) {
        this.currentShiftId = currentShiftId;
    }

}
