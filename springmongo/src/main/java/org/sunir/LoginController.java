package org.sunir;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private MongoDAO mongoDAO;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initLogin(HttpServletRequest request, HttpServletResponse response){
		List<Song> findAllSongs = mongoDAO.findAllSongs();
		return "login";
		
	}
	

}
