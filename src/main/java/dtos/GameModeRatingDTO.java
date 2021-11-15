package dtos;

public class GameModeRatingDTO {
    private int rank;
    private float percentile;
    private int value;


    public GameModeRatingDTO(int rank, float percentile, int value) {
        this.rank = rank;
        this.percentile = percentile;
        this.value = value;
    }
}
