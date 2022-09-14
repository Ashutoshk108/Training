package com.bhavna.task2;

import java.io.*;
public class FileHandling {
	public void addPlayer(Players p) {
		try {
			File file=new File("D://player.csv");
			FileOutputStream fout=new FileOutputStream(file, true);
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			Players ply=new Players(p.getName(),p.getTeamName(),p.getNoOfMatches());
			oos.writeObject(ply);
			System.out.println("Record added Successfully");
			oos.close();
			fout.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void displayPlayer() {
		try {
			File file=new File("D://player.csv");
			FileInputStream fin=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fin);
			Players ply=(Players) ois.readObject();
			System.out.println(ply.getName()+"\t"+ply.getTeamName()+"\t"+ply.getNoOfMatches());
			
			ois.close();
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
