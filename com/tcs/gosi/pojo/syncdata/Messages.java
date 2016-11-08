
package com.tcs.gosi.pojo.syncdata;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "message"
})
public class Messages {

    @JsonProperty("message")
    private List<Message> message = new ArrayList<Message>();

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public List<Message> getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(List<Message> message) {
        this.message = message;
    }

}
