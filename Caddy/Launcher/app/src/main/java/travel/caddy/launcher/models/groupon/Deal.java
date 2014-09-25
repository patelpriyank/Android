
package travel.caddy.launcher.models.groupon;

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
    "textAd",
    "tags",
    "says",
    "shortAnnouncementTitle",
    "grouponRating",
    "locationNote",
    "salesforceLink",
    "mediumImageUrl",
    "type",
    "isTravelBookableDeal",
    "finePrint",
    "merchant",
    "dealTypes",
    "areas",
    "largeImageUrl",
    "isOptionListComplete",
    "soldQuantityMessage",
    "dealUrl",
    "pitchHtml",
    "division",
    "displayOptions",
    "channels",
    "tippingPoint",
    "isTipped",
    "id",
    "startAt",
    "isSoldOut",
    "isGliveInventoryDeal",
    "isNowDeal",
    "placementPriority",
    "isAutoRefundEnabled",
    "placeholderUrl",
    "soldQuantity",
    "vip",
    "smallImageUrl",
    "highlightsHtml",
    "fulfillmentMethod",
    "announcementTitle",
    "endAt",
    "status",
    "isMerchandisingDeal",
    "isInviteOnly",
    "limitedQuantityRemaining",
    "grid4ImageUrl",
    "recommendation",
    "sidebarImageUrl",
    "shippingAddressRequired",
    "tippedAt",
    "redemptionLocation",
    "uuid",
    "grid6ImageUrl",
    "title",
    "allowedInCart",
    "options",
    "accessType"
})
public class Deal {

    @JsonProperty("textAd")
    private TextAd textAd;
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("says")
    private Says says;
    @JsonProperty("shortAnnouncementTitle")
    private String shortAnnouncementTitle;
    @JsonProperty("grouponRating")
    private Object grouponRating;
    @JsonProperty("locationNote")
    private String locationNote;
    @JsonProperty("salesforceLink")
    private String salesforceLink;
    @JsonProperty("mediumImageUrl")
    private String mediumImageUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("isTravelBookableDeal")
    private Boolean isTravelBookableDeal;
    @JsonProperty("finePrint")
    private String finePrint;
    @JsonProperty("merchant")
    private Merchant merchant;
    @JsonProperty("dealTypes")
    private List<DealType> dealTypes = new ArrayList<DealType>();
    @JsonProperty("areas")
    private List<Object> areas = new ArrayList<Object>();
    @JsonProperty("largeImageUrl")
    private String largeImageUrl;
    @JsonProperty("isOptionListComplete")
    private Boolean isOptionListComplete;
    @JsonProperty("soldQuantityMessage")
    private String soldQuantityMessage;
    @JsonProperty("dealUrl")
    private String dealUrl;
    @JsonProperty("pitchHtml")
    private String pitchHtml;
    @JsonProperty("division")
    private Division division;
    @JsonProperty("displayOptions")
    private List<DisplayOption> displayOptions = new ArrayList<DisplayOption>();
    @JsonProperty("channels")
    private List<Object> channels = new ArrayList<Object>();
    @JsonProperty("tippingPoint")
    private Integer tippingPoint;
    @JsonProperty("isTipped")
    private Boolean isTipped;
    @JsonProperty("id")
    private String id;
    @JsonProperty("startAt")
    private String startAt;
    @JsonProperty("isSoldOut")
    private Boolean isSoldOut;
    @JsonProperty("isGliveInventoryDeal")
    private Boolean isGliveInventoryDeal;
    @JsonProperty("isNowDeal")
    private Boolean isNowDeal;
    @JsonProperty("placementPriority")
    private String placementPriority;
    @JsonProperty("isAutoRefundEnabled")
    private Boolean isAutoRefundEnabled;
    @JsonProperty("placeholderUrl")
    private String placeholderUrl;
    @JsonProperty("soldQuantity")
    private Integer soldQuantity;
    @JsonProperty("vip")
    private String vip;
    @JsonProperty("smallImageUrl")
    private String smallImageUrl;
    @JsonProperty("highlightsHtml")
    private String highlightsHtml;
    @JsonProperty("fulfillmentMethod")
    private Object fulfillmentMethod;
    @JsonProperty("announcementTitle")
    private String announcementTitle;
    @JsonProperty("endAt")
    private String endAt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("isMerchandisingDeal")
    private Boolean isMerchandisingDeal;
    @JsonProperty("isInviteOnly")
    private Boolean isInviteOnly;
    @JsonProperty("limitedQuantityRemaining")
    private Object limitedQuantityRemaining;
    @JsonProperty("grid4ImageUrl")
    private String grid4ImageUrl;
    @JsonProperty("recommendation")
    private Recommendation recommendation;
    @JsonProperty("sidebarImageUrl")
    private String sidebarImageUrl;
    @JsonProperty("shippingAddressRequired")
    private Boolean shippingAddressRequired;
    @JsonProperty("tippedAt")
    private String tippedAt;
    @JsonProperty("redemptionLocation")
    private String redemptionLocation;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("grid6ImageUrl")
    private String grid6ImageUrl;
    @JsonProperty("title")
    private String title;
    @JsonProperty("allowedInCart")
    private Boolean allowedInCart;
    @JsonProperty("options")
    private List<Option> options = new ArrayList<Option>();
    @JsonProperty("accessType")
    private String accessType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textAd")
    public TextAd getTextAd() {
        return textAd;
    }

