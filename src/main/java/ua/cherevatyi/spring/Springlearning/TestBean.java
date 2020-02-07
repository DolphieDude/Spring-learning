package ua.cherevatyi.spring.Springlearning;

public class TestBean {
    private String id;

    public TestBean(String id) {
        this.id = id;
    }

    String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
