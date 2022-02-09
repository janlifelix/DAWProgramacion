package MusicOrganizer;
import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }

    public void getArrayList(ArrayList<String> canciones) {
        this.files = canciones;
    } 
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(isValidIndex(index) ==  true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    public void checkIndex(int index) {
        if(index > files.size() || index < 0) {
            System.out.println("Índice invalido, la lista de índices validos es 0, " +
            files.size());
        }

    }

    public boolean isValidIndex(int index) {
        if(index > files.size() || index < 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(isValidIndex(index) == true) {
            files.remove(index);
        }
        else{
            
        }
    }
}