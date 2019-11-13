public class Link {
    private long id;
    private long companyId;
    private long peopleId;

    public Link() {
    }

    public Link(long id, long companyId, long peopleId) {
        this.id = id;
        this.companyId = companyId;
        this.peopleId = peopleId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public long getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(long peopleId) {
        this.peopleId = peopleId;
    }
}