    @JsonProperty("textAd")
    public void setTextAd(TextAd textAd) {
        this.textAd = textAd;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("says")
    public Says getSays() {
        return says;
    }

    @JsonProperty("says")
    public void setSays(Says says) {
        this.says = says;
    }

    @JsonProperty("shortAnnouncementTitle")
    public String getShortAnnouncementTitle() {
        return shortAnnouncementTitle;
    }

    @JsonProperty("shortAnnouncementTitle")
    public void setShortAnnouncementTitle(String shortAnnouncementTitle) {
        this.shortAnnouncementTitle = shortAnnouncementTitle;
    }

    @JsonProperty("grouponRating")
    public Object getGrouponRating() {
        return grouponRating;
    }

    @JsonProperty("grouponRating")
    public void setGrouponRating(Object grouponRating) {
        this.grouponRating = grouponRating;
    }

    @JsonProperty("locationNote")
    public String getLocationNote() {
        return locationNote;
    }

    @JsonProperty("locationNote")
    public void setLocationNote(String locationNote) {
        this.locationNote = locationNote;
    }

    @JsonProperty("salesforceLink")
    public String getSalesforceLink() {
        return salesforceLink;
    }

    @JsonProperty("salesforceLink")
    public void setSalesforceLink(String salesforceLink) {
        this.salesforceLink = salesforceLink;
    }

    @JsonProperty("mediumImageUrl")
    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    @JsonProperty("mediumImageUrl")
    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("isTravelBookableDeal")
    public Boolean getIsTravelBookableDeal() {
        return isTravelBookableDeal;
    }

    @JsonProperty("isTravelBookableDeal")
    public void setIsTravelBookableDeal(Boolean isTravelBookableDeal) {
        this.isTravelBookableDeal = isTravelBookableDeal;
    }

    @JsonProperty("finePrint")
    public String getFinePrint() {
        return finePrint;
    }

    @JsonProperty("finePrint")
    public void setFinePrint(String finePrint) {
        this.finePrint = finePrint;
    }

    @JsonProperty("merchant")
    public Merchant getMerchant() {
        return merchant;
    }

    @JsonProperty("merchant")
    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    @JsonProperty("dealTypes")
    public List<DealType> getDealTypes() {
        return dealTypes;
    }

    @JsonProperty("dealTypes")
    public void setDealTypes(List<DealType> dealTypes) {
        this.dealTypes = dealTypes;
    }

    @JsonProperty("areas")
    public List<Object> getAreas() {
        return areas;
    }

    @JsonProperty("areas")
    public void setAreas(List<Object> areas) {
        this.areas = areas;
    }

    @JsonProperty("largeImageUrl")
    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    @JsonProperty("largeImageUrl")
    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    @JsonProperty("isOptionListComplete")
    public Boolean getIsOptionListComplete() {
        return isOptionListComplete;
    }

    @JsonProperty("isOptionListComplete")
    public void setIsOptionListComplete(Boolean isOptionListComplete) {
        this.isOptionListComplete = isOptionListComplete;
    }

    @JsonProperty("soldQuantityMessage")
    public String getSoldQuantityMessage() {
        return soldQuantityMessage;
    }

    @JsonProperty("soldQuantityMessage")
    public void setSoldQuantityMessage(String soldQuantityMessage) {
        this.soldQuantityMessage = soldQuantityMessage;
    }

    @JsonProperty("dealUrl")
    public String getDealUrl() {
        return dealUrl;
    }

    @JsonProperty("dealUrl")
    public void setDealUrl(String dealUrl) {
        this.dealUrl = dealUrl;
    }

    @JsonProperty("pitchHtml")
    public String getPitchHtml() {
        return pitchHtml;
    }

    @JsonProperty("pitchHtml")
    public void setPitchHtml(String pitchHtml) {
        this.pitchHtml = pitchHtml;
    }

    @JsonProperty("division")
    public Division getDivision() {
        return division;
    }

    @JsonProperty("division")
    public void setDivision(Division division) {
        this.division = division;
    }

    @JsonProperty("displayOptions")
    public List<DisplayOption> getDisplayOptions() {
        return displayOptions;
    }

    @JsonProperty("displayOptions")
    public void setDisplayOptions(List<DisplayOption> displayOptions) {
        this.displayOptions = displayOptions;
    }

    @JsonProperty("channels")
    public List<Object> getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(List<Object> channels) {
        this.channels = channels;
    }

    @JsonProperty("tippingPoint")
    public Integer getTippingPoint() {
        return tippingPoint;
    }

    @JsonProperty("tippingPoint")
    public void setTippingPoint(Integer tippingPoint) {
        this.tippingPoint = tippingPoint;
    }

    @JsonProperty("isTipped")
    public Boolean getIsTipped() {
        return isTipped;
    }

    @JsonProperty("isTipped")
    public void setIsTipped(Boolean isTipped) {
        this.isTipped = isTipped;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("startAt")
    public String getStartAt() {
        return startAt;
    }

    @JsonProperty("startAt")
    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    @JsonProperty("isSoldOut")
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    @JsonProperty("isSoldOut")
    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @JsonProperty("isGliveInventoryDeal")
    public Boolean getIsGliveInventoryDeal() {
        return isGliveInventoryDeal;
    }

    @JsonProperty("isGliveInventoryDeal")
    public void setIsGliveInventoryDeal(Boolean isGliveInventoryDeal) {
        this.isGliveInventoryDeal = isGliveInventoryDeal;
    }

    @JsonProperty("isNowDeal")
    public Boolean getIsNowDeal() {
        return isNowDeal;
    }

    @JsonProperty("isNowDeal")
    public void setIsNowDeal(Boolean isNowDeal) {
        this.isNowDeal = isNowDeal;
    }

    @JsonProperty("placementPriority")
    public String getPlacementPriority() {
        return placementPriority;
    }

    @JsonProperty("placementPriority")
    public void setPlacementPriority(String placementPriority) {
        this.placementPriority = placementPriority;
    }

    @JsonProperty("isAutoRefundEnabled")
    public Boolean getIsAutoRefundEnabled() {
        return isAutoRefundEnabled;
    }

    @JsonProperty("isAutoRefundEnabled")
    public void setIsAutoRefundEnabled(Boolean isAutoRefundEnabled) {
        this.isAutoRefundEnabled = isAutoRefundEnabled;
    }

    @JsonProperty("placeholderUrl")
    public String getPlaceholderUrl() {
        return placeholderUrl;
    }

    @JsonProperty("placeholderUrl")
    public void setPlaceholderUrl(String placeholderUrl) {
        this.placeholderUrl = placeholderUrl;
    }

    @JsonProperty("soldQuantity")
    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    @JsonProperty("soldQuantity")
    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    @JsonProperty("vip")
    public String getVip() {
        return vip;
    }

    @JsonProperty("vip")
    public void setVip(String vip) {
        this.vip = vip;
    }

    @JsonProperty("smallImageUrl")
    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    @JsonProperty("smallImageUrl")
    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    @JsonProperty("highlightsHtml")
    public String getHighlightsHtml() {
        return highlightsHtml;
    }

    @JsonProperty("highlightsHtml")
    public void setHighlightsHtml(String highlightsHtml) {
        this.highlightsHtml = highlightsHtml;
    }

    @JsonProperty("fulfillmentMethod")
    public Object getFulfillmentMethod() {
        return fulfillmentMethod;
    }

    @JsonProperty("fulfillmentMethod")
    public void setFulfillmentMethod(Object fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
    }

    @JsonProperty("announcementTitle")
    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    @JsonProperty("announcementTitle")
    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
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

    @JsonProperty("isMerchandisingDeal")
    public Boolean getIsMerchandisingDeal() {
        return isMerchandisingDeal;
    }

    @JsonProperty("isMerchandisingDeal")
    public void setIsMerchandisingDeal(Boolean isMerchandisingDeal) {
        this.isMerchandisingDeal = isMerchandisingDeal;
    }

    @JsonProperty("isInviteOnly")
    public Boolean getIsInviteOnly() {
        return isInviteOnly;
    }

    @JsonProperty("isInviteOnly")
    public void setIsInviteOnly(Boolean isInviteOnly) {
        this.isInviteOnly = isInviteOnly;
    }

    @JsonProperty("limitedQuantityRemaining")
    public Object getLimitedQuantityRemaining() {
        return limitedQuantityRemaining;
    }

    @JsonProperty("limitedQuantityRemaining")
    public void setLimitedQuantityRemaining(Object limitedQuantityRemaining) {
        this.limitedQuantityRemaining = limitedQuantityRemaining;
    }

    @JsonProperty("grid4ImageUrl")
    public String getGrid4ImageUrl() {
        return grid4ImageUrl;
    }

    @JsonProperty("grid4ImageUrl")
    public void setGrid4ImageUrl(String grid4ImageUrl) {
        this.grid4ImageUrl = grid4ImageUrl;
    }

    @JsonProperty("recommendation")
    public Recommendation getRecommendation() {
        return recommendation;
    }

    @JsonProperty("recommendation")
    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    @JsonProperty("sidebarImageUrl")
    public String getSidebarImageUrl() {
        return sidebarImageUrl;
    }

    @JsonProperty("sidebarImageUrl")
    public void setSidebarImageUrl(String sidebarImageUrl) {
        this.sidebarImageUrl = sidebarImageUrl;
    }

    @JsonProperty("shippingAddressRequired")
    public Boolean getShippingAddressRequired() {
        return shippingAddressRequired;
    }

    @JsonProperty("shippingAddressRequired")
    public void setShippingAddressRequired(Boolean shippingAddressRequired) {
        this.shippingAddressRequired = shippingAddressRequired;
    }

    @JsonProperty("tippedAt")
    public String getTippedAt() {
        return tippedAt;
    }

    @JsonProperty("tippedAt")
    public void setTippedAt(String tippedAt) {
        this.tippedAt = tippedAt;
    }

    @JsonProperty("redemptionLocation")
    public String getRedemptionLocation() {
        return redemptionLocation;
    }

    @JsonProperty("redemptionLocation")
    public void setRedemptionLocation(String redemptionLocation) {
        this.redemptionLocation = redemptionLocation;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("grid6ImageUrl")
    public String getGrid6ImageUrl() {
        return grid6ImageUrl;
    }

    @JsonProperty("grid6ImageUrl")
    public void setGrid6ImageUrl(String grid6ImageUrl) {
        this.grid6ImageUrl = grid6ImageUrl;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("allowedInCart")
    public Boolean getAllowedInCart() {
        return allowedInCart;
    }

    @JsonProperty("allowedInCart")
    public void setAllowedInCart(Boolean allowedInCart) {
        this.allowedInCart = allowedInCart;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("accessType")
    public String getAccessType() {
        return accessType;
    }

    @JsonProperty("accessType")
    public void setAccessType(String accessType) {
        this.accessType = accessType;
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
