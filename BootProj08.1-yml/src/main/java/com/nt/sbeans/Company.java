package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Component("comp")
@Setter
@Getter
@ToString
@ConfigurationProperties(prefix = "org.nit")
@PropertySource("application.yml")
public class Company {
    private int id;
    private String name;
    private String addrs;
    private long pincode;
    private long contact;
    private long phone; // Ensure this matches the YAML structure
    private int size;
    private List<String> branches;
    private List<String> favColors;
    private List<String> nickNames;
    private List<String> owners;
    private List<Long> phones;
    private LicenseDetails licenseDetails; // Ensure you have a nested class for license details
    private CompanyDetails company; // Ensure you have a nested class for company details

    // Add nested classes for LicenseDetails and CompanyDetails
    @Setter
    @Getter
    public static class LicenseDetails {
        private long lid;
        private String type;
        private String issuedBy;
    }

    @Setter
    @Getter
    public static class CompanyDetails {
        private int id;
        private String name;
        private String addrs;
        private int size;
    }
}
