
package com.tcs.gosi.pojo.taskupd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-TaskUpd"
})
public class M1TaskUpd {

    @JsonProperty("M1-TaskUpd")
    private M1TaskUpd_ m1TaskUpd;

    /**
     * 
     * @return
     *     The m1TaskUpd
     */
    @JsonProperty("M1-TaskUpd")
    public M1TaskUpd_ getM1TaskUpd() {
        return m1TaskUpd;
    }

    /**
     * 
     * @param m1TaskUpd
     *     The M1-TaskUpd
     */
    @JsonProperty("M1-TaskUpd")
    public void setM1TaskUpd(M1TaskUpd_ m1TaskUpd) {
        this.m1TaskUpd = m1TaskUpd;
    }

}
