package rest;

import com.google.gson.Gson;
import dtos.GameModeDataDTO;
import dtos.GameModeRatingDTO;
import dtos.RocketLeagueDTO;
import utils.HttpUtils;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Path("rl")
public class RLResource {
    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;

    Gson gson = new Gson();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@RolesAllowed({"user", "admin"})
    public String getRL() throws IOException, ExecutionException, InterruptedException {
       RocketLeagueDTO result = gson.fromJson(HttpUtils.fetchData("https://api.tracker.gg/api/v2/rocket-league/standard/profile/steam/Tomsten"), RocketLeagueDTO.class);
        System.out.println(result);
        /*for(GameModeDataDTO GM : result.getData().getSegments()){
            if (GM.getMetadata().getName().equals("Lifetime")){
                result.getData().getSegments().remove(GM);
            }
        }*/
        result.getData().getSegments().remove(0);
       return gson.toJson(result);
    }



}
