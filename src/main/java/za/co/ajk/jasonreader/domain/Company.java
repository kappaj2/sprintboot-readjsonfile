package za.co.ajk.jasonreader.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Embeddable
public class Company {

@Column(name = "company_name")
    private String name;
    private String catchPhrase;
    private String bs;
    
    public Company() {
    }
}
