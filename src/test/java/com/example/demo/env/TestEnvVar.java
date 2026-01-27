package com.example.demo.env;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class TestEnvVar extends FacadeIT {
  @Value("${vola.api.url}")
  private String volaApiUrl;

  private String getVolaApiUrl = System.getenv("VOLA_API_URL");

  @Value("${api.key}")
  private String apiKey;

  @Test
  void test_value() {
    var value = "azertyuiop/123456789";
    assertEquals(value, volaApiUrl);
  }

  @Test
  void test_get_env() {
    var value = "azertyuiop/123456789";
    assertEquals(value, getVolaApiUrl);
  }

  @Test
  void test_api_key() {
    var value = "api/key/test-value";
    assertEquals(value, apiKey);
  }
}
