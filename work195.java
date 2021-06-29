import java.util.*;
import java.io.*;
import java.net.*;

public class work195 {
    public static void main(String[] args) {
        String url = "http://no1s.biz/kenshu/JA1/src2/mondai/chap19/employee.txt";
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String line;
        // ハッシュマップの宣言（キーがInteger, 値がEmployeeとなる）
        
        Employee employee;
        int employee_id;
        try {
            URL myUrl = new URL(url);
            BufferedReader reader2 = new BufferedReader(
                                        new InputStreamReader(myUrl.openStream()));
            
            String[] values;
            int count = 0;
            while((line = reader2.readLine()) != null) {
                if(count == 0 || line.equals("")){
                    count++;
                    continue;
                }
                values = line.split(",");
                employee = new Employee();
                // valuesの各値をemployeeのメンバ変数に代入する

                //ハッシュマップにemployeeを格納　キーは社員ID、値はemployee

                count++;
            }
            reader2.close();

            while(true) {
                System.out.println("==========");
                System.out.println("社員IDで社員を検索します");
                System.out.println("終了する場合は「exit」と入力してください ");
                System.out.println("==========");
                System.out.print("社員IDを入力してください > ");
                line = reader1.readLine();
                if(line.equals("exit")) {
                    System.out.println("終了します");
                    break;
                }
                
                System.out.println("==========");
                
                employee_id = Integer.parseInt(line);
                // ハッシュマップのキーに「employee_id」が存在すれば、Employeeを表示する

            }
        } catch(NumberFormatException ex) {
            System.out.println("数値ではありません");
        } catch(IOException ex) {
            System.out.println("入力エラーが発生しました");
        }
    }
}

