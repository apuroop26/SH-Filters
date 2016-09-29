package se.bth.softhouse.db;

import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;
import se.bth.softhouse.entities.paths;

import java.util.List;

@RegisterMapperFactory(BeanMapperFactory.class)
public interface PathDao {
    @SqlUpdate("create table if not exists path2 (id int primary key auto_increment, path varchar(255))")
    void createpathsTable();

    @SqlQuery("select path from path2;")
    List<String> getBy();

    @SqlUpdate("insert into path2(path) values (:path);")
     void insertpaths(@Bind("path") String value);

}
