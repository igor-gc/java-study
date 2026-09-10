package br.com.igorgc.oop.initializationblock.domain;

public class Series {
    private String name;
    private int[] episodes;
    {
        System.out.println("Inside initialization block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    public Series(String name) {
        this.name = name;
    }

    public Series() {

        for(int episode: this.episodes){
            System.out.println(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
