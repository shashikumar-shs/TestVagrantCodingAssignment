package Shashi.DemoProject;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
private String name;
private ArrayList<Song>songs;
public Album (String name)
{
this.name=name;
this.songs=new ArrayList<Song>();
}
public Album()
{
}
public Song findSong(String title)
{
	for(Song checkedSong:songs)
	{
		if(checkedSong.getTitle().equals(title)) return checkedSong;
		
			
		}
	return null;
}
	public boolean addSong(String title, double duration)
	{
		if(findSong(title)==null)
		{
			songs.add(new Song(title,duration));
			System.out.println(title+" succesfully added to the list");
			return true;
		}
		else
		{
			System.out.println("Song with name"+title+"already exists in the list");
			return false;

		}
	}
	public boolean addToPlayList(int trackNumber,LinkedList<Song>playlist)
	{
		int index =trackNumber-1;
		if(index>0&& index <=this.songs.size())
		{
			playlist.add(this.songs.get(index));
			return true;
		}
		System.out.println("this album will not have song with tracknumber"+trackNumber);
		return false;
	}
}

