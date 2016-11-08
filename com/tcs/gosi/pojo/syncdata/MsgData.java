
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "input"
})
public class MsgData {

    @JsonProperty("input")
    private Input_ input;

    /**
     * 
     * @return
     *     The input
     */
    @JsonProperty("input")
    public Input_ getInput() {
        return input;
    }

    /**
     * 
     * @param input
     *     The input
     */
    @JsonProperty("input")
    public void setInput(Input_ input) {
        this.input = input;
    }

}
