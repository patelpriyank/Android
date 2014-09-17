
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
    "externalUrl",
    "initialQuantity",
    "expiresAt",
    "details",
    "specificAttributes",
    "expiresInDays",
    "buyUrl",
    "soldQuantityMessage",
    "isLimitedQuantity",
    "price",
    "maximumPurchaseQuantity",
    "id",
    "isSoldOut",
    "remainingQuantity",
    "discountPercent",
    "discount",
    "minimumPurchaseQuantity",
    "redemptionLocations",
    "soldQuantity",
    "value",
    "endAt",
    "status",
    "customFields",
    "uuid",
    "title",
    "bookable"
})
public class Option {

    @JsonProperty("externalUrl")
    private Object externalUrl;
    @JsonProperty("initialQuantity")
    private Integer initialQuantity;
    @JsonProperty("expiresAt")
    private String expiresAt;
    @JsonProperty("details")
    private List<Detail> details = new ArrayList<Detail>();
    @JsonProperty("specificAttributes")
    private SpecificAttributes specificAttributes;
    @JsonProperty("expiresInDays")
    private Integer expiresInDays;
    @JsonProperty("buyUrl")
    private String buyUrl;
    @JsonProperty("soldQuantityMessage")
    private String soldQuantityMessage;
    @JsonProperty("isLimitedQuantity")
    private Boolean isLimitedQuantity;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("maximumPurchaseQuantity")
    private Integer maximumPurchaseQuantity;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("isSoldOut")
    private Boolean isSoldOut;
    @JsonProperty("remainingQuantity")
    private Integer remainingQuantity;
    @JsonProperty("discountPercent")
    private Integer discountPercent;
    @JsonProperty("discount")
    private Discount discount;
    @JsonProperty("minimumPurchaseQuantity")
    private Integer minimumPurchaseQuantity;
    @JsonProperty("redemptionLocations")
    private List<RedemptionLocation> redemptionLocations = new ArrayList<RedemptionLocation>();
    @JsonProperty("soldQuantity")
    private Integer soldQuantity;
    @JsonProperty("value")
    private Value value;
    @JsonProperty("endAt")
    private String endAt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("customFields")
    private List<Object> customFields = new ArrayList<Object>();
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("title")
    private String title;
    @JsonProperty("bookable")
    private Boolean bookable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("externalUrl")
    public Object getExternalUrl() {
        return externalUrl;
    }

    @JsonProperty("externalUrl")
    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

    @JsonProperty("initialQuantity")
    public Integer getInitialQuantity() {
        return initialQuantity;
    }

    @JsonProperty("initialQuantity")
    public void setInitialQuantity(Integer initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    @JsonProperty("expiresAt")
    public String getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty("expiresAt")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    @JsonProperty("details")
    public List<Detail> getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    @JsonProperty("specificAttributes")
    public SpecificAttributes getSpecificAttributes() {
        return specificAttributes;
    }

    @JsonProperty("specificAttributes")
    public void setSpecificAttributes(SpecificAttributes specificAttributes) {
        this.specificAttributes = specificAttributes;
    }

    @JsonProperty("expiresInDays")
    public Integer getExpiresInDays() {
        return expiresInDays;
    }

    @JsonProperty("expiresInDays")
    public void setExpiresInDays(Integer expiresInDays) {
        this.expiresInDays = expiresInDays;
    }

    @JsonProperty("buyUrl")
    public String getBuyUrl() {
        return buyUrl;
    }

    @JsonProperty("buyUrl")
    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    @JsonProperty("soldQuantityMessage")
    public String getSoldQuantityMessage() {
        return soldQuantityMessage;
    }

    @JsonProperty("soldQuantityMessage")
    public void setSoldQuantityMessage(String soldQuantityMessage) {
        this.soldQuantityMessage = soldQuantityMessage;
    }

    @JsonProperty("isLimitedQuantity")
    public Boolean getIsLimitedQuantity() {
        return isLimitedQuantity;
    }

    @JsonProperty("isLimitedQuantity")
    public void setIsLimitedQuantity(Boolean isLimitedQuantity) {
        this.isLimitedQuantity = isLimitedQuantity;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("maximumPurchaseQuantity")
    public Integer getMaximumPurchaseQuantity() {
        return maximumPurchaseQuantity;
    }

    @JsonProperty("maximumPurchaseQuantity")
    public void setMaximumPurchaseQuantity(Integer maximumPurchaseQuantity) {
        this.maximumPurchaseQuantity = maximumPurchaseQuantity;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("isSoldOut")
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    @JsonProperty("isSoldOut")
    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @JsonProperty("remainingQuantity")
    public Integer getRemainingQuantity() {
        return remainingQuantity;
    }

    @JsonProperty("remainingQuantity")
    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    @JsonProperty("discountPercent")
    public Integer getDiscountPercent() {
        return discountPercent;
    }

    @JsonProperty("discountPercent")
    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    @JsonProperty("discount")
    public Discount getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @JsonProperty("minimumPurchaseQuantity")
    public Integer getMinimumPurchaseQuantity() {
        return minimumPurchaseQuantity;
    }

    @JsonProperty("minimumPurchaseQuantity")
    public void setMinimumPurchaseQuantity(Integer minimumPurchaseQuantity) {
        this.minimumPurchaseQuantity = minimumPurchaseQuantity;
    }

    @JsonProperty("redemptionLocations")
    public List<RedemptionLocation> getRedemptionLocations() {
        return redemptionLocations;
    }

    @JsonProperty("redemptionLocations")
    public void setRedemptionLocations(List<RedemptionLocation> redemptionLocations) {
        this.redemptionLocations = redemptionLocations;
    }

    @JsonProperty("soldQuantity")
    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    @JsonProperty("soldQuantity")
    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("endAt")
    public String getEndAt() {
        return endAt;
    }

    @JsonProperty("endAt")
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("customFields")
    public List<Object> getCustomFields() {
        return customFields;
    }

    @JsonProperty("customFields")
    public void setCustomFields(List<Object> customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("bookable")
    public Boolean getBookable() {
        return bookable;
    }

    @JsonProperty("bookable")
    public void setBookable(Boolean bookable) {
        this.bookable = bookable;
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
