package javacore.ZZAclassesinternas.test;

public class OuterClassesTeste02 {

    private String name = "Midorya";
    void print(final String param) {
        final String lastNmae = "Izuky";
         name = "";
         class LocalClass {
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastNmae);
            }
        }
       /* LocalClass localClass = new LocalClass();
        localClass.printLocal();
        */
        new LocalClass().printLocal();

    }
    public static void main(String[] args) {
        OuterClassesTeste02 outer = new OuterClassesTeste02();
        outer.print("oi");
    }
}
