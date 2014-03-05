package ar.org.jgm;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestParam;

@Path("/")
public class ConsultaPersona {
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("persona/cuil/{cuil}")
	public Map<String, Object> getPersonaCuilJSON(@PathParam("cuil") String cuil){
		Map<String, Object> query = new HashMap<String, Object>();  
		query.put("cuil", cuil);
		return query; 
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("persona/dni/{cuil}")
	public Map<String, Object> getDemoPersonaJSON(@PathParam("cuil") String cuil){
		Map<String, Object> query = new HashMap<String, Object>();  
		query.put("cuil", cuil);    
		return query; 
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("personas")
	public String getPersonasJSON(){    
		return null; 
	}
}
