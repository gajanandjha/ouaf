
package com.tcs.gosi.pojo.shflogon;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "input",
    "inputOutput"
})
public class M1ShfLogon_ {

    @JsonProperty("input")
    private Input input;
    @JsonProperty("inputOutput")
    private InputOutput inputOutput;

    /**
     * 
     * @return
     *     The input
     */
    @JsonProperty("input")
    public Input getInput() {
        return input;
    }

    /**
     * 
     * @param input
     *     The input
     */
    @JsonProperty("input")
    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * 
     * @return
     *     The inputOutput
     */
    @JsonProperty("inputOutput")
    public InputOutput getInputOutput() {
        return inputOutput;
    }

    /**
     * 
     * @param inputOutput
     *     The inputOutput
     */
    @JsonProperty("inputOutput")
    public void setInputOutput(InputOutput inputOutput) {
        this.inputOutput = inputOutput;
    }

}
