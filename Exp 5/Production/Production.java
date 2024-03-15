class Production{
    private String title, director, writer;

    Production(String t, String d, String w){
        this.title = t;
        this.director = d;
        this.writer = w;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    public void setWriter(String writer){
        this.writer = writer;
    }

    public String getWriter(){
        return writer;
    }
}

class Play extends  Production {
    private static int performence;

    public void setPerformance(int performence){
        super

    }

    public int getPerformance(){
        return performence;
    }
}

class Musical extends Play{
    private String Composer;
    private String lyricist;

    public void setComposer(String Composer){
        this.Composer = Composer;
    }

    public String getComposer(){
        return Composer;
    }

    public void setLyricist(String lyricist){
        this.lyricist = lyricist;
    }

    public String getLyricist(){
        return lyricist;
    }
}