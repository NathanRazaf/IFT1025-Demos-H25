package Demo8.Maps;
public class EntryInt {
    private final int key;
    private String value;

    public EntryInt(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public java.lang.Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void raiseValue() {
        this.value = this.value.toUpperCase();
    }

    public String toString() {
        return "(" + key + "=" + value + ")";
    }
}
