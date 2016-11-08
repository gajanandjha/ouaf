
package com.tcs.gosi.pojo.prmlfrdvc;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "recipientList"
})
public class SendTo {

    @JsonProperty("recipientList")
    private List<RecipientList> recipientList = new ArrayList<RecipientList>();

    /**
     * 
     * @return
     *     The recipientList
     */
    @JsonProperty("recipientList")
    public List<RecipientList> getRecipientList() {
        return recipientList;
    }

    /**
     * 
     * @param recipientList
     *     The recipientList
     */
    @JsonProperty("recipientList")
    public void setRecipientList(List<RecipientList> recipientList) {
        this.recipientList = recipientList;
    }

}
