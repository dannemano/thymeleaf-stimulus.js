package se.dbot.thymeleafplay.code;

import java.util.List;

public class MyModel {
    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyModel{" +
                "data=" + data +
                '}';
    }
}
