
package com.tcs.gosi.pojo.ims;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "InspectorName",
    "StartDate",
    "StartAddress",
    "EndDate",
    "EndAddress",
    "PrimaryFunction",
    "ShiftStatus"
})
public class ShiftInfo {

    @JsonProperty("InspectorName")
    private String inspectorName;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("StartAddress")
    private String startAddress;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("EndAddress")
    private String endAddress;
    @JsonProperty("PrimaryFunction")
    private String primaryFunction;
    @JsonProperty("ShiftStatus")
    private String shiftStatus;

    /**
     * 
     * @return
     *     The inspectorName
     */
    @JsonProperty("InspectorName")
    public String getInspectorName() {
        return inspectorName;
    }

    /**
     * 
     * @param inspectorName
     *     The InspectorName
     */
    @JsonProperty("InspectorName")
    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The StartDate
     */
    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The startAddress
     */
    @JsonProperty("StartAddress")
    public String getStartAddress() {
        return startAddress;
    }

    /**
     * 
     * @param startAddress
     *     The StartAddress
     */
    @JsonProperty("StartAddress")
    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    /**
     * 
     * @return
     *     The endDate
     */
    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The EndDate
     */
    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     The endAddress
     */
    @JsonProperty("EndAddress")
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * 
     * @param endAddress
     *     The EndAddress
     */
    @JsonProperty("EndAddress")
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    /**
     * 
     * @return
     *     The primaryFunction
     */
    @JsonProperty("PrimaryFunction")
    public String getPrimaryFunction() {
        return primaryFunction;
    }

    /**
     * 
     * @param primaryFunction
     *     The PrimaryFunction
     */
    @JsonProperty("PrimaryFunction")
    public void setPrimaryFunction(String primaryFunction) {
        this.primaryFunction = primaryFunction;
    }

    /**
     * 
     * @return
     *     The shiftStatus
     */
    @JsonProperty("ShiftStatus")
    public String getShiftStatus() {
        return shiftStatus;
    }

    /**
     * 
     * @param shiftStatus
     *     The ShiftStatus
     */
    @JsonProperty("ShiftStatus")
    public void setShiftStatus(String shiftStatus) {
        this.shiftStatus = shiftStatus;
    }

}
