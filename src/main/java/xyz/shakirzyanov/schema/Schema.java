package xyz.shakirzyanov.schema;

import java.util.List;

public class Schema {
    private List<Field> fields;

    public Schema(List<Field> fields) {
        this.fields = fields;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
