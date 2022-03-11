package com.sda.task.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoFunctional {
    public static void main(String[] args) {
        Video video = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com", VideoType.EPISODE);

        Episode episode = new Episode("got1",1, Arrays.asList(video,video1));
        Episode episode1 = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS2", 2, Arrays.asList(episode2));

        List<Season> seasons =Arrays.asList(season,season1);
        List<Episode> resultEpisodes = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .collect(Collectors.toList());

        List<Video> resultVideos = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());
        System.out.println(resultVideos);

        List<String> seasonsNameList = seasons.stream()
                .map(s -> s.seasonName)
                .collect(Collectors.toList());
        System.out.println(seasonsNameList);

        List<Integer> seasonNumberList = seasons.stream()
                .map(s -> s.seasonNumber)
                .collect(Collectors.toList());
        System.out.println(seasonNumberList);

        List<String> episodesNameList = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeName)
                .collect(Collectors.toList());
        System.out.println(episodesNameList);

        List<Integer> episodesNumberList = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeNumber)
                .collect(Collectors.toList());
        System.out.println(episodesNumberList);

        List<String> videosNameList = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title)
                .collect(Collectors.toList());
        System.out.println(videosNameList);

        List<String> videosUrlList = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.url)
                .collect(Collectors.toList());
        System.out.println(videosUrlList);

        List<List<Episode>> episodesList = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .map(s -> s.episodes)
                .collect(Collectors.toList());
        System.out.println(episodesList);

        List<List<Video>> videoList = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.videos)
                .collect(Collectors.toList());
        System.out.println(videoList);

        List<List<Video>> videosFromEvenEpisodesAndSeasons = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .map(e -> e.videos)
                .collect(Collectors.toList());
        System.out.println(videosFromEvenEpisodesAndSeasons);

        List<Video> clipsFromEvenEpisodesAndOddSeasons = seasons.stream()
                .filter(s -> s.seasonNumber % 2 != 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.CLIP)
                .collect(Collectors.toList());
        System.out.println(clipsFromEvenEpisodesAndOddSeasons);

        List<Video> previewsFromOddEpisodesAndEvenSeasons = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 != 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.PREVIEW)
                .collect(Collectors.toList());
        System.out.println(previewsFromOddEpisodesAndEvenSeasons);


    }
}
