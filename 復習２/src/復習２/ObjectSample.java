package 復習２;

public class ObjectSample {

    //インスタンスの作成
    public static void main(String[] args) {
        var employee = new Employee("鈴木", "営業", "課長", 100);
    
        //インスタンスメソッドの呼び出し
        employee.report ();
        employee.report (2);
    
        System.out.println("");
        
        var engineer = new Employee("田中", "開発部", "一般社員", 200);
        
        //インスタンスメソッドの呼び出し
        engineer.report();
    }
}
