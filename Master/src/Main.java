

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;




public class Main {
    
    static private String[] array_kontrol;
    public static void main(String[] args) throws InterruptedException {
        
        try(/*FileWriter process_writer=new FileWriter("../process_state.txt");//dosyaların oluşturulması*/
            FileWriter sensor_writer=new FileWriter("../sensor_data.txt")){
            /*
            Scanner scanner=new Scanner(System.in);
            
            System.out.print("Process State Seçiniz (Master/Slave): ");
            String secim=scanner.nextLine();
            
            if (secim.equals("Master")) {
                process_writer.write("Application:Master/Slave, State=Start/Stop");
            }
            else{
                process_writer.write("Application:Master/Slave, State=Stop/Start");
            }*/
            
            //Master uygulaması
            
            LocalTime now= LocalTime.now();
            System.out.println(now);
            int saniye= now.getSecond();
            System.out.println(saniye);
            System.err.println(saniye+2); 
            while (true) {
                
                double sayi = (double)(Math.random()*100);//1-100 kadar random sayı üretme
                sensor_writer.write(sayi+",");//Bu değerleri sensor_data.txt dosyasına yazıyoruz
                 LocalTime now2= LocalTime.now();
                int anlik_saniye=now2.getSecond();
                System.out.println(anlik_saniye);
                if(anlik_saniye>=saniye+2){
                    break;
                }
            }
           
        } catch (IOException ex) {
            System.out.println("Dosya yazarken hata oluştu");
        }
        
       
        
        
          
    }
    
}
