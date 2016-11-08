
package com.tcs.gosi.pojo.updprcdrs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-UpdPrcdrs"
})
public class M1UpdPrcdrs {

    @JsonProperty("M1-UpdPrcdrs")
    private M1UpdPrcdrs_ m1UpdPrcdrs;

    /**
     * 
     * @return
     *     The m1UpdPrcdrs
     */
    @JsonProperty("M1-UpdPrcdrs")
    public M1UpdPrcdrs_ getM1UpdPrcdrs() {
        return m1UpdPrcdrs;
    }

    /**
     * 
     * @param m1UpdPrcdrs
     *     The M1-UpdPrcdrs
     */
    @JsonProperty("M1-UpdPrcdrs")
    public void setM1UpdPrcdrs(M1UpdPrcdrs_ m1UpdPrcdrs) {
        this.m1UpdPrcdrs = m1UpdPrcdrs;
    }

}
