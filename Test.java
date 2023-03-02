import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args){

    int[] calorias = new int[7];
    String[] dias = {"Lunes", "martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    double promedio = 0;
    int menorCalorias = 0;
    int mayorCalorias = 0;
    String menorDia = "";
    String mayorDia = "";
    int count = 0;
    //Input
    for(int i = 0; i<calorias.length; i++)
    {
      calorias[i] = Integer.parseInt(JOptionPane.showInputDialog("Calorias del dia " + dias[i] +": "));
      promedio += (calorias[i]);
    }
    
    //Process
    //Orden descendente
    while(count <= calorias.length){
      count ++;
      for(int i = 0; i<calorias.length; i++){
	if((i+1)<calorias.length && calorias[i]>calorias[i+1]){
	    menorCalorias = calorias[i];
	    mayorCalorias = calorias[i+1];
	    calorias[i]= mayorCalorias;
	    calorias[i+1]= menorCalorias;
	    
	    menorDia = dias[i];
	    mayorDia = dias[i+1];
	    dias[i] = mayorDia;
	    dias[i+1] = menorDia;
	}
      }
    }
    //Promedio
    promedio /= 7;

    //Output
    String row = new String();
    for(int i = 0; i<dias.length; i++){
     row += "|" + dias[i] + ": " + calorias[i] + "|";
    }
    JOptionPane.showMessageDialog(null, "Orden de dia de menos a mas calorias:\n" + row + "\nPromedio: " + promedio);
  }
}