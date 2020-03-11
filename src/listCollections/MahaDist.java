package listCollections;

import java.util.ArrayList;
import java.util.HashMap;

public class MahaDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Pune = new ArrayList<String>();
Pune.add("PCMC");
Pune.add("Warje");
Pune.add("ShivajiNagar");
Pune.add("Hinjewadi");


HashMap<String, ArrayList<String>> pune1 = new HashMap();
pune1.put("PUNE", Pune);

/////////////////////////////////////////////////

ArrayList<String> satara = new ArrayList<String>();
satara.add("Koregaon");
satara.add("Pachgani");
satara.add("Mahabaleshware");
satara.add("Phaltan");


HashMap<String, ArrayList<String>> satara1 = new HashMap();
satara1.put("SATARA", satara);

////////////////////////////////////////////////

HashMap<String, HashMap<String,ArrayList<String>>> MH=new HashMap<String, HashMap<String,ArrayList<String>>>();



MH.put("10", pune1);
MH.put("11", satara1);
System.out.println(MH);




	}

}
