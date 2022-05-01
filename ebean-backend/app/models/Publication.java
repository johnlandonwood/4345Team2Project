package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Constraint;
import java.util.List;

@Entity
public class Publication extends Model {

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String media_type;

    @Constraints.Required
    public String date;

    @Constraints.Required
    public String link;


}
