import java.util.*;
import java.io.*;

public class work194 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> errorMessage = new HashMap<String, String> ();
        
        try{
            System.out.print("IDを入力してください > ");
            String id = reader.readLine();
            
            System.out.print("パスワードを入力してください > ");
            String pw = reader.readLine();
            
            System.out.println("");
            System.out.println("入力値をチェックします...");
            System.out.println("==========");
            
            //IDは必須チェック
            if(!Validation3.isRequired(id)) {
                errorMessage.put("ID","必須項目です");
            }
            
            //パスワードは数値チェックと必須チェック
            if(!Validation3.isNumeric(pw)) {
                errorMessage.put("パスワード", "数値ではありません");
            }
            if(!Validation3.isRequired(pw)) {
                errorMessage.put("パスワード", "必須項目です");
            }
            
            // IDとパスワードの確認
            if(id.equals("yamada") && pw.equals("12345")) {
                System.out.println("ログインしました!!!");
            } else {
                errorMessage.put("認証エラー", "IDとパスワードが間違っています");
            }
            if(!errorMessage.isEmpty()) {
                for(String key: errorMessage.keySet()) {
                    System.out.println(key + " : " + errorMessage.get(key));
                }
            }
        } catch(IOException ex) {
            System.out.println("入力エラーが発生しました");
        }
    }
}
