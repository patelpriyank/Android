
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
    "websiteContentHtml",
    "id",
    "emailContentHtml",
    "emailContent",
    "websiteContent",
    "title"
})
public class Says {

    @JsonProperty("websiteContentHtml")
    private String websiteContentHtml;
    @JsonProperty("id")
    private String id;
    @JsonProperty("emailContentHtml")
    private String emailContentHtml;
    @JsonProperty("emailContent")
    private String emailContent;
    @JsonProperty("websiteContent")
    private String websiteContent;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("websiteContentHtml")
    public String getWebsiteContentHtml() {
        return websiteContentHtml;
    }

    @JsonProperty("websiteContentHtml")
    public void setWebsiteContentHtml(String websiteContentHtml) {
        this.websiteContentHtml = websiteContentHtml;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("emailContentHtml")
    public String getEmailContentHtml() {
        return emailContentHtml;
    }

    @JsonProperty("emailContentHtml")
    public void setEmailContentHtml(String emailContentHtml) {
        this.emailContentHtml = emailContentHtml;
    }

    @JsonProperty("emailContent")
    public String getEmailContent() {
        return emailContent;
    }

    @JsonProperty("emailContent")
    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    @JsonProperty("websiteContent")
    public String getWebsiteContent() {
        return websiteContent;
    }

    @JsonProperty("websiteContent")
    public void setWebsiteContent(String websiteContent) {
        this.websiteContent = websiteContent;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
