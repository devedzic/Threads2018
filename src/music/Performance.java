/*
 * Created on May 9, 2018
 *
 */
package music;

public class Performance {
    
    private String lyrics;
    private int delay;
    
    public Performance(String lyrics, int delay) {
        super();
        this.lyrics = lyrics;
        this.delay = delay;
    }
    
    public Performance() {
    }
    
    public String getLyrics() {
        return lyrics;
    }
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
    public int getDelay() {
        return delay;
    }
    public void setDelay(int delay) {
        this.delay = delay;
    }

}

