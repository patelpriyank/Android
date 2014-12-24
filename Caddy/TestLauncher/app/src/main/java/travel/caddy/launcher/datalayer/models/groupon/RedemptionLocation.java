
package travel.caddy.launcher.datalayer.models.groupon;

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
    "country",
    "phoneNumber",
    "lat",
    "name",
    "postalCode",
    "streetAddress1",
    "id",
    "streetAddress2",
    "neighborhood",
    "lng",
    "city",
    "state"
})
public class RedemptionLocation {

    @JsonProperty("country")
    private String country;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("name")
    private String name;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("streetAddress1")
    private String streetAddress1;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("streetAddress2")
    private String streetAddress2;
    @JsonProperty("neighborhood")
    private String neighborhood;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("streetAddress1")
    public String getStreetAddress1() {
        return streetAddress1;
    }

    @JsonProperty("streetAddress1")
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("streetAddress2")
    public String getStreetAddress2() {
        return streetAddress2;
    }

    @JsonProperty("streetAddress2")
    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    @JsonProperty("neighborhood")
    public String getNeighborhood() {
        return neighborhood;
    }

    @JsonProperty("neighborhood")
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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
