
package task5.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
public class task01 {

    public static void main(String []args) throws IOException {
        System.out.println("Please enter the first three numbers of your credit card");
        BufferedReader tf = new BufferedReader(new InputStreamReader(System.in));
        String digits= tf.readLine();
        URL url = new URL("https://=Irene Shuma@.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            System.out.println("please wait ...Searching ...");
            while((line= br.readLine())!=null){

                String[] words=line.split("\\t+");
                String bankNumberShum56633=words[0].trim();
                String bankNameShum56663=words[1].trim();
                if(bankNumberShum56633.equals(digits)){
                    System.out.println("successful ");
                    System.out.println("Bank numerals : " +bankNumberShum56633 + "\nBank Name : " +bankNameShum56663);
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("Information successful");
        }

    }



}
