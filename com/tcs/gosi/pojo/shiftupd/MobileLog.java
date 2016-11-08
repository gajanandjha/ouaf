
package com.tcs.gosi.pojo.shiftupd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "mobileLogList"
})
public class MobileLog {

    @JsonProperty("mobileLogList")
    private List<MobileLogList> mobileLogList = new ArrayList<MobileLogList>();

    /**
     * 
     * @return
     *     The mobileLogList
     */
    @JsonProperty("mobileLogList")
    public List<MobileLogList> getMobileLogList() {
        return mobileLogList;
    }

    /**
     * 
     * @param mobileLogList
     *     The mobileLogList
     */
    @JsonProperty("mobileLogList")
    public void setMobileLogList(List<MobileLogList> mobileLogList) {
        this.mobileLogList = mobileLogList;
    }

}
