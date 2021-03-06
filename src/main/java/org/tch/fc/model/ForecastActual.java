package org.tch.fc.model;

import java.io.Serializable;


public class ForecastActual extends ForecastResult implements Serializable {
  private static final long serialVersionUID = 1L;

	private int forecastActualId = 0;
	private String scheduleName = "";
	private String vaccineCvx = "";
  private SoftwareResult softwareResult = null;
  private String explanationHtml = "";

  public String getExplanationHtml() {
    return explanationHtml;
  }

  public void setExplanationHtml(String explanationHtml) {
    this.explanationHtml = explanationHtml;
  }

  public SoftwareResult getSoftwareResult() {
    return softwareResult;
  }

  public void setSoftwareResult(SoftwareResult softwareResult) {
    this.softwareResult = softwareResult;
  }

  public String getVaccineCvx() {
    return vaccineCvx;
  }

  public void setVaccineCvx(String vaccineCvx) {
    this.vaccineCvx = vaccineCvx;
  }

  public int getForecastActualId() {
		return forecastActualId;
	}

	public void setForecastActualId(int forecastActualId) {
		this.forecastActualId = forecastActualId;
	}


	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String softwareVersion) {
		this.scheduleName = softwareVersion;
	}

}
