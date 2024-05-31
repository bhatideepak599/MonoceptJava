package com.techlabs.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C:\\Users\\bhati\\Desktop\\Assignments\\06-file-handling-app\\src\\com\\techlabs\\file\\file.txt");
			int ch;
			int charCount=0,wordsCount=0,lineCount=0;
			String s="";
			while((ch=fileReader.read())!=-1) {
				if(ch!=' ' && ch!='\n') {
					s+=ch;
				}
				else if(ch==' ' || ch=='\n'){
					if(s!="") wordsCount++;
					s="";
				}
				
				
				if(ch!=' ' && ch!='\n') charCount++;
				
				if(ch=='\n') {
					lineCount++;
					
				}
			}
			if(s!="") wordsCount++;
			System.out.println("Total Number of Charachers are "+charCount);
			System.out.println("Total Number of words are "+(wordsCount));
			System.out.println("Total Number of lines are "+ (1+lineCount));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
