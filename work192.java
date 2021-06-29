import java.util.*;
import java.io.*;

public class work192 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        User user;
        ArrayList<User> lists = new ArrayList<User>();
        
        System.out.println("==== 入力を開始します ====");
        
        try{
            while(true) {
                User2 users = new User2();
                System.out.print("名前を入力してください > ");
                line = reader.readLine();
                users.name = line;
                
                System.out.print("年齢を入力してください > ");
                line = reader.readLine();
                users.age = line;
                
                System.out.print("都道府県を入力してください > ");
                line = reader.readLine();
                users.prefecture = line;
                
                //UserオブジェクトをArrayListに格納する
                lists.add(users);
                
                System.out.print("入力を終了しますか? [yes] > ");
                line = reader.readLine();
                
                if(line.equals("yes")) { break; }
            }
            System.out.println("");
            System.out.println("==== lists内を表示します ====");
            
            for(User u: lists) {
                System.out.println(u);
            }
        } catch(IOException ex) {
            System.out.println("入力エラーが発生しました");
        }
    }
}

