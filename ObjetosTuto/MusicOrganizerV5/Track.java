package MusicOrganizerV5;
/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    //A count for specific Track reproductions
    //private static int playCount = 0;
    //A String that references the track's Album
    private String album;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename, String album)
    {
        setDetails(artist, title, filename, album);
    }
    
    @Override
    public String toString() {
        return "Track [album=" + album + ", artist=" + artist + ", filename=" + filename + ", title=" + title + "]";
    }

    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename , "uknown");
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename, String album)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.album = album;
    }
    public void resetCount() {
        //playCount = 0;
    }
    public void incCount() {
        //playCount++;
    }
    
}

