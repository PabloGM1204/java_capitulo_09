public class PruebaAnimal{
    public static void main(String[] args) {
        Pinguino skipper = new Pinguino(Sexo.MACHO);
        skipper.chulea();
        skipper.come("Pescado");
        skipper.duerme();

        Perro bolt = new Perro("Golden Retriever");
        bolt.amamanta();
        bolt.caca();
        bolt.come("Carne");

        Gato garfield = new Gato(Sexo.MACHO, "Egipcio");
        Gato misifa = new Gato(Sexo.HEMBRA, "Egipcio");
        garfield.cuidaCrias();
        garfield.peleaConOtroGato(misifa);
    }
}