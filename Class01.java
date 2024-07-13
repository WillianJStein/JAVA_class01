public class Principal {
    
    //classes
    public class Escola {
      private static String nome = ""; //atributo
    
      private Escola(String nomeEscola) {
        this.nome = nomeEscola;
      }
      
      //métodos
      public static String getNome(){ return nome ;} 
      public static void setNome(String n){ nome = n;}
    }

    //classes
    public class Departamento {
    
      private static String nome = ""; //atributo
    
      private Departamento(String nomeDepto) {
        this.nome = nomeDepto;
      }
      
      //métodos
      public static String getNome(){ return nome ;}
      public static void setNome(String n){ nome = n;}
    }
    
    
    //métodos
    public static void main(String[] arg) {

        Escola.setNome("Ultima School");
        Departamento.setNome("Financeiro");
        
        //Funções
        System.out.println("O departamento " + 
          Departamento.getNome() + " da escola " +      
          Escola.getNome() + " está aberto.");
    }  
}
