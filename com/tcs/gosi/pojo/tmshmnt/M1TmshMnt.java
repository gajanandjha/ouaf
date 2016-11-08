
package com.tcs.gosi.pojo.tmshmnt;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-TmshMnt"
})
public class M1TmshMnt {

    @JsonProperty("M1-TmshMnt")
    private M1TmshMnt_ m1TmshMnt;

    /**
     * 
     * @return
     *     The m1TmshMnt
     */
    @JsonProperty("M1-TmshMnt")
    public M1TmshMnt_ getM1TmshMnt() {
        return m1TmshMnt;
    }

    /**
     * 
     * @param m1TmshMnt
     *     The M1-TmshMnt
     */
    @JsonProperty("M1-TmshMnt")
    public void setM1TmshMnt(M1TmshMnt_ m1TmshMnt) {
        this.m1TmshMnt = m1TmshMnt;
    }

}
