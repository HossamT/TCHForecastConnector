package org.tch.fc.model;

import java.util.Date;

public abstract class ForecastResult
{

  protected TestCase testCase = null;
  protected VaccineGroup vaccineGroup = null;
  protected String doseNumber = null;
  protected Date validDate = null;
  protected Date dueDate = null;
  protected Date overdueDate = null;
  protected Date finishedDate = null;
  transient protected String validDateString = null;
  transient protected String dueDateString = null;
  transient protected String overdueDateString = null;
  transient protected String finishedDateString = null;
  protected String vaccineCvx = "";
  private Admin admin = null;
  private String forecastReason = "";

  public String getValidDateString() {
    return validDateString;
  }

  public void setValidDateString(String validDateString) {
    this.validDateString = validDateString;
  }

  public String getDueDateString() {
    return dueDateString;
  }

  public void setDueDateString(String dueDateString) {
    this.dueDateString = dueDateString;
  }

  public String getOverdueDateString() {
    return overdueDateString;
  }

  public void setOverdueDateString(String overdueDateString) {
    this.overdueDateString = overdueDateString;
  }

  public String getFinishedDateString() {
    return finishedDateString;
  }

  public void setFinishedDateString(String finishedDateString) {
    this.finishedDateString = finishedDateString;
  }

  public String getForecastReason() {
    return forecastReason;
  }

  public void setForecastReason(String forecastReason) {
    this.forecastReason = forecastReason;
  }

  public Admin getAdmin() {
    return admin;
  }

  public void setAdmin(Admin admin) {
    this.admin = admin;
  }

  public String getVaccineCvx() {
    return vaccineCvx;
  }

  public void setVaccineCvx(String vaccineCvx) {
    this.vaccineCvx = vaccineCvx;
  }

  public Date getFinishedDate() {
    return finishedDate;
  }

  public void setFinishedDate(Date finishedDate) {
    this.finishedDate = finishedDate;
  }

  public TestCase getTestCase() {
    return testCase;
  }

  public void setTestCase(TestCase testCase) {
    this.testCase = testCase;
  }

  public VaccineGroup getVaccineGroup() {
    return vaccineGroup;
  }

  public void setVaccineGroup(VaccineGroup forecastItem) {
    this.vaccineGroup = forecastItem;
  }

  public String getDoseNumber() {
    return doseNumber;
  }

  public void setDoseNumber(String doseNumber) {
    this.doseNumber = doseNumber;
  }

  public Date getValidDate() {
    return validDate;
  }

  public void setValidDate(Date validDate) {
    this.validDate = validDate;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public Date getOverdueDate() {
    return overdueDate;
  }

  public void setOverdueDate(Date overdueDate) {
    this.overdueDate = overdueDate;
  }

  public String getAdminStatus() {
    return admin == null ? "" : admin.getAdminStatus();
  }

  public void setAdminStatus(String adminStatus) {
    admin = Admin.getAdmin(adminStatus);
  }

}
