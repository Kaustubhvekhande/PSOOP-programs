class Production {
    private String title, director, writer;
    static int performances;

    Production(String t, String d, String w) {
        this.title = t;
        this.director = d;
        this.writer = w;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }
}

class Play extends Production {
    
    private int playTickets;

    public Play(String t, String d, String w) {
        super(t, d, w);
        performances++;
    }

    public int getPerformance() {
        return performances;
    }

    public int getPlayTickets() {
        return playTickets;
    }

    public void setPlayTickets(int playTickets) {
        this.playTickets = playTickets;
    }

    public int getCollection() {
        return playTickets * 500;
    }

    @Override
    public String toString() {
        return "Title: " + super.getTitle()
        + "\nDirector: " + super.getDirector() 
        + "\nWriter: " + super.getWriter();
    }

}

class Musical extends Play {
    private String Composer;
    private String lyricist;
    private int musicalTicket;

    public Musical(String t, String d, String w, String c, String l) {
        super(t, d, w);
        Composer = c;
        lyricist = l;
    }

    public void setComposer(String Composer) {
        this.Composer = Composer;
    }

    public String getComposer() {
        return Composer;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getLyricist() {
        return lyricist;
    }

    public int getMusicalTicket() {
        return musicalTicket;
    }

    public void setMusicalTicket(int musicalTicket) {
        this.musicalTicket = musicalTicket;
    }

    @Override
    public int getCollection() {
        return musicalTicket * 800;
    }

    @Override
    public String toString() {
        return "Title: " + super.getTitle() 
        + "\nDirector: " + super.getDirector() 
        + "\nWriter: "+ super.getWriter() 
        + "\nMusic Composer: " + getComposer() 
        + "\nLyricist: " + getLyricist();
    }
}