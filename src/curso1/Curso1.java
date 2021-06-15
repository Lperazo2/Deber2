
package curso1;

public class Curso1 {
    private double [] notas;
    private double promedio; 
    private double aux;
    private int estudiantesEncimaPromedio;
    private int aux2;
    public Curso1(){
        notas=new double[12];
    }
    public void setNotas(double notas[]){
            this.notas=notas;
    }
    public double mostrarNotas(){
        for(int i=0;i<12;i++){
            System.out.println("Estudiante "+(i+1)+"    "+this.notas[i]);
            aux=aux+this.notas[i];
        }
        return this.aux;
    }
    public 
        void setPromedio(){
        this.promedio=promedio;
    }
    public double getPromedio(){
        promedio=aux/12;
        return this.promedio;
    }
    public void setNroEstudiantesEncimaPrmedio(){
       
        this.estudiantesEncimaPromedio=estudiantesEncimaPromedio;
    }
    public int getNroEstudiantesEncimaPromedio(){
        for(int i=0; i<12;i++){
            if (promedio<this.notas[i]){
                aux2=aux2+1;
            }
        }
        estudiantesEncimaPromedio=aux2;
        return this.estudiantesEncimaPromedio;
    }
}

