package 復習２;

public class Employee {
    public static void main (String[] args) {
        String[] names = {"桜井", "田原", "中川", "鈴木"};
        String serch  = args[0];
        int i;
        
        for(i = 0; i < names.length; i++) {
            if(serch.equals(names[i])) {
                break;
            }
        }
        if(i < names.length) {
            System.out.println(serch + "は含まれています。");
        } else {
            System.out.println(serch + "は含まれていません。");
        }
    }
    
}