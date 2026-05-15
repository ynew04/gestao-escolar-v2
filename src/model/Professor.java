 package model;  
  
 public class Professor {  
  
    private String nome;  
    private String materia;  
    private String registro;  
  
    public Professor (String nome, String materia, String registro){  
  
        this.nome = nome;  
        this.materia = materia;  
        this.registro = registro;  
    }  
  
    public String getNome (){  
        return nome;  
    }  
  
    public String getMateria(){  
        return materia;  
    }  
  
    public String getRegistro(){  
        return registro;  
    }  
  
    @Override   
   public String toString(){  
        return "Professor: " + nome + " | Matéria: " + materia + " | Registro: " + registro;  
    }  
}