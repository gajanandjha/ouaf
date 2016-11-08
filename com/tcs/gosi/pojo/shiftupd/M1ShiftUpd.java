
package com.tcs.gosi.pojo.shiftupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-ShiftUpd"
})
public class M1ShiftUpd {

    @JsonProperty("M1-ShiftUpd")
    private M1ShiftUpd_ m1ShiftUpd;

    /**
     * 
     * @return
     *     The m1ShiftUpd
     */
    @JsonProperty("M1-ShiftUpd")
    public M1ShiftUpd_ getM1ShiftUpd() {
        return m1ShiftUpd;
    }

    /**
     * 
     * @param m1ShiftUpd
     *     The M1-ShiftUpd
     */
    @JsonProperty("M1-ShiftUpd")
    public void setM1ShiftUpd(M1ShiftUpd_ m1ShiftUpd) {
        this.m1ShiftUpd = m1ShiftUpd;
    }

}
