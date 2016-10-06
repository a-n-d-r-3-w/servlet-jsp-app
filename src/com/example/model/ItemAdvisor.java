package com.example.model;
import java.util.*;

public class ItemAdvisor {
  public List getRecommendations(String item) {
    List recommendations = new ArrayList();
    if (item.equals("1")) {
      recommendations.add("Item 1 - Recommendation 1");
      recommendations.add("Item 1 - Recommendation 2");
    } else {
      recommendations.add("Not item 1 - Recommendation 1");
      recommendations.add("Not item 1 - Recommendation 2");
    }
    return recommendations;
  }
}
