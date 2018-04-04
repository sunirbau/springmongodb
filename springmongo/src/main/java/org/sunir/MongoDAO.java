package org.sunir;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository("mongoDAO")
public class MongoDAO {
	
	@Autowired(required = true)
	private MongoTemplate mongoTemplate;
	
	
	public List<Song> findAllSongs(){
		return mongoTemplate.findAll(Song.class);
	}
	
	public List<User> findAllUsers(){
		return mongoTemplate.findAll(User.class);
	}
	
	

}
