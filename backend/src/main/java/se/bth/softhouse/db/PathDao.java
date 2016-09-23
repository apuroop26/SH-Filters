package se.bth.softhouse.db;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;
import se.bth.softhouse.entities.paths;
import java.util.List;

@RegisterMapperFactory(BeanMapperFactory.class)
public interface PathDao {
    @SqlUpdate("create table if not exists path (id int primary key auto_increment, path varchar(255))")
    public void createpathsTable();
    @SqlQuery("select * from path;")
    public List<paths> getBy();

    @SqlUpdate("insert into path (path) values (:path);")
    public void insertpaths(@BindBean paths paths);



}
