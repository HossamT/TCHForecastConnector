package org.tch.fc.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public enum Service implements Serializable {
  WEB1("web1", "Web1 Epic Interface"), TCH("tch", "TCH Forecaster"), SWP("swp", "Software Partners"), STC("stc",
      "Scientific Technologies Corporation"), ICE("ice", "Immunization Calculation Engine"), BASE("base",
          "Generic representation of any service"), IIS("IIS HL7", "IIS HL7 Interface (NEVER use for production)"),
  			MDS("MDS v11", "MatchMerge Decision Support Service");

  private static final long serialVersionUID = 1L;

  private String serviceType = "";
  private String label = "";

  Service(String serviceType, String label) {
    this.serviceType = serviceType;

    this.label = label;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String roleStatus) {
    this.serviceType = roleStatus;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public static Service getService(String serviceType) {
    for (Service service : Service.values()) {
      if (service.getServiceType().equalsIgnoreCase(serviceType)) {
        return service;
      }
    }
    return null;
  }

  public static List<Service> valueList() {
    return Arrays.asList(values());
  }
}
