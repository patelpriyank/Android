
package travel.caddy.launcher.models;

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
    "deals",
    "facets",
    "pagination"
})
public class GrouponPOJO {

    @JsonProperty("deals")
    private List<Deal> deals = new ArrayList<Deal>();
    @JsonProperty("facets")
    private List<Object> facets = new ArrayList<Object>();
    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("deals")
    public List<Deal> getDeals() {
        return deals;
    }

    @JsonProperty("deals")
    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    @JsonProperty("facets")
    public List<Object> getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(List<Object> facets) {
        this.facets = facets;
    }

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
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
