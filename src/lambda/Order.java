package lambda;

public class Order {

    private int id;
    private String context;

    public Order(int id, String context) {
        this.id = id;
        this.context = context;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
