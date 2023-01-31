import java.util.Scanner;

public class Prova4Ronal {
    public static void main(String[] args) {
        // final de prosWW
        final int N_MESOS = 12;

        int[] alumnes = new int[N_MESOS];
        String[] nMesos = { "Gen", "Feb", "Març", "Abr", "Maig", "Jun", "Jul", "Agost", "Set", "Oct", "Nov", "Des" };
        // Aplicamos el scanner y un print para escribir el numero de mesos
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribe los mesos :");
        // una variable y el bucle que nos hara el recorrido de meses con alumnos
        int mes = entrada.nextInt();
        while (mes != 0) {
            alumnes[mes - 1]++;
            mes = entrada.nextInt();
        }
        // Variables, una para mex_max y otra para la posicion.
        int mes_max = 0;
        int pos_max = 0;
        for (int i = 0; i < N_MESOS; i++) {
            if (alumnes[1] != 0)
                ;
            System.out.println(" al mes " + nMesos[i] + " hi han " + alumnes[i] + " alumnes ");

        }
        // MESOS donde han nacido mas alumnos
        int mesMaxim = 0;
        String mesMaximNom = nMesos[1];
        int quantitatMaxima = 0;
        while (mes_max > 0) {
            for (int i = 0; i < N_MESOS; i++)
                if (alumnes[i] == mes_max)
                    System.out.println(nMesos[i] + "");

            mes_max--;
        }
    }
}
