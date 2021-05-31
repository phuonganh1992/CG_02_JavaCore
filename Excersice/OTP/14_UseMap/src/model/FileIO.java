package model;

import java.io.*;
import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

public class FileIO {
    public void writeToFile(String pathFile, Map<String,Customer> customerMap) throws IOException {
        File file=new File(pathFile);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        Set<String> keys= customerMap.keySet();
        bufferedWriter.write("Key,Customer Name,Customer Age, Customer Address, Customer Identity, Customer Gender, Customer Date of Birth \n");
        for (String key:keys) {
            bufferedWriter.write(key+","
                    +customerMap.get(key).getCusName()+","
                    +customerMap.get(key).getCusAge()+","
                    +customerMap.get(key).getCusAddress()+","
                    +customerMap.get(key).getCusIdentity()+","
                    +customerMap.get(key).displayGender()+","
                    +customerMap.get(key).displayDateOfBirth()+"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
    public Map<String,Customer> readFromFile(String pathFile) throws IOException {
        File file=new File(pathFile);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String lineCSV=null;

        while((lineCSV=bufferedReader.readLine()) !=null) {
            String[]lineContent=lineCSV.split(",");
            String keyMap=lineContent[0];
            String customerName=lineContent[1];
            int customerAge=Integer.parseInt(lineContent[2]);
            String customerAddress=lineContent[3];
            String customerIdentity=lineContent[4];
            String displayGender=lineContent[5];
            int customerGender;
            if(displayGender.equals("female")) customerGender=0;
            else if(displayGender.equals("male")) customerGender=1;
            else if(displayGender.equals("other")) customerGender=2;
            String displayDate=lineContent[6];
            String[] formatDate=displayDate.split("/");
            int day=Integer.parseInt(formatDate[0]);
            int month=Integer.parseInt(formatDate[1]);
            int year=Integer.parseInt(formatDate[2]);
            LocalDate customerDateOfBirth=LocalDate.of(year,month,day);


        }
    }
}
