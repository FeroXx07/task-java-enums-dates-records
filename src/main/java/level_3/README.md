# Level 3 - Records

##  Enunciat de l'exercici
Els records són una funcionalitat moderna de Java pensada per reduir codi quan només volem encapsular dades. Són immutables per defecte, proporcionen automàticament getters, toString, equals i hashCode, i milloren la llegibilitat del codi.

Aquest nivell et servirà per entendre com crear i utilitzar records, afegir lògica bàsica, validar valors i comparar-los amb classes normals. És una eina molt útil per a models de dades simples i clars.
Exercicis:

    Crea un record anomenat Person(String name, int age) i mostra com s’instancia.
    Afegeix mètodes personalitzats dins d’un record.
    Crea un record amb validació en el constructor (ex: edat no pot ser negativa).
    Crea una llista de Person i filtra-la amb lambdas i streams (ex: mostrar només els majors d’edat).
    Compara un record amb una classe tradicional i comenta les diferències en llegibilitat i utilitat.

## 🛠 Tecnologies
- Backend: Java

##  Instal·lació i Execució
1. Clonar el repositori: `git clone ...`
2. Execució de l'aplicació.
3. Demostració: Executar el `Main()`.
4. Proves: Executar les piles de test a `src/test/java`

## 📌 Anotacions
En comparació, les classes tradicionals davant de records tenen molt més boilerplate code a causa d'haver de definir
certs mètodes com els getters, equals(), hashcode(), toString(), constructors, etc.