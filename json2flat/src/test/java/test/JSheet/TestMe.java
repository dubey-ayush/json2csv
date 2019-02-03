package test.JSheet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.github.opendevl.JFlat;

public class TestMe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String str = new String(Files.readAllBytes(Paths.get("d://31jantpp.json")));

		JFlat flatMe = new JFlat(str);

		//get the 2D representation of JSON document
		List<Object[]> json2csv = flatMe.json2Sheet().getJsonAsSheet();

		//write the 2D representation in csv format
		flatMe.write2csv("d://abc_out.json");

	}

}
