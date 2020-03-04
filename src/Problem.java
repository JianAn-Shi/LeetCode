public class Problem {

    private String index;
    private String url;

    public Problem(String index, String url) {
        this.index = index;
        this.url = url;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "index=" + index +
                ", url='" + url + '\'' +
                '}';
    }
}
