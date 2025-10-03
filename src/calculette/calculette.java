package calculette;

public class calculette {
    public static void main(String[] args) {
        int[] Tab = new int[args.length];
        for (int i=0;i<args.length; i++) {
             Tab[i] = Integer.parseInt(args[i]);
        }
        int somme=0;
        for (int i=0;i<Tab.length;i++) {
            System.out.println(Tab[i]);
            somme=somme + Tab[i];
        }
        System.out.println(somme);
    }
}
