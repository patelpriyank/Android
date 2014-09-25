
package travel.caddy.launcher.models.groupon;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;



@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "lat",
    "name",
    "id",
    "timezone",
    "timezoneIdentifier",
    "lng",
    "timezoneOffsetInSeconds"
})
public class Division {

    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("timezoneIdentifier")
    private String timezoneIdentifier;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("timezoneOffsetInSeconds")
    private Integer timezoneOffsetInSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("timezoneIdentifier")
    public String getTimezoneIdentifier() {
        return timezoneIdentifier;
    }

    @JsonProperty("timezoneIdentifier")
    public void setTimezoneIdentifier(String timezoneIdentifier) {
        this.timezoneIdentifier = timezoneIdentifier;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @JsonProperty("timezoneOffsetInSeconds")
    public Integer getTimezoneOffsetInSeconds() {
        return timezoneOffsetInSeconds;
    }

    @JsonProperty("timezoneOffsetInSeconds")
    public void setTimezoneOffsetInSeconds(Integer timezoneOffsetInSeconds) {
        this.timezoneOffsetInSeconds = timezoneOffsetInSeconds;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
