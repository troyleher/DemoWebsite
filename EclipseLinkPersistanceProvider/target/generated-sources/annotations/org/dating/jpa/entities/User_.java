package org.dating.jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.troy.global.persistance.entities.User.City;
import org.troy.global.persistance.entities.User.Gender;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-11-23T16:10:34")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Date> dob;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, String> seekDescription;
    public static volatile SingularAttribute<User, Gender> gender;
    public static volatile SingularAttribute<User, String> caption;
    public static volatile SingularAttribute<User, String> selfDescription;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, City> city;
    public static volatile SingularAttribute<User, Gender> seeks;

}