# Lerneinheit 10
Im Package [ch.fhnw.oop1.le](./src/ch/fhnw/oop1/le) finden Sie Code Beispiele aus den Videos.

# Arbeitsblatt (AB)

## Equals
Gegeben sind die Klassen `Point` und `ColoredPoint`. In der Klasse `Point` ist die Methode `equals` bereits ausimplementiert. In der Klasse `ColoredPoint` müssen Sie die Implementierung noch vervollständigen:

```java
public class Point {
    private int x;
    private int y;
    public Point(int x, int y) { 
        this.x = x; 
        this.y = y; 
    }
	
    @Override
    public boolean equals(Object that) {
        // Kompaktere Schreibweise.
        return that instanceof Point && ((Point)that).x == x && ((Point)that).y == y;
    }
}
```

```java
public class ColoredPoint extends Point {
    private Color color;
    public ColoredPoint(int x, int y, Color color) {
        super(x, y); 
        this.color = color;
    }
	
    @Override
    public boolean equals(Object that) {
        // TODO: Diese Methode gilt es zu implementieren.
    }
}
```

Betrachten Sie insbesondere den Fall, dass Sie einen Punkt mit einem `ColoredPoint` vergleichen:

```java
Point p = new Point(2, 1);
Point cp = new ColoredPoint(2, 1, Color.RED);
System.out.println(p.equals(cp));
System.out.println(cp.equals(p));
```

**Beachten Sie:**
- Die Farbe, die übergeben wird, könnte auch `null` sein (dann ist der Punkt farblos). 
- Der dynamische Typ kann auch über `getClass()` abgefragt werden.

### Aufgaben & Fragen
1. Implementieren Sie das `equals` in der Klasse [ColoredPoint](./src/ch/fhnw/oop1/ab/equals/ColoredPoint.java).
2. Erfüllen die Implementierungen von `equals` in den Klassen `Point` und `ColoredPoint` den Equals-Vertrag?
   - Reflexivität (x.equals(x))
   - Symmetrie (x.equals(y) == y.equals(x))
   - Transitivität (x.equals(y) && y.equals(z) => x.equals(z))
3. Fassen Sie Ihre Erkenntnisse zusammen und notieren Sie diese stichwortartig
4. Lesen Sie das Kapitel aus [LE: Item 10: Obey the general contract when overriding equals](material/equals-contract.pdf) (Seite 1 - 20) und überprüfen Sie Ihre Erkenntnisse.


## Aufzählungstypen (Enums)
In der Gastro-Industrie (Restaurants, Catering, usw.) werden viele Behälter von Standardgrössen verwendet; sogenannte **Gastronorm** Behälter. Standardisiert sind vor allem die Breite und Länge der Behälter, damit sie in Öfen und Kühlschränke passen. Die Höhe ist nicht standardisiert.

Unsere Firma produziert Gastronormbehälter und wir brauchen eine Klasse, um diese Produkte darzustellen. Diese Klasse braucht zwei Aufzählungen:
1. Material: **STEEL** oder **PLASTIC**, ohne weitere Informationen oder Funktionalität.
2. Size: Diese Aufzählung muss die Methoden `getWidth()` und `getLength()` anbieten. Wir produzieren drei der standardisierten Gastronorm-Grössen:
   - GN1_4 (Breite 163mm, Länge 265mm)
   - GN1_2 (Breite 265mm, Länge 325mm)
   - GN1_1 (Breite 325mm, Länge 530mm).

### Aufgabe Enums schreiben
Ergänzen Sie die Klasse unten mit den Aufzählungen (Enums):

```java
public class Gastronorm {
    private Size size;
    private Material material;

    public Gastronorm(Material material, Size size) {
        this.material = material;
        this.size = size;
    }

    public Material getMaterial() { 
        return material; 
    }
    
    public int getWidth() { 
        return size.getWidth(); 
    }

    public int getLength() { 
        return size.getLength(); 
    }

    public int getLiterVolume() { 
        return size.getWidth() * size.getLength() / 10_000;
    }

    // TODO: Enum Material

    // TODO: Enum Size, all measurements in millimeters
}
```

