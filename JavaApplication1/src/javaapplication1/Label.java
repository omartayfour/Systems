package javaapplication1;

public class Label {
    String name;
    String value;
    String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setaddress(String address) {
        this.address = address;
    }
    public Label(String name, String value, String address) {
        this.name = name;
        this.value=value;
        this.address=address;
    }
}
