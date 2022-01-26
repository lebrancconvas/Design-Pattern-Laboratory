import java.util.*;
import java.io.*;

class Journal
{
    private ArrayList<String> entries = new ArrayList<String>();
    private int count = 0;

    public void addEntry(String text)
    {
        ++count;
        entries.add(count + ".) " + text);
    }

    public void removeEntry(int index)
    {
        entries.remove(index);
    }

    @Override
    public String toString()
    {
        return String.join(System.lineSeparator(), entries);
    }
}

class Persistence
{
    public void saveToFile(Journal journal, String filename, Boolean overwrite) throws FileNotFoundException
    {
        if(overwrite || new File(filename).exists())
        {
            try(PrintStream out = new PrintStream(filename))
            {
                out.println(toString());
            }
        }
    }
}

class Solid_S
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Journal xoxojournal = new Journal();
        xoxojournal.addEntry("The Debut of New Idol Group.");
        xoxojournal.addEntry("The best stuff you should try for your project.");
        // System.out.println(xoxojournal);

        Persistence persistence = new Persistence();
        String filenamewithoutextension = "journal_SOLID_S";
        String fileextension = "txt";
        String filename = filenamewithoutextension + "." + fileextension;
        persistence.saveToFile(xoxojournal, filename, true);

    }
}