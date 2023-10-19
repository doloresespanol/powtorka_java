    public class Osoba {
    private int idOsoby;
    private String imie;

    public static int liczbaInstancji;

        public Osoba() {
            liczbaInstancji++;
            imie = "";
            idOsoby = 0;
        }

        public Osoba(int idOsoby,String imie) {
            liczbaInstancji++;
            this.idOsoby = idOsoby;
            this.imie = imie;
        }

        public Osoba(Osoba osoba){
            liczbaInstancji++;
            this.idOsoby = osoba.idOsoby;
            this.imie = osoba.imie;
        }

        public void wypisywanieImienia(String imieArgument){
            if(imie == ""){
                System.out.println("Brak danych");
            }else{
                System.out.println("Cześć "+imieArgument+", mam na imię "+imie);
            }
        }
    }
