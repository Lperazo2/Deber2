package testCurso1;

import curso1.Curso1;
public class TestCurso1 {
    public static void main(String[] args) {
        Curso1 cursoA= new Curso1();
        double [] notas = new double [12];
        for(int i=0;i<12;i++){
            notas[i]= Math.random()*6;
            
        }
        System.out.println("Las notas obtenidas por los estudiantes es la siguiente : \n");
        cursoA.setNotas(notas);
        cursoA.mostrarNotas();
        System.out.println("\n\nEl promedio del curso es: "+cursoA.getPromedio());
        System.out.println("\nEl numero de estudiantes encima del promedio son: "+cursoA.getNroEstudiantesEncimaPromedio());
    }
    
    
}
