package day62_collections4;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.*;
import java.io.*;
public class CSVDataToMap {
    public static void main(String[] args) throws IOException {
        String fileName="countryCodes.csv";//file name with path
        File dataFile =new File(fileName);
        System.out.println(dataFile.exists());

        Scanner scan =new Scanner(dataFile);
       // System.out.println(scan.nextLine());
        //System.out.println(scan.nextLine());
        int counter=1;
        List<String>fileDataList=new ArrayList<>();
        while (scan.hasNextLine()){
            //System.out.println(counter+". " +scan.nextLine());
            fileDataList.add(scan.nextLine());
            counter++;
        }
        scan.close();
        System.out.println(fileName+"contains "+fileDataList.size()+" rows");

        System.out.println("-- READ FROM CSV FILE USING NEW WAY--");
        List<String>countryCodesList= Files.readAllLines(Paths.get(fileName));
        System.out.println(countryCodesList.size());
        System.out.println(countryCodesList.get(0));

        System.out.println(countryCodesList.toString());
        //HOW TO RETRIEVE UNIQUE - NON-DUPLICATE COUNTRY CODES?
        Set<String>countryCodesSet=new HashSet<>(countryCodesList);

        System.out.println("Unique country codes count: "+countryCodesSet.size());
        System.out.println(countryCodesSet.toString());

        //Store each countryCode and country name into HashMap
        //Key -> Country code, Value ->Country name
        Map<String, String>countriesMap=new TreeMap<>();
        //loop through the country countryCodeSet
        for(String eachLine : countryCodesSet){
            System.out.println(eachLine);
            //Split each value with comma
            String[] arr=eachLine.split(",");//{RU,Russia}
            //store index 0 as a Key, and index 1 as a value to the map
            countriesMap.put(arr[0], arr[1]);

        }
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.toString());

        if(countriesMap.containsValue("Mongolia")){
            System.out.println("Mongolia is in the map");
        }else{
            System.out.println("Keep coding java!");
        }

        //PE
        System.out.println(countriesMap.get("PE"));
        System.out.println(countriesMap.get("US"));
        System.out.println(countriesMap.get("TR"));
        System.out.println(countriesMap.get("AZ"));
        System.out.println(countriesMap.get("UA"));

        System.out.println("--- PRINT ALL VALUES USING FOREACH METHOD + LAMBDA---");

        countriesMap.forEach((k,v)->System.out.println(k+"|"+v));

        System.out.println("--- PRINT ALL VALUES USING FOREACH METHOD---");
        for(String eachKey: countriesMap.keySet()){
            System.out.println(eachKey+" | "+countriesMap.get(eachKey));
        }
        System.out.println("--- PRINT ALL VALUES USING ENTRYSET ---");
        for(Map.Entry<String, String>entry:countriesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
