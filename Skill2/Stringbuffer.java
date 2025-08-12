package Skill2;
public class Stringbuffer{
    public static void main(String[] args) {
                StringBuffer sb=new StringBuffer("Java Programming");
                sb.append("Language");
        System.out.println("After append: " + sb);
                sb.insert(5,"is Fun ");
        System.out.println("After insert: " + sb);
                sb.replace(0,4,"Python");
        System.out.println("After replace: " + sb);
                sb.delete(0, 6);
        System.out.println("After delete: " + sb);
                sb.reverse();
        System.out.println("After reverse: " + sb); 
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
    }
}
