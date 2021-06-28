<h1> Proje temel anlamda üç uygulamadan oluşmaktadır index MasterForm ve SlaveForm </h1>
<h3>
Index Uygulaması
</h3>
<p>Index uygulamasında hangi uygulamanın çalışacağı belirlenir uygulamanın seçili olup olmama durumuna göre   
process_state.txt dosyasına uygulama durumları(start/stop) aktarılır</p>
<p align="center">
    <img src="imgs\index1.JPG"/>
</p>
<p align="center">
    <img src="imgs\index2.JPG"/>
</p>
<h3>
MasterForm Uygulaması
</h3>
<p>
Master uygulaması çalıştırıldığı anda önce "process_state.txt" den çalışma izni olup olmadığını kontrol eder. <br>
Eğer çalıma izni yok ise yani State=Stop ise uyarı verir.<br> 
Eğer State=Start ise çalışır ve 2sn içinde 0 ile 100 arasında üretebildiği kadar random sayı üretip "sensor_data.txt" nin içine yazdırır.
</p>
<br>
<p align="center">
    <img src="imgs\master1.JPG"/>
</p>
<br>
<p>Çalıştığı saniye aralıklarını ekrana yansıtır.</p>
<p align="center">
    <img src="imgs\master2.JPG"/>
</p>
<br>
<h3>
SlaveForm Uygulaması
</h3>
<p>
Slave de tıpkı Master uygulaması gibi çalıştırıldığı anda önce "process_state.txt" den çalışma izni olup olmadığını kontrol eder.</p><br>
<p align="center">
    <img src="imgs\slave1.JPG"/>
</p>
<p>
Bu durumda ilk olarak index uygulaması açıldığında master ı start yapmıştık, dolayısı ile slave uygulaması çalışmayacak ve uyarı verecektir.</p><br>
<p align="center">
    <img src="imgs\slave2.JPG"/>
</p>
<p>
Uygulamayı çalıştıra bilmek için tekrardan index uygulamasına gidip slave in durumunu start olarak güncelleriz.   </p><br>
<p align="center">
    <img src="imgs\slave3.JPG"/>
</p>
<br>
<p>
Ve ardından slave uygulaması sorunsuz çalışıp "sensor_data.txt de ki tüm verileri okur adetlerini ve ortalama değerlerini "speed_avg.txt" dosyasına yazdırıp ekrana yansıtır.
</p>
<p align="center">
    <img src="imgs\slave4.JPG"/>
</p>
<br>
<font color="red">Slave ve Master klasörleri uygulamanın console halidir, asıl kullanılabilir halleri SlaveForm ve MasterForm klasörlerinde mevcuttur</font>
<br>