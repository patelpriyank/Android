
package travel.caddy.launcher.models;

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
    "headline",
    "line2",
    "line1"
})
public class TextAd {

    @JsonProperty("headline")
    private String headline;
    @JsonProperty("line2")
    private String line2;
    @JsonProperty("line1")
    private String line1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("headline")
    public String getHeadline() {
        return headline;
    }

    @JsonProperty("headline")
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
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
