
package com.tcs.gosi.pojo.gtprvtsks;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "M1-GtPrvTsks"
})
public class M1GtPrvTsks {

    @JsonProperty("M1-GtPrvTsks")
    private M1GtPrvTsks_ m1GtPrvTsks;

    /**
     * 
     * @return
     *     The m1GtPrvTsks
     */
    @JsonProperty("M1-GtPrvTsks")
    public M1GtPrvTsks_ getM1GtPrvTsks() {
        return m1GtPrvTsks;
    }

    /**
     * 
     * @param m1GtPrvTsks
     *     The M1-GtPrvTsks
     */
    @JsonProperty("M1-GtPrvTsks")
    public void setM1GtPrvTsks(M1GtPrvTsks_ m1GtPrvTsks) {
        this.m1GtPrvTsks = m1GtPrvTsks;
    }

}
