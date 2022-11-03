abstract class Instrumento {
 public abstract void tocar();
 public String tipo() {
return "Instrumento";
 }
 public abstract void afinar();
}
class Guitarra extends Instrumento {
 public void tocar() {
System.out.println("Guitarra.tocar()");
 }
 public String tipo() { return "Guitarra"; }
 public void afinar() {}
}
class Piano extends Instrumento {
 public void tocar() {
System.out.println("Piano.tocar()");
 }
 public String tipo() { return "Piano"; }
 public void afinar() {}
}
class Saxofon extends Instrumento {
 public void tocar() {
System.out.println("Saxofon.tocar()");
 }
 public String tipo() { return "Saxofon"; }
 public void afinar() {}
}
// Un tipo de Guitarra 
class Guzla extends Guitarra {
 public void tocar() {
 System.out.println("Guzla.tocar()");
 }
 public void afinar() {
 System.out.println("Guzla.afinar()");
 }
 }
// Un tipo de Guitarra 
class Ukelele extends Guitarra {
 public void tocar() {
System.out.println("Ukelele.tocar()");
 }
 public String tipo() { return "Ukelele"; }
}
public class Musica2 {
 // No importa el tipo de Instrumento,
 // seguirá funcionando debido a Polimorfismo:
 static void afinar(Instrumento i) {
// ...
i.tocar();
 }
 static void afinarTodo(Instrumento[] e) {
for(int i = 0; i < e.length; i++)
 afinar(e[i]);
 }
 public static void main(String[] args) {
 // Declarar un Arreglo SIN INSTANCIAS es valido en Clases Abstractas
Instrumento[] orquesta = new Instrumento[5];
 // Generar una INSTANCIA de una la Clase Abstracta no es valido 
 // Instrumento nuevo = new Instrumento();
int i = 0;
// Up-casting al asignarse el Arreglo
orquesta[i++] = new Guitarra();
orquesta[i++] = new Piano();
orquesta[i++] = new Saxofon();
orquesta[i++] = new Guzla();
orquesta[i++] = new Ukelele();
afinarTodo(orquesta);
 }
}
