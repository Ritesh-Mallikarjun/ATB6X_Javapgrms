package ATB_6X_May.Enum;

enum Days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

enum Fruits{
    APPLE,MANGO,BANNANA,SAPOTA,ORANGE,PINEAPPLE,MOSAMBI,CUSTARD_APPLE;
}

enum HTTPStatusCode{
    OK(200,"OK"),
    CREATED(201,"CREATED"),
    ACCEPTED(202,"ACCEPTED"),
    NO_CONTENT(204,"NO CONTENT"),
    BAD_REQUEST(400,"BAD REQUEST"),
    UNAUTHORIZED(401,"UNAUTHORIZED"),
    FORBIDDEN(403,"FORBIDDEN"),
    PAGE_NOT_FOUND(404,"PAGE_NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500,"INTERNAL SERVER ERROR");

    private Integer code;
    private String statusName;

    HTTPStatusCode(Integer code, String statusName) {
        this.code = code;
        this.statusName = statusName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}

enum Size{
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL"),
    DOUBLE_EXTRA_LARGE("XXL"),
    TRIPLE_EXTRA_LARGE("XXXL");

    private String sizecode;

    Size(String sizecode) {
        this.sizecode = sizecode;
    }

    public String getSizecode() {
        return sizecode;
    }

    public void setSizecode(String sizecode) {
        this.sizecode = sizecode;
    }

}


enum pages{
    HOMEPAGE("https://www.amazon.com","homepage"),
    ABOUT_US_Page("https://www.amazon.com/about-us","About_Us_page"),
    CareersPage("https://www.amazon.com/careers","Careerspage");

    private String pageUrl;
    private String pageNames;

    pages(String pageUrl, String pageNames) {
        this.pageUrl = pageUrl;
        this.pageNames = pageNames;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageNames() {
        return pageNames;
    }

    public void setPageNames(String pageNames) {
        this.pageNames = pageNames;
    }

}