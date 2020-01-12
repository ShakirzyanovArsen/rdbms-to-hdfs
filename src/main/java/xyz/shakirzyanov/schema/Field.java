package xyz.shakirzyanov.schema;

import java.util.Objects;

public class Field {
    private Type type;
    private String name;

    public Field(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return type == field.type &&
                Objects.equals(name, field.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }
}
