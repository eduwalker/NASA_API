import java.util.Date;
import java.util.List;

public class ModelJsonNasaTemp {
    private final String key = "EOWOopVuRmncyNFqDTfjpsnpQ9MCKkvvPg2s9ApU";
    private String jsonUrl;

    private String catalog;
    private String activityID;
    private String location;
    private Date eventTime;
    private String link;
    private List<Instrument> instruments;

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    private String displayName;


    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String jsonUrlKey (String jsonUrl){
        this.jsonUrl = jsonUrl;
        return jsonUrl+key;
    }
}
