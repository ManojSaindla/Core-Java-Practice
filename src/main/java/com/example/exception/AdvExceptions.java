package com.example.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class AdvExceptions {

	public static void main(String[] args) throws Exception {

			File file = new File("./sample.txt");
			

			if(!file.exists()) {
				file.createNewFile();
			}
		//Autoclosable ==> If we want to try with resourcs then the class should be implemented by Autoclosable Interface	
try {
			FileReader fr = new FileReader(file);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	}


	}