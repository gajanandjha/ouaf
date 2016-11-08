
package com.tcs.gosi.pojo.reqshift;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-ReqShift"
})
public class M1ReqShift {

    @JsonProperty("M1-ReqShift")
    private M1ReqShift_ m1ReqShift;

    /**
     * 
     * @return
     *     The m1ReqShift
     */
    @JsonProperty("M1-ReqShift")
    public M1ReqShift_ getM1ReqShift() {
        return m1ReqShift;
    }

    /**
     * 
     * @param m1ReqShift
     *     The M1-ReqShift
     */
    @JsonProperty("M1-ReqShift")
    public void setM1ReqShift(M1ReqShift_ m1ReqShift) {
        this.m1ReqShift = m1ReqShift;
    }

}
