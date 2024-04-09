package br.com.alura.screenmatch.models;

public class Serie extends Title {
    private int seasons;
    private int episodesPerSeason;
    private boolean releasing;
    private int minPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isReleasing() {
        return releasing;
    }

    public void setReleasing(boolean releasing) {
        this.releasing = releasing;
    }

    public int getMinPerEpisode() {
        return minPerEpisode;
    }

    public void setMinPerEpisode(int minPerEpisode) {
        this.minPerEpisode = minPerEpisode;
    }

    @Override
    public int getDurationInMin() {
        return seasons * episodesPerSeason * minPerEpisode;
    }
}
