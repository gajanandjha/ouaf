
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "messages"
})
public class Output {

    @JsonProperty("messages")
    private Messages messages;

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("messages")
    public Messages getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    @JsonProperty("messages")
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

}
