import java.util.*;
import java.io.*;
import java.net.*;

public class work193 {
    public static void main(String[] args) {
        String url = "http://no1s.biz/kenshu/JA1/src2/mondai/chap19/data.txt";
        String line;
        //Book型のArrayListを作成
        try {
            URL myUrl = new URL(url);
            BufferedReader reader = new BufferedReader(
                                       new InputStreamReader(myUrl.openStream()));
            // ここで読み込み

            // 各行からBookオブジェクトを作成して各メンバ変数に値を代入

　　　　　     // ArrayListにBookオブジェクトを代入
            
            reader.close();
            
            for(Book b: books) {
                System.out.println(b);
            }
        } catch (MalformedURLException e) {
            System.out.println("URLの形式が誤っています：" + e);
        } catch (NumberFormatException e) {
            System.out.println("数値ではありません");
        } catch (IOException e) {
            System.out.println("I/Oエラーです：" + e);
        }
    }
}

