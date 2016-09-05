package se.bth.softhouse.db;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;
import se.bth.softhouse.entities.Audio;

import java.util.List;

@RegisterMapperFactory(BeanMapperFactory.class)
public interface AudioDAO {

	@SqlUpdate("create table  if not exists audio (id int default not null auto_increment primary key, name varchar(100));")
	public void createAudioTable();

	@SqlQuery("SELECT * FROM audio;")
	public List<Audio> getAll();

	@SqlUpdate("INSERT INTO audio (name) VALUES (:name);")
	public void createAudio(@Bind("name") String name);

	@SqlQuery("SELECT * FROM audio WHERE id = :id;")
	public Audio getBy(@Bind("id") int id);

}
