public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>();
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.remove(0);
        list.add(e,0);
       list.seeList();
    }
}