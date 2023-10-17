import Implementation.myArrayList;
import Implementation.myLinkedList;
import Interface.myCollection;
import Interface.myIterator;
import Interface.myList;

public class Main {
    public static void main(String[] args) {
        myList<String> lista = new myLinkedList<>();
        System.out.println(lista.isEmpty());
        for (int i = 0; i < 12; i++) {
            lista.add("marko" + i);
        }
        myIterator<String> iter = lista.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(lista.indexOf("marko"+11));
        System.out.println(lista.contains("marko5"));
        System.out.println(lista.remove("marko11"));
        System.out.println(lista.remove(10));
        System.out.println(lista.set(0,"marko5"));
        System.out.println("/////////////////////////////////////////////////");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
