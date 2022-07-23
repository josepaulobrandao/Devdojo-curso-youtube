package javacore.ZZAclassesinternas.test;

public class OuterClassesTeste01 {//Classe externa
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAtribute(){//Classe interna
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeste01.this);//se for somente this, ele referencia o objeto da classe interna

        }
    }
    public static void main(String[] args) {
        OuterClassesTeste01 outerClass = new OuterClassesTeste01();
        //OuterClassesTeste01.Inner inner = outerClass.new Inner();

        Inner inner2 = new OuterClassesTeste01().new Inner();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAtribute();
        inner2.printOuterClassAtribute();
    }
}
