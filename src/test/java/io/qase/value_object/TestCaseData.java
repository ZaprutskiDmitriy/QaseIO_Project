package io.qase.value_object;

import io.qase.page_object.TestcasePage;

import java.util.List;

public class TestCaseData {
    private String title;
    private TestcasePage.Status status;
    private String description;
    private TestcasePage.Severity severity;
    private List<StepData> stepDataList;

    public TestCaseData(String title, TestcasePage.Status status, String description, TestcasePage.Severity severity) {
        this.title = title;
        this.status = status;
        this.description = description;
        this.severity = severity;
    }

    public TestCaseData(String title, TestcasePage.Status status, String description, TestcasePage.Severity severity, List<StepData> stepDataList) {
        this.title = title;
        this.status = status;
        this.description = description;
        this.severity = severity;
        this.stepDataList = stepDataList;
    }

    public String getTitle() {
        return title;
    }

    public List<StepData> getStepDataList() {
        return stepDataList;
    }

    public void setStepDataList(List<StepData> stepDataList) {
        this.stepDataList = stepDataList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TestcasePage.Status getStatus() {
        return status;
    }

    public void setStatus(TestcasePage.Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TestcasePage.Severity getSeverity() {
        return severity;
    }

    public void setSeverity(TestcasePage.Severity severity) {
        this.severity = severity;
    }
}
