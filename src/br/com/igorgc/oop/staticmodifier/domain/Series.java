package br.com.igorgc.oop.staticmodifier.domain;

public class Series {
    private String name;
    private static int[] episodes;
    static {
        System.out.println("Inside static initialization block 1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    static {
        System.out.println("Inside static initialization block 2 ");

    }

    static {
        System.out.println("Inside static initialization block 3 ");

    }

    {
        System.out.println("Inside non-static initialization block 3 ");
    }

    public Series(String name) {
        this.name = name;
    }

    public Series() {

        for(int episode: Series.episodes){
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

}
