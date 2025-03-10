
package override3;


 abstract class Animal {
void emitirSom() {
}
}
package override3;
class Cachorro extends Animal {
@Override
void emitirSom() {
System.out.println("O cachorro late: Au Au!");
}
}

