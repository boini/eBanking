package com.ebanking.ws.model.address;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COUNTRY_ID")
    private long countryId;

    @Column(name = "COUNTRY_NAME", nullable = false)
    private String countryName;

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (countryId != country.countryId) return false;
        if (!countryName.equals(country.countryName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (countryId ^ (countryId >>> 32));
        result = 31 * result + countryName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
