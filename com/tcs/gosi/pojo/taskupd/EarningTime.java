
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
    "earningTimeList"
})
public class EarningTime {

    @JsonProperty("earningTimeList")
    private List<Object> earningTimeList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The earningTimeList
     */
    @JsonProperty("earningTimeList")
    public List<Object> getEarningTimeList() {
        return earningTimeList;
    }

    /**
     * 
     * @param earningTimeList
     *     The earningTimeList
     */
    @JsonProperty("earningTimeList")
    public void setEarningTimeList(List<Object> earningTimeList) {
        this.earningTimeList = earningTimeList;
    }

}
