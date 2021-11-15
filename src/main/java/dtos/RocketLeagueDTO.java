package dtos;

public class RocketLeagueDTO {
    private RLDataDTO data;


    public RocketLeagueDTO(RLDataDTO data) {
        this.data = data;
    }

    public RLDataDTO getData() {
        return data;
    }
}
