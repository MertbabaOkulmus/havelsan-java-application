
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    static private  String[] array_sayilar;
    public static void main(String[] args) {
        //Slave
        try(Scanner sensor_reader=new Scanner(new FileReader("../sensor_data.txt"));
            FileWriter speed_avg_writer=new FileWriter("../speed_avg.txt")) {
                 while(sensor_reader.hasNextLine()){//satır sonuna kadar oku
            
                String sayilar=sensor_reader.nextLine();
                array_sayilar=sayilar.split(",");
                int toplam=0;
                for (int i = 0; i < array_sayilar.length; i++) {
                         
                        double int_sayi=Double.valueOf(array_sayilar[i]);
                        toplam+=int_sayi;
                     }
                
                
                double instance_count=array_sayilar.length;
                double ortalama=toplam/instance_count;
                
                     System.out.println(toplam);
                     System.out.println(instance_count);
                     //System.out.println(toplam);
                
                String str_ort=Double.toString(ortalama);
                speed_avg_writer.write("("+instance_count+" , "+str_ort+")");
                
                
                
                }
        }catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı...");
            
        }catch(IOException ex){
            System.out.println("Dosya Açılırken hata oluştu...");
        }
    }
    
}
