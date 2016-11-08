
package com.tcs.gosi.pojo.taskupd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "remarkTypesList"
})
public class RemarkTypes {

    @JsonProperty("remarkTypesList")
    private List<Object> remarkTypesList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The remarkTypesList
     */
    @JsonProperty("remarkTypesList")
    public List<Object> getRemarkTypesList() {
        return remarkTypesList;
    }

    /**
     * 
     * @param remarkTypesList
     *     The remarkTypesList
     */
    @JsonProperty("remarkTypesList")
    public void setRemarkTypesList(List<Object> remarkTypesList) {
        this.remarkTypesList = remarkTypesList;
    }

}
