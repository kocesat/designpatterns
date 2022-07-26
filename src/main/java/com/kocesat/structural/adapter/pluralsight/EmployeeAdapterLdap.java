package com.kocesat.structural.adapter.pluralsight;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLDAP instance;

    public EmployeeAdapterLdap(EmployeeLDAP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + instance.getCn();
    }
}
