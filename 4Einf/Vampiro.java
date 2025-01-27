package gioco;

public class Vampiro extends Extraterrestre {
    String nome;
    public Vampiro(String nome){
        this.nome=nome;
    }
    @Override
    public void morso() {
        System.out.println("vampiro "+nome+" morde e perde 2 punti forza");
        forza-=2;
    }
    public int getForza(){
        return forza;
    }

}
