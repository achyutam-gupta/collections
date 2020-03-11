package listCollections;

import java.util.ArrayList;
import java.util.HashMap;

public class IndiaALl {

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

/////////////////////////////////////////////////////////////
/////////////////////Madhya Pradesh/////////

ArrayList<String> Bhopal = new ArrayList<String>();
Bhopal.add("Piplani");
Bhopal.add("Rajat_Nagar");
Bhopal.add("ARERA_Colony");
Bhopal.add("Bhamghar");

HashMap<String, ArrayList<String>> bhopal1 = new HashMap();
bhopal1.put("BHOPLA", Bhopal);

///////////////////////////////////////////////

ArrayList<String> Indore = new ArrayList<String>();
Indore.add("ChappanBhog");
Indore.add("Shish_Mahal");
Indore.add("Ganjag_Basoda");
Indore.add("Gawalior");


HashMap<String, ArrayList<String>> indore1 = new HashMap();
indore1.put("INDORE", Indore);

///////////////////////////////////////////////////////

HashMap<String, HashMap<String,ArrayList<String>>> MP=new HashMap<String, HashMap<String,ArrayList<String>>>();



MP.put("12", bhopal1);
MP.put("13", indore1);
System.out.println(MP);

////////////////////////////////////////////

HashMap<String, HashMap<String, HashMap<String,ArrayList<String>>>> INDIA =new HashMap<String, HashMap<String, HashMap<String,ArrayList<String>>>>();
INDIA.put("MAHA", MH);
INDIA.put("MP", MP);




System.out.println(INDIA);




	}

}
