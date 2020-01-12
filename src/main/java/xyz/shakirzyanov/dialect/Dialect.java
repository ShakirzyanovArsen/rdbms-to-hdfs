package xyz.shakirzyanov.dialect;

import xyz.shakirzyanov.schema.Schema;

public interface Dialect {
    Schema inferSchema(String table);
}
