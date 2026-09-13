package br.com.igorgc.oop.enumeration.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start-up");

    private int value;
    private String reportName;

    CustomerType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }

    public int getValue() {
        return value;
    }
}