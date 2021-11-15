package dtos;

import java.util.ArrayList;

public class RLDataDTO {
    private ArrayList<GameModeDataDTO> segments;


    public RLDataDTO(ArrayList<GameModeDataDTO> segments) {
        this.segments = segments;
    }

    public ArrayList<GameModeDataDTO> getSegments() {
        return segments;
    }
}
