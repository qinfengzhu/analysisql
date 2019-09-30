package com.weibo.dip.analysisql.dsl.filter.relational.gt;

import com.weibo.dip.analysisql.dsl.filter.relational.RelationalFilter;

/** StringGtRelationalFilter. */
public class StringGtFilter extends GtFilter {
  private String value;

  public StringGtFilter() {}

  /**
   * Initializes a instance with name and string value.
   *
   * @param name name
   * @param value string value
   */
  public StringGtFilter(String name, String value) {
    super(name, RelationalFilter.STRING);

    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}