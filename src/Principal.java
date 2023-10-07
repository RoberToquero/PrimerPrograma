public class Principal {
    public static void main(String[] args) {
        /*PRIMERA PARTE: MODIFICAR COLOR DEL TEXTO
        * Se emplea el comando \033[ y su código para cambiar de color dentro de los ""*/
        System.out.print("\033[33m mandarina");
        System.out.print("\033[32m hierba");
        System.out.print("\033[31m tomate");
        System.out.print("\033[37m sábanas");
        System.out.print("\033[36m cielo");
        System.out.print("\033[35m nazareno");
        System.out.println("\033[34m mar");
        System.out.println("\033[37m");
        System.out.println("**************************************************************");
        //Tabla de ejemplo
        System.out.println("┌────────┬───────────┬────────┬────────────────┐");
        System.out.println("| Código    Color      Código      Color       |");
        System.out.println("├────────┼───────────┼────────┼────────────────┤");
        System.out.print("| 30     |\033[30m negro \033[39;49m       |");
        System.out.println(" 90    |\033[90m negro claro \033[39;49m  |");
        System.out.print("| 31     |\033[31m rojo \033[39;49m        |");
        System.out.println(" 91    |\033[91m rojo claro \033[39;49m  |");
        System.out.print("| 32     |\033[32m verde \033[39;49m        |");
        System.out.println(" 92     |\033[92m verde claro \033[39;49m  |");
        System.out.print("| 33     |\033[33m amarillo \033[39;49m       |");
        System.out.println(" 93    |\033[93m amarillo claro \033[39;49m  |");
        System.out.print("| 34     |\033[34m azul \033[39;49m        |");
        System.out.println(" 94     |\033[94m azul claro \033[39;49m  |");
        System.out.print("| 35     |\033[35m morado \033[39;49m        |");
        System.out.println(" 95     |\033[95m morado claro \033[39;49m  |");
        System.out.print("| 36      |\033[36m cian \033[39;49m        |");
        System.out.println(" 96    |\033[96m cian claro \033[39;49m  |");
        System.out.print("| 37     |\033[37m blanco \033[39;49m        |");
        System.out.println(" 97     |\033[97m blanco claro \033[39;49m  |");
        System.out.println("\033[37m└────────┴───────────┴────────┴────────────────┘");


        System.out.println("*************************************************************************");
        //Introducir caracteres UNICODE con el comando
        System.out.println("Dos corcheas \u266B");
        // Salto de línea con \n
        System.out.println("Roberto Toquero\nCalle Comuneros de Castilla Nº1,1ºC\nTlfn:692374739");
        // TABULADOR CON \t
        System.out.println("computer\t ordenador\n student\t alumno\n cat\t gato\n machine\t máquina");
        System.out.println("┌────────┬───────────┬───────────┬────────────────┬───────────┬────────────┐");
        System.out.println("|  Horas     Lunes     Martes       Miércoles          Jueves      Viernes |");
        System.out.println("├────────┼───────────┼───────────┼────────────────┴───────────┴────────────┤");
        System.out.println("|\033[33m 08:30\t\033[31m  Matemáticas\t\033[32m Lengua \t\033[34m Inglés    \t\033[35m   Historia   \t\033[36mInformática|");
        System.out.println("\033[37m└────────┴───────────┴───────────┴────────────────┴───────────┴────────────┘");

        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");

        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*********");

        System.out.println("*********");
        System.out.println(" *     *");
        System.out.println("  *   *");
        System.out.println("   * *");
        System.out.println("    *");
        // Chorradas varias

        System.out.println("                  \uD83D\uDE04     ██");
        System.out.println("   REALIZADO POR MI    ██");
        System.out.println("   EL PUTO AMO            ██");
        System.out.println("Más máquina imposible ████████████");
        System.out.println("                      ████████  ██");
        System.out.println("                      ████████████");
        System.out.println("                      ██████████");
        System.out.println("\uD83D\uDE04 ☠ ");

    }
}

