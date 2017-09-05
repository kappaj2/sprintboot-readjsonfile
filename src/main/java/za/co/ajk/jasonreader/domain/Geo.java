package za.co.ajk.jasonreader.domain;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Embeddable
@AllArgsConstructor
public class Geo {
    
    private String lat;
    private String lng;
    
    public Geo() {
    }
}
