

package batallanaval;

public class Tablero {
    
    int tablero[][]= new int [10][10];
    
    public void imprimir(){
    
for (int i=0; i<10; i++){
    
for (int j=0; j<10; j++){
    
    System.out.print(tablero[i][j]+ " ");
    

}
System.out.println("");
}
}
    
}
