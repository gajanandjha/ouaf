package com.tcs.gosi.pojo;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tcs.gosi.pojo.syncdata.M1SyncData_;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-SyncData"
})
public class SyncDataList {

    @JsonProperty("M1-SyncData")
    private M1SyncData_ m1SyncData;

    /**
     * 
     * @return
     *     The m1SyncData
     */
    @JsonProperty("M1-SyncData")
    public M1SyncData_ getM1SyncData() {
        return m1SyncData;
    }

    /**
     * 
     * @param m1SyncData
     *     The M1-SyncData
     */
    @JsonProperty("M1-SyncData")
    public void setM1SyncData(M1SyncData_ m1SyncData) {
        this.m1SyncData = m1SyncData;
    }

}
