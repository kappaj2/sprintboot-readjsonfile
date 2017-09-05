package za.co.ajk.mongoatlas.domains;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by andrekapp on 2017/07/12.
 */
@Document(collection="domain")
@Getter
@Setter
public class Domain {
    
    @Id
    private long id;
    
    @Indexed(unique = true)
    private String domain;
    
    private boolean displayAdds;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdDate;
    
}





