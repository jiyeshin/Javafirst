package datastructure;

import java.util.*;

public class SetMain {

	public static void main(String[] args) {
		LinkedHashSet<String> song = new LinkedHashSet<>();
		song.add("꽃이야");
		song.add("Say my name");
		song.add("Wonderful days");
		song.add("부를게");
		song.add("On my mind");
		song.add("부를게");
		song.add("매일");
		for(String temp: song);{
		System.out.println(song);
		}

	}

}
