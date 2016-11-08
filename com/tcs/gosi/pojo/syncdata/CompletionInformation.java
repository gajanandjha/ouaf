
package com.tcs.gosi.pojo.syncdata;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "remainingDuration",
    "workDuration"
})
public class CompletionInformation {

    @JsonProperty("remainingDuration")
    private String remainingDuration;
    @JsonProperty("workDuration")
    private String workDuration;
    
    @JsonProperty("remainingDuration")
	public String getRemainingDuration() {
		return remainingDuration;
	}
    
    @JsonProperty("remainingDuration")
	public void setRemainingDuration(String remainingDuration) {
		this.remainingDuration = remainingDuration;
	}
    
    @JsonProperty("workDuration")
	public String getWorkDuration() {
		return workDuration;
	}
    
    @JsonProperty("workDuration")
	public void setWorkDuration(String workDuration) {
		this.workDuration = workDuration;
	}
}