### Aufgabe Client Klasse schreiben
Schreiben Sie eine Klasse mit einer Main-Methode, welche die Klasse `Gastronorm` instanziert und verwendet. Geben Sie z.B. das Volumen eines Behälters aus Stahl mit der Norm `GN1_1` aus.


# Übung (UB)

## Smarte Vererbung
Über einen eShop werden Autos der Marke Smart verkauft. Es stehen dabei Smarts in verschiedenen Varianten zur Verfügung: 
- Karosserie:
  - smart city-coupé: Grundvariante
  - smart cabrio: Grundvariante mit stufenlos verstellbarem Textilverdeck

- Linie / Ausstattungsmöglichkeiten:
  - smart & pure	
  - smart & pulse	temperamentvolle Variante (insbesondere stärkerer Motor)	
  - smart & passion	edle Variante (luxuriöse Ausstattungen


### 1. Modellieren Sie die sechs Varianten 
Bilden Sie die sechs Varianten (Kombinationen aus Karosserie und Linie) in Java-Code ab und benutzen Sie dazu (wo sinnvoll) Vererbung und Attribute und Methoden (evtl. auch statische Attribute und Methoden). Beschreiben Sie Ihre Lösung mit einem kleinen UML Klassendiagramm. Brauchen Sie für die Implementierung der Linie und der Motorisierung **Enumerationen**.

Ihre Implementierung soll folgende Aspekte berücksichtigen:

- Jedes smart-Auto kann in einer beliebigen Farbe geliefert werden. Beim Erzeugen einer neuen Instanz soll die gewünschte Farbe angegeben werden. Diese soll jederzeit abgefragt, aber nicht geändert werden können. Typ: `java.awt.Color`.
- Jeder Smart kann als Benziner oder als Dieselvariante geliefert werden (Aufpreis Diesel: CHF 1200).
- Beim Smart cabrio kann zusätzlich ein Radio+CD Spieler eingebaut werden (Aufpreis CHF 460). Das Radio kann auch nachträglich ein- und ausgebaut werden.
- Es gelten folgende Preise: 
  - smart city-coupé pure:	CHF 14390
  - smart city-coupé pulse:	CHF 15590
  - smart city-coupé passion:	CHF 16790
  - Die cabrio Varianten kosten generell CHF 3100 mehr.
- Der Verkaufspreis/Wert eines Autos hängt von den jeweiligen Ausstattungen ab und soll für jede Instanz abgefragt werden können (Typ: `int`).
- Jedes Auto soll eine eindeutige Seriennummer erhalten (Typ: `int`) die über die Lebensdauer des Autos nicht geändert werden darf. Bei der Erzeugung einer neuen smart-Instanz soll dieser eine eindeutige Seriennummer zugewiesen werden. Sie soll über eine Methode abgefragt werden können.
- Es soll von aussen weder auf die Klassen- noch auf die Instanzvariablen direkt zugegriffen werden können.

### 2. Methode toString implementieren
Implementieren Sie in Ihren Klassen die Methode `toString` aus der Klasse `Object` welche einen Smart als Stringrepräsentation zurückgibt.

### 3. Equals Implementieren (Sie müssen :-))
Implementieren Sie in Ihren Klassen die Methode `equals` aus der Klasse `Object`. Überlegen Sie sich, wann zwei smart-Objekte als identisch betrachtet werden sollen.

### 4. Client Klasse schreiben
Schreiben Sie ein Testprogramm, das einige smart Autos in verschiedenen Varianten (smart city-coupé pure, smart cabrio pure, ....) erzeugt und sie in ein Array ablegt. Traversieren Sie anschliessend alle Autos und geben Sie für jedes Auto den Typ, die Seriennummer, die Verkaufskosten sowie Angaben zur Ausstattung aus.

Testen Sie auch Ihre `equals()` Implementierung.

