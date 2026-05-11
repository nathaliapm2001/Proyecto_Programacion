import java.util.Scanner;

public class TiendaOtaku {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { // terminar menu
        String opcion;

        do {
            System.out.println("======MENU========");
            System.out.println("""
                    1.Mostrar catalogo de disponibles
                    2.Almacenar pedido
                    3.Eliminar del catalogo(Manga o Manhwa)
                    4.Mostrar los mejores valorados
                    5.Ver cual esta en emision o finalizado
                    6.Mostrar por generos
                    7.Mostrar las novedades (mas recientes)
                    0.Salir
                        """);
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":

                    break;

                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

                case "7":

                    break;

                case "0":
                    System.out.println("Finalizacion del dia");
                    break;

                default:
                    System.out.println("Error: Opcion Invalida");
                    break;
            }

        } while (!opcion.contains("0"));

        /*
         * public boolean insertarMultiples(List<HitoHistorico> hitos) throws
         * SQLException {
         * for (HitoHistorico hito : hitos) {
         * insertarHito(hito); // Reutiliza tu método existente
         * }
         * return true;
         * }
         * 
         * 
         * private List<Manga> mangas;
         * 
         * public DAOManhwa() {
         * this.mangas = new ArrayList<>();
         * }
         * 
         * @Override
         * public String toString() {
         * return "DAOManhwa [mangas=" + mangas + "]";
         * }
         * 
         * public List<Manga> getMangas() {
         * return mangas;
         * }
         * 
         * public List<Manga> listaMangas() {
         * //aqui rellenas tus mangas
         * 
         * mangas.add(new Manga(null, null, null, null, null, 0, 0))
         * 
         * return mangas;
         * 
         * }
         */

    }
}
