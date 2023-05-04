package ru.shanin.domain.entity;

import ru.shanin.domain.entity.helpers.ConverterToString;

public class WorkerInfo {
    private final String firstName;
    private final String secondName;
    private final String lastName;
    private final String phone;
    private final String email;

    public WorkerInfo(
            String lastName,
            String firstName,
            String secondName,
            String phone,
            String email
    ) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return ConverterToString.makeJsonString(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != getClass()) return false;
        WorkerInfo peopleInfo = (WorkerInfo) object;
        return this.lastName.equals(peopleInfo.getLastName())
                && this.firstName.equals(peopleInfo.getFirstName())
                && this.secondName.equals(peopleInfo.getSecondName())
                && this.email.equals(peopleInfo.getEmail())
                && this.phone.equals(peopleInfo.getPhone());
    }
}
