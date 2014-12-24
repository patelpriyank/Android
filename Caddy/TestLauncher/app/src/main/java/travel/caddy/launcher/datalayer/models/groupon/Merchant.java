
package travel.caddy.launcher.datalayer.models.groupon;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "ratings",
    "twitterUrl",
    "name",
    "facebookUrl",
    "id",
    "uuid",
    "websiteUrl"
})
public class Merchant {

    @JsonProperty("ratings")
    private List<Object> ratings = new ArrayList<Object>();
    @JsonProperty("twitterUrl")
    private Object twitterUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("facebookUrl")
    private String facebookUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("websiteUrl")
    private String websiteUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ratings")
    public List<Object> getRatings() {
        return ratings;
    }

    @JsonProperty("ratings")
    public void setRatings(List<Object> ratings) {
        this.ratings = ratings;
    }

    @JsonProperty("twitterUrl")
    public Object getTwitterUrl() {
        return twitterUrl;
    }

    @JsonProperty("twitterUrl")
    public void setTwitterUrl(Object twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("facebookUrl")
    public String getFacebookUrl() {
        return facebookUrl;
    }

    @JsonProperty("facebookUrl")
    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("websiteUrl")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("websiteUrl")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
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
