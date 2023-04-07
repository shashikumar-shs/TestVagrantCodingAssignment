package Shashi.DemoProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MainClass {
	private static ArrayList<Album>albums=new ArrayList<>();
	public static void main(String[] args) {
String name;
Album album=new Album("Album1");
album.addSong("S1", 4.5);
album.addSong("S2", 3.8);
album.addSong("S3", 4.0);
album.addSong("S4", 5.0);
albums.add(album);
LinkedList<Song> PlayList_1=new LinkedList<>();
albums.get(0).addToPlayList(1, PlayList_1);
albums.get(0).addToPlayList(2, PlayList_1);
albums.get(0).addToPlayList(3, PlayList_1);
albums.get(0).addToPlayList(4, PlayList_1);
	}
	private static void play(LinkedList<Song>PlayList)
	{
		Scanner sc=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		ListIterator<Song>listiterator=PlayList.listIterator();
		if(PlayList.size()==0)
		{
			System.out.println("This playlist have no songs");
		}
		else
		{
			System.out.println("now playing"+listiterator.next().toString());
			printMenu();
		}
		while(!quit)
		{
			int action=sc.nextInt();
			sc.nextLine();
			switch (action)
			{
			case 0:
				System.out.println("playlist complete");
				quit=true;
				break;
			case 1:
				if(!forward)
				{
					if(listiterator.hasNext())
					{
						listiterator.next();
					}
					forward=true;
				}
				if(listiterator.hasNext())
				{
					System.out.println("now playing"+listiterator.toString());
				}
				else
				{
					System.out.println("no song available, reached to the end of the list");
				forward =false;
				}
				break;
			case 2:
				if(forward)
				{
					if(listiterator.hasPrevious())
					{
						listiterator.previous();
					}
					forward=false;
				}
				
				if(listiterator.hasPrevious())
				{
					System.out.println("now playing" + listiterator.previous().toString());
				}
				else
				{
					System.out.println("we are the first song");
					forward=false;
				}
			case 3:
				if(forward)
				{
					if(listiterator.hasPrevious())
					{
						System.out.println("now paying"+listiterator.previous().toString());
						forward=false;
					}
					
					else
					{
						System.out.println("we are at the start of the list");
					}
					}
					else
					{
						if(listiterator.hasNext())
						{
							System.out.println("now playing"+listiterator.next().toString());
						}
						else
						{
							System.out.println("we have to reached the end of the list");
						}
					}
						break;
						
					}
				}
			}
		
	
private static void printMenu()
{
	System.out.println("Available options\n press");
	System.out.println("0 to quit\n"+
	"1-to play next song\n"+
    "2-to play previous song\n"+
	"3-to replay the current song\n"+
    "4-list of all songs\n");
}
}
