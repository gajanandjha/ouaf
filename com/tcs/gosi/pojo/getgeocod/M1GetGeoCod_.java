
package com.tcs.gosi.pojo.getgeocod;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "shiftId",
    "crewLocation",
    "tasks",
    "route",
    "themes",
    "mapViewerDetails"
})
public class M1GetGeoCod_ {

    @JsonProperty("shiftId")
    private String shiftId;
    @JsonProperty("crewLocation")
    private CrewLocation crewLocation;
    @JsonProperty("tasks")
    private Tasks tasks;
    @JsonProperty("route")
    private Route route;
    @JsonProperty("themes")
    private String themes;
    @JsonProperty("mapViewerDetails")
    private MapViewerDetails mapViewerDetails;

    /**
     * 
     * @return
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public String getShiftId() {
        return shiftId;
    }

    /**
     * 
     * @param shiftId
     *     The shiftId
     */
    @JsonProperty("shiftId")
    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    /**
     * 
     * @return
     *     The crewLocation
     */
    @JsonProperty("crewLocation")
    public CrewLocation getCrewLocation() {
        return crewLocation;
    }

    /**
     * 
     * @param crewLocation
     *     The crewLocation
     */
    @JsonProperty("crewLocation")
    public void setCrewLocation(CrewLocation crewLocation) {
        this.crewLocation = crewLocation;
    }

    /**
     * 
     * @return
     *     The tasks
     */
    @JsonProperty("tasks")
    public Tasks getTasks() {
        return tasks;
    }

    /**
     * 
     * @param tasks
     *     The tasks
     */
    @JsonProperty("tasks")
    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    /**
     * 
     * @return
     *     The route
     */
    @JsonProperty("route")
    public Route getRoute() {
        return route;
    }

    /**
     * 
     * @param route
     *     The route
     */
    @JsonProperty("route")
    public void setRoute(Route route) {
        this.route = route;
    }

    /**
     * 
     * @return
     *     The themes
     */
    @JsonProperty("themes")
    public String getThemes() {
        return themes;
    }

    /**
     * 
     * @param themes
     *     The themes
     */
    @JsonProperty("themes")
    public void setThemes(String themes) {
        this.themes = themes;
    }

    /**
     * 
     * @return
     *     The mapViewerDetails
     */
    @JsonProperty("mapViewerDetails")
    public MapViewerDetails getMapViewerDetails() {
        return mapViewerDetails;
    }

    /**
     * 
     * @param mapViewerDetails
     *     The mapViewerDetails
     */
    @JsonProperty("mapViewerDetails")
    public void setMapViewerDetails(MapViewerDetails mapViewerDetails) {
        this.mapViewerDetails = mapViewerDetails;
    }

}
