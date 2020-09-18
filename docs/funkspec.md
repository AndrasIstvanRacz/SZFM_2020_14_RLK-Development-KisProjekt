## 5. Igényelt üzleti folyamatok

A program alapvetően egy oldalsó menűsávból és egy funkcíó képernyőből áll. Az oldalsó menüsáv feladata, hogy konyedén tudjunk navigálni a különböző funkcíok közöt, amit a funkcióképernyön fog megjeleníteni a szoftver. A program célja, hogy egy SQL alapu adatbázis elönyeit ki tudjuk használni SQL utasítások írása nélkül. Így a mi feladatunk, hogy az adatbázis fontosabb funkciók használatára lehetőséget biztosítanunk a felhasználok számára.

A következő funkciók a fontosabbak:
   * Hozzáadás
   * Lekérdezés
   * Módosítás
   * Törlés

Ezen funkciók könyed eléréséhez egy grafikus felületett biztosítunk, így megkönyitvén a program használatát a felhasználok részére. Az első említet funkció, a hozzáadás, egy új ellem hozzáadását jelenti ahoz a táblához amiben a vendégek adatait tároljuk. Új vendég megadásakor a név, a szoba száma, a szoba használatának kezdő idöpontja mezők kitöltése kötelező, illetve minden vendég rendelkezni fog egy azonosítoval amit a szoftver automatikusan general. A másik három funkció az ezen hozzáadásokból létrejöt táblat fogja használni. A lekerdezés a táblában lévő adatok grafikus megjelnítését jelenti, illetve a lekért adattáblában való keresésre is lehetőséget ad. Továbbá lehetöség lesz az adatok módosítására és törlésére is. A szerkesztés a cellák átírásával majd az Enter gomb leütésével lesz lehetöség a szerkesztö táblén belül. Az elöbb említet táblában lesz továbbá megtalálható a törlés gomb ami atomatikusan kitörli az adot sort az adatbázisból.

## 6. Képernyőtervek

Az alkalmazásnak probáltunk a lehetö legmegfelelöbb designt megalkotni, amely megkönnyíti a használatot, de a megjelenése igényes, modern hatást kelt, mégis egyszerű. Ehhez JavaFX 14-et használtunk amely lehetöséget adot nekünk a letísztult és átlátható design megalkotására és ugyanakkor rengeteg fontos és hasznos felhasználói eszköz megvalósítását egyszerűsíti. Az oldal alapját egy oldalsó menüsáv alkotja amely mellett található az az ablakrész ahol a kiválasztott menüpontott meg fogjuk jeleníteni. Jelenleg 3 menüpont van tervbe véve:
* Főoldal:
A szoftver elindulásakor automatikusan ezt latjuk elsőnek. Itt megjelenitésre kerül a teljes adattábla illtve lehetöség lesz az adattáblában való keresésre oszlop szerint.


* Vendég hozzáadása:
Ebben a menüpontban lesz lehetöségunk új vendég felvételére a megadot cellák kitöltésével majd a hozzáad gomb megnzomásával. 


* Szerkesztés:
A menüpont kiválasztásakor ahol a Főoldal menüponthoz hasonlóan latjuk a táblát és tudunk keresni, de itt még lehetöségünk nyilk a táblázat cellájinak szerkesztésére illetve minden sor végén található egy törlés gomb ami az adot sor törlésére szolgál.

A grafikus felület reszponzív megjelenésü. A táblázaokban az oldalso scrollbar használatával vagy egérgörgőve tekerhetünk feljebb vagy lejebb. Adatmegadáskor típushiba eseten felugró ablak jelzi a hibát.