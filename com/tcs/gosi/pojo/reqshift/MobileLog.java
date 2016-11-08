
package com.tcs.gosi.pojo.reqshift;

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
    private MobileLogList mobileLogList;

    /**
     * 
     * @return
     *     The mobileLogList
     */
    @JsonProperty("mobileLogList")
    public MobileLogList getMobileLogList() {
        return mobileLogList;
    }

    /**
     * 
     * @param mobileLogList
     *     The mobileLogList
     */
    @JsonProperty("mobileLogList")
    public void setMobileLogList(MobileLogList mobileLogList) {
        this.mobileLogList = mobileLogList;
    }

}
