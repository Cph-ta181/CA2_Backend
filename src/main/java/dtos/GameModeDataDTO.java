package dtos;

public class GameModeDataDTO {
    private MetaDataDTO metadata;
    private GameModeStatsDTO stats;



    public GameModeDataDTO(MetaDataDTO metadata) {
        this.metadata = metadata;
    }

    public MetaDataDTO getMetadata() {
        return metadata;
    }

    public GameModeStatsDTO getStats() {
        return stats;
    }
}
