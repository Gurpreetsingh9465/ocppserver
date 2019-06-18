package ocpp.essential;

public class KeyVal {
    String key; //length<50. Required.
    boolean readonly; //Required. False if the value can be set with the ChangeConfiguration message.
    String value; //length<500. Optional. If key is known but not set, this field may be absent.

    public KeyVal(){
        key= "";
        readonly = false;
        value = "";
    }

    /*parameterized constructor*/
    public KeyVal(String key, boolean readonly, String value) {
        this.key = key;
        this.readonly = readonly;
        this.value = value;
    }

    /*getter and setter*/
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isReadonly() {
        return readonly;
    }

    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
